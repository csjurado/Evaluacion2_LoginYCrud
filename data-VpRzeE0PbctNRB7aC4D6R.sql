DROP TABLE IF EXISTS `myTable`;

CREATE TABLE `myTable` (
  `id` mediumint(8) unsigned NOT NULL auto_increment,
  `IDusuario` mediumint,
  `Nombre` varchar(255) default NULL,
  `Pais` varchar(100) default NULL,
  `Telefono` varchar(100) default NULL,
  `Ciudad` varchar(255),
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `myTable` (`IDusuario`,`Nombre`,`Pais`,`Telefono`,`Ciudad`)
VALUES
  (1,"Brenda Clark","France","1-683-641-4161","Przemyśl"),
  (2,"Clio Witt","Russian Federation","(555) 259-3554","Lagos"),
  (3,"Zachary Gould","India","1-896-264-7881","Villahermosa"),
  (4,"Theodore Best","Sweden","1-337-333-6637","Bruckneudorf"),
  (5,"Ivana Fowler","Australia","1-764-541-4834","Invercargill"),
  (6,"Audra Zimmerman","Mexico","(784) 473-4485","Port Harcourt"),
  (7,"Eliana Fernandez","Colombia","1-171-771-2572","Westport"),
  (8,"Shad Oliver","Colombia","1-648-243-6421","Izmail"),
  (9,"Yvonne Lawrence","Germany","1-377-598-1011","Nicoya"),
  (10,"Jamalia Johnson","Indonesia","1-185-511-0807","Sokoto");
INSERT INTO `myTable` (`IDusuario`,`Nombre`,`Pais`,`Telefono`,`Ciudad`)
VALUES
  (11,"Giselle Harvey","South Africa","1-256-990-1893","Padang Panjang"),
  (12,"Amethyst Maxwell","France","1-282-373-7565","Stratford"),
  (13,"Maite Silva","United States","(316) 840-5218","Palmerston North"),
  (14,"Slade Bentley","Pakistan","(795) 876-8486","Imphal"),
  (15,"Diana Le","Singapore","1-811-756-8972","Doetinchem"),
  (16,"Camille Horton","Poland","(715) 660-6242","Böblingen"),
  (17,"Amal Whitney","Spain","1-612-449-3618","Arviat"),
  (18,"Melyssa Waters","Spain","1-450-942-7687","Cork"),
  (19,"Lani Mcgowan","South Korea","(780) 349-2309","Caxias do Sul"),
  (20,"Xander Burke","Brazil","(725) 343-6282","Białystok");
INSERT INTO `myTable` (`IDusuario`,`Nombre`,`Pais`,`Telefono`,`Ciudad`)
VALUES
  (21,"Alvin Acevedo","China","1-823-756-4619","Kovel"),
  (22,"Sydnee Palmer","Spain","1-334-464-8851","Johannesburg"),
  (23,"Harrison Dickerson","Philippines","1-282-540-9141","Cork"),
  (24,"Brynn Wilkerson","Singapore","1-728-227-5903","Hangu"),
  (25,"Carly Sanford","Colombia","(837) 173-8820","Pasir Ris"),
  (26,"Hayden Hardy","Mexico","(243) 434-5601","Teruel"),
  (27,"Kasimir Dillon","Brazil","1-173-113-3717","Cholet"),
  (28,"Cecilia Macdonald","Austria","1-537-327-5733","Charlottetown"),
  (29,"Drew Sanford","Philippines","(434) 937-1736","Levanger"),
  (30,"Galvin Merritt","United Kingdom","(557) 501-4353","Jambi");
INSERT INTO `myTable` (`IDusuario`,`Nombre`,`Pais`,`Telefono`,`Ciudad`)
VALUES
  (31,"Allegra Larsen","Nigeria","1-588-288-4236","Whitehorse"),
  (32,"Cassidy Davidson","Ukraine","(723) 615-6268","Cork"),
  (33,"Jakeem Newton","United Kingdom","1-151-664-7356","Galway"),
  (34,"Dorothy Hutchinson","Italy","1-586-468-7418","Vienna"),
  (35,"Lunea Gaines","Brazil","(557) 647-6200","Kursk"),
  (36,"Clark Mclaughlin","Peru","1-149-225-0629","Ashburton"),
  (37,"Yuri Bruce","Singapore","1-476-655-2798","Haguenau"),
  (38,"Sierra Townsend","China","(952) 436-8363","Butte"),
  (39,"Jonas Roberson","Australia","1-469-614-5364","Dublin"),
  (40,"Leilani Mueller","Philippines","(792) 445-7224","Bundaberg");
INSERT INTO `myTable` (`IDusuario`,`Nombre`,`Pais`,`Telefono`,`Ciudad`)
VALUES
  (41,"Althea Leblanc","Italy","1-262-338-8158","Hamoir"),
  (42,"Martin Conway","Norway","(208) 216-8526","Antibes"),
  (43,"Flavia Kirk","Austria","(665) 984-2383","Torrevieja"),
  (44,"Guinevere Russo","Colombia","1-488-455-3736","Vienna"),
  (45,"Lani Shepherd","Austria","1-491-224-1672","Port Nolloth"),
  (46,"Nerea Barton","Chile","1-985-523-3638","Galway"),
  (47,"Priscilla Gibson","South Africa","1-151-633-8803","Frederikstad"),
  (48,"Malik Finley","New Zealand","(353) 774-2758","Coquimbo"),
  (49,"Felicia Holmes","Norway","(283) 850-5290","Mâcon"),
  (50,"Jelani Daniels","India","(351) 545-5394","Semarang");
INSERT INTO `myTable` (`IDusuario`,`Nombre`,`Pais`,`Telefono`,`Ciudad`)
VALUES
  (51,"Quemby Willis","South Korea","1-923-762-5857","Dutse"),
  (52,"Chaney Owens","Norway","(949) 760-4325","Sumy"),
  (53,"Jared Guy","Spain","(257) 235-9593","Yunnan"),
  (54,"Forrest Davenport","Spain","1-368-914-5675","Elx"),
  (55,"Kasimir Moss","Peru","1-333-718-4218","Napier"),
  (56,"Hunter Larson","Nigeria","1-572-749-4147","Cametá"),
  (57,"Xyla Perez","Austria","1-814-437-3531","Camaragibe"),
  (58,"Beau Woodward","United States","1-457-342-3123","Watson Lake"),
  (59,"Finn Walsh","Canada","1-353-330-4591","Valencia"),
  (60,"Patrick Waller","Philippines","1-300-572-5675","Uijeongbu");
INSERT INTO `myTable` (`IDusuario`,`Nombre`,`Pais`,`Telefono`,`Ciudad`)
VALUES
  (61,"Carson Barrett","United States","1-472-120-0057","Belfast"),
  (62,"Maisie Torres","Costa Rica","1-688-485-6574","Olinda"),
  (63,"Amos Calderon","Colombia","1-866-466-7168","Bedok"),
  (64,"Kermit Frazier","Russian Federation","1-828-231-2531","San Diego"),
  (65,"Melvin Hardin","Turkey","(267) 535-0341","Cần Thơ"),
  (66,"Myra Bender","South Korea","1-234-872-5123","Valladolid"),
  (67,"Britanni Fischer","Australia","1-456-357-3343","Chungju"),
  (68,"Elvis Sawyer","South Africa","(644) 473-2425","Heilongjiang"),
  (69,"Sharon Estrada","Vietnam","1-623-453-9947","Dalcahue"),
  (70,"Sheila Burnett","Singapore","(515) 348-3822","Oslo");
INSERT INTO `myTable` (`IDusuario`,`Nombre`,`Pais`,`Telefono`,`Ciudad`)
VALUES
  (71,"Sawyer Deleon","Poland","(323) 775-4394","Biggleswade"),
  (72,"Driscoll Snyder","Austria","(315) 359-3011","Enkhuizen"),
  (73,"Jaquelyn Castro","Spain","1-213-859-4861","Bremen"),
  (74,"Teagan Maldonado","United Kingdom","(863) 510-1412","Lanco"),
  (75,"Rama Moss","Costa Rica","(527) 979-0081","Vĩnh Long"),
  (76,"Yvette Kelley","Costa Rica","(427) 695-6791","Pangkalpinang"),
  (77,"Fritz Sullivan","United States","(224) 701-2688","Caxias"),
  (78,"Kelsey Gates","Colombia","1-504-318-1967","Secunda"),
  (79,"Jason Britt","Spain","1-587-757-4654","San Rafael"),
  (80,"Charde Tanner","Russian Federation","(345) 685-4174","Chalon-sur-Saône");
INSERT INTO `myTable` (`IDusuario`,`Nombre`,`Pais`,`Telefono`,`Ciudad`)
VALUES
  (81,"Abdul Warner","Peru","1-983-308-6477","Benalla"),
  (82,"Clare Whitaker","Pakistan","1-208-421-2629","Aizwal"),
  (83,"Xander Bond","Germany","(811) 813-1010","Ravels"),
  (84,"Hollee Clark","China","1-112-148-3176","Toruń"),
  (85,"Guinevere Everett","Australia","(488) 831-7784","Alingsås"),
  (86,"Phoebe Frye","Singapore","(308) 530-8877","Port Harcourt"),
  (87,"Chloe Joseph","Canada","1-297-738-3858","Colchane"),
  (88,"Kirby Mcdowell","Austria","(690) 516-2522","Kalush"),
  (89,"Shelly Stokes","Nigeria","(486) 555-7118","Magadan"),
  (90,"Quentin Rutledge","Australia","1-936-842-8135","Lagos");
INSERT INTO `myTable` (`IDusuario`,`Nombre`,`Pais`,`Telefono`,`Ciudad`)
VALUES
  (91,"Rae Stokes","Nigeria","1-457-734-7601","Kędzierzyn-Koźle"),
  (92,"Wynter Barr","Singapore","1-496-308-1547","Lexington"),
  (93,"Alea Weiss","Italy","1-259-161-4478","Tarnów"),
  (94,"Karyn Ford","Germany","1-144-460-1572","Ercilla"),
  (95,"Idola Moss","Ireland","1-252-452-4234","Port Nolloth"),
  (96,"Aimee Beasley","China","(738) 446-6214","Vienna"),
  (97,"Addison Spencer","Vietnam","1-497-414-6207","Coatzacoalcos"),
  (98,"Burton Strickland","Poland","1-360-318-3012","Trubchevsk"),
  (99,"Larissa Cash","Belgium","1-425-645-1744","Mérida"),
  (100,"Georgia Lester","Nigeria","(429) 645-4754","Koronadal");
