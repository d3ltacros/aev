package com.fingerprintjs.android.pro.fingerprint

import com.fingerprintjs.android.pro.fingerprint.requests.FetchTokenResponse

interface ApplicationVerifier {
    fun getToken(listener: (FetchTokenResponse) -> (Unit))
}