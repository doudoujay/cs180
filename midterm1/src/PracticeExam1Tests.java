
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PracticeExam1Tests {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test001"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test002"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test003"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test004"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test005"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large8.indexOfLargest(i_array21);
    int[] i_array23 = large0.indexOfLargest(i_array22);
    Large large24 = new Large();
    int[] i_array26 = new int[] { 1 };
    int[] i_array27 = large24.indexOfLargest(i_array26);
    Large large28 = new Large();
    Large large29 = new Large();
    int[] i_array31 = new int[] { 1 };
    int[] i_array32 = large29.indexOfLargest(i_array31);
    int[] i_array33 = large28.indexOfLargest(i_array31);
    Large large34 = new Large();
    Large large35 = new Large();
    Large large36 = new Large();
    int[] i_array38 = new int[] { 1 };
    int[] i_array39 = large36.indexOfLargest(i_array38);
    int[] i_array40 = large35.indexOfLargest(i_array38);
    int[] i_array41 = large34.indexOfLargest(i_array38);
    int[] i_array42 = large28.indexOfLargest(i_array41);
    int[] i_array43 = large24.indexOfLargest(i_array42);
    int[] i_array44 = large0.indexOfLargest(i_array42);
    Large large45 = new Large();
    Large large46 = new Large();
    Large large47 = new Large();
    int[] i_array49 = new int[] { 1 };
    int[] i_array50 = large47.indexOfLargest(i_array49);
    int[] i_array51 = large46.indexOfLargest(i_array49);
    int[] i_array52 = large45.indexOfLargest(i_array49);
    Large large53 = new Large();
    Large large54 = new Large();
    int[] i_array56 = new int[] { 1 };
    int[] i_array57 = large54.indexOfLargest(i_array56);
    int[] i_array58 = large53.indexOfLargest(i_array56);
    Large large59 = new Large();
    Large large60 = new Large();
    Large large61 = new Large();
    int[] i_array63 = new int[] { 1 };
    int[] i_array64 = large61.indexOfLargest(i_array63);
    int[] i_array65 = large60.indexOfLargest(i_array63);
    int[] i_array66 = large59.indexOfLargest(i_array63);
    int[] i_array67 = large53.indexOfLargest(i_array66);
    int[] i_array68 = large45.indexOfLargest(i_array67);
    Large large69 = new Large();
    int[] i_array71 = new int[] { 1 };
    int[] i_array72 = large69.indexOfLargest(i_array71);
    Large large73 = new Large();
    Large large74 = new Large();
    int[] i_array76 = new int[] { 1 };
    int[] i_array77 = large74.indexOfLargest(i_array76);
    int[] i_array78 = large73.indexOfLargest(i_array76);
    Large large79 = new Large();
    Large large80 = new Large();
    Large large81 = new Large();
    int[] i_array83 = new int[] { 1 };
    int[] i_array84 = large81.indexOfLargest(i_array83);
    int[] i_array85 = large80.indexOfLargest(i_array83);
    int[] i_array86 = large79.indexOfLargest(i_array83);
    int[] i_array87 = large73.indexOfLargest(i_array86);
    int[] i_array88 = large69.indexOfLargest(i_array87);
    int[] i_array89 = large45.indexOfLargest(i_array87);
    int[] i_array90 = large0.indexOfLargest(i_array87);
    Large large91 = new Large();
    int[] i_array93 = new int[] { 1 };
    int[] i_array94 = large91.indexOfLargest(i_array93);
    int[] i_array95 = large0.indexOfLargest(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array95);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test006"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test007"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test008"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    Large large3 = new Large();
    int[] i_array5 = new int[] { 1 };
    int[] i_array6 = large3.indexOfLargest(i_array5);
    int[] i_array7 = large2.indexOfLargest(i_array5);
    int[] i_array8 = large1.indexOfLargest(i_array5);
    int[] i_array9 = large0.indexOfLargest(i_array5);
    Large large10 = new Large();
    Large large11 = new Large();
    int[] i_array13 = new int[] { 1 };
    int[] i_array14 = large11.indexOfLargest(i_array13);
    int[] i_array15 = large10.indexOfLargest(i_array13);
    Large large16 = new Large();
    Large large17 = new Large();
    Large large18 = new Large();
    int[] i_array20 = new int[] { 1 };
    int[] i_array21 = large18.indexOfLargest(i_array20);
    int[] i_array22 = large17.indexOfLargest(i_array20);
    int[] i_array23 = large16.indexOfLargest(i_array20);
    int[] i_array24 = large10.indexOfLargest(i_array23);
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    Large large31 = new Large();
    Large large32 = new Large();
    Large large33 = new Large();
    int[] i_array35 = new int[] { 1 };
    int[] i_array36 = large33.indexOfLargest(i_array35);
    int[] i_array37 = large32.indexOfLargest(i_array35);
    int[] i_array38 = large31.indexOfLargest(i_array35);
    int[] i_array39 = large25.indexOfLargest(i_array38);
    int[] i_array40 = large10.indexOfLargest(i_array39);
    int[] i_array41 = large0.indexOfLargest(i_array39);
    Large large42 = new Large();
    Large large43 = new Large();
    Large large44 = new Large();
    int[] i_array46 = new int[] { 1 };
    int[] i_array47 = large44.indexOfLargest(i_array46);
    int[] i_array48 = large43.indexOfLargest(i_array46);
    int[] i_array49 = large42.indexOfLargest(i_array46);
    Large large50 = new Large();
    Large large51 = new Large();
    int[] i_array53 = new int[] { 1 };
    int[] i_array54 = large51.indexOfLargest(i_array53);
    int[] i_array55 = large50.indexOfLargest(i_array53);
    Large large56 = new Large();
    Large large57 = new Large();
    Large large58 = new Large();
    int[] i_array60 = new int[] { 1 };
    int[] i_array61 = large58.indexOfLargest(i_array60);
    int[] i_array62 = large57.indexOfLargest(i_array60);
    int[] i_array63 = large56.indexOfLargest(i_array60);
    int[] i_array64 = large50.indexOfLargest(i_array63);
    int[] i_array65 = large42.indexOfLargest(i_array64);
    int[] i_array66 = large0.indexOfLargest(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test009"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large8.indexOfLargest(i_array21);
    int[] i_array23 = large0.indexOfLargest(i_array22);
    Large large24 = new Large();
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    int[] i_array31 = large24.indexOfLargest(i_array28);
    int[] i_array32 = large0.indexOfLargest(i_array31);
    Large large33 = new Large();
    Large large34 = new Large();
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large34.indexOfLargest(i_array37);
    int[] i_array40 = large33.indexOfLargest(i_array37);
    int[] i_array41 = large0.indexOfLargest(i_array37);
    Large large42 = new Large();
    Large large43 = new Large();
    Large large44 = new Large();
    int[] i_array46 = new int[] { 1 };
    int[] i_array47 = large44.indexOfLargest(i_array46);
    int[] i_array48 = large43.indexOfLargest(i_array46);
    int[] i_array49 = large42.indexOfLargest(i_array46);
    Large large50 = new Large();
    Large large51 = new Large();
    int[] i_array53 = new int[] { 1 };
    int[] i_array54 = large51.indexOfLargest(i_array53);
    int[] i_array55 = large50.indexOfLargest(i_array53);
    Large large56 = new Large();
    Large large57 = new Large();
    Large large58 = new Large();
    int[] i_array60 = new int[] { 1 };
    int[] i_array61 = large58.indexOfLargest(i_array60);
    int[] i_array62 = large57.indexOfLargest(i_array60);
    int[] i_array63 = large56.indexOfLargest(i_array60);
    int[] i_array64 = large50.indexOfLargest(i_array63);
    int[] i_array65 = large42.indexOfLargest(i_array64);
    int[] i_array66 = large0.indexOfLargest(i_array65);
    Large large67 = new Large();
    int[] i_array69 = new int[] { 1 };
    int[] i_array70 = large67.indexOfLargest(i_array69);
    int[] i_array71 = large0.indexOfLargest(i_array69);
    int[] i_array72 = null;
    int[] i_array73 = large0.indexOfLargest(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array73);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test010"); }

    Large large0 = new Large();
    int[] i_array1 = null;
    int[] i_array2 = large0.indexOfLargest(i_array1);
    Large large3 = new Large();
    Large large4 = new Large();
    int[] i_array6 = new int[] { 1 };
    int[] i_array7 = large4.indexOfLargest(i_array6);
    int[] i_array8 = large3.indexOfLargest(i_array6);
    Large large9 = new Large();
    Large large10 = new Large();
    Large large11 = new Large();
    int[] i_array13 = new int[] { 1 };
    int[] i_array14 = large11.indexOfLargest(i_array13);
    int[] i_array15 = large10.indexOfLargest(i_array13);
    int[] i_array16 = large9.indexOfLargest(i_array13);
    int[] i_array17 = large3.indexOfLargest(i_array16);
    Large large18 = new Large();
    int[] i_array20 = new int[] { 1 };
    int[] i_array21 = large18.indexOfLargest(i_array20);
    Large large22 = new Large();
    Large large23 = new Large();
    int[] i_array25 = new int[] { 1 };
    int[] i_array26 = large23.indexOfLargest(i_array25);
    int[] i_array27 = large22.indexOfLargest(i_array25);
    Large large28 = new Large();
    Large large29 = new Large();
    Large large30 = new Large();
    int[] i_array32 = new int[] { 1 };
    int[] i_array33 = large30.indexOfLargest(i_array32);
    int[] i_array34 = large29.indexOfLargest(i_array32);
    int[] i_array35 = large28.indexOfLargest(i_array32);
    int[] i_array36 = large22.indexOfLargest(i_array35);
    int[] i_array37 = large18.indexOfLargest(i_array36);
    int[] i_array38 = large3.indexOfLargest(i_array36);
    Large large39 = new Large();
    Large large40 = new Large();
    Large large41 = new Large();
    int[] i_array43 = new int[] { 1 };
    int[] i_array44 = large41.indexOfLargest(i_array43);
    int[] i_array45 = large40.indexOfLargest(i_array43);
    int[] i_array46 = large39.indexOfLargest(i_array43);
    Large large47 = new Large();
    Large large48 = new Large();
    int[] i_array50 = new int[] { 1 };
    int[] i_array51 = large48.indexOfLargest(i_array50);
    int[] i_array52 = large47.indexOfLargest(i_array50);
    Large large53 = new Large();
    Large large54 = new Large();
    Large large55 = new Large();
    int[] i_array57 = new int[] { 1 };
    int[] i_array58 = large55.indexOfLargest(i_array57);
    int[] i_array59 = large54.indexOfLargest(i_array57);
    int[] i_array60 = large53.indexOfLargest(i_array57);
    int[] i_array61 = large47.indexOfLargest(i_array60);
    int[] i_array62 = large39.indexOfLargest(i_array61);
    Large large63 = new Large();
    Large large64 = new Large();
    Large large65 = new Large();
    int[] i_array67 = new int[] { 1 };
    int[] i_array68 = large65.indexOfLargest(i_array67);
    int[] i_array69 = large64.indexOfLargest(i_array67);
    int[] i_array70 = large63.indexOfLargest(i_array67);
    int[] i_array71 = large39.indexOfLargest(i_array70);
    int[] i_array72 = large3.indexOfLargest(i_array71);
    Large large73 = new Large();
    Large large74 = new Large();
    int[] i_array76 = new int[] { 1 };
    int[] i_array77 = large74.indexOfLargest(i_array76);
    int[] i_array78 = large73.indexOfLargest(i_array76);
    Large large79 = new Large();
    Large large80 = new Large();
    Large large81 = new Large();
    int[] i_array83 = new int[] { 1 };
    int[] i_array84 = large81.indexOfLargest(i_array83);
    int[] i_array85 = large80.indexOfLargest(i_array83);
    int[] i_array86 = large79.indexOfLargest(i_array83);
    int[] i_array87 = large73.indexOfLargest(i_array86);
    int[] i_array88 = large3.indexOfLargest(i_array86);
    int[] i_array89 = large0.indexOfLargest(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test011"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large8.indexOfLargest(i_array21);
    int[] i_array23 = large0.indexOfLargest(i_array22);
    Large large24 = new Large();
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    int[] i_array31 = large24.indexOfLargest(i_array28);
    int[] i_array32 = large0.indexOfLargest(i_array31);
    Large large33 = new Large();
    Large large34 = new Large();
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large34.indexOfLargest(i_array37);
    int[] i_array40 = large33.indexOfLargest(i_array37);
    int[] i_array41 = large0.indexOfLargest(i_array37);
    Large large42 = new Large();
    Large large43 = new Large();
    Large large44 = new Large();
    int[] i_array46 = new int[] { 1 };
    int[] i_array47 = large44.indexOfLargest(i_array46);
    int[] i_array48 = large43.indexOfLargest(i_array46);
    int[] i_array49 = large42.indexOfLargest(i_array46);
    Large large50 = new Large();
    Large large51 = new Large();
    int[] i_array53 = new int[] { 1 };
    int[] i_array54 = large51.indexOfLargest(i_array53);
    int[] i_array55 = large50.indexOfLargest(i_array53);
    Large large56 = new Large();
    Large large57 = new Large();
    Large large58 = new Large();
    int[] i_array60 = new int[] { 1 };
    int[] i_array61 = large58.indexOfLargest(i_array60);
    int[] i_array62 = large57.indexOfLargest(i_array60);
    int[] i_array63 = large56.indexOfLargest(i_array60);
    int[] i_array64 = large50.indexOfLargest(i_array63);
    int[] i_array65 = large42.indexOfLargest(i_array64);
    int[] i_array66 = large0.indexOfLargest(i_array65);
    Large large67 = new Large();
    Large large68 = new Large();
    int[] i_array70 = new int[] { 1 };
    int[] i_array71 = large68.indexOfLargest(i_array70);
    int[] i_array72 = large67.indexOfLargest(i_array70);
    int[] i_array73 = large0.indexOfLargest(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test012"); }

    Large large0 = new Large();
    int[] i_array2 = new int[] { 1 };
    int[] i_array3 = large0.indexOfLargest(i_array2);
    Large large4 = new Large();
    Large large5 = new Large();
    Large large6 = new Large();
    int[] i_array8 = new int[] { 1 };
    int[] i_array9 = large6.indexOfLargest(i_array8);
    int[] i_array10 = large5.indexOfLargest(i_array8);
    int[] i_array11 = large4.indexOfLargest(i_array8);
    Large large12 = new Large();
    Large large13 = new Large();
    Large large14 = new Large();
    int[] i_array16 = new int[] { 1 };
    int[] i_array17 = large14.indexOfLargest(i_array16);
    int[] i_array18 = large13.indexOfLargest(i_array16);
    int[] i_array19 = large12.indexOfLargest(i_array16);
    Large large20 = new Large();
    Large large21 = new Large();
    int[] i_array23 = new int[] { 1 };
    int[] i_array24 = large21.indexOfLargest(i_array23);
    int[] i_array25 = large20.indexOfLargest(i_array23);
    Large large26 = new Large();
    Large large27 = new Large();
    Large large28 = new Large();
    int[] i_array30 = new int[] { 1 };
    int[] i_array31 = large28.indexOfLargest(i_array30);
    int[] i_array32 = large27.indexOfLargest(i_array30);
    int[] i_array33 = large26.indexOfLargest(i_array30);
    int[] i_array34 = large20.indexOfLargest(i_array33);
    int[] i_array35 = large12.indexOfLargest(i_array34);
    Large large36 = new Large();
    Large large37 = new Large();
    Large large38 = new Large();
    int[] i_array40 = new int[] { 1 };
    int[] i_array41 = large38.indexOfLargest(i_array40);
    int[] i_array42 = large37.indexOfLargest(i_array40);
    int[] i_array43 = large36.indexOfLargest(i_array40);
    int[] i_array44 = large12.indexOfLargest(i_array43);
    Large large45 = new Large();
    Large large46 = new Large();
    Large large47 = new Large();
    int[] i_array49 = new int[] { 1 };
    int[] i_array50 = large47.indexOfLargest(i_array49);
    int[] i_array51 = large46.indexOfLargest(i_array49);
    int[] i_array52 = large45.indexOfLargest(i_array49);
    int[] i_array53 = large12.indexOfLargest(i_array49);
    Large large54 = new Large();
    Large large55 = new Large();
    Large large56 = new Large();
    int[] i_array58 = new int[] { 1 };
    int[] i_array59 = large56.indexOfLargest(i_array58);
    int[] i_array60 = large55.indexOfLargest(i_array58);
    int[] i_array61 = large54.indexOfLargest(i_array58);
    Large large62 = new Large();
    Large large63 = new Large();
    int[] i_array65 = new int[] { 1 };
    int[] i_array66 = large63.indexOfLargest(i_array65);
    int[] i_array67 = large62.indexOfLargest(i_array65);
    Large large68 = new Large();
    Large large69 = new Large();
    Large large70 = new Large();
    int[] i_array72 = new int[] { 1 };
    int[] i_array73 = large70.indexOfLargest(i_array72);
    int[] i_array74 = large69.indexOfLargest(i_array72);
    int[] i_array75 = large68.indexOfLargest(i_array72);
    int[] i_array76 = large62.indexOfLargest(i_array75);
    int[] i_array77 = large54.indexOfLargest(i_array76);
    Large large78 = new Large();
    Large large79 = new Large();
    Large large80 = new Large();
    int[] i_array82 = new int[] { 1 };
    int[] i_array83 = large80.indexOfLargest(i_array82);
    int[] i_array84 = large79.indexOfLargest(i_array82);
    int[] i_array85 = large78.indexOfLargest(i_array82);
    int[] i_array86 = large54.indexOfLargest(i_array85);
    int[] i_array87 = large12.indexOfLargest(i_array85);
    int[] i_array88 = large4.indexOfLargest(i_array85);
    int[] i_array89 = large0.indexOfLargest(i_array88);
    int[] i_array90 = null;
    int[] i_array91 = large0.indexOfLargest(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array91);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test013"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    int[] i_array17 = new int[] { 1 };
    int[] i_array18 = large15.indexOfLargest(i_array17);
    Large large19 = new Large();
    Large large20 = new Large();
    int[] i_array22 = new int[] { 1 };
    int[] i_array23 = large20.indexOfLargest(i_array22);
    int[] i_array24 = large19.indexOfLargest(i_array22);
    Large large25 = new Large();
    Large large26 = new Large();
    Large large27 = new Large();
    int[] i_array29 = new int[] { 1 };
    int[] i_array30 = large27.indexOfLargest(i_array29);
    int[] i_array31 = large26.indexOfLargest(i_array29);
    int[] i_array32 = large25.indexOfLargest(i_array29);
    int[] i_array33 = large19.indexOfLargest(i_array32);
    int[] i_array34 = large15.indexOfLargest(i_array33);
    int[] i_array35 = large0.indexOfLargest(i_array33);
    Large large36 = new Large();
    Large large37 = new Large();
    Large large38 = new Large();
    int[] i_array40 = new int[] { 1 };
    int[] i_array41 = large38.indexOfLargest(i_array40);
    int[] i_array42 = large37.indexOfLargest(i_array40);
    int[] i_array43 = large36.indexOfLargest(i_array40);
    Large large44 = new Large();
    Large large45 = new Large();
    int[] i_array47 = new int[] { 1 };
    int[] i_array48 = large45.indexOfLargest(i_array47);
    int[] i_array49 = large44.indexOfLargest(i_array47);
    Large large50 = new Large();
    Large large51 = new Large();
    Large large52 = new Large();
    int[] i_array54 = new int[] { 1 };
    int[] i_array55 = large52.indexOfLargest(i_array54);
    int[] i_array56 = large51.indexOfLargest(i_array54);
    int[] i_array57 = large50.indexOfLargest(i_array54);
    int[] i_array58 = large44.indexOfLargest(i_array57);
    int[] i_array59 = large36.indexOfLargest(i_array58);
    Large large60 = new Large();
    Large large61 = new Large();
    Large large62 = new Large();
    int[] i_array64 = new int[] { 1 };
    int[] i_array65 = large62.indexOfLargest(i_array64);
    int[] i_array66 = large61.indexOfLargest(i_array64);
    int[] i_array67 = large60.indexOfLargest(i_array64);
    int[] i_array68 = large36.indexOfLargest(i_array67);
    int[] i_array69 = large0.indexOfLargest(i_array68);
    int[] i_array70 = null;
    int[] i_array71 = large0.indexOfLargest(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array71);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test014"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    int[] i_array17 = new int[] { 1 };
    int[] i_array18 = large15.indexOfLargest(i_array17);
    Large large19 = new Large();
    Large large20 = new Large();
    int[] i_array22 = new int[] { 1 };
    int[] i_array23 = large20.indexOfLargest(i_array22);
    int[] i_array24 = large19.indexOfLargest(i_array22);
    Large large25 = new Large();
    Large large26 = new Large();
    Large large27 = new Large();
    int[] i_array29 = new int[] { 1 };
    int[] i_array30 = large27.indexOfLargest(i_array29);
    int[] i_array31 = large26.indexOfLargest(i_array29);
    int[] i_array32 = large25.indexOfLargest(i_array29);
    int[] i_array33 = large19.indexOfLargest(i_array32);
    int[] i_array34 = large15.indexOfLargest(i_array33);
    int[] i_array35 = large0.indexOfLargest(i_array33);
    Large large36 = new Large();
    int[] i_array38 = new int[] { 1 };
    int[] i_array39 = large36.indexOfLargest(i_array38);
    int[] i_array40 = large0.indexOfLargest(i_array38);
    Large large41 = new Large();
    Large large42 = new Large();
    int[] i_array44 = new int[] { 1 };
    int[] i_array45 = large42.indexOfLargest(i_array44);
    int[] i_array46 = large41.indexOfLargest(i_array44);
    Large large47 = new Large();
    Large large48 = new Large();
    Large large49 = new Large();
    int[] i_array51 = new int[] { 1 };
    int[] i_array52 = large49.indexOfLargest(i_array51);
    int[] i_array53 = large48.indexOfLargest(i_array51);
    int[] i_array54 = large47.indexOfLargest(i_array51);
    int[] i_array55 = large41.indexOfLargest(i_array54);
    Large large56 = new Large();
    Large large57 = new Large();
    Large large58 = new Large();
    int[] i_array60 = new int[] { 1 };
    int[] i_array61 = large58.indexOfLargest(i_array60);
    int[] i_array62 = large57.indexOfLargest(i_array60);
    int[] i_array63 = large56.indexOfLargest(i_array60);
    Large large64 = new Large();
    Large large65 = new Large();
    int[] i_array67 = new int[] { 1 };
    int[] i_array68 = large65.indexOfLargest(i_array67);
    int[] i_array69 = large64.indexOfLargest(i_array67);
    Large large70 = new Large();
    Large large71 = new Large();
    Large large72 = new Large();
    int[] i_array74 = new int[] { 1 };
    int[] i_array75 = large72.indexOfLargest(i_array74);
    int[] i_array76 = large71.indexOfLargest(i_array74);
    int[] i_array77 = large70.indexOfLargest(i_array74);
    int[] i_array78 = large64.indexOfLargest(i_array77);
    int[] i_array79 = large56.indexOfLargest(i_array78);
    Large large80 = new Large();
    Large large81 = new Large();
    Large large82 = new Large();
    int[] i_array84 = new int[] { 1 };
    int[] i_array85 = large82.indexOfLargest(i_array84);
    int[] i_array86 = large81.indexOfLargest(i_array84);
    int[] i_array87 = large80.indexOfLargest(i_array84);
    int[] i_array88 = large56.indexOfLargest(i_array87);
    int[] i_array89 = large41.indexOfLargest(i_array87);
    int[] i_array96 = new int[] { 0, (short)-1, (byte)100, (byte)10, (-1), (byte)100 };
    int[] i_array97 = large41.indexOfLargest(i_array96);
    int[] i_array98 = large0.indexOfLargest(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array98);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test015"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test016"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large8.indexOfLargest(i_array21);
    int[] i_array23 = large0.indexOfLargest(i_array22);
    Large large24 = new Large();
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    int[] i_array31 = large24.indexOfLargest(i_array28);
    int[] i_array32 = large0.indexOfLargest(i_array31);
    Large large33 = new Large();
    Large large34 = new Large();
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large34.indexOfLargest(i_array37);
    int[] i_array40 = large33.indexOfLargest(i_array37);
    int[] i_array41 = large0.indexOfLargest(i_array37);
    Large large42 = new Large();
    Large large43 = new Large();
    Large large44 = new Large();
    int[] i_array46 = new int[] { 1 };
    int[] i_array47 = large44.indexOfLargest(i_array46);
    int[] i_array48 = large43.indexOfLargest(i_array46);
    int[] i_array49 = large42.indexOfLargest(i_array46);
    Large large50 = new Large();
    Large large51 = new Large();
    int[] i_array53 = new int[] { 1 };
    int[] i_array54 = large51.indexOfLargest(i_array53);
    int[] i_array55 = large50.indexOfLargest(i_array53);
    Large large56 = new Large();
    Large large57 = new Large();
    Large large58 = new Large();
    int[] i_array60 = new int[] { 1 };
    int[] i_array61 = large58.indexOfLargest(i_array60);
    int[] i_array62 = large57.indexOfLargest(i_array60);
    int[] i_array63 = large56.indexOfLargest(i_array60);
    int[] i_array64 = large50.indexOfLargest(i_array63);
    int[] i_array65 = large42.indexOfLargest(i_array64);
    Large large66 = new Large();
    Large large67 = new Large();
    Large large68 = new Large();
    int[] i_array70 = new int[] { 1 };
    int[] i_array71 = large68.indexOfLargest(i_array70);
    int[] i_array72 = large67.indexOfLargest(i_array70);
    int[] i_array73 = large66.indexOfLargest(i_array70);
    int[] i_array74 = large42.indexOfLargest(i_array73);
    int[] i_array75 = large0.indexOfLargest(i_array73);
    Large large76 = new Large();
    Large large77 = new Large();
    Large large78 = new Large();
    int[] i_array80 = new int[] { 1 };
    int[] i_array81 = large78.indexOfLargest(i_array80);
    int[] i_array82 = large77.indexOfLargest(i_array80);
    int[] i_array83 = large76.indexOfLargest(i_array80);
    int[] i_array84 = large0.indexOfLargest(i_array83);
    Large large85 = new Large();
    Large large86 = new Large();
    Large large87 = new Large();
    Large large88 = new Large();
    int[] i_array90 = new int[] { 1 };
    int[] i_array91 = large88.indexOfLargest(i_array90);
    int[] i_array92 = large87.indexOfLargest(i_array90);
    int[] i_array93 = large86.indexOfLargest(i_array90);
    int[] i_array94 = large85.indexOfLargest(i_array90);
    int[] i_array95 = large0.indexOfLargest(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array95);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test017"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test018"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test019"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test020"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    Large large21 = new Large();
    Large large22 = new Large();
    Large large23 = new Large();
    int[] i_array25 = new int[] { 1 };
    int[] i_array26 = large23.indexOfLargest(i_array25);
    int[] i_array27 = large22.indexOfLargest(i_array25);
    int[] i_array28 = large21.indexOfLargest(i_array25);
    int[] i_array29 = large15.indexOfLargest(i_array28);
    int[] i_array30 = large0.indexOfLargest(i_array29);
    Large large31 = new Large();
    Large large32 = new Large();
    int[] i_array34 = new int[] { 1 };
    int[] i_array35 = large32.indexOfLargest(i_array34);
    int[] i_array36 = large31.indexOfLargest(i_array34);
    Large large37 = new Large();
    int[] i_array39 = new int[] { 1 };
    int[] i_array40 = large37.indexOfLargest(i_array39);
    Large large41 = new Large();
    Large large42 = new Large();
    int[] i_array44 = new int[] { 1 };
    int[] i_array45 = large42.indexOfLargest(i_array44);
    int[] i_array46 = large41.indexOfLargest(i_array44);
    Large large47 = new Large();
    Large large48 = new Large();
    Large large49 = new Large();
    int[] i_array51 = new int[] { 1 };
    int[] i_array52 = large49.indexOfLargest(i_array51);
    int[] i_array53 = large48.indexOfLargest(i_array51);
    int[] i_array54 = large47.indexOfLargest(i_array51);
    int[] i_array55 = large41.indexOfLargest(i_array54);
    int[] i_array56 = large37.indexOfLargest(i_array55);
    int[] i_array57 = large31.indexOfLargest(i_array56);
    Large large58 = new Large();
    Large large59 = new Large();
    Large large60 = new Large();
    Large large61 = new Large();
    int[] i_array63 = new int[] { 1 };
    int[] i_array64 = large61.indexOfLargest(i_array63);
    int[] i_array65 = large60.indexOfLargest(i_array63);
    int[] i_array66 = large59.indexOfLargest(i_array63);
    int[] i_array67 = large58.indexOfLargest(i_array63);
    int[] i_array68 = large31.indexOfLargest(i_array63);
    int[] i_array69 = large0.indexOfLargest(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test021"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test022"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    Large large9 = new Large();
    Large large10 = new Large();
    int[] i_array12 = new int[] { 1 };
    int[] i_array13 = large10.indexOfLargest(i_array12);
    int[] i_array14 = large9.indexOfLargest(i_array12);
    int[] i_array15 = large8.indexOfLargest(i_array12);
    Large large16 = new Large();
    Large large17 = new Large();
    int[] i_array19 = new int[] { 1 };
    int[] i_array20 = large17.indexOfLargest(i_array19);
    int[] i_array21 = large16.indexOfLargest(i_array19);
    Large large22 = new Large();
    Large large23 = new Large();
    Large large24 = new Large();
    int[] i_array26 = new int[] { 1 };
    int[] i_array27 = large24.indexOfLargest(i_array26);
    int[] i_array28 = large23.indexOfLargest(i_array26);
    int[] i_array29 = large22.indexOfLargest(i_array26);
    int[] i_array30 = large16.indexOfLargest(i_array29);
    int[] i_array31 = large8.indexOfLargest(i_array30);
    Large large32 = new Large();
    Large large33 = new Large();
    Large large34 = new Large();
    int[] i_array36 = new int[] { 1 };
    int[] i_array37 = large34.indexOfLargest(i_array36);
    int[] i_array38 = large33.indexOfLargest(i_array36);
    int[] i_array39 = large32.indexOfLargest(i_array36);
    int[] i_array40 = large8.indexOfLargest(i_array39);
    Large large41 = new Large();
    Large large42 = new Large();
    Large large43 = new Large();
    int[] i_array45 = new int[] { 1 };
    int[] i_array46 = large43.indexOfLargest(i_array45);
    int[] i_array47 = large42.indexOfLargest(i_array45);
    int[] i_array48 = large41.indexOfLargest(i_array45);
    int[] i_array49 = large8.indexOfLargest(i_array45);
    Large large50 = new Large();
    Large large51 = new Large();
    Large large52 = new Large();
    int[] i_array54 = new int[] { 1 };
    int[] i_array55 = large52.indexOfLargest(i_array54);
    int[] i_array56 = large51.indexOfLargest(i_array54);
    int[] i_array57 = large50.indexOfLargest(i_array54);
    Large large58 = new Large();
    Large large59 = new Large();
    int[] i_array61 = new int[] { 1 };
    int[] i_array62 = large59.indexOfLargest(i_array61);
    int[] i_array63 = large58.indexOfLargest(i_array61);
    Large large64 = new Large();
    Large large65 = new Large();
    Large large66 = new Large();
    int[] i_array68 = new int[] { 1 };
    int[] i_array69 = large66.indexOfLargest(i_array68);
    int[] i_array70 = large65.indexOfLargest(i_array68);
    int[] i_array71 = large64.indexOfLargest(i_array68);
    int[] i_array72 = large58.indexOfLargest(i_array71);
    int[] i_array73 = large50.indexOfLargest(i_array72);
    Large large74 = new Large();
    Large large75 = new Large();
    Large large76 = new Large();
    int[] i_array78 = new int[] { 1 };
    int[] i_array79 = large76.indexOfLargest(i_array78);
    int[] i_array80 = large75.indexOfLargest(i_array78);
    int[] i_array81 = large74.indexOfLargest(i_array78);
    int[] i_array82 = large50.indexOfLargest(i_array81);
    int[] i_array83 = large8.indexOfLargest(i_array81);
    int[] i_array84 = large0.indexOfLargest(i_array81);
    Large large85 = new Large();
    Large large86 = new Large();
    Large large87 = new Large();
    int[] i_array89 = new int[] { 1 };
    int[] i_array90 = large87.indexOfLargest(i_array89);
    int[] i_array91 = large86.indexOfLargest(i_array89);
    int[] i_array92 = large85.indexOfLargest(i_array89);
    int[] i_array93 = large0.indexOfLargest(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test023"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    boolean b27 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test024"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test025"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test026"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    Large large16 = new Large();
    Large large17 = new Large();
    int[] i_array19 = new int[] { 1 };
    int[] i_array20 = large17.indexOfLargest(i_array19);
    int[] i_array21 = large16.indexOfLargest(i_array19);
    int[] i_array22 = large15.indexOfLargest(i_array19);
    Large large23 = new Large();
    Large large24 = new Large();
    int[] i_array26 = new int[] { 1 };
    int[] i_array27 = large24.indexOfLargest(i_array26);
    int[] i_array28 = large23.indexOfLargest(i_array26);
    Large large29 = new Large();
    Large large30 = new Large();
    Large large31 = new Large();
    int[] i_array33 = new int[] { 1 };
    int[] i_array34 = large31.indexOfLargest(i_array33);
    int[] i_array35 = large30.indexOfLargest(i_array33);
    int[] i_array36 = large29.indexOfLargest(i_array33);
    int[] i_array37 = large23.indexOfLargest(i_array36);
    int[] i_array38 = large15.indexOfLargest(i_array37);
    Large large39 = new Large();
    Large large40 = new Large();
    Large large41 = new Large();
    int[] i_array43 = new int[] { 1 };
    int[] i_array44 = large41.indexOfLargest(i_array43);
    int[] i_array45 = large40.indexOfLargest(i_array43);
    int[] i_array46 = large39.indexOfLargest(i_array43);
    int[] i_array47 = large15.indexOfLargest(i_array46);
    int[] i_array48 = large0.indexOfLargest(i_array46);
    int[] i_array55 = new int[] { 0, (short)-1, (byte)100, (byte)10, (-1), (byte)100 };
    int[] i_array56 = large0.indexOfLargest(i_array55);
    int[] i_array57 = null;
    int[] i_array58 = large0.indexOfLargest(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array58);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test027"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test028"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("", "hi!");
    boolean b27 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test029"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large8.indexOfLargest(i_array21);
    int[] i_array23 = large0.indexOfLargest(i_array22);
    Large large24 = new Large();
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    int[] i_array31 = large24.indexOfLargest(i_array28);
    int[] i_array32 = large0.indexOfLargest(i_array31);
    Large large33 = new Large();
    Large large34 = new Large();
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large34.indexOfLargest(i_array37);
    int[] i_array40 = large33.indexOfLargest(i_array37);
    int[] i_array41 = large0.indexOfLargest(i_array37);
    Large large42 = new Large();
    Large large43 = new Large();
    Large large44 = new Large();
    int[] i_array46 = new int[] { 1 };
    int[] i_array47 = large44.indexOfLargest(i_array46);
    int[] i_array48 = large43.indexOfLargest(i_array46);
    int[] i_array49 = large42.indexOfLargest(i_array46);
    Large large50 = new Large();
    Large large51 = new Large();
    int[] i_array53 = new int[] { 1 };
    int[] i_array54 = large51.indexOfLargest(i_array53);
    int[] i_array55 = large50.indexOfLargest(i_array53);
    Large large56 = new Large();
    Large large57 = new Large();
    Large large58 = new Large();
    int[] i_array60 = new int[] { 1 };
    int[] i_array61 = large58.indexOfLargest(i_array60);
    int[] i_array62 = large57.indexOfLargest(i_array60);
    int[] i_array63 = large56.indexOfLargest(i_array60);
    int[] i_array64 = large50.indexOfLargest(i_array63);
    int[] i_array65 = large42.indexOfLargest(i_array64);
    int[] i_array66 = large0.indexOfLargest(i_array65);
    Large large67 = new Large();
    Large large68 = new Large();
    Large large69 = new Large();
    int[] i_array71 = new int[] { 1 };
    int[] i_array72 = large69.indexOfLargest(i_array71);
    int[] i_array73 = large68.indexOfLargest(i_array71);
    int[] i_array74 = large67.indexOfLargest(i_array71);
    int[] i_array75 = large0.indexOfLargest(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test030"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test031"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test032"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    int[] i_array17 = new int[] { 1 };
    int[] i_array18 = large15.indexOfLargest(i_array17);
    Large large19 = new Large();
    Large large20 = new Large();
    int[] i_array22 = new int[] { 1 };
    int[] i_array23 = large20.indexOfLargest(i_array22);
    int[] i_array24 = large19.indexOfLargest(i_array22);
    Large large25 = new Large();
    Large large26 = new Large();
    Large large27 = new Large();
    int[] i_array29 = new int[] { 1 };
    int[] i_array30 = large27.indexOfLargest(i_array29);
    int[] i_array31 = large26.indexOfLargest(i_array29);
    int[] i_array32 = large25.indexOfLargest(i_array29);
    int[] i_array33 = large19.indexOfLargest(i_array32);
    int[] i_array34 = large15.indexOfLargest(i_array33);
    int[] i_array35 = large0.indexOfLargest(i_array33);
    Large large36 = new Large();
    int[] i_array38 = new int[] { 1 };
    int[] i_array39 = large36.indexOfLargest(i_array38);
    int[] i_array40 = large0.indexOfLargest(i_array38);
    Large large41 = new Large();
    int[] i_array43 = new int[] { 1 };
    int[] i_array44 = large41.indexOfLargest(i_array43);
    Large large45 = new Large();
    int[] i_array47 = new int[] { 1 };
    int[] i_array48 = large45.indexOfLargest(i_array47);
    Large large49 = new Large();
    Large large50 = new Large();
    int[] i_array52 = new int[] { 1 };
    int[] i_array53 = large50.indexOfLargest(i_array52);
    int[] i_array54 = large49.indexOfLargest(i_array52);
    Large large55 = new Large();
    Large large56 = new Large();
    Large large57 = new Large();
    int[] i_array59 = new int[] { 1 };
    int[] i_array60 = large57.indexOfLargest(i_array59);
    int[] i_array61 = large56.indexOfLargest(i_array59);
    int[] i_array62 = large55.indexOfLargest(i_array59);
    int[] i_array63 = large49.indexOfLargest(i_array62);
    int[] i_array64 = large45.indexOfLargest(i_array63);
    int[] i_array65 = large41.indexOfLargest(i_array64);
    int[] i_array66 = large0.indexOfLargest(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test033"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    int[] i_array9 = new int[] { 1 };
    int[] i_array10 = large7.indexOfLargest(i_array9);
    int[] i_array11 = large6.indexOfLargest(i_array9);
    Large large12 = new Large();
    Large large13 = new Large();
    Large large14 = new Large();
    int[] i_array16 = new int[] { 1 };
    int[] i_array17 = large14.indexOfLargest(i_array16);
    int[] i_array18 = large13.indexOfLargest(i_array16);
    int[] i_array19 = large12.indexOfLargest(i_array16);
    int[] i_array20 = large6.indexOfLargest(i_array19);
    Large large21 = new Large();
    int[] i_array23 = new int[] { 1 };
    int[] i_array24 = large21.indexOfLargest(i_array23);
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    Large large31 = new Large();
    Large large32 = new Large();
    Large large33 = new Large();
    int[] i_array35 = new int[] { 1 };
    int[] i_array36 = large33.indexOfLargest(i_array35);
    int[] i_array37 = large32.indexOfLargest(i_array35);
    int[] i_array38 = large31.indexOfLargest(i_array35);
    int[] i_array39 = large25.indexOfLargest(i_array38);
    int[] i_array40 = large21.indexOfLargest(i_array39);
    int[] i_array41 = large6.indexOfLargest(i_array39);
    int[] i_array42 = large0.indexOfLargest(i_array41);
    int[] i_array43 = null;
    int[] i_array44 = large0.indexOfLargest(i_array43);
    Large large45 = new Large();
    Large large46 = new Large();
    int[] i_array48 = new int[] { 1 };
    int[] i_array49 = large46.indexOfLargest(i_array48);
    int[] i_array50 = large45.indexOfLargest(i_array48);
    Large large51 = new Large();
    Large large52 = new Large();
    Large large53 = new Large();
    int[] i_array55 = new int[] { 1 };
    int[] i_array56 = large53.indexOfLargest(i_array55);
    int[] i_array57 = large52.indexOfLargest(i_array55);
    int[] i_array58 = large51.indexOfLargest(i_array55);
    int[] i_array59 = large45.indexOfLargest(i_array58);
    Large large60 = new Large();
    int[] i_array62 = new int[] { 1 };
    int[] i_array63 = large60.indexOfLargest(i_array62);
    Large large64 = new Large();
    Large large65 = new Large();
    int[] i_array67 = new int[] { 1 };
    int[] i_array68 = large65.indexOfLargest(i_array67);
    int[] i_array69 = large64.indexOfLargest(i_array67);
    Large large70 = new Large();
    Large large71 = new Large();
    Large large72 = new Large();
    int[] i_array74 = new int[] { 1 };
    int[] i_array75 = large72.indexOfLargest(i_array74);
    int[] i_array76 = large71.indexOfLargest(i_array74);
    int[] i_array77 = large70.indexOfLargest(i_array74);
    int[] i_array78 = large64.indexOfLargest(i_array77);
    int[] i_array79 = large60.indexOfLargest(i_array78);
    int[] i_array80 = large45.indexOfLargest(i_array78);
    Large large81 = new Large();
    int[] i_array83 = new int[] { 1 };
    int[] i_array84 = large81.indexOfLargest(i_array83);
    int[] i_array85 = large45.indexOfLargest(i_array83);
    int[] i_array86 = large0.indexOfLargest(i_array83);
    Large large87 = new Large();
    Large large88 = new Large();
    Large large89 = new Large();
    Large large90 = new Large();
    int[] i_array92 = new int[] { 1 };
    int[] i_array93 = large90.indexOfLargest(i_array92);
    int[] i_array94 = large89.indexOfLargest(i_array92);
    int[] i_array95 = large88.indexOfLargest(i_array92);
    int[] i_array96 = large87.indexOfLargest(i_array92);
    int[] i_array97 = large0.indexOfLargest(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array97);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test034"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test035"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    Large large21 = new Large();
    Large large22 = new Large();
    Large large23 = new Large();
    int[] i_array25 = new int[] { 1 };
    int[] i_array26 = large23.indexOfLargest(i_array25);
    int[] i_array27 = large22.indexOfLargest(i_array25);
    int[] i_array28 = large21.indexOfLargest(i_array25);
    int[] i_array29 = large15.indexOfLargest(i_array28);
    Large large30 = new Large();
    int[] i_array32 = new int[] { 1 };
    int[] i_array33 = large30.indexOfLargest(i_array32);
    Large large34 = new Large();
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large34.indexOfLargest(i_array37);
    Large large40 = new Large();
    Large large41 = new Large();
    Large large42 = new Large();
    int[] i_array44 = new int[] { 1 };
    int[] i_array45 = large42.indexOfLargest(i_array44);
    int[] i_array46 = large41.indexOfLargest(i_array44);
    int[] i_array47 = large40.indexOfLargest(i_array44);
    int[] i_array48 = large34.indexOfLargest(i_array47);
    int[] i_array49 = large30.indexOfLargest(i_array48);
    int[] i_array50 = large15.indexOfLargest(i_array48);
    int[] i_array51 = large0.indexOfLargest(i_array48);
    Large large52 = new Large();
    Large large53 = new Large();
    Large large54 = new Large();
    Large large55 = new Large();
    int[] i_array57 = new int[] { 1 };
    int[] i_array58 = large55.indexOfLargest(i_array57);
    int[] i_array59 = large54.indexOfLargest(i_array57);
    int[] i_array60 = large53.indexOfLargest(i_array57);
    int[] i_array61 = large52.indexOfLargest(i_array57);
    int[] i_array62 = large0.indexOfLargest(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test036"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test037"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test038"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    int[] i_array8 = new int[] { 1 };
    int[] i_array9 = large6.indexOfLargest(i_array8);
    Large large10 = new Large();
    Large large11 = new Large();
    int[] i_array13 = new int[] { 1 };
    int[] i_array14 = large11.indexOfLargest(i_array13);
    int[] i_array15 = large10.indexOfLargest(i_array13);
    Large large16 = new Large();
    Large large17 = new Large();
    Large large18 = new Large();
    int[] i_array20 = new int[] { 1 };
    int[] i_array21 = large18.indexOfLargest(i_array20);
    int[] i_array22 = large17.indexOfLargest(i_array20);
    int[] i_array23 = large16.indexOfLargest(i_array20);
    int[] i_array24 = large10.indexOfLargest(i_array23);
    int[] i_array25 = large6.indexOfLargest(i_array24);
    int[] i_array26 = large0.indexOfLargest(i_array25);
    Large large27 = new Large();
    Large large28 = new Large();
    int[] i_array30 = new int[] { 1 };
    int[] i_array31 = large28.indexOfLargest(i_array30);
    int[] i_array32 = large27.indexOfLargest(i_array30);
    Large large33 = new Large();
    int[] i_array35 = new int[] { 1 };
    int[] i_array36 = large33.indexOfLargest(i_array35);
    Large large37 = new Large();
    Large large38 = new Large();
    int[] i_array40 = new int[] { 1 };
    int[] i_array41 = large38.indexOfLargest(i_array40);
    int[] i_array42 = large37.indexOfLargest(i_array40);
    Large large43 = new Large();
    Large large44 = new Large();
    Large large45 = new Large();
    int[] i_array47 = new int[] { 1 };
    int[] i_array48 = large45.indexOfLargest(i_array47);
    int[] i_array49 = large44.indexOfLargest(i_array47);
    int[] i_array50 = large43.indexOfLargest(i_array47);
    int[] i_array51 = large37.indexOfLargest(i_array50);
    int[] i_array52 = large33.indexOfLargest(i_array51);
    int[] i_array53 = large27.indexOfLargest(i_array52);
    Large large54 = new Large();
    Large large55 = new Large();
    Large large56 = new Large();
    int[] i_array58 = new int[] { 1 };
    int[] i_array59 = large56.indexOfLargest(i_array58);
    int[] i_array60 = large55.indexOfLargest(i_array58);
    int[] i_array61 = large54.indexOfLargest(i_array58);
    Large large62 = new Large();
    Large large63 = new Large();
    int[] i_array65 = new int[] { 1 };
    int[] i_array66 = large63.indexOfLargest(i_array65);
    int[] i_array67 = large62.indexOfLargest(i_array65);
    Large large68 = new Large();
    Large large69 = new Large();
    Large large70 = new Large();
    int[] i_array72 = new int[] { 1 };
    int[] i_array73 = large70.indexOfLargest(i_array72);
    int[] i_array74 = large69.indexOfLargest(i_array72);
    int[] i_array75 = large68.indexOfLargest(i_array72);
    int[] i_array76 = large62.indexOfLargest(i_array75);
    int[] i_array77 = large54.indexOfLargest(i_array76);
    Large large78 = new Large();
    Large large79 = new Large();
    Large large80 = new Large();
    int[] i_array82 = new int[] { 1 };
    int[] i_array83 = large80.indexOfLargest(i_array82);
    int[] i_array84 = large79.indexOfLargest(i_array82);
    int[] i_array85 = large78.indexOfLargest(i_array82);
    int[] i_array86 = large54.indexOfLargest(i_array85);
    int[] i_array87 = large27.indexOfLargest(i_array85);
    int[] i_array88 = large0.indexOfLargest(i_array87);
    Large large89 = new Large();
    Large large90 = new Large();
    Large large91 = new Large();
    Large large92 = new Large();
    int[] i_array94 = new int[] { 1 };
    int[] i_array95 = large92.indexOfLargest(i_array94);
    int[] i_array96 = large91.indexOfLargest(i_array94);
    int[] i_array97 = large90.indexOfLargest(i_array94);
    int[] i_array98 = large89.indexOfLargest(i_array94);
    int[] i_array99 = large0.indexOfLargest(i_array98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array99);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test039"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test040"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("", "hi!");
    boolean b27 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test041"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b27 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test042"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "");
    boolean b27 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test043"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    boolean b27 = stringManipulation0.haveSameChars("hi!", "");
    boolean b30 = stringManipulation0.haveSameChars("", "");
    boolean b33 = stringManipulation0.haveSameChars("hi!", "");
    boolean b36 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test044"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test045"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test046"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "");
    boolean b27 = stringManipulation0.haveSameChars("", "");
    boolean b30 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test047"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test048"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test049"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    int[] i_array17 = new int[] { 1 };
    int[] i_array18 = large15.indexOfLargest(i_array17);
    int[] i_array19 = large0.indexOfLargest(i_array18);
    Large large20 = new Large();
    Large large21 = new Large();
    int[] i_array23 = new int[] { 1 };
    int[] i_array24 = large21.indexOfLargest(i_array23);
    int[] i_array25 = large20.indexOfLargest(i_array23);
    Large large26 = new Large();
    Large large27 = new Large();
    int[] i_array29 = new int[] { 1 };
    int[] i_array30 = large27.indexOfLargest(i_array29);
    int[] i_array31 = large26.indexOfLargest(i_array29);
    Large large32 = new Large();
    Large large33 = new Large();
    Large large34 = new Large();
    int[] i_array36 = new int[] { 1 };
    int[] i_array37 = large34.indexOfLargest(i_array36);
    int[] i_array38 = large33.indexOfLargest(i_array36);
    int[] i_array39 = large32.indexOfLargest(i_array36);
    int[] i_array40 = large26.indexOfLargest(i_array39);
    Large large41 = new Large();
    int[] i_array43 = new int[] { 1 };
    int[] i_array44 = large41.indexOfLargest(i_array43);
    Large large45 = new Large();
    Large large46 = new Large();
    int[] i_array48 = new int[] { 1 };
    int[] i_array49 = large46.indexOfLargest(i_array48);
    int[] i_array50 = large45.indexOfLargest(i_array48);
    Large large51 = new Large();
    Large large52 = new Large();
    Large large53 = new Large();
    int[] i_array55 = new int[] { 1 };
    int[] i_array56 = large53.indexOfLargest(i_array55);
    int[] i_array57 = large52.indexOfLargest(i_array55);
    int[] i_array58 = large51.indexOfLargest(i_array55);
    int[] i_array59 = large45.indexOfLargest(i_array58);
    int[] i_array60 = large41.indexOfLargest(i_array59);
    int[] i_array61 = large26.indexOfLargest(i_array59);
    int[] i_array62 = large20.indexOfLargest(i_array61);
    Large large63 = new Large();
    Large large64 = new Large();
    int[] i_array66 = new int[] { 1 };
    int[] i_array67 = large64.indexOfLargest(i_array66);
    int[] i_array68 = large63.indexOfLargest(i_array66);
    Large large69 = new Large();
    Large large70 = new Large();
    int[] i_array72 = new int[] { 1 };
    int[] i_array73 = large70.indexOfLargest(i_array72);
    int[] i_array74 = large69.indexOfLargest(i_array72);
    int[] i_array75 = large63.indexOfLargest(i_array74);
    int[] i_array76 = large20.indexOfLargest(i_array74);
    int[] i_array77 = large0.indexOfLargest(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test050"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    Large large16 = new Large();
    Large large17 = new Large();
    Large large18 = new Large();
    int[] i_array20 = new int[] { 1 };
    int[] i_array21 = large18.indexOfLargest(i_array20);
    int[] i_array22 = large17.indexOfLargest(i_array20);
    int[] i_array23 = large16.indexOfLargest(i_array20);
    int[] i_array24 = large15.indexOfLargest(i_array20);
    Large large25 = new Large();
    int[] i_array27 = new int[] { 1 };
    int[] i_array28 = large25.indexOfLargest(i_array27);
    Large large29 = new Large();
    Large large30 = new Large();
    int[] i_array32 = new int[] { 1 };
    int[] i_array33 = large30.indexOfLargest(i_array32);
    int[] i_array34 = large29.indexOfLargest(i_array32);
    Large large35 = new Large();
    Large large36 = new Large();
    Large large37 = new Large();
    int[] i_array39 = new int[] { 1 };
    int[] i_array40 = large37.indexOfLargest(i_array39);
    int[] i_array41 = large36.indexOfLargest(i_array39);
    int[] i_array42 = large35.indexOfLargest(i_array39);
    int[] i_array43 = large29.indexOfLargest(i_array42);
    int[] i_array44 = large25.indexOfLargest(i_array43);
    int[] i_array45 = large15.indexOfLargest(i_array43);
    int[] i_array46 = large0.indexOfLargest(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test051"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test052"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    boolean b27 = stringManipulation0.haveSameChars("hi!", "");
    boolean b30 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test053"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    int[] i_array8 = new int[] { 1 };
    int[] i_array9 = large6.indexOfLargest(i_array8);
    Large large10 = new Large();
    Large large11 = new Large();
    int[] i_array13 = new int[] { 1 };
    int[] i_array14 = large11.indexOfLargest(i_array13);
    int[] i_array15 = large10.indexOfLargest(i_array13);
    Large large16 = new Large();
    Large large17 = new Large();
    Large large18 = new Large();
    int[] i_array20 = new int[] { 1 };
    int[] i_array21 = large18.indexOfLargest(i_array20);
    int[] i_array22 = large17.indexOfLargest(i_array20);
    int[] i_array23 = large16.indexOfLargest(i_array20);
    int[] i_array24 = large10.indexOfLargest(i_array23);
    int[] i_array25 = large6.indexOfLargest(i_array24);
    int[] i_array26 = large0.indexOfLargest(i_array25);
    Large large27 = new Large();
    Large large28 = new Large();
    Large large29 = new Large();
    int[] i_array31 = new int[] { 1 };
    int[] i_array32 = large29.indexOfLargest(i_array31);
    int[] i_array33 = large28.indexOfLargest(i_array31);
    int[] i_array34 = large27.indexOfLargest(i_array31);
    Large large35 = new Large();
    Large large36 = new Large();
    int[] i_array38 = new int[] { 1 };
    int[] i_array39 = large36.indexOfLargest(i_array38);
    int[] i_array40 = large35.indexOfLargest(i_array38);
    Large large41 = new Large();
    Large large42 = new Large();
    Large large43 = new Large();
    int[] i_array45 = new int[] { 1 };
    int[] i_array46 = large43.indexOfLargest(i_array45);
    int[] i_array47 = large42.indexOfLargest(i_array45);
    int[] i_array48 = large41.indexOfLargest(i_array45);
    int[] i_array49 = large35.indexOfLargest(i_array48);
    int[] i_array50 = large27.indexOfLargest(i_array49);
    Large large51 = new Large();
    int[] i_array53 = new int[] { 1 };
    int[] i_array54 = large51.indexOfLargest(i_array53);
    Large large55 = new Large();
    Large large56 = new Large();
    int[] i_array58 = new int[] { 1 };
    int[] i_array59 = large56.indexOfLargest(i_array58);
    int[] i_array60 = large55.indexOfLargest(i_array58);
    Large large61 = new Large();
    Large large62 = new Large();
    Large large63 = new Large();
    int[] i_array65 = new int[] { 1 };
    int[] i_array66 = large63.indexOfLargest(i_array65);
    int[] i_array67 = large62.indexOfLargest(i_array65);
    int[] i_array68 = large61.indexOfLargest(i_array65);
    int[] i_array69 = large55.indexOfLargest(i_array68);
    int[] i_array70 = large51.indexOfLargest(i_array69);
    int[] i_array71 = large27.indexOfLargest(i_array69);
    int[] i_array72 = large0.indexOfLargest(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test054"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b27 = stringManipulation0.haveSameChars("hi!", "");
    boolean b30 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test055"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    Large large12 = new Large();
    int[] i_array14 = new int[] { 1 };
    int[] i_array15 = large12.indexOfLargest(i_array14);
    Large large16 = new Large();
    Large large17 = new Large();
    int[] i_array19 = new int[] { 1 };
    int[] i_array20 = large17.indexOfLargest(i_array19);
    int[] i_array21 = large16.indexOfLargest(i_array19);
    Large large22 = new Large();
    Large large23 = new Large();
    Large large24 = new Large();
    int[] i_array26 = new int[] { 1 };
    int[] i_array27 = large24.indexOfLargest(i_array26);
    int[] i_array28 = large23.indexOfLargest(i_array26);
    int[] i_array29 = large22.indexOfLargest(i_array26);
    int[] i_array30 = large16.indexOfLargest(i_array29);
    int[] i_array31 = large12.indexOfLargest(i_array30);
    int[] i_array32 = large8.indexOfLargest(i_array31);
    Large large33 = new Large();
    Large large34 = new Large();
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large34.indexOfLargest(i_array37);
    int[] i_array40 = large33.indexOfLargest(i_array37);
    int[] i_array41 = large8.indexOfLargest(i_array40);
    int[] i_array42 = large0.indexOfLargest(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test056"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test057"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    boolean b27 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b30 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test058"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test059"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test060"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("", "hi!");
    boolean b27 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test061"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b27 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test062"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test063"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test064"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test065"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test066"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test067"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test068"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test069"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test070"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    int[] i_array9 = new int[] { 1 };
    int[] i_array10 = large7.indexOfLargest(i_array9);
    int[] i_array11 = large6.indexOfLargest(i_array9);
    Large large12 = new Large();
    Large large13 = new Large();
    Large large14 = new Large();
    int[] i_array16 = new int[] { 1 };
    int[] i_array17 = large14.indexOfLargest(i_array16);
    int[] i_array18 = large13.indexOfLargest(i_array16);
    int[] i_array19 = large12.indexOfLargest(i_array16);
    int[] i_array20 = large6.indexOfLargest(i_array19);
    Large large21 = new Large();
    int[] i_array23 = new int[] { 1 };
    int[] i_array24 = large21.indexOfLargest(i_array23);
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    Large large31 = new Large();
    Large large32 = new Large();
    Large large33 = new Large();
    int[] i_array35 = new int[] { 1 };
    int[] i_array36 = large33.indexOfLargest(i_array35);
    int[] i_array37 = large32.indexOfLargest(i_array35);
    int[] i_array38 = large31.indexOfLargest(i_array35);
    int[] i_array39 = large25.indexOfLargest(i_array38);
    int[] i_array40 = large21.indexOfLargest(i_array39);
    int[] i_array41 = large6.indexOfLargest(i_array39);
    int[] i_array42 = large0.indexOfLargest(i_array41);
    int[] i_array43 = null;
    int[] i_array44 = large0.indexOfLargest(i_array43);
    int[] i_array45 = null;
    int[] i_array46 = large0.indexOfLargest(i_array45);
    Large large47 = new Large();
    int[] i_array49 = new int[] { 1 };
    int[] i_array50 = large47.indexOfLargest(i_array49);
    Large large51 = new Large();
    Large large52 = new Large();
    int[] i_array54 = new int[] { 1 };
    int[] i_array55 = large52.indexOfLargest(i_array54);
    int[] i_array56 = large51.indexOfLargest(i_array54);
    Large large57 = new Large();
    Large large58 = new Large();
    Large large59 = new Large();
    int[] i_array61 = new int[] { 1 };
    int[] i_array62 = large59.indexOfLargest(i_array61);
    int[] i_array63 = large58.indexOfLargest(i_array61);
    int[] i_array64 = large57.indexOfLargest(i_array61);
    int[] i_array65 = large51.indexOfLargest(i_array64);
    int[] i_array66 = large47.indexOfLargest(i_array65);
    int[] i_array67 = large0.indexOfLargest(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test071"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    int[] i_array9 = new int[] { 1 };
    int[] i_array10 = large7.indexOfLargest(i_array9);
    int[] i_array11 = large6.indexOfLargest(i_array9);
    Large large12 = new Large();
    Large large13 = new Large();
    Large large14 = new Large();
    int[] i_array16 = new int[] { 1 };
    int[] i_array17 = large14.indexOfLargest(i_array16);
    int[] i_array18 = large13.indexOfLargest(i_array16);
    int[] i_array19 = large12.indexOfLargest(i_array16);
    int[] i_array20 = large6.indexOfLargest(i_array19);
    Large large21 = new Large();
    int[] i_array23 = new int[] { 1 };
    int[] i_array24 = large21.indexOfLargest(i_array23);
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    Large large31 = new Large();
    Large large32 = new Large();
    Large large33 = new Large();
    int[] i_array35 = new int[] { 1 };
    int[] i_array36 = large33.indexOfLargest(i_array35);
    int[] i_array37 = large32.indexOfLargest(i_array35);
    int[] i_array38 = large31.indexOfLargest(i_array35);
    int[] i_array39 = large25.indexOfLargest(i_array38);
    int[] i_array40 = large21.indexOfLargest(i_array39);
    int[] i_array41 = large6.indexOfLargest(i_array39);
    int[] i_array42 = large0.indexOfLargest(i_array41);
    Large large43 = new Large();
    Large large44 = new Large();
    Large large45 = new Large();
    Large large46 = new Large();
    int[] i_array48 = new int[] { 1 };
    int[] i_array49 = large46.indexOfLargest(i_array48);
    int[] i_array50 = large45.indexOfLargest(i_array48);
    int[] i_array51 = large44.indexOfLargest(i_array48);
    int[] i_array52 = large43.indexOfLargest(i_array48);
    Large large53 = new Large();
    Large large54 = new Large();
    int[] i_array56 = new int[] { 1 };
    int[] i_array57 = large54.indexOfLargest(i_array56);
    int[] i_array58 = large53.indexOfLargest(i_array56);
    Large large59 = new Large();
    Large large60 = new Large();
    Large large61 = new Large();
    int[] i_array63 = new int[] { 1 };
    int[] i_array64 = large61.indexOfLargest(i_array63);
    int[] i_array65 = large60.indexOfLargest(i_array63);
    int[] i_array66 = large59.indexOfLargest(i_array63);
    int[] i_array67 = large53.indexOfLargest(i_array66);
    Large large68 = new Large();
    Large large69 = new Large();
    int[] i_array71 = new int[] { 1 };
    int[] i_array72 = large69.indexOfLargest(i_array71);
    int[] i_array73 = large68.indexOfLargest(i_array71);
    Large large74 = new Large();
    Large large75 = new Large();
    Large large76 = new Large();
    int[] i_array78 = new int[] { 1 };
    int[] i_array79 = large76.indexOfLargest(i_array78);
    int[] i_array80 = large75.indexOfLargest(i_array78);
    int[] i_array81 = large74.indexOfLargest(i_array78);
    int[] i_array82 = large68.indexOfLargest(i_array81);
    int[] i_array83 = large53.indexOfLargest(i_array82);
    int[] i_array84 = large43.indexOfLargest(i_array82);
    int[] i_array85 = large0.indexOfLargest(i_array82);
    int[] i_array86 = null;
    int[] i_array87 = large0.indexOfLargest(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array87);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test072"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large1.indexOfLargest(i_array12);
    int[] i_array14 = large0.indexOfLargest(i_array12);
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    Large large21 = new Large();
    Large large22 = new Large();
    int[] i_array24 = new int[] { 1 };
    int[] i_array25 = large22.indexOfLargest(i_array24);
    int[] i_array26 = large21.indexOfLargest(i_array24);
    Large large27 = new Large();
    Large large28 = new Large();
    Large large29 = new Large();
    int[] i_array31 = new int[] { 1 };
    int[] i_array32 = large29.indexOfLargest(i_array31);
    int[] i_array33 = large28.indexOfLargest(i_array31);
    int[] i_array34 = large27.indexOfLargest(i_array31);
    int[] i_array35 = large21.indexOfLargest(i_array34);
    Large large36 = new Large();
    int[] i_array38 = new int[] { 1 };
    int[] i_array39 = large36.indexOfLargest(i_array38);
    Large large40 = new Large();
    Large large41 = new Large();
    int[] i_array43 = new int[] { 1 };
    int[] i_array44 = large41.indexOfLargest(i_array43);
    int[] i_array45 = large40.indexOfLargest(i_array43);
    Large large46 = new Large();
    Large large47 = new Large();
    Large large48 = new Large();
    int[] i_array50 = new int[] { 1 };
    int[] i_array51 = large48.indexOfLargest(i_array50);
    int[] i_array52 = large47.indexOfLargest(i_array50);
    int[] i_array53 = large46.indexOfLargest(i_array50);
    int[] i_array54 = large40.indexOfLargest(i_array53);
    int[] i_array55 = large36.indexOfLargest(i_array54);
    int[] i_array56 = large21.indexOfLargest(i_array54);
    int[] i_array57 = large15.indexOfLargest(i_array56);
    Large large58 = new Large();
    Large large59 = new Large();
    int[] i_array61 = new int[] { 1 };
    int[] i_array62 = large59.indexOfLargest(i_array61);
    int[] i_array63 = large58.indexOfLargest(i_array61);
    Large large64 = new Large();
    Large large65 = new Large();
    int[] i_array67 = new int[] { 1 };
    int[] i_array68 = large65.indexOfLargest(i_array67);
    int[] i_array69 = large64.indexOfLargest(i_array67);
    int[] i_array70 = large58.indexOfLargest(i_array69);
    int[] i_array71 = large15.indexOfLargest(i_array69);
    int[] i_array72 = large0.indexOfLargest(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test073"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test074"); }

    Large large0 = new Large();
    int[] i_array2 = new int[] { 1 };
    int[] i_array3 = large0.indexOfLargest(i_array2);
    Large large4 = new Large();
    int[] i_array6 = new int[] { 1 };
    int[] i_array7 = large4.indexOfLargest(i_array6);
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large8.indexOfLargest(i_array21);
    int[] i_array23 = large4.indexOfLargest(i_array22);
    int[] i_array24 = large0.indexOfLargest(i_array23);
    Large large25 = new Large();
    Large large26 = new Large();
    Large large27 = new Large();
    int[] i_array29 = new int[] { 1 };
    int[] i_array30 = large27.indexOfLargest(i_array29);
    int[] i_array31 = large26.indexOfLargest(i_array29);
    int[] i_array32 = large25.indexOfLargest(i_array29);
    int[] i_array33 = large0.indexOfLargest(i_array32);
    Large large34 = new Large();
    Large large35 = new Large();
    Large large36 = new Large();
    int[] i_array38 = new int[] { 1 };
    int[] i_array39 = large36.indexOfLargest(i_array38);
    int[] i_array40 = large35.indexOfLargest(i_array38);
    int[] i_array41 = large34.indexOfLargest(i_array38);
    Large large42 = new Large();
    Large large43 = new Large();
    int[] i_array45 = new int[] { 1 };
    int[] i_array46 = large43.indexOfLargest(i_array45);
    int[] i_array47 = large42.indexOfLargest(i_array45);
    Large large48 = new Large();
    Large large49 = new Large();
    Large large50 = new Large();
    int[] i_array52 = new int[] { 1 };
    int[] i_array53 = large50.indexOfLargest(i_array52);
    int[] i_array54 = large49.indexOfLargest(i_array52);
    int[] i_array55 = large48.indexOfLargest(i_array52);
    int[] i_array56 = large42.indexOfLargest(i_array55);
    Large large57 = new Large();
    Large large58 = new Large();
    int[] i_array60 = new int[] { 1 };
    int[] i_array61 = large58.indexOfLargest(i_array60);
    int[] i_array62 = large57.indexOfLargest(i_array60);
    Large large63 = new Large();
    Large large64 = new Large();
    Large large65 = new Large();
    int[] i_array67 = new int[] { 1 };
    int[] i_array68 = large65.indexOfLargest(i_array67);
    int[] i_array69 = large64.indexOfLargest(i_array67);
    int[] i_array70 = large63.indexOfLargest(i_array67);
    int[] i_array71 = large57.indexOfLargest(i_array70);
    Large large72 = new Large();
    int[] i_array74 = new int[] { 1 };
    int[] i_array75 = large72.indexOfLargest(i_array74);
    Large large76 = new Large();
    Large large77 = new Large();
    int[] i_array79 = new int[] { 1 };
    int[] i_array80 = large77.indexOfLargest(i_array79);
    int[] i_array81 = large76.indexOfLargest(i_array79);
    Large large82 = new Large();
    Large large83 = new Large();
    Large large84 = new Large();
    int[] i_array86 = new int[] { 1 };
    int[] i_array87 = large84.indexOfLargest(i_array86);
    int[] i_array88 = large83.indexOfLargest(i_array86);
    int[] i_array89 = large82.indexOfLargest(i_array86);
    int[] i_array90 = large76.indexOfLargest(i_array89);
    int[] i_array91 = large72.indexOfLargest(i_array90);
    int[] i_array92 = large57.indexOfLargest(i_array90);
    int[] i_array93 = large42.indexOfLargest(i_array90);
    int[] i_array94 = large34.indexOfLargest(i_array90);
    int[] i_array95 = large0.indexOfLargest(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array95);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test075"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("", "hi!");
    boolean b27 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test076"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "");
    boolean b27 = stringManipulation0.haveSameChars("", "");
    boolean b30 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test077"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test078"); }

    Large large0 = new Large();
    int[] i_array2 = new int[] { 1 };
    int[] i_array3 = large0.indexOfLargest(i_array2);
    Large large4 = new Large();
    Large large5 = new Large();
    int[] i_array7 = new int[] { 1 };
    int[] i_array8 = large5.indexOfLargest(i_array7);
    int[] i_array9 = large4.indexOfLargest(i_array7);
    Large large10 = new Large();
    Large large11 = new Large();
    Large large12 = new Large();
    int[] i_array14 = new int[] { 1 };
    int[] i_array15 = large12.indexOfLargest(i_array14);
    int[] i_array16 = large11.indexOfLargest(i_array14);
    int[] i_array17 = large10.indexOfLargest(i_array14);
    int[] i_array18 = large4.indexOfLargest(i_array17);
    int[] i_array19 = large0.indexOfLargest(i_array18);
    Large large20 = new Large();
    Large large21 = new Large();
    int[] i_array23 = new int[] { 1 };
    int[] i_array24 = large21.indexOfLargest(i_array23);
    int[] i_array25 = large20.indexOfLargest(i_array23);
    Large large26 = new Large();
    Large large27 = new Large();
    Large large28 = new Large();
    int[] i_array30 = new int[] { 1 };
    int[] i_array31 = large28.indexOfLargest(i_array30);
    int[] i_array32 = large27.indexOfLargest(i_array30);
    int[] i_array33 = large26.indexOfLargest(i_array30);
    int[] i_array34 = large20.indexOfLargest(i_array33);
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large20.indexOfLargest(i_array38);
    Large large40 = new Large();
    Large large41 = new Large();
    int[] i_array43 = new int[] { 1 };
    int[] i_array44 = large41.indexOfLargest(i_array43);
    int[] i_array45 = large40.indexOfLargest(i_array43);
    Large large46 = new Large();
    Large large47 = new Large();
    int[] i_array49 = new int[] { 1 };
    int[] i_array50 = large47.indexOfLargest(i_array49);
    int[] i_array51 = large46.indexOfLargest(i_array49);
    int[] i_array52 = large40.indexOfLargest(i_array51);
    int[] i_array53 = large20.indexOfLargest(i_array51);
    Large large54 = new Large();
    Large large55 = new Large();
    Large large56 = new Large();
    int[] i_array58 = new int[] { 1 };
    int[] i_array59 = large56.indexOfLargest(i_array58);
    int[] i_array60 = large55.indexOfLargest(i_array58);
    int[] i_array61 = large54.indexOfLargest(i_array58);
    Large large62 = new Large();
    Large large63 = new Large();
    int[] i_array65 = new int[] { 1 };
    int[] i_array66 = large63.indexOfLargest(i_array65);
    int[] i_array67 = large62.indexOfLargest(i_array65);
    Large large68 = new Large();
    Large large69 = new Large();
    Large large70 = new Large();
    int[] i_array72 = new int[] { 1 };
    int[] i_array73 = large70.indexOfLargest(i_array72);
    int[] i_array74 = large69.indexOfLargest(i_array72);
    int[] i_array75 = large68.indexOfLargest(i_array72);
    int[] i_array76 = large62.indexOfLargest(i_array75);
    int[] i_array77 = large54.indexOfLargest(i_array76);
    Large large78 = new Large();
    Large large79 = new Large();
    Large large80 = new Large();
    int[] i_array82 = new int[] { 1 };
    int[] i_array83 = large80.indexOfLargest(i_array82);
    int[] i_array84 = large79.indexOfLargest(i_array82);
    int[] i_array85 = large78.indexOfLargest(i_array82);
    int[] i_array86 = large54.indexOfLargest(i_array85);
    int[] i_array87 = large20.indexOfLargest(i_array86);
    int[] i_array88 = large0.indexOfLargest(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test079"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test080"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test081"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test082"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    int[] i_array9 = new int[] { 1 };
    int[] i_array10 = large7.indexOfLargest(i_array9);
    int[] i_array11 = large6.indexOfLargest(i_array9);
    Large large12 = new Large();
    Large large13 = new Large();
    Large large14 = new Large();
    int[] i_array16 = new int[] { 1 };
    int[] i_array17 = large14.indexOfLargest(i_array16);
    int[] i_array18 = large13.indexOfLargest(i_array16);
    int[] i_array19 = large12.indexOfLargest(i_array16);
    int[] i_array20 = large6.indexOfLargest(i_array19);
    Large large21 = new Large();
    int[] i_array23 = new int[] { 1 };
    int[] i_array24 = large21.indexOfLargest(i_array23);
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    Large large31 = new Large();
    Large large32 = new Large();
    Large large33 = new Large();
    int[] i_array35 = new int[] { 1 };
    int[] i_array36 = large33.indexOfLargest(i_array35);
    int[] i_array37 = large32.indexOfLargest(i_array35);
    int[] i_array38 = large31.indexOfLargest(i_array35);
    int[] i_array39 = large25.indexOfLargest(i_array38);
    int[] i_array40 = large21.indexOfLargest(i_array39);
    int[] i_array41 = large6.indexOfLargest(i_array39);
    int[] i_array42 = large0.indexOfLargest(i_array41);
    int[] i_array43 = null;
    int[] i_array44 = large0.indexOfLargest(i_array43);
    int[] i_array45 = null;
    int[] i_array46 = large0.indexOfLargest(i_array45);
    Large large47 = new Large();
    int[] i_array49 = new int[] { 1 };
    int[] i_array50 = large47.indexOfLargest(i_array49);
    Large large51 = new Large();
    int[] i_array53 = new int[] { 1 };
    int[] i_array54 = large51.indexOfLargest(i_array53);
    Large large55 = new Large();
    Large large56 = new Large();
    int[] i_array58 = new int[] { 1 };
    int[] i_array59 = large56.indexOfLargest(i_array58);
    int[] i_array60 = large55.indexOfLargest(i_array58);
    Large large61 = new Large();
    Large large62 = new Large();
    Large large63 = new Large();
    int[] i_array65 = new int[] { 1 };
    int[] i_array66 = large63.indexOfLargest(i_array65);
    int[] i_array67 = large62.indexOfLargest(i_array65);
    int[] i_array68 = large61.indexOfLargest(i_array65);
    int[] i_array69 = large55.indexOfLargest(i_array68);
    int[] i_array70 = large51.indexOfLargest(i_array69);
    int[] i_array71 = large47.indexOfLargest(i_array70);
    Large large72 = new Large();
    Large large73 = new Large();
    Large large74 = new Large();
    int[] i_array76 = new int[] { 1 };
    int[] i_array77 = large74.indexOfLargest(i_array76);
    int[] i_array78 = large73.indexOfLargest(i_array76);
    int[] i_array79 = large72.indexOfLargest(i_array76);
    int[] i_array80 = large47.indexOfLargest(i_array79);
    int[] i_array81 = large0.indexOfLargest(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test083"); }

    Large large0 = new Large();
    int[] i_array1 = null;
    int[] i_array2 = large0.indexOfLargest(i_array1);
    Large large3 = new Large();
    Large large4 = new Large();
    Large large5 = new Large();
    int[] i_array7 = new int[] { 1 };
    int[] i_array8 = large5.indexOfLargest(i_array7);
    int[] i_array9 = large4.indexOfLargest(i_array7);
    int[] i_array10 = large3.indexOfLargest(i_array7);
    Large large11 = new Large();
    Large large12 = new Large();
    int[] i_array14 = new int[] { 1 };
    int[] i_array15 = large12.indexOfLargest(i_array14);
    int[] i_array16 = large11.indexOfLargest(i_array14);
    Large large17 = new Large();
    Large large18 = new Large();
    Large large19 = new Large();
    int[] i_array21 = new int[] { 1 };
    int[] i_array22 = large19.indexOfLargest(i_array21);
    int[] i_array23 = large18.indexOfLargest(i_array21);
    int[] i_array24 = large17.indexOfLargest(i_array21);
    int[] i_array25 = large11.indexOfLargest(i_array24);
    int[] i_array26 = large3.indexOfLargest(i_array25);
    Large large27 = new Large();
    Large large28 = new Large();
    Large large29 = new Large();
    int[] i_array31 = new int[] { 1 };
    int[] i_array32 = large29.indexOfLargest(i_array31);
    int[] i_array33 = large28.indexOfLargest(i_array31);
    int[] i_array34 = large27.indexOfLargest(i_array31);
    int[] i_array35 = large3.indexOfLargest(i_array34);
    Large large36 = new Large();
    Large large37 = new Large();
    int[] i_array39 = new int[] { 1 };
    int[] i_array40 = large37.indexOfLargest(i_array39);
    int[] i_array41 = large36.indexOfLargest(i_array39);
    Large large42 = new Large();
    Large large43 = new Large();
    Large large44 = new Large();
    int[] i_array46 = new int[] { 1 };
    int[] i_array47 = large44.indexOfLargest(i_array46);
    int[] i_array48 = large43.indexOfLargest(i_array46);
    int[] i_array49 = large42.indexOfLargest(i_array46);
    int[] i_array50 = large36.indexOfLargest(i_array49);
    Large large51 = new Large();
    Large large52 = new Large();
    int[] i_array54 = new int[] { 1 };
    int[] i_array55 = large52.indexOfLargest(i_array54);
    int[] i_array56 = large51.indexOfLargest(i_array54);
    Large large57 = new Large();
    Large large58 = new Large();
    Large large59 = new Large();
    int[] i_array61 = new int[] { 1 };
    int[] i_array62 = large59.indexOfLargest(i_array61);
    int[] i_array63 = large58.indexOfLargest(i_array61);
    int[] i_array64 = large57.indexOfLargest(i_array61);
    int[] i_array65 = large51.indexOfLargest(i_array64);
    Large large66 = new Large();
    int[] i_array68 = new int[] { 1 };
    int[] i_array69 = large66.indexOfLargest(i_array68);
    Large large70 = new Large();
    Large large71 = new Large();
    int[] i_array73 = new int[] { 1 };
    int[] i_array74 = large71.indexOfLargest(i_array73);
    int[] i_array75 = large70.indexOfLargest(i_array73);
    Large large76 = new Large();
    Large large77 = new Large();
    Large large78 = new Large();
    int[] i_array80 = new int[] { 1 };
    int[] i_array81 = large78.indexOfLargest(i_array80);
    int[] i_array82 = large77.indexOfLargest(i_array80);
    int[] i_array83 = large76.indexOfLargest(i_array80);
    int[] i_array84 = large70.indexOfLargest(i_array83);
    int[] i_array85 = large66.indexOfLargest(i_array84);
    int[] i_array86 = large51.indexOfLargest(i_array84);
    int[] i_array87 = large36.indexOfLargest(i_array84);
    int[] i_array88 = large3.indexOfLargest(i_array84);
    int[] i_array89 = large0.indexOfLargest(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test084"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    int[] i_array9 = new int[] { 1 };
    int[] i_array10 = large7.indexOfLargest(i_array9);
    int[] i_array11 = large6.indexOfLargest(i_array9);
    int[] i_array12 = large0.indexOfLargest(i_array11);
    Large large13 = new Large();
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large13.indexOfLargest(i_array18);
    Large large23 = new Large();
    Large large24 = new Large();
    Large large25 = new Large();
    int[] i_array27 = new int[] { 1 };
    int[] i_array28 = large25.indexOfLargest(i_array27);
    int[] i_array29 = large24.indexOfLargest(i_array27);
    int[] i_array30 = large23.indexOfLargest(i_array27);
    Large large31 = new Large();
    Large large32 = new Large();
    int[] i_array34 = new int[] { 1 };
    int[] i_array35 = large32.indexOfLargest(i_array34);
    int[] i_array36 = large31.indexOfLargest(i_array34);
    Large large37 = new Large();
    Large large38 = new Large();
    Large large39 = new Large();
    int[] i_array41 = new int[] { 1 };
    int[] i_array42 = large39.indexOfLargest(i_array41);
    int[] i_array43 = large38.indexOfLargest(i_array41);
    int[] i_array44 = large37.indexOfLargest(i_array41);
    int[] i_array45 = large31.indexOfLargest(i_array44);
    int[] i_array46 = large23.indexOfLargest(i_array45);
    Large large47 = new Large();
    Large large48 = new Large();
    Large large49 = new Large();
    int[] i_array51 = new int[] { 1 };
    int[] i_array52 = large49.indexOfLargest(i_array51);
    int[] i_array53 = large48.indexOfLargest(i_array51);
    int[] i_array54 = large47.indexOfLargest(i_array51);
    int[] i_array55 = large23.indexOfLargest(i_array54);
    Large large56 = new Large();
    Large large57 = new Large();
    Large large58 = new Large();
    int[] i_array60 = new int[] { 1 };
    int[] i_array61 = large58.indexOfLargest(i_array60);
    int[] i_array62 = large57.indexOfLargest(i_array60);
    int[] i_array63 = large56.indexOfLargest(i_array60);
    int[] i_array64 = large23.indexOfLargest(i_array60);
    Large large65 = new Large();
    Large large66 = new Large();
    int[] i_array68 = new int[] { 1 };
    int[] i_array69 = large66.indexOfLargest(i_array68);
    int[] i_array70 = large65.indexOfLargest(i_array68);
    Large large71 = new Large();
    Large large72 = new Large();
    Large large73 = new Large();
    int[] i_array75 = new int[] { 1 };
    int[] i_array76 = large73.indexOfLargest(i_array75);
    int[] i_array77 = large72.indexOfLargest(i_array75);
    int[] i_array78 = large71.indexOfLargest(i_array75);
    int[] i_array79 = large65.indexOfLargest(i_array78);
    Large large80 = new Large();
    Large large81 = new Large();
    int[] i_array83 = new int[] { 1 };
    int[] i_array84 = large81.indexOfLargest(i_array83);
    int[] i_array85 = large80.indexOfLargest(i_array83);
    Large large86 = new Large();
    Large large87 = new Large();
    Large large88 = new Large();
    int[] i_array90 = new int[] { 1 };
    int[] i_array91 = large88.indexOfLargest(i_array90);
    int[] i_array92 = large87.indexOfLargest(i_array90);
    int[] i_array93 = large86.indexOfLargest(i_array90);
    int[] i_array94 = large80.indexOfLargest(i_array93);
    int[] i_array95 = large65.indexOfLargest(i_array94);
    int[] i_array96 = large23.indexOfLargest(i_array94);
    int[] i_array97 = large13.indexOfLargest(i_array94);
    int[] i_array98 = large0.indexOfLargest(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array98);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test085"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test086"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test087"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test088"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test089"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test090"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b27 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test091"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test092"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    Large large7 = new Large();
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    int[] i_array14 = large7.indexOfLargest(i_array11);
    int[] i_array15 = large1.indexOfLargest(i_array14);
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    Large large20 = new Large();
    Large large21 = new Large();
    int[] i_array23 = new int[] { 1 };
    int[] i_array24 = large21.indexOfLargest(i_array23);
    int[] i_array25 = large20.indexOfLargest(i_array23);
    Large large26 = new Large();
    Large large27 = new Large();
    Large large28 = new Large();
    int[] i_array30 = new int[] { 1 };
    int[] i_array31 = large28.indexOfLargest(i_array30);
    int[] i_array32 = large27.indexOfLargest(i_array30);
    int[] i_array33 = large26.indexOfLargest(i_array30);
    int[] i_array34 = large20.indexOfLargest(i_array33);
    int[] i_array35 = large16.indexOfLargest(i_array34);
    int[] i_array36 = large1.indexOfLargest(i_array34);
    Large large37 = new Large();
    Large large38 = new Large();
    int[] i_array40 = new int[] { 1 };
    int[] i_array41 = large38.indexOfLargest(i_array40);
    int[] i_array42 = large37.indexOfLargest(i_array40);
    Large large43 = new Large();
    Large large44 = new Large();
    Large large45 = new Large();
    int[] i_array47 = new int[] { 1 };
    int[] i_array48 = large45.indexOfLargest(i_array47);
    int[] i_array49 = large44.indexOfLargest(i_array47);
    int[] i_array50 = large43.indexOfLargest(i_array47);
    int[] i_array51 = large37.indexOfLargest(i_array50);
    Large large52 = new Large();
    Large large53 = new Large();
    int[] i_array55 = new int[] { 1 };
    int[] i_array56 = large53.indexOfLargest(i_array55);
    int[] i_array57 = large52.indexOfLargest(i_array55);
    Large large58 = new Large();
    Large large59 = new Large();
    Large large60 = new Large();
    int[] i_array62 = new int[] { 1 };
    int[] i_array63 = large60.indexOfLargest(i_array62);
    int[] i_array64 = large59.indexOfLargest(i_array62);
    int[] i_array65 = large58.indexOfLargest(i_array62);
    int[] i_array66 = large52.indexOfLargest(i_array65);
    Large large67 = new Large();
    int[] i_array69 = new int[] { 1 };
    int[] i_array70 = large67.indexOfLargest(i_array69);
    Large large71 = new Large();
    Large large72 = new Large();
    int[] i_array74 = new int[] { 1 };
    int[] i_array75 = large72.indexOfLargest(i_array74);
    int[] i_array76 = large71.indexOfLargest(i_array74);
    Large large77 = new Large();
    Large large78 = new Large();
    Large large79 = new Large();
    int[] i_array81 = new int[] { 1 };
    int[] i_array82 = large79.indexOfLargest(i_array81);
    int[] i_array83 = large78.indexOfLargest(i_array81);
    int[] i_array84 = large77.indexOfLargest(i_array81);
    int[] i_array85 = large71.indexOfLargest(i_array84);
    int[] i_array86 = large67.indexOfLargest(i_array85);
    int[] i_array87 = large52.indexOfLargest(i_array85);
    int[] i_array88 = large37.indexOfLargest(i_array85);
    int[] i_array89 = large1.indexOfLargest(i_array85);
    int[] i_array90 = large0.indexOfLargest(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test093"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    boolean b27 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test094"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test095"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    Large large21 = new Large();
    Large large22 = new Large();
    Large large23 = new Large();
    int[] i_array25 = new int[] { 1 };
    int[] i_array26 = large23.indexOfLargest(i_array25);
    int[] i_array27 = large22.indexOfLargest(i_array25);
    int[] i_array28 = large21.indexOfLargest(i_array25);
    int[] i_array29 = large15.indexOfLargest(i_array28);
    Large large30 = new Large();
    int[] i_array32 = new int[] { 1 };
    int[] i_array33 = large30.indexOfLargest(i_array32);
    Large large34 = new Large();
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large34.indexOfLargest(i_array37);
    Large large40 = new Large();
    Large large41 = new Large();
    Large large42 = new Large();
    int[] i_array44 = new int[] { 1 };
    int[] i_array45 = large42.indexOfLargest(i_array44);
    int[] i_array46 = large41.indexOfLargest(i_array44);
    int[] i_array47 = large40.indexOfLargest(i_array44);
    int[] i_array48 = large34.indexOfLargest(i_array47);
    int[] i_array49 = large30.indexOfLargest(i_array48);
    int[] i_array50 = large15.indexOfLargest(i_array48);
    int[] i_array51 = large0.indexOfLargest(i_array48);
    Large large52 = new Large();
    Large large53 = new Large();
    int[] i_array55 = new int[] { 1 };
    int[] i_array56 = large53.indexOfLargest(i_array55);
    int[] i_array57 = large52.indexOfLargest(i_array55);
    int[] i_array58 = large0.indexOfLargest(i_array57);
    int[] i_array59 = null;
    int[] i_array60 = large0.indexOfLargest(i_array59);
    Large large61 = new Large();
    Large large62 = new Large();
    Large large63 = new Large();
    int[] i_array65 = new int[] { 1 };
    int[] i_array66 = large63.indexOfLargest(i_array65);
    int[] i_array67 = large62.indexOfLargest(i_array65);
    int[] i_array68 = large61.indexOfLargest(i_array65);
    int[] i_array69 = large0.indexOfLargest(i_array65);
    Large large70 = new Large();
    Large large71 = new Large();
    int[] i_array73 = new int[] { 1 };
    int[] i_array74 = large71.indexOfLargest(i_array73);
    int[] i_array75 = large70.indexOfLargest(i_array73);
    int[] i_array76 = large0.indexOfLargest(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test096"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test097"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large8.indexOfLargest(i_array21);
    int[] i_array23 = large0.indexOfLargest(i_array22);
    Large large24 = new Large();
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    int[] i_array31 = large24.indexOfLargest(i_array28);
    int[] i_array32 = large0.indexOfLargest(i_array31);
    Large large33 = new Large();
    Large large34 = new Large();
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large34.indexOfLargest(i_array37);
    int[] i_array40 = large33.indexOfLargest(i_array37);
    int[] i_array41 = large0.indexOfLargest(i_array37);
    Large large42 = new Large();
    Large large43 = new Large();
    Large large44 = new Large();
    int[] i_array46 = new int[] { 1 };
    int[] i_array47 = large44.indexOfLargest(i_array46);
    int[] i_array48 = large43.indexOfLargest(i_array46);
    int[] i_array49 = large42.indexOfLargest(i_array46);
    Large large50 = new Large();
    Large large51 = new Large();
    int[] i_array53 = new int[] { 1 };
    int[] i_array54 = large51.indexOfLargest(i_array53);
    int[] i_array55 = large50.indexOfLargest(i_array53);
    Large large56 = new Large();
    Large large57 = new Large();
    Large large58 = new Large();
    int[] i_array60 = new int[] { 1 };
    int[] i_array61 = large58.indexOfLargest(i_array60);
    int[] i_array62 = large57.indexOfLargest(i_array60);
    int[] i_array63 = large56.indexOfLargest(i_array60);
    int[] i_array64 = large50.indexOfLargest(i_array63);
    int[] i_array65 = large42.indexOfLargest(i_array64);
    Large large66 = new Large();
    Large large67 = new Large();
    Large large68 = new Large();
    int[] i_array70 = new int[] { 1 };
    int[] i_array71 = large68.indexOfLargest(i_array70);
    int[] i_array72 = large67.indexOfLargest(i_array70);
    int[] i_array73 = large66.indexOfLargest(i_array70);
    int[] i_array74 = large42.indexOfLargest(i_array73);
    int[] i_array75 = large0.indexOfLargest(i_array73);
    int[] i_array76 = null;
    int[] i_array77 = large0.indexOfLargest(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array77);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test098"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test099"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test100"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test101"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test102"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test103"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    int[] i_array9 = new int[] { 1 };
    int[] i_array10 = large7.indexOfLargest(i_array9);
    int[] i_array11 = large6.indexOfLargest(i_array9);
    Large large12 = new Large();
    Large large13 = new Large();
    Large large14 = new Large();
    int[] i_array16 = new int[] { 1 };
    int[] i_array17 = large14.indexOfLargest(i_array16);
    int[] i_array18 = large13.indexOfLargest(i_array16);
    int[] i_array19 = large12.indexOfLargest(i_array16);
    int[] i_array20 = large6.indexOfLargest(i_array19);
    Large large21 = new Large();
    int[] i_array23 = new int[] { 1 };
    int[] i_array24 = large21.indexOfLargest(i_array23);
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    Large large31 = new Large();
    Large large32 = new Large();
    Large large33 = new Large();
    int[] i_array35 = new int[] { 1 };
    int[] i_array36 = large33.indexOfLargest(i_array35);
    int[] i_array37 = large32.indexOfLargest(i_array35);
    int[] i_array38 = large31.indexOfLargest(i_array35);
    int[] i_array39 = large25.indexOfLargest(i_array38);
    int[] i_array40 = large21.indexOfLargest(i_array39);
    int[] i_array41 = large6.indexOfLargest(i_array39);
    int[] i_array42 = large0.indexOfLargest(i_array41);
    Large large43 = new Large();
    Large large44 = new Large();
    int[] i_array46 = new int[] { 1 };
    int[] i_array47 = large44.indexOfLargest(i_array46);
    int[] i_array48 = large43.indexOfLargest(i_array46);
    Large large49 = new Large();
    Large large50 = new Large();
    int[] i_array52 = new int[] { 1 };
    int[] i_array53 = large50.indexOfLargest(i_array52);
    int[] i_array54 = large49.indexOfLargest(i_array52);
    int[] i_array55 = large43.indexOfLargest(i_array54);
    int[] i_array56 = large0.indexOfLargest(i_array54);
    Large large57 = new Large();
    int[] i_array59 = new int[] { 1 };
    int[] i_array60 = large57.indexOfLargest(i_array59);
    Large large61 = new Large();
    Large large62 = new Large();
    int[] i_array64 = new int[] { 1 };
    int[] i_array65 = large62.indexOfLargest(i_array64);
    int[] i_array66 = large61.indexOfLargest(i_array64);
    Large large67 = new Large();
    Large large68 = new Large();
    Large large69 = new Large();
    int[] i_array71 = new int[] { 1 };
    int[] i_array72 = large69.indexOfLargest(i_array71);
    int[] i_array73 = large68.indexOfLargest(i_array71);
    int[] i_array74 = large67.indexOfLargest(i_array71);
    int[] i_array75 = large61.indexOfLargest(i_array74);
    Large large76 = new Large();
    int[] i_array78 = new int[] { 1 };
    int[] i_array79 = large76.indexOfLargest(i_array78);
    int[] i_array80 = large61.indexOfLargest(i_array79);
    int[] i_array81 = large57.indexOfLargest(i_array79);
    int[] i_array82 = large0.indexOfLargest(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test104"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test105"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test106"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large1.indexOfLargest(i_array12);
    int[] i_array14 = large0.indexOfLargest(i_array12);
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    Large large21 = new Large();
    Large large22 = new Large();
    Large large23 = new Large();
    int[] i_array25 = new int[] { 1 };
    int[] i_array26 = large23.indexOfLargest(i_array25);
    int[] i_array27 = large22.indexOfLargest(i_array25);
    int[] i_array28 = large21.indexOfLargest(i_array25);
    int[] i_array29 = large15.indexOfLargest(i_array28);
    int[] i_array30 = large0.indexOfLargest(i_array29);
    Large large31 = new Large();
    Large large32 = new Large();
    Large large33 = new Large();
    int[] i_array35 = new int[] { 1 };
    int[] i_array36 = large33.indexOfLargest(i_array35);
    int[] i_array37 = large32.indexOfLargest(i_array35);
    int[] i_array38 = large31.indexOfLargest(i_array35);
    Large large39 = new Large();
    int[] i_array41 = new int[] { 1 };
    int[] i_array42 = large39.indexOfLargest(i_array41);
    Large large43 = new Large();
    Large large44 = new Large();
    int[] i_array46 = new int[] { 1 };
    int[] i_array47 = large44.indexOfLargest(i_array46);
    int[] i_array48 = large43.indexOfLargest(i_array46);
    Large large49 = new Large();
    Large large50 = new Large();
    Large large51 = new Large();
    int[] i_array53 = new int[] { 1 };
    int[] i_array54 = large51.indexOfLargest(i_array53);
    int[] i_array55 = large50.indexOfLargest(i_array53);
    int[] i_array56 = large49.indexOfLargest(i_array53);
    int[] i_array57 = large43.indexOfLargest(i_array56);
    Large large58 = new Large();
    int[] i_array60 = new int[] { 1 };
    int[] i_array61 = large58.indexOfLargest(i_array60);
    int[] i_array62 = large43.indexOfLargest(i_array61);
    int[] i_array63 = large39.indexOfLargest(i_array61);
    int[] i_array64 = large31.indexOfLargest(i_array63);
    int[] i_array65 = large0.indexOfLargest(i_array63);
    Large large66 = new Large();
    int[] i_array68 = new int[] { 1 };
    int[] i_array69 = large66.indexOfLargest(i_array68);
    Large large70 = new Large();
    Large large71 = new Large();
    int[] i_array73 = new int[] { 1 };
    int[] i_array74 = large71.indexOfLargest(i_array73);
    int[] i_array75 = large70.indexOfLargest(i_array73);
    Large large76 = new Large();
    Large large77 = new Large();
    Large large78 = new Large();
    int[] i_array80 = new int[] { 1 };
    int[] i_array81 = large78.indexOfLargest(i_array80);
    int[] i_array82 = large77.indexOfLargest(i_array80);
    int[] i_array83 = large76.indexOfLargest(i_array80);
    int[] i_array84 = large70.indexOfLargest(i_array83);
    Large large85 = new Large();
    int[] i_array87 = new int[] { 1 };
    int[] i_array88 = large85.indexOfLargest(i_array87);
    int[] i_array89 = large70.indexOfLargest(i_array88);
    int[] i_array90 = large66.indexOfLargest(i_array88);
    int[] i_array91 = large0.indexOfLargest(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test107"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large8.indexOfLargest(i_array21);
    int[] i_array23 = large0.indexOfLargest(i_array22);
    Large large24 = new Large();
    Large large25 = new Large();
    int[] i_array27 = new int[] { 1 };
    int[] i_array28 = large25.indexOfLargest(i_array27);
    int[] i_array29 = large24.indexOfLargest(i_array27);
    Large large30 = new Large();
    Large large31 = new Large();
    Large large32 = new Large();
    int[] i_array34 = new int[] { 1 };
    int[] i_array35 = large32.indexOfLargest(i_array34);
    int[] i_array36 = large31.indexOfLargest(i_array34);
    int[] i_array37 = large30.indexOfLargest(i_array34);
    int[] i_array38 = large24.indexOfLargest(i_array37);
    Large large39 = new Large();
    int[] i_array41 = new int[] { 1 };
    int[] i_array42 = large39.indexOfLargest(i_array41);
    Large large43 = new Large();
    Large large44 = new Large();
    int[] i_array46 = new int[] { 1 };
    int[] i_array47 = large44.indexOfLargest(i_array46);
    int[] i_array48 = large43.indexOfLargest(i_array46);
    Large large49 = new Large();
    Large large50 = new Large();
    Large large51 = new Large();
    int[] i_array53 = new int[] { 1 };
    int[] i_array54 = large51.indexOfLargest(i_array53);
    int[] i_array55 = large50.indexOfLargest(i_array53);
    int[] i_array56 = large49.indexOfLargest(i_array53);
    int[] i_array57 = large43.indexOfLargest(i_array56);
    int[] i_array58 = large39.indexOfLargest(i_array57);
    int[] i_array59 = large24.indexOfLargest(i_array57);
    Large large60 = new Large();
    Large large61 = new Large();
    Large large62 = new Large();
    int[] i_array64 = new int[] { 1 };
    int[] i_array65 = large62.indexOfLargest(i_array64);
    int[] i_array66 = large61.indexOfLargest(i_array64);
    int[] i_array67 = large60.indexOfLargest(i_array64);
    Large large68 = new Large();
    Large large69 = new Large();
    int[] i_array71 = new int[] { 1 };
    int[] i_array72 = large69.indexOfLargest(i_array71);
    int[] i_array73 = large68.indexOfLargest(i_array71);
    Large large74 = new Large();
    Large large75 = new Large();
    Large large76 = new Large();
    int[] i_array78 = new int[] { 1 };
    int[] i_array79 = large76.indexOfLargest(i_array78);
    int[] i_array80 = large75.indexOfLargest(i_array78);
    int[] i_array81 = large74.indexOfLargest(i_array78);
    int[] i_array82 = large68.indexOfLargest(i_array81);
    int[] i_array83 = large60.indexOfLargest(i_array82);
    Large large84 = new Large();
    Large large85 = new Large();
    Large large86 = new Large();
    int[] i_array88 = new int[] { 1 };
    int[] i_array89 = large86.indexOfLargest(i_array88);
    int[] i_array90 = large85.indexOfLargest(i_array88);
    int[] i_array91 = large84.indexOfLargest(i_array88);
    int[] i_array92 = large60.indexOfLargest(i_array91);
    int[] i_array93 = large24.indexOfLargest(i_array92);
    int[] i_array94 = large0.indexOfLargest(i_array92);
    Large large95 = new Large();
    int[] i_array97 = new int[] { 1 };
    int[] i_array98 = large95.indexOfLargest(i_array97);
    int[] i_array99 = large0.indexOfLargest(i_array97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array99);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test108"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test109"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large8.indexOfLargest(i_array21);
    int[] i_array23 = large0.indexOfLargest(i_array22);
    Large large24 = new Large();
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    int[] i_array31 = large24.indexOfLargest(i_array28);
    int[] i_array32 = large0.indexOfLargest(i_array31);
    Large large33 = new Large();
    Large large34 = new Large();
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large34.indexOfLargest(i_array37);
    int[] i_array40 = large33.indexOfLargest(i_array37);
    int[] i_array41 = large0.indexOfLargest(i_array37);
    int[] i_array42 = null;
    int[] i_array43 = large0.indexOfLargest(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array43);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test110"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large1.indexOfLargest(i_array12);
    Large large14 = new Large();
    Large large15 = new Large();
    int[] i_array17 = new int[] { 1 };
    int[] i_array18 = large15.indexOfLargest(i_array17);
    int[] i_array19 = large14.indexOfLargest(i_array17);
    Large large20 = new Large();
    Large large21 = new Large();
    Large large22 = new Large();
    int[] i_array24 = new int[] { 1 };
    int[] i_array25 = large22.indexOfLargest(i_array24);
    int[] i_array26 = large21.indexOfLargest(i_array24);
    int[] i_array27 = large20.indexOfLargest(i_array24);
    int[] i_array28 = large14.indexOfLargest(i_array27);
    Large large29 = new Large();
    int[] i_array31 = new int[] { 1 };
    int[] i_array32 = large29.indexOfLargest(i_array31);
    int[] i_array33 = large14.indexOfLargest(i_array32);
    Large large34 = new Large();
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large34.indexOfLargest(i_array37);
    Large large40 = new Large();
    Large large41 = new Large();
    int[] i_array43 = new int[] { 1 };
    int[] i_array44 = large41.indexOfLargest(i_array43);
    int[] i_array45 = large40.indexOfLargest(i_array43);
    int[] i_array46 = large34.indexOfLargest(i_array45);
    int[] i_array47 = large14.indexOfLargest(i_array45);
    int[] i_array48 = large1.indexOfLargest(i_array47);
    int[] i_array49 = large0.indexOfLargest(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test111"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test112"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    boolean b27 = stringManipulation0.haveSameChars("hi!", "");
    boolean b30 = stringManipulation0.haveSameChars("", "");
    boolean b33 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b36 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test113"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large8.indexOfLargest(i_array21);
    int[] i_array23 = large0.indexOfLargest(i_array22);
    Large large24 = new Large();
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    int[] i_array31 = large24.indexOfLargest(i_array28);
    int[] i_array32 = large0.indexOfLargest(i_array31);
    Large large33 = new Large();
    Large large34 = new Large();
    int[] i_array36 = new int[] { 1 };
    int[] i_array37 = large34.indexOfLargest(i_array36);
    int[] i_array38 = large33.indexOfLargest(i_array36);
    Large large39 = new Large();
    Large large40 = new Large();
    Large large41 = new Large();
    int[] i_array43 = new int[] { 1 };
    int[] i_array44 = large41.indexOfLargest(i_array43);
    int[] i_array45 = large40.indexOfLargest(i_array43);
    int[] i_array46 = large39.indexOfLargest(i_array43);
    int[] i_array47 = large33.indexOfLargest(i_array46);
    Large large48 = new Large();
    Large large49 = new Large();
    int[] i_array51 = new int[] { 1 };
    int[] i_array52 = large49.indexOfLargest(i_array51);
    int[] i_array53 = large48.indexOfLargest(i_array51);
    Large large54 = new Large();
    Large large55 = new Large();
    Large large56 = new Large();
    int[] i_array58 = new int[] { 1 };
    int[] i_array59 = large56.indexOfLargest(i_array58);
    int[] i_array60 = large55.indexOfLargest(i_array58);
    int[] i_array61 = large54.indexOfLargest(i_array58);
    int[] i_array62 = large48.indexOfLargest(i_array61);
    Large large63 = new Large();
    int[] i_array65 = new int[] { 1 };
    int[] i_array66 = large63.indexOfLargest(i_array65);
    Large large67 = new Large();
    Large large68 = new Large();
    int[] i_array70 = new int[] { 1 };
    int[] i_array71 = large68.indexOfLargest(i_array70);
    int[] i_array72 = large67.indexOfLargest(i_array70);
    Large large73 = new Large();
    Large large74 = new Large();
    Large large75 = new Large();
    int[] i_array77 = new int[] { 1 };
    int[] i_array78 = large75.indexOfLargest(i_array77);
    int[] i_array79 = large74.indexOfLargest(i_array77);
    int[] i_array80 = large73.indexOfLargest(i_array77);
    int[] i_array81 = large67.indexOfLargest(i_array80);
    int[] i_array82 = large63.indexOfLargest(i_array81);
    int[] i_array83 = large48.indexOfLargest(i_array81);
    int[] i_array84 = large33.indexOfLargest(i_array81);
    Large large85 = new Large();
    Large large86 = new Large();
    int[] i_array88 = new int[] { 1 };
    int[] i_array89 = large86.indexOfLargest(i_array88);
    int[] i_array90 = large85.indexOfLargest(i_array88);
    int[] i_array91 = large33.indexOfLargest(i_array90);
    Large large92 = new Large();
    int[] i_array94 = new int[] { 1 };
    int[] i_array95 = large92.indexOfLargest(i_array94);
    int[] i_array96 = large33.indexOfLargest(i_array94);
    int[] i_array97 = large0.indexOfLargest(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array97);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test114"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test115"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test116"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large8.indexOfLargest(i_array21);
    int[] i_array23 = large0.indexOfLargest(i_array22);
    Large large24 = new Large();
    int[] i_array26 = new int[] { 1 };
    int[] i_array27 = large24.indexOfLargest(i_array26);
    Large large28 = new Large();
    Large large29 = new Large();
    int[] i_array31 = new int[] { 1 };
    int[] i_array32 = large29.indexOfLargest(i_array31);
    int[] i_array33 = large28.indexOfLargest(i_array31);
    Large large34 = new Large();
    Large large35 = new Large();
    Large large36 = new Large();
    int[] i_array38 = new int[] { 1 };
    int[] i_array39 = large36.indexOfLargest(i_array38);
    int[] i_array40 = large35.indexOfLargest(i_array38);
    int[] i_array41 = large34.indexOfLargest(i_array38);
    int[] i_array42 = large28.indexOfLargest(i_array41);
    int[] i_array43 = large24.indexOfLargest(i_array42);
    int[] i_array44 = large0.indexOfLargest(i_array42);
    int[] i_array45 = null;
    int[] i_array46 = large0.indexOfLargest(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array46);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test117"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    Large large3 = new Large();
    int[] i_array5 = new int[] { 1 };
    int[] i_array6 = large3.indexOfLargest(i_array5);
    int[] i_array7 = large2.indexOfLargest(i_array5);
    int[] i_array8 = large1.indexOfLargest(i_array5);
    int[] i_array9 = large0.indexOfLargest(i_array5);
    Large large10 = new Large();
    Large large11 = new Large();
    int[] i_array13 = new int[] { 1 };
    int[] i_array14 = large11.indexOfLargest(i_array13);
    int[] i_array15 = large10.indexOfLargest(i_array13);
    Large large16 = new Large();
    Large large17 = new Large();
    Large large18 = new Large();
    int[] i_array20 = new int[] { 1 };
    int[] i_array21 = large18.indexOfLargest(i_array20);
    int[] i_array22 = large17.indexOfLargest(i_array20);
    int[] i_array23 = large16.indexOfLargest(i_array20);
    int[] i_array24 = large10.indexOfLargest(i_array23);
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    Large large31 = new Large();
    Large large32 = new Large();
    Large large33 = new Large();
    int[] i_array35 = new int[] { 1 };
    int[] i_array36 = large33.indexOfLargest(i_array35);
    int[] i_array37 = large32.indexOfLargest(i_array35);
    int[] i_array38 = large31.indexOfLargest(i_array35);
    int[] i_array39 = large25.indexOfLargest(i_array38);
    int[] i_array40 = large10.indexOfLargest(i_array39);
    int[] i_array41 = large0.indexOfLargest(i_array39);
    Large large42 = new Large();
    Large large43 = new Large();
    int[] i_array45 = new int[] { 1 };
    int[] i_array46 = large43.indexOfLargest(i_array45);
    int[] i_array47 = large42.indexOfLargest(i_array45);
    Large large48 = new Large();
    int[] i_array50 = new int[] { 1 };
    int[] i_array51 = large48.indexOfLargest(i_array50);
    Large large52 = new Large();
    Large large53 = new Large();
    int[] i_array55 = new int[] { 1 };
    int[] i_array56 = large53.indexOfLargest(i_array55);
    int[] i_array57 = large52.indexOfLargest(i_array55);
    Large large58 = new Large();
    Large large59 = new Large();
    Large large60 = new Large();
    int[] i_array62 = new int[] { 1 };
    int[] i_array63 = large60.indexOfLargest(i_array62);
    int[] i_array64 = large59.indexOfLargest(i_array62);
    int[] i_array65 = large58.indexOfLargest(i_array62);
    int[] i_array66 = large52.indexOfLargest(i_array65);
    int[] i_array67 = large48.indexOfLargest(i_array66);
    int[] i_array68 = large42.indexOfLargest(i_array67);
    Large large69 = new Large();
    Large large70 = new Large();
    Large large71 = new Large();
    Large large72 = new Large();
    int[] i_array74 = new int[] { 1 };
    int[] i_array75 = large72.indexOfLargest(i_array74);
    int[] i_array76 = large71.indexOfLargest(i_array74);
    int[] i_array77 = large70.indexOfLargest(i_array74);
    int[] i_array78 = large69.indexOfLargest(i_array74);
    int[] i_array79 = large42.indexOfLargest(i_array74);
    int[] i_array80 = large0.indexOfLargest(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test118"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    int[] i_array9 = new int[] { 1 };
    int[] i_array10 = large7.indexOfLargest(i_array9);
    int[] i_array11 = large6.indexOfLargest(i_array9);
    int[] i_array12 = large0.indexOfLargest(i_array11);
    Large large13 = new Large();
    Large large14 = new Large();
    Large large15 = new Large();
    int[] i_array17 = new int[] { 1 };
    int[] i_array18 = large15.indexOfLargest(i_array17);
    int[] i_array19 = large14.indexOfLargest(i_array17);
    int[] i_array20 = large13.indexOfLargest(i_array17);
    Large large21 = new Large();
    Large large22 = new Large();
    Large large23 = new Large();
    int[] i_array25 = new int[] { 1 };
    int[] i_array26 = large23.indexOfLargest(i_array25);
    int[] i_array27 = large22.indexOfLargest(i_array25);
    int[] i_array28 = large21.indexOfLargest(i_array25);
    Large large29 = new Large();
    Large large30 = new Large();
    int[] i_array32 = new int[] { 1 };
    int[] i_array33 = large30.indexOfLargest(i_array32);
    int[] i_array34 = large29.indexOfLargest(i_array32);
    Large large35 = new Large();
    Large large36 = new Large();
    Large large37 = new Large();
    int[] i_array39 = new int[] { 1 };
    int[] i_array40 = large37.indexOfLargest(i_array39);
    int[] i_array41 = large36.indexOfLargest(i_array39);
    int[] i_array42 = large35.indexOfLargest(i_array39);
    int[] i_array43 = large29.indexOfLargest(i_array42);
    int[] i_array44 = large21.indexOfLargest(i_array43);
    Large large45 = new Large();
    Large large46 = new Large();
    Large large47 = new Large();
    int[] i_array49 = new int[] { 1 };
    int[] i_array50 = large47.indexOfLargest(i_array49);
    int[] i_array51 = large46.indexOfLargest(i_array49);
    int[] i_array52 = large45.indexOfLargest(i_array49);
    int[] i_array53 = large21.indexOfLargest(i_array52);
    Large large54 = new Large();
    Large large55 = new Large();
    Large large56 = new Large();
    int[] i_array58 = new int[] { 1 };
    int[] i_array59 = large56.indexOfLargest(i_array58);
    int[] i_array60 = large55.indexOfLargest(i_array58);
    int[] i_array61 = large54.indexOfLargest(i_array58);
    int[] i_array62 = large21.indexOfLargest(i_array58);
    Large large63 = new Large();
    Large large64 = new Large();
    Large large65 = new Large();
    int[] i_array67 = new int[] { 1 };
    int[] i_array68 = large65.indexOfLargest(i_array67);
    int[] i_array69 = large64.indexOfLargest(i_array67);
    int[] i_array70 = large63.indexOfLargest(i_array67);
    Large large71 = new Large();
    Large large72 = new Large();
    int[] i_array74 = new int[] { 1 };
    int[] i_array75 = large72.indexOfLargest(i_array74);
    int[] i_array76 = large71.indexOfLargest(i_array74);
    Large large77 = new Large();
    Large large78 = new Large();
    Large large79 = new Large();
    int[] i_array81 = new int[] { 1 };
    int[] i_array82 = large79.indexOfLargest(i_array81);
    int[] i_array83 = large78.indexOfLargest(i_array81);
    int[] i_array84 = large77.indexOfLargest(i_array81);
    int[] i_array85 = large71.indexOfLargest(i_array84);
    int[] i_array86 = large63.indexOfLargest(i_array85);
    Large large87 = new Large();
    Large large88 = new Large();
    Large large89 = new Large();
    int[] i_array91 = new int[] { 1 };
    int[] i_array92 = large89.indexOfLargest(i_array91);
    int[] i_array93 = large88.indexOfLargest(i_array91);
    int[] i_array94 = large87.indexOfLargest(i_array91);
    int[] i_array95 = large63.indexOfLargest(i_array94);
    int[] i_array96 = large21.indexOfLargest(i_array94);
    int[] i_array97 = large13.indexOfLargest(i_array94);
    int[] i_array98 = large0.indexOfLargest(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array98);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test119"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    Large large21 = new Large();
    Large large22 = new Large();
    Large large23 = new Large();
    int[] i_array25 = new int[] { 1 };
    int[] i_array26 = large23.indexOfLargest(i_array25);
    int[] i_array27 = large22.indexOfLargest(i_array25);
    int[] i_array28 = large21.indexOfLargest(i_array25);
    int[] i_array29 = large15.indexOfLargest(i_array28);
    Large large30 = new Large();
    int[] i_array32 = new int[] { 1 };
    int[] i_array33 = large30.indexOfLargest(i_array32);
    Large large34 = new Large();
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large34.indexOfLargest(i_array37);
    Large large40 = new Large();
    Large large41 = new Large();
    Large large42 = new Large();
    int[] i_array44 = new int[] { 1 };
    int[] i_array45 = large42.indexOfLargest(i_array44);
    int[] i_array46 = large41.indexOfLargest(i_array44);
    int[] i_array47 = large40.indexOfLargest(i_array44);
    int[] i_array48 = large34.indexOfLargest(i_array47);
    int[] i_array49 = large30.indexOfLargest(i_array48);
    int[] i_array50 = large15.indexOfLargest(i_array48);
    int[] i_array51 = large0.indexOfLargest(i_array48);
    Large large52 = new Large();
    Large large53 = new Large();
    int[] i_array55 = new int[] { 1 };
    int[] i_array56 = large53.indexOfLargest(i_array55);
    int[] i_array57 = large52.indexOfLargest(i_array55);
    int[] i_array58 = large0.indexOfLargest(i_array57);
    int[] i_array59 = null;
    int[] i_array60 = large0.indexOfLargest(i_array59);
    Large large61 = new Large();
    Large large62 = new Large();
    Large large63 = new Large();
    int[] i_array65 = new int[] { 1 };
    int[] i_array66 = large63.indexOfLargest(i_array65);
    int[] i_array67 = large62.indexOfLargest(i_array65);
    int[] i_array68 = large61.indexOfLargest(i_array65);
    int[] i_array69 = large0.indexOfLargest(i_array65);
    Large large70 = new Large();
    Large large71 = new Large();
    int[] i_array73 = new int[] { 1 };
    int[] i_array74 = large71.indexOfLargest(i_array73);
    int[] i_array75 = large70.indexOfLargest(i_array73);
    Large large76 = new Large();
    Large large77 = new Large();
    Large large78 = new Large();
    int[] i_array80 = new int[] { 1 };
    int[] i_array81 = large78.indexOfLargest(i_array80);
    int[] i_array82 = large77.indexOfLargest(i_array80);
    int[] i_array83 = large76.indexOfLargest(i_array80);
    int[] i_array84 = large70.indexOfLargest(i_array83);
    int[] i_array85 = large0.indexOfLargest(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test120"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test121"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test122"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test123"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test124"); }

    Large large0 = new Large();
    int[] i_array2 = new int[] { 1 };
    int[] i_array3 = large0.indexOfLargest(i_array2);
    Large large4 = new Large();
    Large large5 = new Large();
    int[] i_array7 = new int[] { 1 };
    int[] i_array8 = large5.indexOfLargest(i_array7);
    int[] i_array9 = large4.indexOfLargest(i_array7);
    Large large10 = new Large();
    Large large11 = new Large();
    Large large12 = new Large();
    int[] i_array14 = new int[] { 1 };
    int[] i_array15 = large12.indexOfLargest(i_array14);
    int[] i_array16 = large11.indexOfLargest(i_array14);
    int[] i_array17 = large10.indexOfLargest(i_array14);
    int[] i_array18 = large4.indexOfLargest(i_array17);
    Large large19 = new Large();
    int[] i_array21 = new int[] { 1 };
    int[] i_array22 = large19.indexOfLargest(i_array21);
    int[] i_array23 = large4.indexOfLargest(i_array22);
    int[] i_array24 = large0.indexOfLargest(i_array22);
    int[] i_array25 = null;
    int[] i_array26 = large0.indexOfLargest(i_array25);
    Large large27 = new Large();
    int[] i_array29 = new int[] { 1 };
    int[] i_array30 = large27.indexOfLargest(i_array29);
    Large large31 = new Large();
    Large large32 = new Large();
    int[] i_array34 = new int[] { 1 };
    int[] i_array35 = large32.indexOfLargest(i_array34);
    int[] i_array36 = large31.indexOfLargest(i_array34);
    Large large37 = new Large();
    Large large38 = new Large();
    Large large39 = new Large();
    int[] i_array41 = new int[] { 1 };
    int[] i_array42 = large39.indexOfLargest(i_array41);
    int[] i_array43 = large38.indexOfLargest(i_array41);
    int[] i_array44 = large37.indexOfLargest(i_array41);
    int[] i_array45 = large31.indexOfLargest(i_array44);
    int[] i_array46 = large27.indexOfLargest(i_array45);
    Large large47 = new Large();
    Large large48 = new Large();
    int[] i_array50 = new int[] { 1 };
    int[] i_array51 = large48.indexOfLargest(i_array50);
    int[] i_array52 = large47.indexOfLargest(i_array50);
    Large large53 = new Large();
    Large large54 = new Large();
    Large large55 = new Large();
    int[] i_array57 = new int[] { 1 };
    int[] i_array58 = large55.indexOfLargest(i_array57);
    int[] i_array59 = large54.indexOfLargest(i_array57);
    int[] i_array60 = large53.indexOfLargest(i_array57);
    int[] i_array61 = large47.indexOfLargest(i_array60);
    Large large62 = new Large();
    int[] i_array64 = new int[] { 1 };
    int[] i_array65 = large62.indexOfLargest(i_array64);
    Large large66 = new Large();
    Large large67 = new Large();
    int[] i_array69 = new int[] { 1 };
    int[] i_array70 = large67.indexOfLargest(i_array69);
    int[] i_array71 = large66.indexOfLargest(i_array69);
    Large large72 = new Large();
    Large large73 = new Large();
    Large large74 = new Large();
    int[] i_array76 = new int[] { 1 };
    int[] i_array77 = large74.indexOfLargest(i_array76);
    int[] i_array78 = large73.indexOfLargest(i_array76);
    int[] i_array79 = large72.indexOfLargest(i_array76);
    int[] i_array80 = large66.indexOfLargest(i_array79);
    int[] i_array81 = large62.indexOfLargest(i_array80);
    int[] i_array82 = large47.indexOfLargest(i_array80);
    Large large83 = new Large();
    int[] i_array85 = new int[] { 1 };
    int[] i_array86 = large83.indexOfLargest(i_array85);
    int[] i_array87 = large47.indexOfLargest(i_array85);
    int[] i_array88 = large27.indexOfLargest(i_array85);
    int[] i_array89 = large0.indexOfLargest(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array89);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test125"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    Large large14 = new Large();
    Large large15 = new Large();
    int[] i_array17 = new int[] { 1 };
    int[] i_array18 = large15.indexOfLargest(i_array17);
    int[] i_array19 = large14.indexOfLargest(i_array17);
    Large large20 = new Large();
    Large large21 = new Large();
    Large large22 = new Large();
    int[] i_array24 = new int[] { 1 };
    int[] i_array25 = large22.indexOfLargest(i_array24);
    int[] i_array26 = large21.indexOfLargest(i_array24);
    int[] i_array27 = large20.indexOfLargest(i_array24);
    int[] i_array28 = large14.indexOfLargest(i_array27);
    int[] i_array29 = large6.indexOfLargest(i_array28);
    int[] i_array30 = large0.indexOfLargest(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test126"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test127"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    int[] i_array9 = new int[] { 1 };
    int[] i_array10 = large7.indexOfLargest(i_array9);
    int[] i_array11 = large6.indexOfLargest(i_array9);
    int[] i_array12 = large0.indexOfLargest(i_array11);
    Large large13 = new Large();
    Large large14 = new Large();
    int[] i_array16 = new int[] { 1 };
    int[] i_array17 = large14.indexOfLargest(i_array16);
    int[] i_array18 = large13.indexOfLargest(i_array16);
    Large large19 = new Large();
    Large large20 = new Large();
    Large large21 = new Large();
    int[] i_array23 = new int[] { 1 };
    int[] i_array24 = large21.indexOfLargest(i_array23);
    int[] i_array25 = large20.indexOfLargest(i_array23);
    int[] i_array26 = large19.indexOfLargest(i_array23);
    int[] i_array27 = large13.indexOfLargest(i_array26);
    int[] i_array28 = large0.indexOfLargest(i_array27);
    Large large29 = new Large();
    Large large30 = new Large();
    Large large31 = new Large();
    Large large32 = new Large();
    int[] i_array34 = new int[] { 1 };
    int[] i_array35 = large32.indexOfLargest(i_array34);
    int[] i_array36 = large31.indexOfLargest(i_array34);
    int[] i_array37 = large30.indexOfLargest(i_array34);
    int[] i_array38 = large29.indexOfLargest(i_array34);
    Large large39 = new Large();
    Large large40 = new Large();
    int[] i_array42 = new int[] { 1 };
    int[] i_array43 = large40.indexOfLargest(i_array42);
    int[] i_array44 = large39.indexOfLargest(i_array42);
    Large large45 = new Large();
    Large large46 = new Large();
    Large large47 = new Large();
    int[] i_array49 = new int[] { 1 };
    int[] i_array50 = large47.indexOfLargest(i_array49);
    int[] i_array51 = large46.indexOfLargest(i_array49);
    int[] i_array52 = large45.indexOfLargest(i_array49);
    int[] i_array53 = large39.indexOfLargest(i_array52);
    Large large54 = new Large();
    Large large55 = new Large();
    int[] i_array57 = new int[] { 1 };
    int[] i_array58 = large55.indexOfLargest(i_array57);
    int[] i_array59 = large54.indexOfLargest(i_array57);
    Large large60 = new Large();
    Large large61 = new Large();
    Large large62 = new Large();
    int[] i_array64 = new int[] { 1 };
    int[] i_array65 = large62.indexOfLargest(i_array64);
    int[] i_array66 = large61.indexOfLargest(i_array64);
    int[] i_array67 = large60.indexOfLargest(i_array64);
    int[] i_array68 = large54.indexOfLargest(i_array67);
    int[] i_array69 = large39.indexOfLargest(i_array68);
    int[] i_array70 = large29.indexOfLargest(i_array68);
    int[] i_array71 = large0.indexOfLargest(i_array68);
    int[] i_array72 = null;
    int[] i_array73 = large0.indexOfLargest(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array73);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test128"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test129"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test130"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test131"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    boolean b27 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test132"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test133"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("", "");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    boolean b27 = stringManipulation0.haveSameChars("", "");
    boolean b30 = stringManipulation0.haveSameChars("hi!", "");
    boolean b33 = stringManipulation0.haveSameChars("", "");
    boolean b36 = stringManipulation0.haveSameChars("", "");
    boolean b39 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b42 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test134"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "");
    boolean b27 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test135"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    int[] i_array17 = new int[] { 1 };
    int[] i_array18 = large15.indexOfLargest(i_array17);
    Large large19 = new Large();
    Large large20 = new Large();
    int[] i_array22 = new int[] { 1 };
    int[] i_array23 = large20.indexOfLargest(i_array22);
    int[] i_array24 = large19.indexOfLargest(i_array22);
    Large large25 = new Large();
    Large large26 = new Large();
    Large large27 = new Large();
    int[] i_array29 = new int[] { 1 };
    int[] i_array30 = large27.indexOfLargest(i_array29);
    int[] i_array31 = large26.indexOfLargest(i_array29);
    int[] i_array32 = large25.indexOfLargest(i_array29);
    int[] i_array33 = large19.indexOfLargest(i_array32);
    int[] i_array34 = large15.indexOfLargest(i_array33);
    int[] i_array35 = large0.indexOfLargest(i_array33);
    Large large36 = new Large();
    int[] i_array38 = new int[] { 1 };
    int[] i_array39 = large36.indexOfLargest(i_array38);
    int[] i_array40 = large0.indexOfLargest(i_array38);
    int[] i_array41 = null;
    int[] i_array42 = large0.indexOfLargest(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array42);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test136"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    int[] i_array17 = new int[] { 1 };
    int[] i_array18 = large15.indexOfLargest(i_array17);
    int[] i_array19 = large0.indexOfLargest(i_array18);
    Large large20 = new Large();
    Large large21 = new Large();
    int[] i_array23 = new int[] { 1 };
    int[] i_array24 = large21.indexOfLargest(i_array23);
    int[] i_array25 = large20.indexOfLargest(i_array23);
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    Large large30 = new Large();
    Large large31 = new Large();
    int[] i_array33 = new int[] { 1 };
    int[] i_array34 = large31.indexOfLargest(i_array33);
    int[] i_array35 = large30.indexOfLargest(i_array33);
    Large large36 = new Large();
    Large large37 = new Large();
    Large large38 = new Large();
    int[] i_array40 = new int[] { 1 };
    int[] i_array41 = large38.indexOfLargest(i_array40);
    int[] i_array42 = large37.indexOfLargest(i_array40);
    int[] i_array43 = large36.indexOfLargest(i_array40);
    int[] i_array44 = large30.indexOfLargest(i_array43);
    int[] i_array45 = large26.indexOfLargest(i_array44);
    int[] i_array46 = large20.indexOfLargest(i_array45);
    Large large47 = new Large();
    Large large48 = new Large();
    Large large49 = new Large();
    Large large50 = new Large();
    int[] i_array52 = new int[] { 1 };
    int[] i_array53 = large50.indexOfLargest(i_array52);
    int[] i_array54 = large49.indexOfLargest(i_array52);
    int[] i_array55 = large48.indexOfLargest(i_array52);
    int[] i_array56 = large47.indexOfLargest(i_array52);
    int[] i_array57 = large20.indexOfLargest(i_array52);
    int[] i_array58 = large0.indexOfLargest(i_array57);
    Large large59 = new Large();
    Large large60 = new Large();
    Large large61 = new Large();
    int[] i_array63 = new int[] { 1 };
    int[] i_array64 = large61.indexOfLargest(i_array63);
    int[] i_array65 = large60.indexOfLargest(i_array63);
    int[] i_array66 = large59.indexOfLargest(i_array63);
    Large large67 = new Large();
    Large large68 = new Large();
    int[] i_array70 = new int[] { 1 };
    int[] i_array71 = large68.indexOfLargest(i_array70);
    int[] i_array72 = large67.indexOfLargest(i_array70);
    Large large73 = new Large();
    Large large74 = new Large();
    Large large75 = new Large();
    int[] i_array77 = new int[] { 1 };
    int[] i_array78 = large75.indexOfLargest(i_array77);
    int[] i_array79 = large74.indexOfLargest(i_array77);
    int[] i_array80 = large73.indexOfLargest(i_array77);
    int[] i_array81 = large67.indexOfLargest(i_array80);
    int[] i_array82 = large59.indexOfLargest(i_array81);
    int[] i_array83 = large0.indexOfLargest(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test137"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    Large large12 = new Large();
    Large large13 = new Large();
    int[] i_array15 = new int[] { 1 };
    int[] i_array16 = large13.indexOfLargest(i_array15);
    int[] i_array17 = large12.indexOfLargest(i_array15);
    Large large18 = new Large();
    Large large19 = new Large();
    Large large20 = new Large();
    int[] i_array22 = new int[] { 1 };
    int[] i_array23 = large20.indexOfLargest(i_array22);
    int[] i_array24 = large19.indexOfLargest(i_array22);
    int[] i_array25 = large18.indexOfLargest(i_array22);
    int[] i_array26 = large12.indexOfLargest(i_array25);
    Large large27 = new Large();
    int[] i_array29 = new int[] { 1 };
    int[] i_array30 = large27.indexOfLargest(i_array29);
    int[] i_array31 = large12.indexOfLargest(i_array30);
    int[] i_array32 = large8.indexOfLargest(i_array30);
    int[] i_array33 = large0.indexOfLargest(i_array32);
    int[] i_array34 = null;
    int[] i_array35 = large0.indexOfLargest(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array35);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test138"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test139"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    Large large3 = new Large();
    int[] i_array5 = new int[] { 1 };
    int[] i_array6 = large3.indexOfLargest(i_array5);
    int[] i_array7 = large2.indexOfLargest(i_array5);
    int[] i_array8 = large1.indexOfLargest(i_array5);
    Large large9 = new Large();
    Large large10 = new Large();
    int[] i_array12 = new int[] { 1 };
    int[] i_array13 = large10.indexOfLargest(i_array12);
    int[] i_array14 = large9.indexOfLargest(i_array12);
    Large large15 = new Large();
    Large large16 = new Large();
    Large large17 = new Large();
    int[] i_array19 = new int[] { 1 };
    int[] i_array20 = large17.indexOfLargest(i_array19);
    int[] i_array21 = large16.indexOfLargest(i_array19);
    int[] i_array22 = large15.indexOfLargest(i_array19);
    int[] i_array23 = large9.indexOfLargest(i_array22);
    int[] i_array24 = large1.indexOfLargest(i_array23);
    Large large25 = new Large();
    Large large26 = new Large();
    Large large27 = new Large();
    int[] i_array29 = new int[] { 1 };
    int[] i_array30 = large27.indexOfLargest(i_array29);
    int[] i_array31 = large26.indexOfLargest(i_array29);
    int[] i_array32 = large25.indexOfLargest(i_array29);
    int[] i_array33 = large1.indexOfLargest(i_array32);
    Large large34 = new Large();
    Large large35 = new Large();
    int[] i_array37 = new int[] { 1 };
    int[] i_array38 = large35.indexOfLargest(i_array37);
    int[] i_array39 = large34.indexOfLargest(i_array37);
    Large large40 = new Large();
    Large large41 = new Large();
    Large large42 = new Large();
    int[] i_array44 = new int[] { 1 };
    int[] i_array45 = large42.indexOfLargest(i_array44);
    int[] i_array46 = large41.indexOfLargest(i_array44);
    int[] i_array47 = large40.indexOfLargest(i_array44);
    int[] i_array48 = large34.indexOfLargest(i_array47);
    Large large49 = new Large();
    Large large50 = new Large();
    int[] i_array52 = new int[] { 1 };
    int[] i_array53 = large50.indexOfLargest(i_array52);
    int[] i_array54 = large49.indexOfLargest(i_array52);
    Large large55 = new Large();
    Large large56 = new Large();
    Large large57 = new Large();
    int[] i_array59 = new int[] { 1 };
    int[] i_array60 = large57.indexOfLargest(i_array59);
    int[] i_array61 = large56.indexOfLargest(i_array59);
    int[] i_array62 = large55.indexOfLargest(i_array59);
    int[] i_array63 = large49.indexOfLargest(i_array62);
    Large large64 = new Large();
    int[] i_array66 = new int[] { 1 };
    int[] i_array67 = large64.indexOfLargest(i_array66);
    Large large68 = new Large();
    Large large69 = new Large();
    int[] i_array71 = new int[] { 1 };
    int[] i_array72 = large69.indexOfLargest(i_array71);
    int[] i_array73 = large68.indexOfLargest(i_array71);
    Large large74 = new Large();
    Large large75 = new Large();
    Large large76 = new Large();
    int[] i_array78 = new int[] { 1 };
    int[] i_array79 = large76.indexOfLargest(i_array78);
    int[] i_array80 = large75.indexOfLargest(i_array78);
    int[] i_array81 = large74.indexOfLargest(i_array78);
    int[] i_array82 = large68.indexOfLargest(i_array81);
    int[] i_array83 = large64.indexOfLargest(i_array82);
    int[] i_array84 = large49.indexOfLargest(i_array82);
    int[] i_array85 = large34.indexOfLargest(i_array82);
    int[] i_array86 = large1.indexOfLargest(i_array82);
    int[] i_array87 = large0.indexOfLargest(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array87);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test140"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    Large large21 = new Large();
    Large large22 = new Large();
    Large large23 = new Large();
    int[] i_array25 = new int[] { 1 };
    int[] i_array26 = large23.indexOfLargest(i_array25);
    int[] i_array27 = large22.indexOfLargest(i_array25);
    int[] i_array28 = large21.indexOfLargest(i_array25);
    int[] i_array29 = large15.indexOfLargest(i_array28);
    int[] i_array30 = large0.indexOfLargest(i_array29);
    Large large31 = new Large();
    int[] i_array33 = new int[] { 1 };
    int[] i_array34 = large31.indexOfLargest(i_array33);
    Large large35 = new Large();
    Large large36 = new Large();
    int[] i_array38 = new int[] { 1 };
    int[] i_array39 = large36.indexOfLargest(i_array38);
    int[] i_array40 = large35.indexOfLargest(i_array38);
    Large large41 = new Large();
    Large large42 = new Large();
    Large large43 = new Large();
    int[] i_array45 = new int[] { 1 };
    int[] i_array46 = large43.indexOfLargest(i_array45);
    int[] i_array47 = large42.indexOfLargest(i_array45);
    int[] i_array48 = large41.indexOfLargest(i_array45);
    int[] i_array49 = large35.indexOfLargest(i_array48);
    Large large50 = new Large();
    int[] i_array52 = new int[] { 1 };
    int[] i_array53 = large50.indexOfLargest(i_array52);
    int[] i_array54 = large35.indexOfLargest(i_array53);
    int[] i_array55 = large31.indexOfLargest(i_array53);
    Large large56 = new Large();
    Large large57 = new Large();
    Large large58 = new Large();
    int[] i_array60 = new int[] { 1 };
    int[] i_array61 = large58.indexOfLargest(i_array60);
    int[] i_array62 = large57.indexOfLargest(i_array60);
    Large large63 = new Large();
    Large large64 = new Large();
    int[] i_array66 = new int[] { 1 };
    int[] i_array67 = large64.indexOfLargest(i_array66);
    int[] i_array68 = large63.indexOfLargest(i_array66);
    int[] i_array69 = large57.indexOfLargest(i_array68);
    int[] i_array70 = large56.indexOfLargest(i_array68);
    int[] i_array71 = large31.indexOfLargest(i_array68);
    int[] i_array72 = large0.indexOfLargest(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test141"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test142"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test143"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "");
    boolean b27 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test144"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    boolean b27 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test145"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test146"); }

    Large large0 = new Large();
    Large large1 = new Large();
    int[] i_array3 = new int[] { 1 };
    int[] i_array4 = large1.indexOfLargest(i_array3);
    int[] i_array5 = large0.indexOfLargest(i_array3);
    Large large6 = new Large();
    Large large7 = new Large();
    Large large8 = new Large();
    int[] i_array10 = new int[] { 1 };
    int[] i_array11 = large8.indexOfLargest(i_array10);
    int[] i_array12 = large7.indexOfLargest(i_array10);
    int[] i_array13 = large6.indexOfLargest(i_array10);
    int[] i_array14 = large0.indexOfLargest(i_array13);
    Large large15 = new Large();
    int[] i_array17 = new int[] { 1 };
    int[] i_array18 = large15.indexOfLargest(i_array17);
    Large large19 = new Large();
    Large large20 = new Large();
    int[] i_array22 = new int[] { 1 };
    int[] i_array23 = large20.indexOfLargest(i_array22);
    int[] i_array24 = large19.indexOfLargest(i_array22);
    Large large25 = new Large();
    Large large26 = new Large();
    Large large27 = new Large();
    int[] i_array29 = new int[] { 1 };
    int[] i_array30 = large27.indexOfLargest(i_array29);
    int[] i_array31 = large26.indexOfLargest(i_array29);
    int[] i_array32 = large25.indexOfLargest(i_array29);
    int[] i_array33 = large19.indexOfLargest(i_array32);
    int[] i_array34 = large15.indexOfLargest(i_array33);
    int[] i_array35 = large0.indexOfLargest(i_array33);
    int[] i_array36 = null;
    int[] i_array37 = large0.indexOfLargest(i_array36);
    Large large38 = new Large();
    Large large39 = new Large();
    int[] i_array41 = new int[] { 1 };
    int[] i_array42 = large39.indexOfLargest(i_array41);
    int[] i_array43 = large38.indexOfLargest(i_array41);
    Large large44 = new Large();
    Large large45 = new Large();
    Large large46 = new Large();
    int[] i_array48 = new int[] { 1 };
    int[] i_array49 = large46.indexOfLargest(i_array48);
    int[] i_array50 = large45.indexOfLargest(i_array48);
    int[] i_array51 = large44.indexOfLargest(i_array48);
    int[] i_array52 = large38.indexOfLargest(i_array51);
    Large large53 = new Large();
    Large large54 = new Large();
    Large large55 = new Large();
    int[] i_array57 = new int[] { 1 };
    int[] i_array58 = large55.indexOfLargest(i_array57);
    int[] i_array59 = large54.indexOfLargest(i_array57);
    int[] i_array60 = large53.indexOfLargest(i_array57);
    Large large61 = new Large();
    Large large62 = new Large();
    int[] i_array64 = new int[] { 1 };
    int[] i_array65 = large62.indexOfLargest(i_array64);
    int[] i_array66 = large61.indexOfLargest(i_array64);
    Large large67 = new Large();
    Large large68 = new Large();
    Large large69 = new Large();
    int[] i_array71 = new int[] { 1 };
    int[] i_array72 = large69.indexOfLargest(i_array71);
    int[] i_array73 = large68.indexOfLargest(i_array71);
    int[] i_array74 = large67.indexOfLargest(i_array71);
    int[] i_array75 = large61.indexOfLargest(i_array74);
    int[] i_array76 = large53.indexOfLargest(i_array75);
    Large large77 = new Large();
    Large large78 = new Large();
    Large large79 = new Large();
    int[] i_array81 = new int[] { 1 };
    int[] i_array82 = large79.indexOfLargest(i_array81);
    int[] i_array83 = large78.indexOfLargest(i_array81);
    int[] i_array84 = large77.indexOfLargest(i_array81);
    int[] i_array85 = large53.indexOfLargest(i_array84);
    int[] i_array86 = large38.indexOfLargest(i_array84);
    int[] i_array93 = new int[] { 0, (short)-1, (byte)100, (byte)10, (-1), (byte)100 };
    int[] i_array94 = large38.indexOfLargest(i_array93);
    int[] i_array95 = large0.indexOfLargest(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array95);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test147"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b27 = stringManipulation0.haveSameChars("", "");
    boolean b30 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test148"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("", "");
    boolean b12 = stringManipulation0.haveSameChars("hi!", "");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test149"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("hi!", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test150"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("", "hi!");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("hi!", "");
    boolean b27 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test151"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test152"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "hi!");
    boolean b21 = stringManipulation0.haveSameChars("", "hi!");
    boolean b24 = stringManipulation0.haveSameChars("", "");
    boolean b27 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test153"); }

    Large large0 = new Large();
    int[] i_array2 = new int[] { 1 };
    int[] i_array3 = large0.indexOfLargest(i_array2);
    Large large4 = new Large();
    Large large5 = new Large();
    int[] i_array7 = new int[] { 1 };
    int[] i_array8 = large5.indexOfLargest(i_array7);
    int[] i_array9 = large4.indexOfLargest(i_array7);
    Large large10 = new Large();
    Large large11 = new Large();
    Large large12 = new Large();
    int[] i_array14 = new int[] { 1 };
    int[] i_array15 = large12.indexOfLargest(i_array14);
    int[] i_array16 = large11.indexOfLargest(i_array14);
    int[] i_array17 = large10.indexOfLargest(i_array14);
    int[] i_array18 = large4.indexOfLargest(i_array17);
    int[] i_array19 = large0.indexOfLargest(i_array18);
    Large large20 = new Large();
    Large large21 = new Large();
    int[] i_array23 = new int[] { 1 };
    int[] i_array24 = large21.indexOfLargest(i_array23);
    int[] i_array25 = large20.indexOfLargest(i_array23);
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    Large large30 = new Large();
    Large large31 = new Large();
    int[] i_array33 = new int[] { 1 };
    int[] i_array34 = large31.indexOfLargest(i_array33);
    int[] i_array35 = large30.indexOfLargest(i_array33);
    Large large36 = new Large();
    Large large37 = new Large();
    Large large38 = new Large();
    int[] i_array40 = new int[] { 1 };
    int[] i_array41 = large38.indexOfLargest(i_array40);
    int[] i_array42 = large37.indexOfLargest(i_array40);
    int[] i_array43 = large36.indexOfLargest(i_array40);
    int[] i_array44 = large30.indexOfLargest(i_array43);
    int[] i_array45 = large26.indexOfLargest(i_array44);
    int[] i_array46 = large20.indexOfLargest(i_array45);
    Large large47 = new Large();
    Large large48 = new Large();
    Large large49 = new Large();
    int[] i_array51 = new int[] { 1 };
    int[] i_array52 = large49.indexOfLargest(i_array51);
    int[] i_array53 = large48.indexOfLargest(i_array51);
    int[] i_array54 = large47.indexOfLargest(i_array51);
    Large large55 = new Large();
    Large large56 = new Large();
    int[] i_array58 = new int[] { 1 };
    int[] i_array59 = large56.indexOfLargest(i_array58);
    int[] i_array60 = large55.indexOfLargest(i_array58);
    Large large61 = new Large();
    Large large62 = new Large();
    Large large63 = new Large();
    int[] i_array65 = new int[] { 1 };
    int[] i_array66 = large63.indexOfLargest(i_array65);
    int[] i_array67 = large62.indexOfLargest(i_array65);
    int[] i_array68 = large61.indexOfLargest(i_array65);
    int[] i_array69 = large55.indexOfLargest(i_array68);
    int[] i_array70 = large47.indexOfLargest(i_array69);
    Large large71 = new Large();
    Large large72 = new Large();
    Large large73 = new Large();
    int[] i_array75 = new int[] { 1 };
    int[] i_array76 = large73.indexOfLargest(i_array75);
    int[] i_array77 = large72.indexOfLargest(i_array75);
    int[] i_array78 = large71.indexOfLargest(i_array75);
    int[] i_array79 = large47.indexOfLargest(i_array78);
    int[] i_array80 = large20.indexOfLargest(i_array78);
    Large large81 = new Large();
    int[] i_array83 = new int[] { 1 };
    int[] i_array84 = large81.indexOfLargest(i_array83);
    int[] i_array85 = large20.indexOfLargest(i_array84);
    int[] i_array86 = large0.indexOfLargest(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array86);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test154"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "hi!");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("hi!", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test155"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "");
    boolean b18 = stringManipulation0.haveSameChars("", "");
    boolean b21 = stringManipulation0.haveSameChars("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test156"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    int[] i_array4 = new int[] { 1 };
    int[] i_array5 = large2.indexOfLargest(i_array4);
    int[] i_array6 = large1.indexOfLargest(i_array4);
    int[] i_array7 = large0.indexOfLargest(i_array4);
    Large large8 = new Large();
    Large large9 = new Large();
    int[] i_array11 = new int[] { 1 };
    int[] i_array12 = large9.indexOfLargest(i_array11);
    int[] i_array13 = large8.indexOfLargest(i_array11);
    Large large14 = new Large();
    Large large15 = new Large();
    Large large16 = new Large();
    int[] i_array18 = new int[] { 1 };
    int[] i_array19 = large16.indexOfLargest(i_array18);
    int[] i_array20 = large15.indexOfLargest(i_array18);
    int[] i_array21 = large14.indexOfLargest(i_array18);
    int[] i_array22 = large8.indexOfLargest(i_array21);
    int[] i_array23 = large0.indexOfLargest(i_array22);
    Large large24 = new Large();
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    int[] i_array31 = large24.indexOfLargest(i_array28);
    int[] i_array32 = large0.indexOfLargest(i_array31);
    Large large33 = new Large();
    Large large34 = new Large();
    int[] i_array36 = new int[] { 1 };
    int[] i_array37 = large34.indexOfLargest(i_array36);
    int[] i_array38 = large33.indexOfLargest(i_array36);
    Large large39 = new Large();
    Large large40 = new Large();
    Large large41 = new Large();
    int[] i_array43 = new int[] { 1 };
    int[] i_array44 = large41.indexOfLargest(i_array43);
    int[] i_array45 = large40.indexOfLargest(i_array43);
    int[] i_array46 = large39.indexOfLargest(i_array43);
    int[] i_array47 = large33.indexOfLargest(i_array46);
    int[] i_array48 = large0.indexOfLargest(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test157"); }

    StringManipulation stringManipulation0 = new StringManipulation();
    boolean b3 = stringManipulation0.haveSameChars("hi!", "hi!");
    boolean b6 = stringManipulation0.haveSameChars("", "");
    boolean b9 = stringManipulation0.haveSameChars("hi!", "");
    boolean b12 = stringManipulation0.haveSameChars("", "hi!");
    boolean b15 = stringManipulation0.haveSameChars("", "hi!");
    boolean b18 = stringManipulation0.haveSameChars("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test158"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    Large large3 = new Large();
    int[] i_array5 = new int[] { 1 };
    int[] i_array6 = large3.indexOfLargest(i_array5);
    int[] i_array7 = large2.indexOfLargest(i_array5);
    int[] i_array8 = large1.indexOfLargest(i_array5);
    int[] i_array9 = large0.indexOfLargest(i_array5);
    Large large10 = new Large();
    int[] i_array12 = new int[] { 1 };
    int[] i_array13 = large10.indexOfLargest(i_array12);
    Large large14 = new Large();
    Large large15 = new Large();
    int[] i_array17 = new int[] { 1 };
    int[] i_array18 = large15.indexOfLargest(i_array17);
    int[] i_array19 = large14.indexOfLargest(i_array17);
    Large large20 = new Large();
    Large large21 = new Large();
    Large large22 = new Large();
    int[] i_array24 = new int[] { 1 };
    int[] i_array25 = large22.indexOfLargest(i_array24);
    int[] i_array26 = large21.indexOfLargest(i_array24);
    int[] i_array27 = large20.indexOfLargest(i_array24);
    int[] i_array28 = large14.indexOfLargest(i_array27);
    int[] i_array29 = large10.indexOfLargest(i_array28);
    Large large30 = new Large();
    Large large31 = new Large();
    Large large32 = new Large();
    int[] i_array34 = new int[] { 1 };
    int[] i_array35 = large32.indexOfLargest(i_array34);
    int[] i_array36 = large31.indexOfLargest(i_array34);
    int[] i_array37 = large30.indexOfLargest(i_array34);
    Large large38 = new Large();
    Large large39 = new Large();
    int[] i_array41 = new int[] { 1 };
    int[] i_array42 = large39.indexOfLargest(i_array41);
    int[] i_array43 = large38.indexOfLargest(i_array41);
    Large large44 = new Large();
    Large large45 = new Large();
    Large large46 = new Large();
    int[] i_array48 = new int[] { 1 };
    int[] i_array49 = large46.indexOfLargest(i_array48);
    int[] i_array50 = large45.indexOfLargest(i_array48);
    int[] i_array51 = large44.indexOfLargest(i_array48);
    int[] i_array52 = large38.indexOfLargest(i_array51);
    int[] i_array53 = large30.indexOfLargest(i_array52);
    int[] i_array54 = large10.indexOfLargest(i_array53);
    int[] i_array55 = large0.indexOfLargest(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array55);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","PracticeExam1Tests.test159"); }

    Large large0 = new Large();
    Large large1 = new Large();
    Large large2 = new Large();
    Large large3 = new Large();
    int[] i_array5 = new int[] { 1 };
    int[] i_array6 = large3.indexOfLargest(i_array5);
    int[] i_array7 = large2.indexOfLargest(i_array5);
    int[] i_array8 = large1.indexOfLargest(i_array5);
    int[] i_array9 = large0.indexOfLargest(i_array5);
    Large large10 = new Large();
    Large large11 = new Large();
    int[] i_array13 = new int[] { 1 };
    int[] i_array14 = large11.indexOfLargest(i_array13);
    int[] i_array15 = large10.indexOfLargest(i_array13);
    Large large16 = new Large();
    Large large17 = new Large();
    Large large18 = new Large();
    int[] i_array20 = new int[] { 1 };
    int[] i_array21 = large18.indexOfLargest(i_array20);
    int[] i_array22 = large17.indexOfLargest(i_array20);
    int[] i_array23 = large16.indexOfLargest(i_array20);
    int[] i_array24 = large10.indexOfLargest(i_array23);
    Large large25 = new Large();
    Large large26 = new Large();
    int[] i_array28 = new int[] { 1 };
    int[] i_array29 = large26.indexOfLargest(i_array28);
    int[] i_array30 = large25.indexOfLargest(i_array28);
    Large large31 = new Large();
    Large large32 = new Large();
    Large large33 = new Large();
    int[] i_array35 = new int[] { 1 };
    int[] i_array36 = large33.indexOfLargest(i_array35);
    int[] i_array37 = large32.indexOfLargest(i_array35);
    int[] i_array38 = large31.indexOfLargest(i_array35);
    int[] i_array39 = large25.indexOfLargest(i_array38);
    int[] i_array40 = large10.indexOfLargest(i_array39);
    int[] i_array41 = large0.indexOfLargest(i_array39);
    Large large42 = new Large();
    int[] i_array44 = new int[] { 1 };
    int[] i_array45 = large42.indexOfLargest(i_array44);
    Large large46 = new Large();
    Large large47 = new Large();
    int[] i_array49 = new int[] { 1 };
    int[] i_array50 = large47.indexOfLargest(i_array49);
    int[] i_array51 = large46.indexOfLargest(i_array49);
    Large large52 = new Large();
    Large large53 = new Large();
    Large large54 = new Large();
    int[] i_array56 = new int[] { 1 };
    int[] i_array57 = large54.indexOfLargest(i_array56);
    int[] i_array58 = large53.indexOfLargest(i_array56);
    int[] i_array59 = large52.indexOfLargest(i_array56);
    int[] i_array60 = large46.indexOfLargest(i_array59);
    Large large61 = new Large();
    int[] i_array63 = new int[] { 1 };
    int[] i_array64 = large61.indexOfLargest(i_array63);
    int[] i_array65 = large46.indexOfLargest(i_array64);
    int[] i_array66 = large42.indexOfLargest(i_array64);
    Large large67 = new Large();
    Large large68 = new Large();
    Large large69 = new Large();
    int[] i_array71 = new int[] { 1 };
    int[] i_array72 = large69.indexOfLargest(i_array71);
    int[] i_array73 = large68.indexOfLargest(i_array71);
    Large large74 = new Large();
    Large large75 = new Large();
    int[] i_array77 = new int[] { 1 };
    int[] i_array78 = large75.indexOfLargest(i_array77);
    int[] i_array79 = large74.indexOfLargest(i_array77);
    int[] i_array80 = large68.indexOfLargest(i_array79);
    int[] i_array81 = large67.indexOfLargest(i_array79);
    int[] i_array82 = large42.indexOfLargest(i_array79);
    int[] i_array83 = large0.indexOfLargest(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array83);

  }

  @Test
  public void test160() {
    Bug bug = new Bug(0);
    Class clazz = bug.getClass();
    Constructor[] constructors = clazz.getDeclaredConstructors();
    org.junit.Assert.assertEquals("Check constructor", 1, constructors.length);

    Class[] constructorParams = constructors[0].getParameterTypes();
    org.junit.Assert.assertEquals("Check constructor", 1, constructorParams.length);
    org.junit.Assert.assertEquals("Check constructor", "int", constructorParams[0].getTypeName());

    Method m;
    try {
      m  = clazz.getDeclaredMethod("getDirection");
    } catch (NoSuchMethodException e) {
      org.junit.Assert.assertFalse("check getDirection", true);
    }

    try {
      m  = clazz.getDeclaredMethod("getPosition");
    } catch (NoSuchMethodException e) {
      org.junit.Assert.assertFalse("check getPosition", true);
    }

    try {
      m  = clazz.getDeclaredMethod("turn");
    } catch (NoSuchMethodException e) {
      org.junit.Assert.assertFalse("check turn", true);
    }

    try {
      m  = clazz.getDeclaredMethod("move");
    } catch (NoSuchMethodException e) {
      org.junit.Assert.assertFalse("check move", true);
    }
  }

  @Test
  public void test161() {
    Bug bug = new Bug(10);
    int expectedPosition = 10;
    String expectedDirection = "right";

    int actualPosition = bug.getPosition();
    String actualDirection = bug.getDirection();

    String message = "Bug(): check behavior";

    org.junit.Assert.assertEquals(message, expectedPosition, actualPosition);
    org.junit.Assert.assertEquals(message, expectedDirection, actualDirection);
  }

  @Test
  public void test162() {
    Bug bug = new Bug(8);

    for (int i = 0; i < 5; i++) {
      bug.move();
    }

    int expected = 13;
    int actual = bug.getPosition();

    String message = "turn(): check behavior";
    org.junit.Assert.assertEquals(message, expected, actual);

    String eDirection = "right";
    String aDirection = bug.getDirection();
    org.junit.Assert.assertEquals(message, eDirection, aDirection);
  }

  @Test
  public void test163() {
    Bug bug = new Bug(8);

    for (int i = 0; i < 5; i++) {
      bug.move();
    }

    bug.turn();

    for (int i = 0; i < 5; i++) {
      bug.move();
    }

    int expected = 8;
    int actual = bug.getPosition();

    String message = "turn(): check behavior";
    org.junit.Assert.assertEquals(message, expected, actual);

    String eDirection = "left";
    String aDirection = bug.getDirection();
    org.junit.Assert.assertEquals(message, eDirection, aDirection);
  }

  @Test
  public void test164() {
    Bug bug = new Bug(8);

    for (int i = 0; i < 7; i++) {
      bug.move();
    }

    bug.turn();

    for (int i = 0; i < 5; i++) {
      bug.move();
    }

    int expected = 10;
    int actual = bug.getPosition();

    String message = "turn(): check behavior";
    org.junit.Assert.assertEquals(message, expected, actual);

    String eDirection = "left";
    String aDirection = bug.getDirection();
    org.junit.Assert.assertEquals(message, eDirection, aDirection);
  }

  @Test
  public void test165() {
    Bug bug = new Bug(-1);

    for (int i = 0; i < 7; i++) {
      bug.move();
    }

    int expected = 6;
    int actual = bug.getPosition();

    String message = "turn(): check behavior";
    org.junit.Assert.assertEquals(message, expected, actual);

    String eDirection = "right";
    String aDirection = bug.getDirection();
    org.junit.Assert.assertEquals(message, eDirection, aDirection);
  }

  @Test
  public void test166() {
    Bug bug = new Bug(-1);

    for (int i = 0; i < 7; i++) {
      bug.move();
    }

    bug.turn();

    for (int i = 0; i < 7; i++) {
      bug.move();
    }

    int expected = -1;
    int actual = bug.getPosition();

    String message = "turn(): check behavior";
    org.junit.Assert.assertEquals(message, expected, actual);

    String eDirection = "left";
    String aDirection = bug.getDirection();
    org.junit.Assert.assertEquals(message, eDirection, aDirection);
  }

  @Test
  public void test167() {
    Bug bug = new Bug(-1);

    for (int i = 0; i < 7; i++) {
      bug.move();
    }

    bug.turn();

    for (int i = 0; i < 3; i++) {
      bug.move();
    }

    bug.turn();

    for (int i = 0; i < 5; i++) {
      bug.move();
    }

    int expected = 8;
    int actual = bug.getPosition();

    String message = "turn(): check behavior";
    org.junit.Assert.assertEquals(message, expected, actual);

    String eDirection = "right";
    String aDirection = bug.getDirection();
    org.junit.Assert.assertEquals(message, eDirection, aDirection);
  }

  @Test
  public void test168() {
    Bug bug = new Bug(-1);

    bug.turn();

    for (int i = 0; i < 7; i++) {
      bug.move();
    }

    int expected = -8;
    int actual = bug.getPosition();

    String message = "turn(): check behavior";
    org.junit.Assert.assertEquals(message, expected, actual);

    String eDirection = "left";
    String aDirection = bug.getDirection();
    org.junit.Assert.assertEquals(message, eDirection, aDirection);
  }

  @Test
  public void test169() {
    Bug bug = new Bug(3);

    bug.turn();

    for (int i = 0; i < 6; i++) {
      bug.move();
    }

    int expected = -3;
    int actual = bug.getPosition();

    String message = "turn(): check behavior";
    org.junit.Assert.assertEquals(message, expected, actual);

    String eDirection = "left";
    String aDirection = bug.getDirection();
    org.junit.Assert.assertEquals(message, eDirection, aDirection);
  }

}
