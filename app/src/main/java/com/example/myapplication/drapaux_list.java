package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import Adapter.DrapeauAdapter;
import beans.Drapeau;
import service.DrapeauService;

public class drapaux_list extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView drapeaux;
    private DrapeauService ds=DrapeauService.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drapeau_list);
        drapeaux= findViewById(R.id.liste);
        ds.create(new Drapeau("Maroc","Rabat"," Le Maroc (en arabe : المغرب, al-Maġrib ; en amazighe : ⵍⵎⵖⵔⵉⴱ18, L-Meġrib), ou depuis 1957, \n" +
                "en forme longue le Royaume du Maroc, autrefois appelé Empire chérifien, est un État unitaire régionalisé situé en Afrique du Nord.\n" +
                " Son régime politique est une Monarchie constitutionnelle semi-parlementaire unitaire et régionalisée. Sa capitale administrative et politique est Rabat et sa plus grande ville, \n " +
                "ainsi que sa capitale économique, est Casablanca.\n" +
                "Géographiquement,\n il est notamment caractérisé par des zones montagneuses ou désertiques et est l'un des seuls pays — avec l'Espagne et la France — à comporter des rives sur la mer Méditerranée d'un côté\n" +
                " et l'océan Atlantique de l'autre. Sa population est de près de 34 millions d'habitants (recensement de 2014) et sa superficie de 446 550 km219 (47,51 hab./km2), \n" +
                "ou de 710 850 km2 en incluant le Sahara occidental20,21 — ex-« Sahara espagnol », considéré comme un territoire non autonome par l'Organisation des Nations unies2 — dont il administre de facto environ 80 % et qu'il revendique dans sa totalité,\n" +
                " tout comme le Front Polisario. Sa culture est berbéro-arabe depuis plusieurs siècles,\n" +
                " et s'est étendue principalement au Maghreb et dans le Sud de l'Espagne. ",R.mipmap.maroc));

        ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));

         ds.create(new Drapeau("Maroc","Rabat"," Le Maroc (en arabe : المغرب, al-Maġrib ; en amazighe : ⵍⵎⵖⵔⵉⴱ18, L-Meġrib), ou depuis 1957, \n" +
                "en forme longue le Royaume du Maroc, autrefois appelé Empire chérifien, est un État unitaire régionalisé situé en Afrique du Nord.\n" +
                " Son régime politique est une Monarchie constitutionnelle semi-parlementaire unitaire et régionalisée. Sa capitale administrative et politique est Rabat et sa plus grande ville, \n " +
                "ainsi que sa capitale économique, est Casablanca.\n" +
                "Géographiquement,\n il est notamment caractérisé par des zones montagneuses ou désertiques et est l'un des seuls pays — avec l'Espagne et la France — à comporter des rives sur la mer Méditerranée d'un côté\n" +
                " et l'océan Atlantique de l'autre. Sa population est de près de 34 millions d'habitants (recensement de 2014) et sa superficie de 446 550 km219 (47,51 hab./km2), \n" +
                "ou de 710 850 km2 en incluant le Sahara occidental20,21 — ex-« Sahara espagnol », considéré comme un territoire non autonome par l'Organisation des Nations unies2 — dont il administre de facto environ 80 % et qu'il revendique dans sa totalité,\n" +
                " tout comme le Front Polisario. Sa culture est berbéro-arabe depuis plusieurs siècles,\n" +
                " et s'est étendue principalement au Maghreb et dans le Sud de l'Espagne. ",R.mipmap.maroc));

        ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));
          ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));
          ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));
          ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));
          ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));
          ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));
          ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));
          ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));
          ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));
          ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));
          ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));
          ds.create(new Drapeau("Espagne","Madrid"," L'Espagne est bordée au nord-est par les Pyrénées, qui constituent une frontière naturelle avec la France et l'Andorre ;\n" +
                " à l'est et au sud-est par la mer Méditerranée,\n au sud-sud-ouest par le territoire britannique de Gibraltar et le détroit du même nom, \n" +
                "ce dernier séparant le continent européen de l'Afrique.\n" +
                " Le Portugal est limitrophe de l'Espagne à l'ouest tandis que l'océan Atlantique borde le pays à l'ouest-nord-ouest ; \n" +
                "enfin le golfe de Gascogne baigne le littoral nord.\n Le territoire espagnol inclut également les îles Baléares en Méditerranée, les îles Canaries dans l'océan Atlantique au large de la côte africaine, \n" +
                "et deux cités autonomes en Afrique du Nord, Ceuta et Melilla, limitrophes du Maroc. Avec une superficie de 504 030 km2,\n" +
                " l'Espagne est le pays le plus étendu d'Europe de l'Ouest et de l'Union européenne après la France ainsi que le troisième d'Europe derrière l'Ukraine et la France si l'on exclut la partie européenne" +
                " (selon les définitions) de la Russie. ",R.mipmap.espagne));

        ds.create(new Drapeau("Belgique","Bruxelle"," La Belgique (/bɛlʒik/a Écouter ; en néerlandais : België /ˈbɛlɣiǝ/b Écouter ; en allemand : Belgien /ˈbɛlgiən/c Écouter), \n" +
                "en forme longue le royaume de Belgiqued, est un pays d’Europe de l'Ouest, bordé par la France, les Pays-Bas, l’Allemagne, \n" +
                "le Luxembourg et la mer du Nord. Politiquement, il s'agit d’une monarchie constitutionnelle fédérale à régime parlementaire. Elle est l’un des six pays fondateurs de l’Union européenne et accueille,\n" +
                " dans sa capitale Bruxelles, le Conseil de l'Union européenne, la Commission européenne, les Commissions parlementaires et six sessions plénières additionnelles du Parlement européen, \n" +
                "ainsi que d’autres organisations internationales comme l’OTAN. Le pays accueille également, à Mons, le Grand Quartier général des puissances alliées en Europe (SHAPE). \n" +
                "La Belgique couvre une superficie de 30 688 km23 avec une population de 11 507 163 habitants au 1er janvier 20211, soit une densité de 373,97 habitants/km2.\n" +
                ""+ "\nSituée à mi-chemin entre l’Europe germanique et l’Europe romane, la Belgique abrite principalement deux groupes linguistiques : les francophones, membres de la Communauté française et les néerlandophones, membres de la Communauté flamande.\n" +
                " Elle comprend également une minorité germanophone représentant environ 1 % de la population et constituant la Communauté germanophone de Belgique. ",R.mipmap.belgique));

        ds.create(new Drapeau("France","Paris"," La France (Écouter), en forme longue depuis 1875 la République française (Écouter), est un État souverain transcontinental dont le territoire métropolitain est situé en Europe de l'Ouest et dont le territoire ultramarin est situé dans les océans Indien,\n" +
                " Atlantique et Pacifique ainsi qu'en Amérique du Sud. Il s'agit du seul pays au monde à s'étendre sur treize fuseaux horaires.\n" +
                " Le pays a des frontières terrestres avec la Belgique, le Luxembourg, l'Allemagne, la Suisse, l'Italie, l'Espagne et les deux principautés d'Andorre et de Monaco en Europe,\n" +
                " auxquelles s'ajoutent les frontières terrestres avec le Brésil, le Suriname et les Pays-Bas aux Amériques.\n" +
                " La France dispose d'importantes façades maritimes sur l'Atlantique, la Méditerranée, le Pacifique et l'océan Indien, \n" +
                "lui permettant de bénéficier de la deuxième plus vaste zone économique exclusive du monde6. ",R.mipmap.lafrance));
        ds.create(new Drapeau("Etat-Unis","Washington"," Les États-Unis (/e.ta.z‿y.ni/, en forme longue les États-Unis d'AmériqueN 1, également appelés informellement les USA ou moins exactement l’Amérique (en anglais :\n" +
                " United States, United States of America, US, USA, America), sont un État transcontinental dont la majorité du territoire se situe en Amérique du Nord.\n" +
                " Les États-Unis ont la structure politique d'une république constitutionnelle et d'un État fédéral à régime présidentiel, composé de cinquante États.\n" +
                "\n" +
                "48 des 50 États sont adjacents et forment le Mainland. Celui-ci est encadré par l'océan Atlantique à l'est,\n" +
                " le golfe du Mexique au sud-est et l'océan Pacifique à l'ouest, et se trouve bordé au nord par le Canada et au sud-ouest par le Mexique.\n" +
                " Les deux États de l’Union non limitrophes sont l'Alaska, au nord-ouest du Canada, et Hawaï, un archipel au milieu de l'océan Pacifique nord. \n" +
                "De plus, le pays comprend quatorze territoires insulaires disséminés dans la mer des Caraïbes et le Pacifique. La géographie et le climat du pays sont extrêmement diversifiés, \n" +
                "abritant une grande variété de faune et de flore, faisant des États-Unis l'un des 17 pays mégadivers de la planète4. ",R.mipmap.us));




        drapeaux.setAdapter(new DrapeauAdapter(this, ds.findAll()));
        drapeaux.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
       TextView idd = view.findViewById(R.id.idd);
        Intent intent = new Intent(drapaux_list.this, DetailsDrapeau.class);
        intent.putExtra("idd", idd.getText().toString());
        startActivity(intent);
    }
}