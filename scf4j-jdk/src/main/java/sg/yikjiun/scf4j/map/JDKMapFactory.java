/*
 * Copyright 2015 Lee Yik Jiun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sg.yikjiun.scf4j.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Lee Yik Jiun
 */
public class JDKMapFactory implements MapFactoryDelegate {
    public ByteByteMap createByteByteHashMap() {
        Map<Byte, Byte> map = new HashMap<Byte, Byte>();
        return new JDKByteByteMapAdapter(map);
    }

    public ByteBooleanMap createByteBooleanHashMap() {
        Map<Byte, Boolean> map = new HashMap<Byte, Boolean>();
        return new JDKByteBooleanMapAdapter(map);
    }

    public ByteShortMap createByteShortHashMap() {
        Map<Byte, Short> map = new HashMap<Byte, Short>();
        return new JDKByteShortMapAdapter(map);
    }

    public ByteIntMap createByteIntHashMap() {
        Map<Byte, Integer> map = new HashMap<Byte, Integer>();
        return new JDKByteIntMapAdapter(map);
    }

    public ByteLongMap createByteLongHashMap() {
        Map<Byte, Long> map = new HashMap<Byte, Long>();
        return new JDKByteLongMapAdapter(map);
    }

    public ByteDoubleMap createByteDoubleHashMap() {
        Map<Byte, Double> map = new HashMap<Byte, Double>();
        return new JDKByteDoubleMapAdapter(map);
    }

    public ByteFloatMap createByteFloatHashMap() {
        Map<Byte, Float> map = new HashMap<Byte, Float>();
        return new JDKByteFloatMapAdapter(map);
    }

    public ByteCharMap createByteCharHashMap() {
        Map<Byte, Character> map = new HashMap<Byte, Character>();
        return new JDKByteCharMapAdapter(map);
    }

    public BooleanByteMap createBooleanByteHashMap() {
        Map<Boolean, Byte> map = new HashMap<Boolean, Byte>();
        return new JDKBooleanByteMapAdapter(map);
    }

    public BooleanBooleanMap createBooleanBooleanHashMap() {
        Map<Boolean, Boolean> map = new HashMap<Boolean, Boolean>();
        return new JDKBooleanBooleanMapAdapter(map);
    }

    public BooleanShortMap createBooleanShortHashMap() {
        Map<Boolean, Short> map = new HashMap<Boolean, Short>();
        return new JDKBooleanShortMapAdapter(map);
    }

    public BooleanIntMap createBooleanIntHashMap() {
        Map<Boolean, Integer> map = new HashMap<Boolean, Integer>();
        return new JDKBooleanIntMapAdapter(map);
    }

    public BooleanLongMap createBooleanLongHashMap() {
        Map<Boolean, Long> map = new HashMap<Boolean, Long>();
        return new JDKBooleanLongMapAdapter(map);
    }

    public BooleanDoubleMap createBooleanDoubleHashMap() {
        Map<Boolean, Double> map = new HashMap<Boolean, Double>();
        return new JDKBooleanDoubleMapAdapter(map);
    }

    public BooleanFloatMap createBooleanFloatHashMap() {
        Map<Boolean, Float> map = new HashMap<Boolean, Float>();
        return new JDKBooleanFloatMapAdapter(map);
    }

    public BooleanCharMap createBooleanCharHashMap() {
        Map<Boolean, Character> map = new HashMap<Boolean, Character>();
        return new JDKBooleanCharMapAdapter(map);
    }

    public ShortByteMap createShortByteHashMap() {
        Map<Short, Byte> map = new HashMap<Short, Byte>();
        return new JDKShortByteMapAdapter(map);
    }

    public ShortBooleanMap createShortBooleanHashMap() {
        Map<Short, Boolean> map = new HashMap<Short, Boolean>();
        return new JDKShortBooleanMapAdapter(map);
    }

    public ShortShortMap createShortShortHashMap() {
        Map<Short, Short> map = new HashMap<Short, Short>();
        return new JDKShortShortMapAdapter(map);
    }

