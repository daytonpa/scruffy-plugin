/**
 * Copyright (c) 2009 Cliffano Subagio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.plugins.chucknorris;

import java.util.Random;

/**
 * {@link FactGenerator} provides Chuck Norris facts.
 * @author cliffano
 */
public class FactGenerator {

    /**
     * The configured Chuck Norris facts, from <a href="http://www.codesqueeze.com/the-ultimate-top-25-chuck-norris-the-programmer-jokes/"
     * >http://www.codesqueeze.com/the-ultimate-top-25-chuck-norris-the-
     * programmer-jokes/</a>.
     */
    private static final String[] FACTS = {
        "Life and death are a seamless continuum. Mmm hmm.",
        "My job?  Toilets 'n' boilers, boilers 'n' toilets.  Plus that one boiling toilet.",
        "Fire me if'n you dare.",
        "The candle that burns twice as bright burns half as long.",
        "Life goes on, but I believe we'll forever carry the pain on the inside.  Mmhmm.",
        "Jail's not so bad... You can make sangria in the terlet.  'Course, it's shank or be shanked.",
        "Should've known better than to store my antiques at the office.",
        "A greater tragedy my eyes have never beheld.  Well, into the terlet.",
        "Scruffy's going to die the way he lived.  Yup.",
        "I'm Scruffy, the janitor.  I'm on break.",
        "Yep.",
        "The elves are back.",
        "Second",
        "Ain't a boiler or a toilet... pass.",
        "Scruffy's work is done here.  Mmm hmm.",
        "There.  I turned a regulerr board into a divin' board.  Mmm hmm.",
        "Oh... it would be sweet for awhile, but in the back of our minds we'd know that I'm a man, and you're janitorial equipment.",
        "Boy, I've never seen him so down.  Or ever before...",
        "Scruffy believes in this company.",
        "We've formulated a plan, but you'll need a ready source of nauseatin' rotten fish.",
        "Hmm... I guess we'll never know.",
        "Scruffy's goin` to get himself one of them $300 haircuts.  This one's lost its 'pizzaaz'.",
        "Scruffy's rollin' out a large pill.",
        "Hmm... never known your kind to spray paint in such like-a manner.",
        "A Mr. Hedonism Bot to see you?",
        "What fever dream is this that bids to tear this company in twain?",
        "Oh, marmalade!",
        "Dern it...",
        "Don't thank me, thank the ladder.",
        "Somebody called 'the Robot Devil' is here to see somebody called 'Michael'.",
        "The day of reckoning in nigh... I reckon..."
    };

    /**
     * Random instance.
     */
    private static final Random RANDOM = new Random();

    /**
     * Retrieves a random fact.
     * @return a random fact
     */
    public String random() {
        return FACTS[RANDOM.nextInt(FACTS.length)];
    }
}
