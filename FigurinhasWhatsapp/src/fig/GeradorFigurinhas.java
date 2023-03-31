package fig;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;

public class GeradorFigurinhas {
	
	public void criar() throws Exception{
		
		InputStream inputStream = new URL("https://s2.glbimg.com/TG14-sWolYI-9fXAODVvZrTJPFE=/0x0:828x644/924x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_b0f0e84207c948ab8b8777be5a6a4395/internal_photos/bs/2023/I/5/4AhMBXTzSgVeGmhB6jJw/gretchen.jpeg").openStream() ;
		BufferedImage imagemOriginal = ImageIO.read(inputStream);
	
		int largura = imagemOriginal.getWidth();
		int altura = imagemOriginal.getHeight();
		int novaAltura = altura + 200;
		BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
		
		Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
		graphics.drawImage(imagemOriginal, 0, 0, null);
		
		var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 72);
		graphics.setColor(Color.PINK);
		graphics.setFont(fonte);
		
		graphics.drawString("Kitty", 400, novaAltura-100);
		
		ImageIO.write(novaImagem, "png", new File("C:\\Users\\nayar\\OneDrive\\Documentos\\ImersaoJava\\FigurinhasWhatsapp\\src\\fig\\saida\\fig2.png"));
	}
	
	public static void main(String[] args) throws Exception {
		var gerador = new GeradorFigurinhas();
		gerador.criar();
	}
}