    public ShortIntMap createShortIntHashMap() {
        Map<Short, Integer> map = new HashMap<Short, Integer>();
        return new JDKShortIntMapAdapter(map);
    }

    public ShortLongMap createShortLongHashMap() {
        Map<Short, Long> map = new HashMap<Short, Long>();
        return new JDKShortLongMapAdapter(map);
    }

    public ShortDoubleMap createShortDoubleHashMap() {
        Map<Short, Double> map = new HashMap<Short, Double>();
        return new JDKShortDoubleMapAdapter(map);
    }

    public ShortFloatMap createShortFloatHashMap() {
        Map<Short, Float> map = new HashMap<Short, Float>();
        return new JDKShortFloatMapAdapter(map);
    }

    public ShortCharMap createShortCharHashMap() {
        Map<Short, Character> map = new HashMap<Short, Character>();
        return new JDKShortCharMapAdapter(map);
    }

    public IntByteMap createIntByteHashMap() {
        Map<Integer, Byte> map = new HashMap<Integer, Byte>();
        return new JDKIntByteMapAdapter(map);
    }

    public IntBooleanMap createIntBooleanHashMap() {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        return new JDKIntBooleanMapAdapter(map);
    }

    public IntShortMap createIntShortHashMap() {
        Map<Integer, Short> map = new HashMap<Integer, Short>();
        return new JDKIntShortMapAdapter(map);
    }

    public IntIntMap createIntIntHashMap() {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        return new JDKIntIntMapAdapter(map);
    }

    public IntLongMap createIntLongHashMap() {
        Map<Integer, Long> map = new HashMap<Integer, Long>();
        return new JDKIntLongMapAdapter(map);
    }

    public IntDoubleMap createIntDoubleHashMap() {
        Map<Integer, Double> map = new HashMap<Integer, Double>();
        return new JDKIntDoubleMapAdapter(map);
    }

    public IntFloatMap createIntFloatHashMap() {
        Map<Integer, Float> map = new HashMap<Integer, Float>();
        return new JDKIntFloatMapAdapter(map);
    }

    public IntCharMap createIntCharHashMap() {
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        return new JDKIntCharMapAdapter(map);
    }

    public LongByteMap createLongByteHashMap() {
        Map<Long, Byte> map = new HashMap<Long, Byte>();
        return new JDKLongByteMapAdapter(map);
    }

    public LongBooleanMap createLongBooleanHashMap() {
        Map<Long, Boolean> map = new HashMap<Long, Boolean>();
        return new JDKLongBooleanMapAdapter(map);
    }

    public LongShortMap createLongShortHashMap() {
        Map<Long, Short> map = new HashMap<Long, Short>();
        return new JDKLongShortMapAdapter(map);
    }

    public LongIntMap createLongIntHashMap() {
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        return new JDKLongIntMapAdapter(map);
    }

    public LongLongMap createLongLongHashMap() {
        Map<Long, Long> map = new HashMap<Long, Long>();
        return new JDKLongLongMapAdapter(map);
    }

    public LongDoubleMap createLongDoubleHashMap() {
        Map<Long, Double> map = new HashMap<Long, Double>();
        return new JDKLongDoubleMapAdapter(map);
    }

    public LongFloatMap createLongFloatHashMap() {
        Map<Long, Float> map = new HashMap<Long, Float>();
        return new JDKLongFloatMapAdapter(map);
    }

    public LongCharMap createLongCharHashMap() {
        Map<Long, Character> map = new HashMap<Long, Character>();
        return new JDKLongCharMapAdapter(map);
    }

    public DoubleByteMap createDoubleByteHashMap() {
        Map<Double, Byte> map = new HashMap<Double, Byte>();
        return new JDKDoubleByteMapAdapter(map);
    }

    public DoubleBooleanMap createDoubleBooleanHashMap() {
        Map<Double, Boolean> map = new HashMap<Double, Boolean>();
        return new JDKDoubleBooleanMapAdapter(map);
    }

