static int[] extrairePairs(int[][] tab) {
	int[] preResultat = new int[tab.length*tab[0].length];
	int nbPairs = 0;
	for (int[]ligne : tab)
		for(int n : ligne)
			if (n%2==0)
