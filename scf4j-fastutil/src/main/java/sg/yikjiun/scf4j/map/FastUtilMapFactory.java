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

import it.unimi.dsi.fastutil.bytes.*;
import it.unimi.dsi.fastutil.chars.*;
import it.unimi.dsi.fastutil.doubles.*;
import it.unimi.dsi.fastutil.floats.*;
import it.unimi.dsi.fastutil.ints.*;
import it.unimi.dsi.fastutil.longs.*;
import it.unimi.dsi.fastutil.shorts.*;

/**
 * @author Lee Yik Jiun
 */
public class FastUtilMapFactory implements MapFactoryDelegate {
    public ByteByteMap createByteByteHashMap() {
        Byte2ByteMap map = new Byte2ByteOpenHashMap();
        return new FastUtilByteByteMapAdapter(map);
    }
    public ByteBooleanMap createByteBooleanHashMap() {
        Byte2BooleanMap map = new Byte2BooleanOpenHashMap();
        return new FastUtilByteBooleanMapAdapter(map);
    }
    public ByteShortMap createByteShortHashMap() {
        Byte2ShortMap map = new Byte2ShortOpenHashMap();
        return new FastUtilByteShortMapAdapter(map);
    }
    public ByteIntMap createByteIntHashMap() {
        Byte2IntMap map = new Byte2IntOpenHashMap();
        return new FastUtilByteIntMapAdapter(map);
    }
    public ByteLongMap createByteLongHashMap() {
        Byte2LongMap map = new Byte2LongOpenHashMap();
        return new FastUtilByteLongMapAdapter(map);
    }
    public ByteDoubleMap createByteDoubleHashMap() {
        Byte2DoubleMap map = new Byte2DoubleOpenHashMap();
        return new FastUtilByteDoubleMapAdapter(map);
    }
    public ByteFloatMap createByteFloatHashMap() {
        Byte2FloatMap map = new Byte2FloatOpenHashMap();
        return new FastUtilByteFloatMapAdapter(map);
    }
    public ByteCharMap createByteCharHashMap() {
        Byte2CharMap map = new Byte2CharOpenHashMap();
        return new FastUtilByteCharMapAdapter(map);
    }
    public BooleanByteMap createBooleanByteHashMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanBooleanMap createBooleanBooleanHashMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanShortMap createBooleanShortHashMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanIntMap createBooleanIntHashMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanLongMap createBooleanLongHashMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanDoubleMap createBooleanDoubleHashMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanFloatMap createBooleanFloatHashMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanCharMap createBooleanCharHashMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public ShortByteMap createShortByteHashMap() {
        Short2ByteMap map = new Short2ByteOpenHashMap();
        return new FastUtilShortByteMapAdapter(map);
    }
    public ShortBooleanMap createShortBooleanHashMap() {
        Short2BooleanMap map = new Short2BooleanOpenHashMap();
        return new FastUtilShortBooleanMapAdapter(map);
    }
    public ShortShortMap createShortShortHashMap() {
        Short2ShortMap map = new Short2ShortOpenHashMap();
        return new FastUtilShortShortMapAdapter(map);
    }
    public ShortIntMap createShortIntHashMap() {
        Short2IntMap map = new Short2IntOpenHashMap();
        return new FastUtilShortIntMapAdapter(map);
    }
    public ShortLongMap createShortLongHashMap() {
        Short2LongMap map = new Short2LongOpenHashMap();
        return new FastUtilShortLongMapAdapter(map);
    }
    public ShortDoubleMap createShortDoubleHashMap() {
        Short2DoubleMap map = new Short2DoubleOpenHashMap();
        return new FastUtilShortDoubleMapAdapter(map);
    }
    public ShortFloatMap createShortFloatHashMap() {
        Short2FloatMap map = new Short2FloatOpenHashMap();
        return new FastUtilShortFloatMapAdapter(map);
    }
    public ShortCharMap createShortCharHashMap() {
        Short2CharMap map = new Short2CharOpenHashMap();
        return new FastUtilShortCharMapAdapter(map);
    }
    public IntByteMap createIntByteHashMap() {
        Int2ByteMap map = new Int2ByteOpenHashMap();
        return new FastUtilIntByteMapAdapter(map);
    }
    public IntBooleanMap createIntBooleanHashMap() {
        Int2BooleanMap map = new Int2BooleanOpenHashMap();
        return new FastUtilIntBooleanMapAdapter(map);
    }
    public IntShortMap createIntShortHashMap() {
        Int2ShortMap map = new Int2ShortOpenHashMap();
        return new FastUtilIntShortMapAdapter(map);
    }
    public IntIntMap createIntIntHashMap() {
        Int2IntMap map = new Int2IntOpenHashMap();
        return new FastUtilIntIntMapAdapter(map);
    }
    public IntLongMap createIntLongHashMap() {
        Int2LongMap map = new Int2LongOpenHashMap();
        return new FastUtilIntLongMapAdapter(map);
    }
    public IntDoubleMap createIntDoubleHashMap() {
        Int2DoubleMap map = new Int2DoubleOpenHashMap();
        return new FastUtilIntDoubleMapAdapter(map);
    }
    public IntFloatMap createIntFloatHashMap() {
        Int2FloatMap map = new Int2FloatOpenHashMap();
        return new FastUtilIntFloatMapAdapter(map);
    }
    public IntCharMap createIntCharHashMap() {
        Int2CharMap map = new Int2CharOpenHashMap();
        return new FastUtilIntCharMapAdapter(map);
    }
    public LongByteMap createLongByteHashMap() {
        Long2ByteMap map = new Long2ByteOpenHashMap();
        return new FastUtilLongByteMapAdapter(map);
    }
    public LongBooleanMap createLongBooleanHashMap() {
        Long2BooleanMap map = new Long2BooleanOpenHashMap();
        return new FastUtilLongBooleanMapAdapter(map);
    }
    public LongShortMap createLongShortHashMap() {
        Long2ShortMap map = new Long2ShortOpenHashMap();
        return new FastUtilLongShortMapAdapter(map);
    }
    public LongIntMap createLongIntHashMap() {
        Long2IntMap map = new Long2IntOpenHashMap();
        return new FastUtilLongIntMapAdapter(map);
    }
    public LongLongMap createLongLongHashMap() {
        Long2LongMap map = new Long2LongOpenHashMap();
        return new FastUtilLongLongMapAdapter(map);
    }
    public LongDoubleMap createLongDoubleHashMap() {
        Long2DoubleMap map = new Long2DoubleOpenHashMap();
        return new FastUtilLongDoubleMapAdapter(map);
    }
    public LongFloatMap createLongFloatHashMap() {
        Long2FloatMap map = new Long2FloatOpenHashMap();
        return new FastUtilLongFloatMapAdapter(map);
    }
    public LongCharMap createLongCharHashMap() {
        Long2CharMap map = new Long2CharOpenHashMap();
        return new FastUtilLongCharMapAdapter(map);
    }
    public DoubleByteMap createDoubleByteHashMap() {
        Double2ByteMap map = new Double2ByteOpenHashMap();
        return new FastUtilDoubleByteMapAdapter(map);
    }
    public DoubleBooleanMap createDoubleBooleanHashMap() {
        Double2BooleanMap map = new Double2BooleanOpenHashMap();
        return new FastUtilDoubleBooleanMapAdapter(map);
    }
    public DoubleShortMap createDoubleShortHashMap() {
        Double2ShortMap map = new Double2ShortOpenHashMap();
        return new FastUtilDoubleShortMapAdapter(map);
    }
    public DoubleIntMap createDoubleIntHashMap() {
        Double2IntMap map = new Double2IntOpenHashMap();
        return new FastUtilDoubleIntMapAdapter(map);
    }
    public DoubleLongMap createDoubleLongHashMap() {
        Double2LongMap map = new Double2LongOpenHashMap();
        return new FastUtilDoubleLongMapAdapter(map);
    }
    public DoubleDoubleMap createDoubleDoubleHashMap() {
        Double2DoubleMap map = new Double2DoubleOpenHashMap();
        return new FastUtilDoubleDoubleMapAdapter(map);
    }
    public DoubleFloatMap createDoubleFloatHashMap() {
        Double2FloatMap map = new Double2FloatOpenHashMap();
        return new FastUtilDoubleFloatMapAdapter(map);
    }
    public DoubleCharMap createDoubleCharHashMap() {
        Double2CharMap map = new Double2CharOpenHashMap();
        return new FastUtilDoubleCharMapAdapter(map);
    }
    public FloatByteMap createFloatByteHashMap() {
        Float2ByteMap map = new Float2ByteOpenHashMap();
        return new FastUtilFloatByteMapAdapter(map);
    }
    public FloatBooleanMap createFloatBooleanHashMap() {
        Float2BooleanMap map = new Float2BooleanOpenHashMap();
        return new FastUtilFloatBooleanMapAdapter(map);
    }
    public FloatShortMap createFloatShortHashMap() {
        Float2ShortMap map = new Float2ShortOpenHashMap();
        return new FastUtilFloatShortMapAdapter(map);
    }
    public FloatIntMap createFloatIntHashMap() {
        Float2IntMap map = new Float2IntOpenHashMap();
        return new FastUtilFloatIntMapAdapter(map);
    }
    public FloatLongMap createFloatLongHashMap() {
        Float2LongMap map = new Float2LongOpenHashMap();
        return new FastUtilFloatLongMapAdapter(map);
    }
    public FloatDoubleMap createFloatDoubleHashMap() {
        Float2DoubleMap map = new Float2DoubleOpenHashMap();
        return new FastUtilFloatDoubleMapAdapter(map);
    }
    public FloatFloatMap createFloatFloatHashMap() {
        Float2FloatMap map = new Float2FloatOpenHashMap();
        return new FastUtilFloatFloatMapAdapter(map);
    }
    public FloatCharMap createFloatCharHashMap() {
        Float2CharMap map = new Float2CharOpenHashMap();
        return new FastUtilFloatCharMapAdapter(map);
    }
    public CharByteMap createCharByteHashMap() {
        Char2ByteMap map = new Char2ByteOpenHashMap();
        return new FastUtilCharByteMapAdapter(map);
    }
    public CharBooleanMap createCharBooleanHashMap() {
        Char2BooleanMap map = new Char2BooleanOpenHashMap();
        return new FastUtilCharBooleanMapAdapter(map);
    }
    public CharShortMap createCharShortHashMap() {
        Char2ShortMap map = new Char2ShortOpenHashMap();
        return new FastUtilCharShortMapAdapter(map);
    }
    public CharIntMap createCharIntHashMap() {
        Char2IntMap map = new Char2IntOpenHashMap();
        return new FastUtilCharIntMapAdapter(map);
    }
    public CharLongMap createCharLongHashMap() {
        Char2LongMap map = new Char2LongOpenHashMap();
        return new FastUtilCharLongMapAdapter(map);
    }
    public CharDoubleMap createCharDoubleHashMap() {
        Char2DoubleMap map = new Char2DoubleOpenHashMap();
        return new FastUtilCharDoubleMapAdapter(map);
    }
    public CharFloatMap createCharFloatHashMap() {
        Char2FloatMap map = new Char2FloatOpenHashMap();
        return new FastUtilCharFloatMapAdapter(map);
    }
    public CharCharMap createCharCharHashMap() {
        Char2CharMap map = new Char2CharOpenHashMap();
        return new FastUtilCharCharMapAdapter(map);
    }
    public ByteByteMap createByteByteTreeMap() {
        Byte2ByteMap map = new Byte2ByteRBTreeMap();
        return new FastUtilByteByteMapAdapter(map);
    }
    public ByteBooleanMap createByteBooleanTreeMap() {
        Byte2BooleanMap map = new Byte2BooleanRBTreeMap();
        return new FastUtilByteBooleanMapAdapter(map);
    }
    public ByteShortMap createByteShortTreeMap() {
        Byte2ShortMap map = new Byte2ShortRBTreeMap();
        return new FastUtilByteShortMapAdapter(map);
    }
    public ByteIntMap createByteIntTreeMap() {
        Byte2IntMap map = new Byte2IntRBTreeMap();
        return new FastUtilByteIntMapAdapter(map);
    }
    public ByteLongMap createByteLongTreeMap() {
        Byte2LongMap map = new Byte2LongRBTreeMap();
        return new FastUtilByteLongMapAdapter(map);
    }
    public ByteDoubleMap createByteDoubleTreeMap() {
        Byte2DoubleMap map = new Byte2DoubleRBTreeMap();
        return new FastUtilByteDoubleMapAdapter(map);
    }
    public ByteFloatMap createByteFloatTreeMap() {
        Byte2FloatMap map = new Byte2FloatRBTreeMap();
        return new FastUtilByteFloatMapAdapter(map);
    }
    public ByteCharMap createByteCharTreeMap() {
        Byte2CharMap map = new Byte2CharRBTreeMap();
        return new FastUtilByteCharMapAdapter(map);
    }
    public BooleanByteMap createBooleanByteTreeMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanBooleanMap createBooleanBooleanTreeMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanShortMap createBooleanShortTreeMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanIntMap createBooleanIntTreeMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanLongMap createBooleanLongTreeMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanDoubleMap createBooleanDoubleTreeMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanFloatMap createBooleanFloatTreeMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public BooleanCharMap createBooleanCharTreeMap() {
        throw new UnsupportedOperationException("FastUtil does not support boolean map");
    }
    public ShortByteMap createShortByteTreeMap() {
        Short2ByteMap map = new Short2ByteRBTreeMap();
        return new FastUtilShortByteMapAdapter(map);
    }
    public ShortBooleanMap createShortBooleanTreeMap() {
        Short2BooleanMap map = new Short2BooleanRBTreeMap();
        return new FastUtilShortBooleanMapAdapter(map);
    }
    public ShortShortMap createShortShortTreeMap() {
        Short2ShortMap map = new Short2ShortRBTreeMap();
        return new FastUtilShortShortMapAdapter(map);
    }
    public ShortIntMap createShortIntTreeMap() {
        Short2IntMap map = new Short2IntRBTreeMap();
        return new FastUtilShortIntMapAdapter(map);
    }
    public ShortLongMap createShortLongTreeMap() {
        Short2LongMap map = new Short2LongRBTreeMap();
        return new FastUtilShortLongMapAdapter(map);
    }
    public ShortDoubleMap createShortDoubleTreeMap() {
        Short2DoubleMap map = new Short2DoubleRBTreeMap();
        return new FastUtilShortDoubleMapAdapter(map);
    }
    public ShortFloatMap createShortFloatTreeMap() {
        Short2FloatMap map = new Short2FloatRBTreeMap();
        return new FastUtilShortFloatMapAdapter(map);
    }
    public ShortCharMap createShortCharTreeMap() {
        Short2CharMap map = new Short2CharRBTreeMap();
        return new FastUtilShortCharMapAdapter(map);
    }
    public IntByteMap createIntByteTreeMap() {
        Int2ByteMap map = new Int2ByteRBTreeMap();
        return new FastUtilIntByteMapAdapter(map);
    }
    public IntBooleanMap createIntBooleanTreeMap() {
        Int2BooleanMap map = new Int2BooleanRBTreeMap();
        return new FastUtilIntBooleanMapAdapter(map);
    }
    public IntShortMap createIntShortTreeMap() {
        Int2ShortMap map = new Int2ShortRBTreeMap();
        return new FastUtilIntShortMapAdapter(map);
    }
    public IntIntMap createIntIntTreeMap() {
        Int2IntMap map = new Int2IntRBTreeMap();
        return new FastUtilIntIntMapAdapter(map);
    }
    public IntLongMap createIntLongTreeMap() {
        Int2LongMap map = new Int2LongRBTreeMap();
        return new FastUtilIntLongMapAdapter(map);
    }
    public IntDoubleMap createIntDoubleTreeMap() {
        Int2DoubleMap map = new Int2DoubleRBTreeMap();
        return new FastUtilIntDoubleMapAdapter(map);
    }
    public IntFloatMap createIntFloatTreeMap() {
        Int2FloatMap map = new Int2FloatRBTreeMap();
        return new FastUtilIntFloatMapAdapter(map);
    }
    public IntCharMap createIntCharTreeMap() {
        Int2CharMap map = new Int2CharRBTreeMap();
        return new FastUtilIntCharMapAdapter(map);
    }
    public LongByteMap createLongByteTreeMap() {
        Long2ByteMap map = new Long2ByteRBTreeMap();
        return new FastUtilLongByteMapAdapter(map);
    }
    public LongBooleanMap createLongBooleanTreeMap() {
        Long2BooleanMap map = new Long2BooleanRBTreeMap();
        return new FastUtilLongBooleanMapAdapter(map);
    }
    public LongShortMap createLongShortTreeMap() {
        Long2ShortMap map = new Long2ShortRBTreeMap();
        return new FastUtilLongShortMapAdapter(map);
    }
    public LongIntMap createLongIntTreeMap() {
        Long2IntMap map = new Long2IntRBTreeMap();
        return new FastUtilLongIntMapAdapter(map);
    }
    public LongLongMap createLongLongTreeMap() {
        Long2LongMap map = new Long2LongRBTreeMap();
        return new FastUtilLongLongMapAdapter(map);
    }
    public LongDoubleMap createLongDoubleTreeMap() {
        Long2DoubleMap map = new Long2DoubleRBTreeMap();
        return new FastUtilLongDoubleMapAdapter(map);
    }
    public LongFloatMap createLongFloatTreeMap() {
        Long2FloatMap map = new Long2FloatRBTreeMap();
        return new FastUtilLongFloatMapAdapter(map);
    }
    public LongCharMap createLongCharTreeMap() {
        Long2CharMap map = new Long2CharRBTreeMap();
        return new FastUtilLongCharMapAdapter(map);
    }
    public DoubleByteMap createDoubleByteTreeMap() {
        Double2ByteMap map = new Double2ByteRBTreeMap();
        return new FastUtilDoubleByteMapAdapter(map);
    }
    public DoubleBooleanMap createDoubleBooleanTreeMap() {
        Double2BooleanMap map = new Double2BooleanRBTreeMap();
        return new FastUtilDoubleBooleanMapAdapter(map);
    }
    public DoubleShortMap createDoubleShortTreeMap() {
        Double2ShortMap map = new Double2ShortRBTreeMap();
        return new FastUtilDoubleShortMapAdapter(map);
    }
    public DoubleIntMap createDoubleIntTreeMap() {
        Double2IntMap map = new Double2IntRBTreeMap();
        return new FastUtilDoubleIntMapAdapter(map);
    }
    public DoubleLongMap createDoubleLongTreeMap() {
        Double2LongMap map = new Double2LongRBTreeMap();
        return new FastUtilDoubleLongMapAdapter(map);
    }
    public DoubleDoubleMap createDoubleDoubleTreeMap() {
        Double2DoubleMap map = new Double2DoubleRBTreeMap();
        return new FastUtilDoubleDoubleMapAdapter(map);
    }
    public DoubleFloatMap createDoubleFloatTreeMap() {
        Double2FloatMap map = new Double2FloatRBTreeMap();
        return new FastUtilDoubleFloatMapAdapter(map);
    }
    public DoubleCharMap createDoubleCharTreeMap() {
        Double2CharMap map = new Double2CharRBTreeMap();
        return new FastUtilDoubleCharMapAdapter(map);
    }
    public FloatByteMap createFloatByteTreeMap() {
        Float2ByteMap map = new Float2ByteRBTreeMap();
        return new FastUtilFloatByteMapAdapter(map);
    }
    public FloatBooleanMap createFloatBooleanTreeMap() {
        Float2BooleanMap map = new Float2BooleanRBTreeMap();
        return new FastUtilFloatBooleanMapAdapter(map);
    }
    public FloatShortMap createFloatShortTreeMap() {
        Float2ShortMap map = new Float2ShortRBTreeMap();
        return new FastUtilFloatShortMapAdapter(map);
    }
    public FloatIntMap createFloatIntTreeMap() {
        Float2IntMap map = new Float2IntRBTreeMap();
        return new FastUtilFloatIntMapAdapter(map);
    }
    public FloatLongMap createFloatLongTreeMap() {
        Float2LongMap map = new Float2LongRBTreeMap();
        return new FastUtilFloatLongMapAdapter(map);
    }
    public FloatDoubleMap createFloatDoubleTreeMap() {
        Float2DoubleMap map = new Float2DoubleRBTreeMap();
        return new FastUtilFloatDoubleMapAdapter(map);
    }
    public FloatFloatMap createFloatFloatTreeMap() {
        Float2FloatMap map = new Float2FloatRBTreeMap();
        return new FastUtilFloatFloatMapAdapter(map);
    }
    public FloatCharMap createFloatCharTreeMap() {
        Float2CharMap map = new Float2CharRBTreeMap();
        return new FastUtilFloatCharMapAdapter(map);
    }
    public CharByteMap createCharByteTreeMap() {
        Char2ByteMap map = new Char2ByteRBTreeMap();
        return new FastUtilCharByteMapAdapter(map);
    }
    public CharBooleanMap createCharBooleanTreeMap() {
        Char2BooleanMap map = new Char2BooleanRBTreeMap();
        return new FastUtilCharBooleanMapAdapter(map);
    }
    public CharShortMap createCharShortTreeMap() {
        Char2ShortMap map = new Char2ShortRBTreeMap();
        return new FastUtilCharShortMapAdapter(map);
    }
    public CharIntMap createCharIntTreeMap() {
        Char2IntMap map = new Char2IntRBTreeMap();
        return new FastUtilCharIntMapAdapter(map);
    }
    public CharLongMap createCharLongTreeMap() {
        Char2LongMap map = new Char2LongRBTreeMap();
        return new FastUtilCharLongMapAdapter(map);
    }
    public CharDoubleMap createCharDoubleTreeMap() {
        Char2DoubleMap map = new Char2DoubleRBTreeMap();
        return new FastUtilCharDoubleMapAdapter(map);
    }
    public CharFloatMap createCharFloatTreeMap() {
        Char2FloatMap map = new Char2FloatRBTreeMap();
        return new FastUtilCharFloatMapAdapter(map);
    }
    public CharCharMap createCharCharTreeMap() {
        Char2CharMap map = new Char2CharRBTreeMap();
        return new FastUtilCharCharMapAdapter(map);
    }
}