    public DoubleShortMap createDoubleShortHashMap() {
        Map<Double, Short> map = new HashMap<Double, Short>();
        return new JDKDoubleShortMapAdapter(map);
    }

    public DoubleIntMap createDoubleIntHashMap() {
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        return new JDKDoubleIntMapAdapter(map);
    }

    public DoubleLongMap createDoubleLongHashMap() {
        Map<Double, Long> map = new HashMap<Double, Long>();
        return new JDKDoubleLongMapAdapter(map);
    }

    public DoubleDoubleMap createDoubleDoubleHashMap() {
        Map<Double, Double> map = new HashMap<Double, Double>();
        return new JDKDoubleDoubleMapAdapter(map);
    }

    public DoubleFloatMap createDoubleFloatHashMap() {
        Map<Double, Float> map = new HashMap<Double, Float>();
        return new JDKDoubleFloatMapAdapter(map);
    }

    public DoubleCharMap createDoubleCharHashMap() {
        Map<Double, Character> map = new HashMap<Double, Character>();
        return new JDKDoubleCharMapAdapter(map);
    }

    public FloatByteMap createFloatByteHashMap() {
        Map<Float, Byte> map = new HashMap<Float, Byte>();
        return new JDKFloatByteMapAdapter(map);
    }

    public FloatBooleanMap createFloatBooleanHashMap() {
        Map<Float, Boolean> map = new HashMap<Float, Boolean>();
        return new JDKFloatBooleanMapAdapter(map);
    }

    public FloatShortMap createFloatShortHashMap() {
        Map<Float, Short> map = new HashMap<Float, Short>();
        return new JDKFloatShortMapAdapter(map);
    }

    public FloatIntMap createFloatIntHashMap() {
        Map<Float, Integer> map = new HashMap<Float, Integer>();
        return new JDKFloatIntMapAdapter(map);
    }

    public FloatLongMap createFloatLongHashMap() {
        Map<Float, Long> map = new HashMap<Float, Long>();
        return new JDKFloatLongMapAdapter(map);
    }

    public FloatDoubleMap createFloatDoubleHashMap() {
        Map<Float, Double> map = new HashMap<Float, Double>();
        return new JDKFloatDoubleMapAdapter(map);
    }

    public FloatFloatMap createFloatFloatHashMap() {
        Map<Float, Float> map = new HashMap<Float, Float>();
        return new JDKFloatFloatMapAdapter(map);
    }

    public FloatCharMap createFloatCharHashMap() {
        Map<Float, Character> map = new HashMap<Float, Character>();
        return new JDKFloatCharMapAdapter(map);
    }

    public CharByteMap createCharByteHashMap() {
        Map<Character, Byte> map = new HashMap<Character, Byte>();
        return new JDKCharByteMapAdapter(map);
    }

    public CharBooleanMap createCharBooleanHashMap() {
        Map<Character, Boolean> map = new HashMap<Character, Boolean>();
        return new JDKCharBooleanMapAdapter(map);
    }

    public CharShortMap createCharShortHashMap() {
        Map<Character, Short> map = new HashMap<Character, Short>();
        return new JDKCharShortMapAdapter(map);
    }

