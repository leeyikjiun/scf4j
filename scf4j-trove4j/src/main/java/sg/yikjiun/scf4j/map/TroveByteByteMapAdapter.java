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

import gnu.trove.map.TByteByteMap;

/**
 * @author Lee Yik Jiun
 */
public class TroveByteByteMapAdapter implements ByteByteMap {
    private final TByteByteMap map;

    public TroveByteByteMapAdapter(TByteByteMap map) {
        this.map = map;
    }

    public void clear() {
        map.clear();
    }

    public boolean containsKey(byte key) {
        return map.containsKey(key);
    }

    public boolean containsValue(byte value) {
        return map.containsValue(value);
    }

    public byte get(byte key) {
        return map.get(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public byte put(byte key, byte value) {
        return map.put(key, value);
    }

    public byte remove(byte key) {
        return map.remove(key);
    }

    public int size() {
        return map.size();
    }
}