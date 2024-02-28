public class Main {
    public static void main(String[] args) {
        var cat = 3.6;
        var dog = 8.0;
        var paper = 763789;
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(paper);

        cat += 4;
        dog += 4;
        paper +=4;
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(paper);

        cat -= 1.6;
        dog -= 3.5;
        paper -= 7639;
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var totalWeightFighters = firstFighter + secondFighter;
        System.out.println("Общий вес двух бойцов = " + totalWeightFighters + " кг!");
        var weightDifference = secondFighter - firstFighter;
        System.out.println("Разница в весе между двумя бойцами = " + weightDifference + " кг!");
        var weightDifference2 = secondFighter % firstFighter;
        System.out.println("Разница в весе между двумя бойцами 2 способ = " + weightDifference2 + " кг!");

        var totalTime = 640;
        var totalWorker = totalTime / 8;
        System.out.println("Общее число работников = " + totalWorker + " работников.");
        var totalWorkerPlus = (totalWorker + 94) * 8;
        System.out.println("Между работниками может быть поделено = " + totalWorkerPlus + " часа.");

        int bottleInMinute = 8;
        int bottleIn20Minute = 20 * bottleInMinute;
        System.out.println("За 20 мин = " + bottleIn20Minute);
        int minuteInHour = 60;
        int minuteInDay = (24 * minuteInHour) * bottleInMinute;
        System.out.println("За сутки = " + minuteInDay);
        int bottleInThreeDays = minuteInDay * 3;
        System.out.println("За 3 дня = " + bottleInThreeDays);
        int bottleInMounth = minuteInDay * 30;
        System.out.println("За месяц = " + bottleInMounth);

        int totalJarPaint = 120;
        int brownPaint = 4;
        int whitePaint = 2;
        int classOfSchool = totalJarPaint / (brownPaint + whitePaint);
        int totalBrownPaint = classOfSchool * brownPaint;
        int totalWhitePaint = classOfSchool * whitePaint;
        System.out.println("В школе, где " + classOfSchool + " классов, надо " + totalWhitePaint + " банок белой краски"
                + " и " + totalBrownPaint + " банок коричневой краски.");


        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int totalWeightGramm = bananas + milk + iceCream + eggs;
        System.out.println("Вес в граммах = " + totalWeightGramm);
        float totalWeightKg = totalWeightGramm / 1000f;
        System.out.println("Вес в КГ = " + totalWeightKg);


        int startWeightKg = 7;
        int startWeightGr = startWeightKg * 1000;
        int weightMinGr = 250;
        int weightMaxGr = 500;
        int loseWeightMinDay = startWeightGr / weightMinGr;
        int loseWeightMaxDay = startWeightGr / weightMaxGr;
        System.out.println("Если спортсмен будет терять каждый день по 250гр то ему надо дней = "
            + loseWeightMinDay + " , а если по 500 гр, тогда " + loseWeightMaxDay + " дней.");
        int avarageWeight = startWeightGr / ((weightMinGr + weightMaxGr) / 2);
        System.out.println("в среднем потребуется = " + avarageWeight + " дней.");


        int go = 9;
    }
}
