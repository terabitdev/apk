package io.elevenlabs.payments.di;

import android.content.Context;
import androidx.room.m0;
import com.revenuecat.purchases.Purchases;
import io.elevenlabs.domain.Configuration;
import ul.c;
import ul.f;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class PaymentsModule_ProvideRevenueCatPaymentsFactory implements c {
    private final f configurationProvider;
    private final f contextProvider;

    private PaymentsModule_ProvideRevenueCatPaymentsFactory(f fVar, f fVar2) {
        this.configurationProvider = fVar;
        this.contextProvider = fVar2;
    }

    public static PaymentsModule_ProvideRevenueCatPaymentsFactory create(f fVar, f fVar2) {
        return new PaymentsModule_ProvideRevenueCatPaymentsFactory(fVar, fVar2);
    }

    public static Purchases provideRevenueCatPayments(Configuration configuration, Context context) {
        Purchases provideRevenueCatPayments = PaymentsModule.INSTANCE.provideRevenueCatPayments(configuration, context);
        m0.n(provideRevenueCatPayments);
        return provideRevenueCatPayments;
    }

    @Override // rn.a
    public Purchases get() {
        return provideRevenueCatPayments((Configuration) this.configurationProvider.get(), (Context) this.contextProvider.get());
    }
}
