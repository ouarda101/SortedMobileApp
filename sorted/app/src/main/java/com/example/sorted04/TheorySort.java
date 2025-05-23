package com.example.sorted04;

import android.widget.TextView;

public class TheorySort {
    public void setTheory(TextView mTextView, String theories){

        mTextView.findViewById(R.id.theory);

        mTextView.setText (theories);

    }
    public static final String THEORY_BUBBLE_SORT = "  Tri a Bulles : \n" +
            "\n" +
            "En partant du premier index, comparez le premier et le deuxième éléments. \n " +
            "Si le premier élément est supérieur au deuxième élément, ils sont échangés.\n"  +
            "Maintenant, comparez les deuxième et troisième éléments.\n" +
            "Échangez-les s'ils ne sont pas en règle.\n" +
            "Le processus ci-dessus se poursuit jusqu'au dernier élément. \n " +
            "Le même processus se poursuit pour les itérations restantes. \n" +
            "Après chaque itération, le plus grand élément parmi les éléments non triés est placé à la fin. \n " +
            "À chaque itération, la comparaison a lieu jusqu'au dernier élément non trié. \n" +
            "Le tableau est trié lorsque tous les éléments non triés sont placés à leurs positions correctes.\n " +
            "\n" +
            "Complexity: O(n2). \n " ;
    public static final String THEORY_SELECTION_SORT = " Tri par selection : \n" +
            "\n" +
            "Définissez le premier élément comme minimum.\n" +
            "Comparez le minimum avec l'element second .\n" +
            "Si cet element is plus petit que le minimum , definisser le en minimum . \n" +
            "Le processus ci-dessus se poursuit jusqu'au dernier élément . \n"+
            "A chaque iteration , le minimum est placé au debut de la liste non triée . \n" +
            "\n"+
            "Complexity: O(n^2) . \n" ;

    public static final String THEORY_QUICK_SORT = " Tri rapide : \n" +
            "\n" +
            "Un element pivot est choisi du tableau. \n " +
            "on peut choisir n'importe quel element du tableau .\n" +
            "Les éléments plus petits que l'élément pivot sont placés à gauche " +"\n"+
            "et les éléments supérieurs à l'élément pivot sont placés à droite. \n" +
            "\n" +
            "Les éléments de pivot sont à nouveau choisis séparément pour" +"\n"+
            " les sous-parties gauche et droite.\n" +
            "dans ces sous-parties , les elements pivots sont placés a droite. \n " +
            "etape 2 est repetée. \n"+
            "Les sous-parties sont à nouveau divisées en sous-parties plus" +"\n"+
            " petites jusqu'à ce que chaque sous-partie soit formée d'un seul élément. \n"+
            "a ce point , le tableau est trié . \n" ;


    public static final String THEORY_INSERTION_SORT = " Tri par insertion : \n" +
            "\n" +
            "Le premier élément du tableau est supposé être trié.\n " +
            "Prenez le deuxième élément et stockez-le séparément dans la clé.\n" +
            "Comparer la cle avec le premier element.Si le premier element est plus grand que la clé, " +
            "la clé est placé avant le premier element.\n" +
            "maintenant , les deux premiers element sont triés.\n"+
            "Prenez le troisième élément et comparez-le avec les éléments à gauche .\n" +
            " Placé juste derrière l'élément plus petit que lui. \n" +
            "S'il n'y a pas d'élément plus petit que lui, placez-le au début du tableau.\n" +
            "De même, placez chaque élément non trié à sa position correcte.\n" ;



    public static final String THEORY_MERGE_SORT = " Tri par fusion : \n" +
            "\n" +
            "La fonction MergeSort divise à plusieurs reprises le tableau en deux moitiés \n" +
            " jusqu'à ce que nous atteignions un stade où nous essayons d'effectuer MergeSort sur un sous-tableau de taille 1.\n" +
            "Après cela, la fonction de fusion entre en jeu et combine les tableaux triés en plus grands tableaux \n" +
            "jusqu'à ce que l'ensemble du tableau soit fusionné.\n" ;





}