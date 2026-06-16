package io.elevenlabs.domain.model;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.elevenlabs.data.model.response.d;
import io.elevenlabs.domain.Logger;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.h;
import sn.k;
import sn.l;
import sn.m;
import sn.o;
import tn.a0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\u001a)\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"'\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "Lio/elevenlabs/domain/Logger;", "logger", ParameterNames.TAG, "deriveStoreCurrencyCode", "(Ljava/lang/String;Lio/elevenlabs/domain/Logger;Ljava/lang/String;)Ljava/lang/String;", "code", "normaliseToAlpha2", "(Ljava/lang/String;)Ljava/lang/String;", "", "alpha3ToAlpha2$delegate", "Lsn/h;", "getAlpha3ToAlpha2", "()Ljava/util/Map;", "alpha3ToAlpha2", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CurrencyUtilsKt {
    private static final h alpha3ToAlpha2$delegate = new o(new d(26));

    public static final Map alpha3ToAlpha2_delegate$lambda$0() {
        Object lVar;
        String[] iSOCountries = Locale.getISOCountries();
        iSOCountries.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : iSOCountries) {
            try {
                lVar = new k(new Locale.Builder().setRegion(str).build().getISO3Country(), str);
            } catch (Throwable th) {
                lVar = new l(th);
            }
            if (lVar instanceof l) {
                lVar = null;
            }
            k kVar = (k) lVar;
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return a0.R(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String deriveStoreCurrencyCode(String str, Logger logger, String str2) {
        Object lVar;
        String normaliseToAlpha2;
        Object currencyCode;
        Throwable a10;
        logger.getClass();
        str2.getClass();
        Object obj = null;
        if (str != null) {
            try {
                normaliseToAlpha2 = normaliseToAlpha2(str);
            } catch (Throwable th) {
                lVar = new l(th);
            }
            if (normaliseToAlpha2 != null) {
                currencyCode = Currency.getInstance(new Locale.Builder().setRegion(normaliseToAlpha2).build()).getCurrencyCode();
                lVar = currencyCode;
                a10 = m.a(lVar);
                if (a10 != null) {
                    logger.logWarning(str2, "Failed to derive currency from country code: " + str, a10);
                }
                if (!(lVar instanceof l)) {
                    obj = lVar;
                }
                return (String) obj;
            }
        }
        currencyCode = null;
        lVar = currencyCode;
        a10 = m.a(lVar);
        if (a10 != null) {
        }
        if (!(lVar instanceof l)) {
        }
        return (String) obj;
    }

    private static final Map<String, String> getAlpha3ToAlpha2() {
        return (Map) alpha3ToAlpha2$delegate.getValue();
    }

    private static final String normaliseToAlpha2(String str) {
        int length = str.length();
        if (length != 2) {
            if (length != 3) {
                return null;
            }
            Map<String, String> alpha3ToAlpha2 = getAlpha3ToAlpha2();
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return alpha3ToAlpha2.get(upperCase);
        }
        String upperCase2 = str.toUpperCase(Locale.ROOT);
        upperCase2.getClass();
        return upperCase2;
    }
}
