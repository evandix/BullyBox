package com.androidy.myapplication;

import java.util.Random;

/**
 * Created by christinajackey on 1/8/15.
 */
public class theFacts {

    public String getFact() {


        String facts[] = {
                "The numbers '172' can be found on the back of the U.S. $5 dollar bill in the bushes at the base of the Lincoln Memorial.",
                "President Kennedy was the fastest random speaker in the world with upwards of 350 words per minute.\n" +
                        "\n",
                "In the average lifetime, a person will walk the equivalent of 5 times around the equator.",
                "Odontophobia is the fear of teeth.",
                "The 57 on Heinz ketchup bottles represents the number of varieties of pickles the company once had.",
                "Cats sleep 16 to 18 hours per day.",
                "The most common name in the world is Mohammed.",
                "When you die your hair still grows for a couple of months.",
                "The most money ever paid for a cow in an auction was $1.3 million.",
                "1 in 5,000 north Atlantic lobsters are born bright blue.",
                "A skunk's smell can be detected by a human a mile away.",
                "Every year about 98% of the atoms in your body are replaced.",
                "Elephants are the only mammals that can't jump.",
                "The human heart creates enough pressure to squirt blood 30 feet (9 m).",
                "When snakes are born with two heads, they fight each other for food.",
                "A lion's roar can be heard from five miles away.",
                "You burn more calories sleeping than you do watching TV.",
                "Every human spent about half an hour as a single cell.",
                "7.5 million toothpicks can be created from a cord of wood.",
                "Cats can hear ultrasound.",
                "Ants stretch when they wake up in the morning.",
                "Ostriches can run faster than horses.",
                "Olympic gold medals are actually made mostly of silver.",
                "You are born with 300 bones; by the time you are an adult you will have 206.",
                "It takes about 8 minutes for light from the Sun to reach Earth.",
                "Some bamboo plants can grow almost a meter in just one day.",
                "The state of Florida is bigger than England.",
                "Some penguins can leap 2-3 meters out of the water.",
                "On average, it takes 66 days to form a new habit.",
                "Mammoths still walked the earth when the Great Pyramid was being built."
        };

        // do not forget empty declaration so app wont crash



        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);


        String theFact = facts[randomNumber];

        return theFact;
    }



}
