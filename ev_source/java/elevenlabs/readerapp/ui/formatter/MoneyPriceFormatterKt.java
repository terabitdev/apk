package io.elevenlabs.readerapp.ui.formatter;

import android.icu.text.NumberFormat;
import android.icu.util.Currency;
import io.elevenlabs.domain.model.MoneyPrice;
import java.util.Arrays;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.l;
import sn.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u0001*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0006"}, d2 = {"format", "", "Lio/elevenlabs/domain/model/MoneyPrice;", "formatPrice", "", "currencyCode", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class MoneyPriceFormatterKt {
    public static final String format(MoneyPrice moneyPrice) {
        moneyPrice.getClass();
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.getClass();
        currencyInstance.setCurrency(Currency.getInstance(moneyPrice.getCurrency()));
        currencyInstance.setMinimumFractionDigits(0);
        currencyInstance.setMaximumFractionDigits(2);
        String format = currencyInstance.format(Float.valueOf(((float) moneyPrice.getAmount()) / 100.0f));
        format.getClass();
        return format;
    }

    public static final String formatPrice(float f10, String str) {
        Object lVar;
        try {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            if (str != null) {
                currencyInstance.setCurrency(Currency.getInstance(str));
            }
            currencyInstance.setMinimumFractionDigits(2);
            currencyInstance.setMaximumFractionDigits(2);
            lVar = currencyInstance.format(f10);
        } catch (Throwable th) {
            lVar = new l(th);
        }
        if (m.a(lVar) != null) {
            lVar = "$".concat(String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f10)}, 1)));
        }
        return (String) lVar;
    }
}