    public CharIntMap createCharIntHashMap() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        return new JDKCharIntMapAdapter(map);
    }

    public CharLongMap createCharLongHashMap() {
        Map<Character, Long> map = new HashMap<Character, Long>();
        return new JDKCharLongMapAdapter(map);
    }

    public CharDoubleMap createCharDoubleHashMap() {
        Map<Character, Double> map = new HashMap<Character, Double>();
        return new JDKCharDoubleMapAdapter(map);
    }

    public CharFloatMap createCharFloatHashMap() {
        Map<Character, Float> map = new HashMap<Character, Float>();
        return new JDKCharFloatMapAdapter(map);
    }

    public CharCharMap createCharCharHashMap() {
        Map<Character, Character> map = new HashMap<Character, Character>();
        return new JDKCharCharMapAdapter(map);
    }

    public ByteByteMap createByteByteTreeMap() {
        Map<Byte, Byte> map = new TreeMap<Byte, Byte>();
        return new JDKByteByteMapAdapter(map);
    }

    public ByteBooleanMap createByteBooleanTreeMap() {
        Map<Byte, Boolean> map = new TreeMap<Byte, Boolean>();
        return new JDKByteBooleanMapAdapter(map);
    }

    public ByteShortMap createByteShortTreeMap() {
        Map<Byte, Short> map = new TreeMap<Byte, Short>();
        return new JDKByteShortMapAdapter(map);
    }

    public ByteIntMap createByteIntTreeMap() {
        Map<Byte, Integer> map = new TreeMap<Byte, Integer>();
        return new JDKByteIntMapAdapter(map);
    }

    public ByteLongMap createByteLongTreeMap() {
        Map<Byte, Long> map = new TreeMap<Byte, Long>();
        return new JDKByteLongMapAdapter(map);
    }

    public ByteDoubleMap createByteDoubleTreeMap() {
        Map<Byte, Double> map = new TreeMap<Byte, Double>();
        return new JDKByteDoubleMapAdapter(map);
    }

    public ByteFloatMap createByteFloatTreeMap() {
        Map<Byte, Float> map = new TreeMap<Byte, Float>();
        return new JDKByteFloatMapAdapter(map);
    }

    public ByteCharMap createByteCharTreeMap() {
        Map<Byte, Character> map = new TreeMap<Byte, Character>();
        return new JDKByteCharMapAdapter(map);
    }

    public BooleanByteMap createBooleanByteTreeMap() {
        Map<Boolean, Byte> map = new TreeMap<Boolean, Byte>();
        return new JDKBooleanByteMapAdapter(map);
    }

    public BooleanBooleanMap createBooleanBooleanTreeMap() {
        Map<Boolean, Boolean> map = new TreeMap<Boolean, Boolean>();
        return new JDKBooleanBooleanMapAdapter(map);
    }

    public BooleanShortMap createBooleanShortTreeMap() {
        Map<Boolean, Short> map = new TreeMap<Boolean, Short>();
        return new JDKBooleanShortMapAdapter(map);
    }

    public BooleanIntMap createBooleanIntTreeMap() {
        Map<Boolean, Integer> map = new TreeMap<Boolean, Integer>();
        return new JDKBooleanIntMapAdapter(map);
    }

    public BooleanLongMap createBooleanLongTreeMap() {
        Map<Boolean, Long> map = new TreeMap<Boolean, Long>();
        return new JDKBooleanLongMapAdapter(map);
    }

    public BooleanDoubleMap createBooleanDoubleTreeMap() {
        Map<Boolean, Double> map = new TreeMap<Boolean, Double>();
        return new JDKBooleanDoubleMapAdapter(map);
    }

    public BooleanFloatMap createBooleanFloatTreeMap() {
        Map<Boolean, Float> map = new TreeMap<Boolean, Float>();
        return new JDKBooleanFloatMapAdapter(map);
    }

    public BooleanCharMap createBooleanCharTreeMap() {
        Map<Boolean, Character> map = new TreeMap<Boolean, Character>();
        return new JDKBooleanCharMapAdapter(map);
    }

    public ShortByteMap createShortByteTreeMap() {
        Map<Short, Byte> map = new TreeMap<Short, Byte>();
        return new JDKShortByteMapAdapter(map);
    }

    public ShortBooleanMap createShortBooleanTreeMap() {
        Map<Short, Boolean> map = new TreeMap<Short, Boolean>();
        return new JDKShortBooleanMapAdapter(map);
    }

    public ShortShortMap createShortShortTreeMap() {
        Map<Short, Short> map = new TreeMap<Short, Short>();
        return new JDKShortShortMapAdapter(map);
    }

    public ShortIntMap createShortIntTreeMap() {
        Map<Short, Integer> map = new TreeMap<Short, Integer>();
        return new JDKShortIntMapAdapter(map);
    }

    public ShortLongMap createShortLongTreeMap() {
        Map<Short, Long> map = new TreeMap<Short, Long>();
        return new JDKShortLongMapAdapter(map);
    }

    public ShortDoubleMap createShortDoubleTreeMap() {
        Map<Short, Double> map = new TreeMap<Short, Double>();
        return new JDKShortDoubleMapAdapter(map);
    }

    public ShortFloatMap createShortFloatTreeMap() {
        Map<Short, Float> map = new TreeMap<Short, Float>();
        return new JDKShortFloatMapAdapter(map);
    }

    public ShortCharMap createShortCharTreeMap() {
        Map<Short, Character> map = new TreeMap<Short, Character>();
        return new JDKShortCharMapAdapter(map);
    }

    public IntByteMap createIntByteTreeMap() {
        Map<Integer, Byte> map = new TreeMap<Integer, Byte>();
        return new JDKIntByteMapAdapter(map);
    }

    public IntBooleanMap createIntBooleanTreeMap() {
        Map<Integer, Boolean> map = new TreeMap<Integer, Boolean>();
        return new JDKIntBooleanMapAdapter(map);
    }

    public IntShortMap createIntShortTreeMap() {
        Map<Integer, Short> map = new TreeMap<Integer, Short>();
        return new JDKIntShortMapAdapter(map);
    }

    public IntIntMap createIntIntTreeMap() {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        return new JDKIntIntMapAdapter(map);
    }

    public IntLongMap createIntLongTreeMap() {
        Map<Integer, Long> map = new TreeMap<Integer, Long>();
        return new JDKIntLongMapAdapter(map);
    }

    public IntDoubleMap createIntDoubleTreeMap() {
        Map<Integer, Double> map = new TreeMap<Integer, Double>();
        return new JDKIntDoubleMapAdapter(map);
    }

    public IntFloatMap createIntFloatTreeMap() {
        Map<Integer, Float> map = new TreeMap<Integer, Float>();
        return new JDKIntFloatMapAdapter(map);
    }

    public IntCharMap createIntCharTreeMap() {
        Map<Integer, Character> map = new TreeMap<Integer, Character>();
        return new JDKIntCharMapAdapter(map);
    }

    public LongByteMap createLongByteTreeMap() {
        Map<Long, Byte> map = new TreeMap<Long, Byte>();
        return new JDKLongByteMapAdapter(map);
    }

    public LongBooleanMap createLongBooleanTreeMap() {
        Map<Long, Boolean> map = new TreeMap<Long, Boolean>();
        return new JDKLongBooleanMapAdapter(map);
    }

    public LongShortMap createLongShortTreeMap() {
        Map<Long, Short> map = new TreeMap<Long, Short>();
        return new JDKLongShortMapAdapter(map);
    }

    public LongIntMap createLongIntTreeMap() {
        Map<Long, Integer> map = new TreeMap<Long, Integer>();
        return new JDKLongIntMapAdapter(map);
    }

    public LongLongMap createLongLongTreeMap() {
        Map<Long, Long> map = new TreeMap<Long, Long>();
        return new JDKLongLongMapAdapter(map);
    }

    public LongDoubleMap createLongDoubleTreeMap() {
        Map<Long, Double> map = new TreeMap<Long, Double>();
        return new JDKLongDoubleMapAdapter(map);
    }

    public LongFloatMap createLongFloatTreeMap() {
        Map<Long, Float> map = new TreeMap<Long, Float>();
        return new JDKLongFloatMapAdapter(map);
    }

    public LongCharMap createLongCharTreeMap() {
        Map<Long, Character> map = new TreeMap<Long, Character>();
        return new JDKLongCharMapAdapter(map);
    }

    public DoubleByteMap createDoubleByteTreeMap() {
        Map<Double, Byte> map = new TreeMap<Double, Byte>();
        return new JDKDoubleByteMapAdapter(map);
    }

    public DoubleBooleanMap createDoubleBooleanTreeMap() {
        Map<Double, Boolean> map = new TreeMap<Double, Boolean>();
        return new JDKDoubleBooleanMapAdapter(map);
    }

    public DoubleShortMap createDoubleShortTreeMap() {
        Map<Double, Short> map = new TreeMap<Double, Short>();
        return new JDKDoubleShortMapAdapter(map);
    }

    public DoubleIntMap createDoubleIntTreeMap() {
        Map<Double, Integer> map = new TreeMap<Double, Integer>();
        return new JDKDoubleIntMapAdapter(map);
    }

    public DoubleLongMap createDoubleLongTreeMap() {
        Map<Double, Long> map = new TreeMap<Double, Long>();
        return new JDKDoubleLongMapAdapter(map);
    }

    public DoubleDoubleMap createDoubleDoubleTreeMap() {
        Map<Double, Double> map = new TreeMap<Double, Double>();
        return new JDKDoubleDoubleMapAdapter(map);
    }

    public DoubleFloatMap createDoubleFloatTreeMap() {
        Map<Double, Float> map = new TreeMap<Double, Float>();
        return new JDKDoubleFloatMapAdapter(map);
    }

    public DoubleCharMap createDoubleCharTreeMap() {
        Map<Double, Character> map = new TreeMap<Double, Character>();
        return new JDKDoubleCharMapAdapter(map);
    }

    public FloatByteMap createFloatByteTreeMap() {
        Map<Float, Byte> map = new TreeMap<Float, Byte>();
        return new JDKFloatByteMapAdapter(map);
    }

    public FloatBooleanMap createFloatBooleanTreeMap() {
        Map<Float, Boolean> map = new TreeMap<Float, Boolean>();
        return new JDKFloatBooleanMapAdapter(map);
    }

    public FloatShortMap createFloatShortTreeMap() {
        Map<Float, Short> map = new TreeMap<Float, Short>();
        return new JDKFloatShortMapAdapter(map);
    }

    public FloatIntMap createFloatIntTreeMap() {
        Map<Float, Integer> map = new TreeMap<Float, Integer>();
        return new JDKFloatIntMapAdapter(map);
    }

    public FloatLongMap createFloatLongTreeMap() {
        Map<Float, Long> map = new TreeMap<Float, Long>();
        return new JDKFloatLongMapAdapter(map);
    }

    public FloatDoubleMap createFloatDoubleTreeMap() {
        Map<Float, Double> map = new TreeMap<Float, Double>();
        return new JDKFloatDoubleMapAdapter(map);
    }

    public FloatFloatMap createFloatFloatTreeMap() {
        Map<Float, Float> map = new TreeMap<Float, Float>();
        return new JDKFloatFloatMapAdapter(map);
    }

    public FloatCharMap createFloatCharTreeMap() {
        Map<Float, Character> map = new TreeMap<Float, Character>();
        return new JDKFloatCharMapAdapter(map);
    }

    public CharByteMap createCharByteTreeMap() {
        Map<Character, Byte> map = new TreeMap<Character, Byte>();
        return new JDKCharByteMapAdapter(map);
    }

    public CharBooleanMap createCharBooleanTreeMap() {
        Map<Character, Boolean> map = new TreeMap<Character, Boolean>();
        return new JDKCharBooleanMapAdapter(map);
    }

    public CharShortMap createCharShortTreeMap() {
        Map<Character, Short> map = new TreeMap<Character, Short>();
        return new JDKCharShortMapAdapter(map);
    }

    public CharIntMap createCharIntTreeMap() {
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        return new JDKCharIntMapAdapter(map);
    }

    public CharLongMap createCharLongTreeMap() {
        Map<Character, Long> map = new TreeMap<Character, Long>();
        return new JDKCharLongMapAdapter(map);
    }

    public CharDoubleMap createCharDoubleTreeMap() {
        Map<Character, Double> map = new TreeMap<Character, Double>();
        return new JDKCharDoubleMapAdapter(map);
    }

    public CharFloatMap createCharFloatTreeMap() {
        Map<Character, Float> map = new TreeMap<Character, Float>();
        return new JDKCharFloatMapAdapter(map);
    }

    public CharCharMap createCharCharTreeMap() {
        Map<Character, Character> map = new TreeMap<Character, Character>();
        return new JDKCharCharMapAdapter(map);
    }
}
