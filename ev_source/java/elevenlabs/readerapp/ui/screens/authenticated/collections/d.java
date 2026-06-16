package io.elevenlabs.readerapp.ui.screens.authenticated.collections;

import io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.components.UsageCategoryCardKt;
import io.elevenlabs.ui.components.HintKt;
import io.elevenlabs.ui.components.VideoPlayerKt;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ho.p f15293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15294c;

    public /* synthetic */ d(int i10, int i11, ho.p pVar) {
        this.f15292a = i11;
        this.f15293b = pVar;
        this.f15294c = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z CenteredPlaceholder$lambda$1;
        int i10 = this.f15292a;
        u2.m mVar = (u2.m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                CenteredPlaceholder$lambda$1 = AddReadToCollectionScreenKt.CenteredPlaceholder$lambda$1(this.f15293b, this.f15294c, mVar, intValue);
                return CenteredPlaceholder$lambda$1;
            case 1:
                return HintKt.b(this.f15293b, this.f15294c, mVar, intValue);
            case 2:
                return VideoPlayerKt.c(this.f15293b, this.f15294c, mVar, intValue);
            case 3:
                return VideoPlayerKt.f(this.f15293b, this.f15294c, mVar, intValue);
            default:
                return UsageCategoryCardKt.h(this.f15293b, this.f15294c, mVar, intValue);
        }
    }
}
