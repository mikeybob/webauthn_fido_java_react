/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.orquanet.webauthn.webauthn.assertion.model;

import lombok.Builder;
import lombok.Getter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Arrays;
import java.util.Base64;

@Builder
@Getter
public class AuthenticatorDataAssertion {

    private byte[] rpidHash;
    private int up;
    private int uv;
    private int at;
    private int ed;
    private byte[] aaguid;
    private int authDataLength;
    private byte[] authData;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("rpdishash",this.rpidHash)
                .append("flags", Arrays.toString(new int[]{up,uv,at,ed}))
                .append("aaguid",Base64.getEncoder().encode(aaguid))
                .toString();
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, false);
    }


}
