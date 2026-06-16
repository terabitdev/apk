package io.elevenlabs.readerapp.core;

import io.elevenlabs.readerapp.core.MviViewModel;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14356a;

    public /* synthetic */ f(int i10) {
        this.f14356a = i10;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f14356a) {
            case 0:
                return MviViewModel.AnonymousClass2.d();
            case 1:
                return MviViewModel$queueStateUpdate$2.d();
            case 2:
                return MessageBottomSheetOverlayKt.a();
            case 3:
                return MviViewModel.b();
            case 4:
                return MviViewModel.a();
            case 5:
                return SurveySheetKt.o();
            default:
                return SurveySheetKt.c();
        }
    }
}
