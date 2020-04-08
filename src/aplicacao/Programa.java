package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entidades.Comentario;
import entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");	
		
		Date data =sdf.parse("21/06/2018 13:05:44");		
		String titulo = "Viajando para NovaZelandia";
		String conteudo = "Olha vou fazer uma viagem a Nova zelandia, e ela sera demais, muitas loucuras e aventuras";
		int like = 12;
		Post post1 = new Post(data, titulo, conteudo, like);
		String comentario1 = "Tenha uma otima viajem, loucura vai ser vc";
		String comentario2 = "Viaja ae seu amigao do peito";
		Comentario c1 = new Comentario(comentario1);
		Comentario c2 = new Comentario(comentario2);
		post1.adicionarComentario(c1);
		post1.adicionarComentario(c2);
		
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"),
			              "Boa Noite Camaradas",
			               "Amanha nos veremos mais, vamos fazer a Bolacha dominar o mumdo, foda-se o bidcoito",
			               324);
		
		Comentario c3 = new Comentario("Boa Noite camarada, viva Bolacha");
		Comentario c4 = new Comentario("Morte aos biscoitos");
		post2.adicionarComentario(c3);
		post2.adicionarComentario(c4);	
		
		
		System.out.println(post1);
		System.out.println(post2);		
		

	}

}
