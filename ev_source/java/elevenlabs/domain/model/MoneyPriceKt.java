package io.elevenlabs.domain.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import jo.a;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001¨\u0006\b"}, d2 = {"preDiscount", "Lio/elevenlabs/domain/model/MoneyPrice;", FirebaseAnalytics.Param.DISCOUNT, "", "times", "", "percentageOf", "another", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MoneyPriceKt {
    public static final int percentageOf(MoneyPrice moneyPrice, MoneyPrice moneyPrice2) {
        moneyPrice.getClass();
        moneyPrice2.getClass();
        return a.y((((float) moneyPrice.getAmount()) / ((float) moneyPrice2.getAmount())) * 100.0f);
    }

    public static final MoneyPrice preDiscount(MoneyPrice moneyPrice, float f10) {
        moneyPrice.getClass();
        return MoneyPrice.copy$default(moneyPrice, a.z(((float) moneyPrice.getAmount()) / f10), null, 2, null);
    }

    public static final MoneyPrice times(MoneyPrice moneyPrice, float f10) {
        moneyPrice.getClass();
        return MoneyPrice.copy$default(moneyPrice, a.z(((float) moneyPrice.getAmount()) * f10), null, 2, null);
    }

    public static final MoneyPrice times(MoneyPrice moneyPrice, int i10) {
        moneyPrice.getClass();
        return MoneyPrice.copy$default(moneyPrice, moneyPrice.getAmount() * i10, null, 2, null);
    }
}
