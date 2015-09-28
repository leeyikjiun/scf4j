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

/**
 * @author Lee Yik Jiun
 */
public interface MapFactoryDelegate {
    ByteByteMap createByteByteHashMap();

    ByteBooleanMap createByteBooleanHashMap();

    ByteShortMap createByteShortHashMap();

    ByteIntMap createByteIntHashMap();

    ByteLongMap createByteLongHashMap();

    ByteDoubleMap createByteDoubleHashMap();

    ByteFloatMap createByteFloatHashMap();

    ByteCharMap createByteCharHashMap();

    BooleanByteMap createBooleanByteHashMap();

    BooleanBooleanMap createBooleanBooleanHashMap();

    BooleanShortMap createBooleanShortHashMap();

    BooleanIntMap createBooleanIntHashMap();

    BooleanLongMap createBooleanLongHashMap();

    BooleanDoubleMap createBooleanDoubleHashMap();

    BooleanFloatMap createBooleanFloatHashMap();

    BooleanCharMap createBooleanCharHashMap();

    ShortByteMap createShortByteHashMap();

    ShortBooleanMap createShortBooleanHashMap();

    ShortShortMap createShortShortHashMap();

    ShortIntMap createShortIntHashMap();

    ShortLongMap createShortLongHashMap();

    ShortDoubleMap createShortDoubleHashMap();

    ShortFloatMap createShortFloatHashMap();

    ShortCharMap createShortCharHashMap();

    IntByteMap createIntByteHashMap();

    IntBooleanMap createIntBooleanHashMap();

    IntShortMap createIntShortHashMap();

    IntIntMap createIntIntHashMap();

    IntLongMap createIntLongHashMap();

    IntDoubleMap createIntDoubleHashMap();

    IntFloatMap createIntFloatHashMap();

    IntCharMap createIntCharHashMap();

    LongByteMap createLongByteHashMap();

    LongBooleanMap createLongBooleanHashMap();

    LongShortMap createLongShortHashMap();

    LongIntMap createLongIntHashMap();

    LongLongMap createLongLongHashMap();

    LongDoubleMap createLongDoubleHashMap();

    LongFloatMap createLongFloatHashMap();

    LongCharMap createLongCharHashMap();

    DoubleByteMap createDoubleByteHashMap();

    DoubleBooleanMap createDoubleBooleanHashMap();

    DoubleShortMap createDoubleShortHashMap();

    DoubleIntMap createDoubleIntHashMap();

    DoubleLongMap createDoubleLongHashMap();

    DoubleDoubleMap createDoubleDoubleHashMap();

    DoubleFloatMap createDoubleFloatHashMap();

    DoubleCharMap createDoubleCharHashMap();

    FloatByteMap createFloatByteHashMap();

    FloatBooleanMap createFloatBooleanHashMap();

    FloatShortMap createFloatShortHashMap();

    FloatIntMap createFloatIntHashMap();

    FloatLongMap createFloatLongHashMap();

    FloatDoubleMap createFloatDoubleHashMap();

    FloatFloatMap createFloatFloatHashMap();

    FloatCharMap createFloatCharHashMap();

    CharByteMap createCharByteHashMap();

    CharBooleanMap createCharBooleanHashMap();

    CharShortMap createCharShortHashMap();

    CharIntMap createCharIntHashMap();

    CharLongMap createCharLongHashMap();

    CharDoubleMap createCharDoubleHashMap();

    CharFloatMap createCharFloatHashMap();

    CharCharMap createCharCharHashMap();

    ByteByteMap createByteByteTreeMap();

    ByteBooleanMap createByteBooleanTreeMap();

    ByteShortMap createByteShortTreeMap();

    ByteIntMap createByteIntTreeMap();

    ByteLongMap createByteLongTreeMap();

    ByteDoubleMap createByteDoubleTreeMap();

    ByteFloatMap createByteFloatTreeMap();

    ByteCharMap createByteCharTreeMap();

    BooleanByteMap createBooleanByteTreeMap();

    BooleanBooleanMap createBooleanBooleanTreeMap();

    BooleanShortMap createBooleanShortTreeMap();

    BooleanIntMap createBooleanIntTreeMap();

    BooleanLongMap createBooleanLongTreeMap();

    BooleanDoubleMap createBooleanDoubleTreeMap();

    BooleanFloatMap createBooleanFloatTreeMap();

    BooleanCharMap createBooleanCharTreeMap();

    ShortByteMap createShortByteTreeMap();

    ShortBooleanMap createShortBooleanTreeMap();

    ShortShortMap createShortShortTreeMap();

    ShortIntMap createShortIntTreeMap();

    ShortLongMap createShortLongTreeMap();

    ShortDoubleMap createShortDoubleTreeMap();

    ShortFloatMap createShortFloatTreeMap();

    ShortCharMap createShortCharTreeMap();

    IntByteMap createIntByteTreeMap();

    IntBooleanMap createIntBooleanTreeMap();

    IntShortMap createIntShortTreeMap();

    IntIntMap createIntIntTreeMap();

    IntLongMap createIntLongTreeMap();

    IntDoubleMap createIntDoubleTreeMap();

    IntFloatMap createIntFloatTreeMap();

    IntCharMap createIntCharTreeMap();

    LongByteMap createLongByteTreeMap();

    LongBooleanMap createLongBooleanTreeMap();

    LongShortMap createLongShortTreeMap();

    LongIntMap createLongIntTreeMap();

    LongLongMap createLongLongTreeMap();

    LongDoubleMap createLongDoubleTreeMap();

    LongFloatMap createLongFloatTreeMap();

    LongCharMap createLongCharTreeMap();

    DoubleByteMap createDoubleByteTreeMap();

    DoubleBooleanMap createDoubleBooleanTreeMap();

    DoubleShortMap createDoubleShortTreeMap();

    DoubleIntMap createDoubleIntTreeMap();

    DoubleLongMap createDoubleLongTreeMap();

    DoubleDoubleMap createDoubleDoubleTreeMap();

    DoubleFloatMap createDoubleFloatTreeMap();

    DoubleCharMap createDoubleCharTreeMap();

    FloatByteMap createFloatByteTreeMap();

    FloatBooleanMap createFloatBooleanTreeMap();

    FloatShortMap createFloatShortTreeMap();

    FloatIntMap createFloatIntTreeMap();

    FloatLongMap createFloatLongTreeMap();

    FloatDoubleMap createFloatDoubleTreeMap();

    FloatFloatMap createFloatFloatTreeMap();

    FloatCharMap createFloatCharTreeMap();

    CharByteMap createCharByteTreeMap();

    CharBooleanMap createCharBooleanTreeMap();

    CharShortMap createCharShortTreeMap();

    CharIntMap createCharIntTreeMap();

    CharLongMap createCharLongTreeMap();

    CharDoubleMap createCharDoubleTreeMap();

    CharFloatMap createCharFloatTreeMap();

    CharCharMap createCharCharTreeMap();
}
