/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
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
package com.iluwatar.templatemethod;

/**
 * 
 * Halfling thief uses {@link StealingMethod} to steal.
 * 
 */
public class HalflingThief {

  private StealingMethod method;

  public HalflingThief(StealingMethod method) {
    this.method = method;
  }

  public void steal() {

    /**
     * Dieser Code riecht übel;-)
     * @todo: hier reicht es aus "method.steal()" aufzurufen,
     * sofern Du {@link StealingMethod} um diese template Methode entsprechend erweiterst
     */

    if(method instanceof HitAndRunMethod) {
      HitAndRunMethod hitAndRunMethod = (HitAndRunMethod) method;
      String target = hitAndRunMethod.pickTarget();
      hitAndRunMethod.confuseTarget(target);
      hitAndRunMethod.stealTheItem(target);
    } else if(method instanceof SubtleMethod){
      SubtleMethod subtleMethod = (SubtleMethod) method;
      String target = subtleMethod.chooseTarget();
      subtleMethod.confuseTarget(target);
      subtleMethod.stealIt(target);
    }
  }

  public void changeMethod(StealingMethod method) {
    this.method = method;
  }
}
