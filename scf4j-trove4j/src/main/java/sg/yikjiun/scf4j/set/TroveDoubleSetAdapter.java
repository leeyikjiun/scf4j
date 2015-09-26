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

package sg.yikjiun.scf4j.set;

import gnu.trove.set.TDoubleSet;

/**
 * @author Lee Yik Jiun
 */
public class TroveDoubleSetAdapter implements DoubleSet {
    private final TDoubleSet set;

    public TroveDoubleSetAdapter(TDoubleSet set) {
        this.set = set;
    }

    public boolean add(double d) {
        return set.add(d);
    }

    public void clear() {
        set.clear();
    }

    public boolean contains(double d) {
        return set.contains(d);
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public boolean remove(double d) {
        return set.remove(d);
    }

    public int size() {
        return set.size();
    }

    public double[] toArray() {
        return set.toArray();
    }
}
