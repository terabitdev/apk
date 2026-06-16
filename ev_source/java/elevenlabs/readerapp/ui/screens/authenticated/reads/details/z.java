package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import android.content.Context;
import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.ReadDetailsSection;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16904c;

    public /* synthetic */ z(Object obj, Object obj2, int i10) {
        this.f16902a = i10;
        this.f16904c = obj;
        this.f16903b = obj2;
    }

    @Override // ho.a
    public final Object invoke() {
        sn.z ReadDetailsScreen$lambda$7$0$0;
        sn.z ReadDetailsScreen$lambda$7$1$0;
        sn.z ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$5$0$0;
        sn.z PurchaseOrUltraLayout$lambda$0$0$0$0;
        sn.z zVar;
        sn.z playCarouselPreview$lambda$0;
        switch (this.f16902a) {
            case 0:
                ReadDetailsScreen$lambda$7$0$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$7$0$0((ReadDetailsViewModel) this.f16904c, (z0) this.f16903b);
                return ReadDetailsScreen$lambda$7$0$0;
            case 1:
                ReadDetailsScreen$lambda$7$1$0 = ReadDetailsScreenKt.ReadDetailsScreen$lambda$7$1$0((String) this.f16904c, (z0) this.f16903b);
                return ReadDetailsScreen$lambda$7$1$0;
            case 2:
                ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$5$0$0 = ReadDetailsScreenKt.ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$5$0$0((ho.l) this.f16904c, (ReadDetailsSection) this.f16903b);
                return ReadDetailsContent_n2tekjI$lambda$5$0$0$1$0$0$5$0$0;
            case 3:
                PurchaseOrUltraLayout$lambda$0$0$0$0 = ReadDetailsScreenKt.PurchaseOrUltraLayout$lambda$0$0$0$0((Context) this.f16904c, (ho.l) this.f16903b);
                return PurchaseOrUltraLayout$lambda$0$0$0$0;
            case 4:
                zVar = ReadDetailsViewModel.togglePreview$lambda$0((ReadDetailsViewModel) this.f16904c, (String) this.f16903b);
                return zVar;
            default:
                playCarouselPreview$lambda$0 = ReadDetailsViewModel.playCarouselPreview$lambda$0((ReadDetailsViewModel) this.f16904c, (ExploreRead) this.f16903b);
                return playCarouselPreview$lambda$0;
        }
    }
}
