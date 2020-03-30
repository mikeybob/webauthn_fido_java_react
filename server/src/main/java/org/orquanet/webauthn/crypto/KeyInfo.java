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

package org.orquanet.webauthn.crypto;

import lombok.Builder;
import org.orquanet.webauthn.crypto.cose.ec.constant.ECCurve;

import java.security.PublicKey;

@Builder

public class KeyInfo{

    private PublicKey publicKey;
    private ECCurve algoritm;
    public PublicKey getPublicKey(){
        return this.publicKey;
    }

    public ECCurve getAlgoritm(){
        return algoritm;
    }

}
