package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetControl f16180b;

    public /* synthetic */ h(BottomSheetControl bottomSheetControl, int i10) {
        this.f16179a = i10;
        this.f16180b = bottomSheetControl;
    }

    @Override // ho.a
    public final Object invoke() {
        switch (this.f16179a) {
            case 0:
                return ComposableSingletons$PlayerPreferencesScreenKt.r(this.f16180b);
            default:
                return PlayerPronunciationsKt.c(this.f16180b);
        }
    }
}
