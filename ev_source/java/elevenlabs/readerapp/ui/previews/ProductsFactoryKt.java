package io.elevenlabs.readerapp.ui.previews;

import ig.f;
import io.elevenlabs.domain.model.FreeTrialDuration;
import io.elevenlabs.domain.model.MoneyPrice;
import io.elevenlabs.domain.model.OneTimeCreditsProduct;
import io.elevenlabs.domain.model.OneTimeProductsPage;
import io.elevenlabs.domain.model.SubscriptionPeriod;
import io.elevenlabs.domain.model.SubscriptionProduct;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "stubOneTimeCreditsProduct", "()Lio/elevenlabs/domain/model/OneTimeCreditsProduct;", "Lio/elevenlabs/domain/model/OneTimeProductsPage;", "stubOneTimeProductsPage", "(Lu2/m;I)Lio/elevenlabs/domain/model/OneTimeProductsPage;", "", "stubOneTimeCreditsProductsList", "()Ljava/util/List;", "Lio/elevenlabs/domain/model/SubscriptionProduct;", "stubSubscriptionProduct", "()Lio/elevenlabs/domain/model/SubscriptionProduct;", "stubSubscriptionProductList", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ProductsFactoryKt {
    public static final OneTimeCreditsProduct stubOneTimeCreditsProduct() {
        return new OneTimeCreditsProduct("tier_2", "20 hours", "5% more hours", new MoneyPrice(400L, "USD"));
    }

    public static final List<OneTimeCreditsProduct> stubOneTimeCreditsProductsList() {
        return f.I(new OneTimeCreditsProduct("tier_2", "20 hours", null, new MoneyPrice(800L, "USD")), new OneTimeCreditsProduct("tier_3", "65 hours", "10% more hours", new MoneyPrice(1900L, "USD")));
    }

    public static final OneTimeProductsPage stubOneTimeProductsPage(m mVar, int i10) {
        return new OneTimeProductsPage(60L, stubOneTimeCreditsProductsList(), stubSubscriptionProductList(), "Title", "Subtitle");
    }

    public static final SubscriptionProduct stubSubscriptionProduct() {
        return new SubscriptionProduct("id", "Ultra Yearly", null, "MOST POPULAR", SubscriptionPeriod.ANNUAL, new MoneyPrice(1900L, "USD"), new MoneyPrice(19000L, "USD"), new FreeTrialDuration.Days(3));
    }

    public static final List<SubscriptionProduct> stubSubscriptionProductList() {
        return f.H(new SubscriptionProduct("id", "Unlimited 24/7", "Your best value — Ultra plan", "MOST POPULAR", SubscriptionPeriod.ANNUAL, new MoneyPrice(1900L, "USD"), new MoneyPrice(19000L, "USD"), new FreeTrialDuration.Days(3)));
    }
}
