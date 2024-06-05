package net.AutoCine.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.expression.ParseException;
import net.AutoCine.model.Sala;

@Service
public class SalaServiceImpl implements ISalaService{
private List<Sala> lista=null;
	
	public SalaServiceImpl() {
		lista = new LinkedList<Sala>();
		
		try {
			//CREAMOS LAS SALAS
			//PRIMERA SALA
			Sala sala1 = new Sala();
			sala1.setImagen("sala1.jpg");
			sala1.setId(1);
			sala1.setNombre("VIP"); //Titulo de la Sala
			sala1.setUbicacion("Extremo norte, cerca del área de juegos para niños.");
			sala1.setCapacidad(80);
			sala1.setCaracteristicas1("Pantalla: 15 x 8 metros, Full HD.");
			sala1.setCaracteristicas2("Servicios: Snack bar, baños, zona de juegos para niños");
			sala1.setDestacado(1);
			sala1.setVermas("Nuestra Sala VIP está diseñada para ofrecerte una experiencia de lujo y comodidad inigualable. Pensada para quienes valoran la exclusividad y el servicio personalizado, este espacio está equipado con todo lo necesario para que te sientas especial y bien atendido desde el momento en que entras.");
			
			//SEGUNDA SALA
			Sala sala2 = new Sala();
			sala2.setImagen("sala2.webp");
			sala2.setId(2);
			sala2.setNombre("DELUXE"); //Titulo de la Sala
			sala2.setUbicacion("Sector este, junto al área de restaurantes.");
			sala2.setCapacidad(100);
			sala2.setCaracteristicas1("Pantalla: 20 x 10 metros, 4K");
			sala2.setCaracteristicas2("Servicios: Restaurante, Baños, Zona lounge");
			sala2.setDestacado(1);
			sala2.setVermas("Nuestra Sala Deluxe redefine el concepto de entretenimiento con su elegancia y estilo exclusivo. Sumérgete en un ambiente de lujo y sofisticación mientras disfrutas de las últimas películas con la máxima comodidad y servicio personalizado. Descubre una experiencia cinematográfica sin igual en nuestra Sala Deluxe.");
			
			//TERCERA SALA
			Sala sala3 = new Sala();
			sala3.setImagen("sala3.jpg");
			sala3.setId(3);
			sala3.setNombre("CLASICA"); //Titulo de la Sala
			sala3.setUbicacion("Centro del autocine, acceso principal.");
			sala3.setCapacidad(120);
			sala3.setCaracteristicas1("Pantalla: 12 x 6 metros, HD");
			sala3.setCaracteristicas2("Servicios: Snack bar, Baños, Tienda de recuerdos");
			sala3.setDestacado(1);
			sala3.setVermas("Nuestra Sala Clásica te ofrece un viaje nostálgico a través de la historia del cine. Con un encanto atemporal y una atmósfera acogedora, esta sala es perfecta para disfrutar de los grandes clásicos y películas icónicas. Sumérgete en la magia del cine en nuestra Sala Clásica.");
			
			//CUARTA SALA
			Sala sala4 = new Sala();
			sala4.setImagen("sala4.jpeg");
			sala4.setId(4);
			sala4.setNombre("RETRO"); //Titulo de la Sala
			sala4.setUbicacion("Sector oeste, cerca del área de picnic.");
			sala4.setCapacidad(90);
			sala4.setCaracteristicas1("Pantalla: 10 x 5 metros, HD");
			sala4.setCaracteristicas2("Servicios: Snack bar, Baños, Zona de picnic");
			sala4.setDestacado(1);
			sala4.setVermas("Bienvenido a nuestra Sala Retro, donde el encanto del pasado se encuentra con la emoción del presente. Déjate llevar por la nostalgia mientras disfrutas de una selección de películas vintage y clásicos modernos en un ambiente único y lleno de estilo. Experimenta la nostalgia en nuestra Sala Retro.");
			
			//QUINTA SALA
			Sala sala5 = new Sala();
			sala5.setImagen("sala5.jpg");
			sala5.setId(5);
			sala5.setNombre("FAMILIAR"); //Titulo de la Sala
			sala5.setUbicacion("Cerca del área de juegos para niños.");
			sala5.setCapacidad(150);
			sala5.setCaracteristicas1("Pantalla: 18 x 9 metros, Full HD");
			sala5.setCaracteristicas2("Servicios: Snack bar, Baños, Área de juegos");
			sala5.setDestacado(1);
			sala5.setVermas("La Sala Familiar es el lugar perfecto para disfrutar del cine en compañía de tus seres queridos. Con asientos espaciosos y un ambiente acogedor, esta sala está diseñada para ofrecer diversión y entretenimiento para toda la familia. Disfruta de momentos inolvidables juntos en nuestra Sala Familiar.");
			
			//SEXTA SALA
			Sala sala6 = new Sala();
			sala6.setImagen("sala6.jpg");
			sala6.setId(6);
			sala6.setNombre("ROMANTICA"); //Titulo de la Sala
			sala6.setUbicacion("Sector sur, zona tranquila.");
			sala6.setCapacidad(70);
			sala6.setCaracteristicas1("Pantalla: 14 x 7 metros, Full HD");
			sala6.setCaracteristicas2("Servicios: Snack bar, Baños, Zona de parejas");
			sala6.setDestacado(1);
			sala6.setVermas("Déjate llevar por la pasión del cine en nuestra Sala Romántica. Con una atmósfera íntima y acogedora, esta sala es el escenario ideal para disfrutar de películas que despierten tus emociones más profundas. Vive momentos románticos y mágicos en nuestra Sala Romántica.");
			
			//SEPTIMA SALA
			Sala sala7 = new Sala();
			sala7.setImagen("sala7.jpg");
			sala7.setId(7);
			sala7.setNombre("AVENTURA"); //Titulo de la Sala
			sala7.setUbicacion("Sector noreste, cerca del lago.");
			sala7.setCapacidad(110);
			sala7.setCaracteristicas1("Pantalla: 16 x 8 metros, 4K");
			sala7.setCaracteristicas2("Servicios: Snack bar, Baños, Área de aventuras");
			sala7.setDestacado(1);
			sala7.setVermas("Embárcate en una emocionante aventura cinematográfica en nuestra Sala Aventura. Con una pantalla envolvente y efectos especiales impresionantes, esta sala te transportará a mundos desconocidos y te hará vivir experiencias inolvidables. Descubre la emoción en nuestra Sala Aventura.");
			
			//OCTAVA SALA
			Sala sala8 = new Sala();
			sala8.setImagen("sala8.jpg");
			sala8.setId(8);
			sala8.setNombre("CIENCIA FICCION"); //Titulo de la Sala
			sala8.setUbicacion("Sector sur, cerca del planetario.");
			sala8.setCapacidad(100);
			sala8.setCaracteristicas1("Pantalla: 15 x 8 metros, 4K");
			sala8.setCaracteristicas2("Servicios: Snack bar, Baños, Tienda temática");
			sala8.setDestacado(1);
			sala8.setVermas("Explora los límites de la imaginación en nuestra Sala Ciencia Ficción. Con una selección de películas que desafían la realidad y exploran futuros alternativos, esta sala te sumergirá en mundos fantásticos y te hará reflexionar sobre el futuro de la humanidad. Vive la ciencia ficción en nuestra Sala Ciencia Ficción.");
			
			//NOVENA SALA
			Sala sala9 = new Sala();
			sala9.setImagen("sala9.jpg");
			sala9.setId(9);
			sala9.setNombre("ANIMADA"); //Titulo de la Sala
			sala9.setUbicacion("Sector centro-oeste, área infantil.");
			sala9.setCapacidad(130);
			sala9.setCaracteristicas1("Pantalla: 17 x 9 metros, Full HD");
			sala9.setCaracteristicas2("Servicios: Snack bar, Baños, Zona de juegos");
			sala9.setDestacado(1);
			sala9.setVermas("Bienvenido a nuestra Sala Animada, donde la diversión y la alegría están garantizadas. Con una selección de películas animadas para todas las edades, esta sala es el lugar perfecto para disfrutar en familia y dejarse llevar por la magia del cine animado. Vive la aventura en nuestra Sala Animada.");
			
			//DECIMA SALA
			Sala sala10 = new Sala();
			sala10.setImagen("sala10.jpg");
			sala10.setId(10);
			sala10.setNombre("TERROR"); //Titulo de la Sala
			sala10.setUbicacion("Sector noroeste, área aislada.");
			sala10.setCapacidad(90);
			sala10.setCaracteristicas1("Pantalla: 14 x 7 metros, Full HD");
			sala10.setCaracteristicas2("Servicios: Snack bar, Baños, Zona de sustos");
			sala10.setDestacado(1);
			sala10.setVermas("Prepárate para una experiencia llena de suspenso y terror en nuestra Sala Terror. Con una selección de películas que te mantendrán al borde de tu asiento, esta sala te sumergirá en un mundo de miedo y emoción. Atrévete a adentrarte en nuestra Sala Terror, si te atreves.");
			
			
			
			
			
			//AGREGAMOS LOS 10 ELEMENTOS DE TIPO SALA A LA LISTA
			lista.add(sala1);
			lista.add(sala2);
			lista.add(sala3);
			lista.add(sala4);
			lista.add(sala5);
			lista.add(sala6);
			lista.add(sala7);
			lista.add(sala8);
			lista.add(sala9);
			lista.add(sala10);
			
			}catch (ParseException e) {
				System.out.println("Error: " + e.getMessage());
			}
	}

	@Override
	public List<Sala> buscarTodasSalas(){
		return lista;
	}
	
	@Override
	public Sala buscarPorIdSALA(Integer idSala){
		for(Sala v: lista) {
			if(v.getId() == idSala) {
				return v;
			}
		}
		return null;
	}

	@Override
	public void guardar(Sala sala) {
		// TODO Auto-generated method stub
		lista.add(sala);
	}
	
}
