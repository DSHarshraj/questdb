/*******************************************************************************
 *    ___                  _   ____  ____
 *   / _ \ _   _  ___  ___| |_|  _ \| __ )
 *  | | | | | | |/ _ \/ __| __| | | |  _ \
 *  | |_| | |_| |  __/\__ \ |_| |_| | |_) |
 *   \__\_\\__,_|\___||___/\__|____/|____/
 *
 * Copyright (C) 2014-2019 Appsicle
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 ******************************************************************************/

package com.questdb.cutlass.text.types;

import com.questdb.cairo.ColumnType;
import com.questdb.cairo.TableWriter;
import com.questdb.std.Numbers;
import com.questdb.std.str.DirectByteCharSequence;

public final class ShortAdapter extends AbstractTypeAdapter {

    public static final ShortAdapter INSTANCE = new ShortAdapter();

    private ShortAdapter() {
    }

    @Override
    public int getType() {
        return ColumnType.SHORT;
    }

    @Override
    public boolean probe(CharSequence text) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void write(TableWriter.Row row, int column, DirectByteCharSequence value) throws Exception {
        row.putShort(column, (short) Numbers.parseInt(value));
    }
}
