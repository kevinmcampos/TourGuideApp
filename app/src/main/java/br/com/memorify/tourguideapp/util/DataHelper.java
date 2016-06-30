package br.com.memorify.tourguideapp.util;

import android.support.annotation.NonNull;

import java.util.ArrayList;

import br.com.memorify.tourguideapp.model.Place;

public class DataHelper {

    private static ArrayList<Place> places;

    private static void loadInitialData() {
        places = new ArrayList<>();
        places.add(new Place(Place.Type.BEACH, "Lagoinha do Leste", "Pântano do Sul", "lagoinha_do_leste", "A Praia da Lagoinha do Leste é uma praia brasileira, situada na cidade de Florianópolis, no estado de Santa Catarina. Está localizada no sudeste da Ilha de Santa Catarina. Recebe o mesmo nome da lagoa em formato de 'S' presente na praia."));

        places.add(new Place(Place.Type.BEACH, "Jurerê Beach", "Jurerê", "jurere", "Jurerê é um bairro nobre e uma praia situada na Zona Norte catarinense, entre as praias de Canasvieiras e do Forte, Florianópolis. Localizado no Norte da Ilha de Santa Catarina, em Florianópolis SC, Jurerê Internacional é um empreendimento imobiliário, um residencial e resort desenvolvido pelo Grupo Habitasul, ao lado da praia de Jurerê Tradicional. \n" +
                "\n" +
                "Jurerê Internacional é, hoje, referência em urbanização orgânica e sustentabilidade para todo o País. Por trás desse sucesso, estão os princípios e diretrizes definidos pela Habitasul há mais de 30 anos, quando foi criado o residencial."));

        places.add(new Place(Place.Type.BEACH, "Joaquina Beach", "Retiro", "joaquina", "Praia da Joaquina é uma praia oceânica da cidade brasileira de Florianópolis, ao leste da ilha de Santa Catarina, ao sul do Brasil. O ponto procurado por surfistas, já foi sede de alguns campeonatos mundiais de surfe.\n" +
                "\nA denominação da praia é recente, aparecendo pela primeira vez em mapas a partir de 1975. Até então, era chamada de praia do Campeche. A Praia da Joaquina pertence ao Distrito da Lagoa da Conceição e dista 15 km do Centro da Cidade de Florianópolis na direção nordeste. Possui 3.000 metros de extensão e sua largura varia de 8 a 70 metros. A Praia da Joaquina, ou Joaca, foi descoberto por surfistas, primeiro os brasileiros e depois os estrangeiros, a partir da década de 1970."));

        places.add(new Place(Place.Type.RESTAURANTS, "Ostradamus", "Ribeirão", "ostradamus", "A história de Jaime José de Barcelos surge no Ribeirão da Ilha – Florianópolis/SC, um nativo local que começou a vida com uma oficina mecânica de automóveis na região. Em 1997, Jaime resolveu transformar a oficina em uma lanchonete, oferecendo sorvetes, caldo de cana, água de coco e cachorro quente. \n" +
                "\n" +
                "Com o crescimento da produção das ostras, Jaime resolveu inovar e ampliou o local para atender uma procura constante de turistas e clientes locais por essa iguaria. Servindo ostras ao natural, ao bafo e gratinadas, nasce o Ostradamus. \n" +
                "\n" +
                "Como o fluxo de clientes aumentava gradativamente, Jaime decidiu ampliar as delícias gastronômicas servidas em seu restaurante. Sem muita prática na confecção de pratos mais elaborados, começou a freqüentar restaurantes do centro da cidade e feiras gastronômicas pelo Brasil. Uma grande inspiração do empresário foi ter como referências, chefes locais como Sônia Jendiroba, Zeca D’Acâmpora e Jonas Pacheco. \n"));

        places.add(new Place(Place.Type.RESTAURANTS, "Gourmet Market Burger", "Coqueiro", "gourmet_market", "Inaugurado em 2013, o Gourmet Burger Market - GBM para os íntimos - surgiu com a missão de dar um toque gourmet ao sanduíche nosso de cada dia.\n" +
                "\n" +
                "No cardápio, receitas inovadoras e originais, sempre preparadas com os melhores ingredientes do mercado.\n" +
                "\n" +
                "Tudo isso num ambiente aconchegante e moderno, ideal para passar bons momentos a dois, com a família ou os amigos.\n" +
                "\n" +
                "Se você, assim como a gente, é apaixonado por hambúrguer, seja bem-vindo: você está no lugar certo."));

        places.add(new Place(Place.Type.COMPANY, "nKey Mobile Solutions", "Itacorubi", "nkey", "A nKey é uma empresa dedicada ao desenvolvimento de aplicativos móveis corporativos, localizada em Florianópolis, Santa Catarina. Nosso objetivo é criar soluções eficientes que proporcionam uma ótima experiência aos usuários."));

        places.add(new Place(Place.Type.COMPANY, "Softplan", "Itacorubi", "softplan", "A Softplan é uma das maiores empresas do Brasil no desenvolvimento de softwares de gestão. Atualmente suas soluções estão presentes em todos os estados brasileiros, em países da América Latina e nos Estados Unidos, fazendo a diferença na vida das pessoas. Desde 1990, a companhia atua de modo a tornar a gestão pública e privada no Brasil mais transparente, eficiente e ágil com o uso de tecnologias modernas e inovadoras. Ao longo desses anos, a Softplan se especializou no desenvolvimento e na implantação de softwares de gestão para os segmentos de Justiça, Infraestrutura e Obras, Gestão Pública, Projetos Cofinanciados por Organismos Internacionais e Indústria da Construção."));

        places.add(new Place(Place.Type.RESTAURANTS, "Forneria Catarina", "Santa Mônica", "forneria", "No information."));

        places.add(new Place(Place.Type.RESTAURANTS, "Delícias do Campo", "Saco Grande", "delicias", "Servimos almoço e café colonial!!\n" +
                "Sempre de segunda a sábado\n" +
                "Almoço buffet livre das 11:30 as 15:00hs.\n" +
                "Café colonial das 16:30 as 19:30hs\n" +
                "Reservamos para o café colonial no telefone 3238-6110\n" +
                "Valor do Almoço de segunda a sexta R$15,00 e sábado R$20,00 por pessoa.\n" +
                "Café colonial R$36,00 por pessoa."));

        places.add(new Place(Place.Type.ATTRACTION, "Forte de Santana do Estreito", "Estreito", "santana", "O Forte de Sant'Ana do Estreito, ou simplesmente Forte de Santana, localiza-se na cidade de Florianópolis, estado de Santa Catarina, no Brasil.\n" +
                "\n" +
                "Em posição dominante na altura do estreito entre a ilha de Santa Catarina e o continente, destinava-se à defesa do antigo ancoradouro da Vila de Nossa Senhora do Desterro (hoje cidade de Florianópolis)."));

        places.add(new Place(Place.Type.ATTRACTION, "Ponte Hercílio Luz", "Estreito e Centro", "ponte", "A ponte Hercílio Luz está localizada em Florianópolis, no estado brasileiro de Santa Catarina. A ponte foi construída com o objetivo de ligar a parte insular da capital do estado, na ilha de Santa Catarina, à sua parte continental, visando substituir o antigo serviço de ligação por balsas.\n" +
                "\n" +
                "A ponte Hercílio Luz é a maior ponte pênsil do Brasil e possui o 132º maior vão pênsil do mundo. Teve sua construção iniciada em 14 de novembro de 1922 e foi inaugurada em 13 de maio de 1926. A ponte tem 821,005 m de comprimento total, sendo formada pelos viadutos de acesso do continente, com 222,504 m, da ilha, com 259,08 m, e pelo vão central pênsil, que tem 339,471 m de extensão.[1]"));

        places.add(new Place(Place.Type.ATTRACTION, "Praça XV de Novembro", "Centro", "xv", "Conta-se que a Figueira Centenária tenha nascido em 1871, dentro de um pequeno jardim circular, em frente à Igreja Matriz. Em 1891 foi transplantada para a Praça XV de Novembro, onde se encontra até hoje. A árvore sobre a qual se referem os versos ilhéus possui diversas superstições e simpatias a seu respeito. Seus grandes galhos se estendem por boa parte da Praça XV de Novembro, e hoje são sustentados por hastes de metal, que preservam a estrutura da velha árvore, e que proporciona ótima sombra para os que estão de passagem pela Praça XV."));
    }

    public static ArrayList<Place> getPlacesByType(@NonNull Place.Type type) {
        if (places == null) {
            loadInitialData();
        }
        ArrayList<Place> placesByType = new ArrayList<>();
        for (Place place : places) {
            if (place.type == type)
            placesByType.add(place);
        }
        return placesByType;
    }

}
