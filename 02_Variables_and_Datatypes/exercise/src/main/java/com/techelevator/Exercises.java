package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRacoonsPlaying = 3;
		int numberOfRacoonsGoHome = 2;
		int numberOfRacoonsLeft = numberOfRacoonsPlaying - numberOfRacoonsGoHome;

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberOfBeesVsFlowers = numberOfFlowers - numberOfBees;


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int pigeonEatingCrumbs = 1;
		int newPigeonFriend = 1;
		int numberOfPigeonsEatingBreadcrumbs = pigeonEatingCrumbs + newPigeonFriend;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int numberOfOwlsOnFence = 3;
		int newOwlFriends = 2;
		int totalNumberOfOwlsOnFence = numberOfOwlsOnFence + newOwlFriends;


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int beaversBuildingHome = 2;
		int beaversGoingForSwim = 1;
		int beaversDoingAllTheWork = beaversBuildingHome - beaversGoingForSwim;


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansOnLimb = 2;
		int newToucanFriend = 1;
		int numberOfToucansOnLimb = toucansOnLimb + newToucanFriend;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int numberOfSquirrelsVsNuts = numberOfSquirrels - numberOfNuts;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter = 0.25;
		double dime = 0.10;
		double nickle = 0.05;
		double moneyMrsHiltFound = quarter + dime + (2 * nickle);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int muffinsMrsBrier = 18;
		int muffinsMrsMacAdams = 20;
		int muffinsMrsFlannery = 17;
		int totalFirstGradeMuffins = muffinsMrsBrier + muffinsMrsMacAdams + muffinsMrsFlannery;


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		double yoyoCost = 0.24;
		double whistleCost = 0.14;
		double totalSpendOnToys = yoyoCost + whistleCost;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int snowAtHiltsHouse = 29;
		int snowAtBrecknockElementary = 17;
		int diffInSnow = snowAtHiltsHouse - snowAtBrecknockElementary;

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double moneyHiltHas = 10.00;
		double costOfToyTruck = 3.00;
		double costOfPencil = 2.00;
		double moneyHiltHasLeft = (moneyHiltHas - costOfToyTruck) - costOfPencil;

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marblesJoshHas = 16;
		int marblesJoshLost = 7;
		int marblesJoshHasRemaining = marblesJoshHas - marblesJoshLost;


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int seashellsMeganHas = 19;
		int seashellsMeganWants = 25;
		int seashellsMeganNeeds = seashellsMeganWants - seashellsMeganHas;


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int ballonsBradHas = 17;
		int redBallonsBradHas = 8;
		int greenBallonsBradHas = ballonsBradHas - redBallonsBradHas;


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int booksOnShelf = 38;
		int marthasBooks = 10;
		int totalBooksOnShelf = booksOnShelf + marthasBooks;


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int legsOnOneBee = 6;
		int amountOfBees = 8;
		int amountOfLegs = amountOfBees * legsOnOneBee;

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		double costOfIcecreamCone = 0.99;
		double conesHiltBuys = 2.0;
		double hiltSpendsOnCones = conesHiltBuys * costOfIcecreamCone;


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksHiltGoal = 125;
		int rocksHiltHas = 64;
		int rockHiltNeed = rocksHiltGoal - rocksHiltHas;


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int marblesHiltHas = 38;
		int marbleHiltLost = 15;
		int marbleHiltLeft = marblesHiltHas - marbleHiltLost;


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int hiltConcertDistance = 78;
		int hiltGasStop = 32;
		int hiltHasLeftToDrive = hiltConcertDistance - hiltGasStop;


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int minutesInHour = 60;
		int minutesSpentShovelingSaturdayMorning = minutesInHour + 30;
		int minutesSpentShovelingSaturdayAfternoon = 45;
		int totalTimeShoveling = minutesSpentShovelingSaturdayMorning + minutesSpentShovelingSaturdayAfternoon;


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double hotDogsHiltBought = 6.0;
		double costOfEachHotDog = 0.50;
		double moneyHiltSpentOnHotDogs = hotDogsHiltBought * costOfEachHotDog;

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double hiltsMoneyForPencils = 0.50F;
		double pencilCosts = 0.07F;
		int pencilsHiltCanBuy = (int) (hiltsMoneyForPencils/pencilCosts);


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterfliesSeen = 33;
		int orangeButterflies = 20;
		int redButterflies = butterfliesSeen - orangeButterflies;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double moneyKateGave = 1.00;
		double costOfCandy = 0.54;
		double changeKateGets = moneyKateGave - costOfCandy;


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesMarcHasPlanted = 13;
		int treesMarcMayPlant = 12;
		int amountOfTreesIfMarcPlants = treesMarcHasPlanted + treesMarcMayPlant;


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int hoursInDay = 24;
		int daysUntilJoySeesGrandma = 2;
		int hoursUntilJoySeesGrandma = hoursInDay * daysUntilJoySeesGrandma;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimsCousins = 4;
		int gumToEachCousin = 5;
		int gumKimNeeds = kimsCousins * gumToEachCousin;


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		double dansMoney = 3.00;
		double costOfCandyBar = 1.00;
		double moneyDanHasLeft = dansMoney - costOfCandyBar;


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int amountOfBoatsInLake = 5;
		int peopleInEachBoat = 3;
		int peopleInLake = amountOfBoatsInLake * peopleInEachBoat;


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellensLegos = 380;
		int lostLegos = 57;
		int legosEllenHasLEft = ellensLegos - lostLegos;


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int arthursMuffins = 35;
		int arthurWantsMuffins = 83;
		int muffinsArthurHasLeftToBake = arthurWantsMuffins - arthursMuffins;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int willysCrayons = 1400;
		int lucyCrayons = 290;
		int willVsLucyCrayons = willysCrayons - lucyCrayons;

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int pagesYouHave = 22;
		int stickersYouHave = stickersOnPage * pagesYouHave;


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double cupcakes = 100.0;
		double children =8.0;
		double cupcakesPerChild = cupcakes/children;


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int numberOfGingerBreadCookies = 47;
		int cookiesInEachJar = 6;
		int cookiesNotInJars = numberOfGingerBreadCookies % cookiesInEachJar;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */

		int croissantsMade = 59;
		int numberOfNeighborsGettingCroissants = 8;
		int croissantsLeft = croissantsMade % numberOfNeighborsGettingCroissants;


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int oatmealCookiesMade = 276;
		int oatmealCookiesOnTray = 12;
		int numberOfTraysNeeded = oatmealCookiesMade/oatmealCookiesOnTray;


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int biteSizedPretzels = 480;
		int servingSizePretzels = 12;
		int servingOfPretzels = biteSizedPretzels/servingSizePretzels;



        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakesMade = 53;
		int giftBoxLemonCupcakes = 3;
		int actualLemonCupcakes= lemonCupcakesMade - 2;
		int giftBoxesLemonCupcakesGiven = actualLemonCupcakes / giftBoxLemonCupcakes;

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticksMade = 74;
		int numberOfPeopleCarrots = 12;
		int carrotsLeftUneaten = carrotSticksMade % numberOfPeopleCarrots;


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int numberOfTeddys = 98;
		int shelvesCapacityForTeddys = 7;
		int shelvesFullOfTeddys = numberOfTeddys / shelvesCapacityForTeddys;

        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int numberOfPictures = 480;
		int albumCapacity = 20;
		int familyAlbums = numberOfPictures / albumCapacity;


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int tradingCards = 94;
		int boxCapacityForTradingCards = 8;
		int fullBoxTradingCards = tradingCards / boxCapacityForTradingCards;
		int unfilledBoxTradingCards = tradingCards % boxCapacityForTradingCards;

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int susieDadBooks = 210;
		int susieDadShelves = 10;
		int booksOnShelves = susieDadBooks / susieDadShelves;

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double cristinaCroissants = 17.0;
		double cristinaGuests = 7.0;
		double christaServingCroissant = cristinaCroissants / cristinaGuests;


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double billsTime = 1/2.15f;
		double jillsTime = 1/1.90f;
		double combinedTime = billsTime + jillsTime;
		double hourToPaintTotalRooms = 5/combinedTime;




	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hopper";
		String middleInitial = "B";
		String fullName = lastName + ", " + firstName + " " + middleInitial +".";


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		float distanceNYtoChicago = 800f;
		float distanceTraveled = 537f;
		int percentOfTripComplete = (int)((distanceTraveled/distanceNYtoChicago)*100);

	}

}
