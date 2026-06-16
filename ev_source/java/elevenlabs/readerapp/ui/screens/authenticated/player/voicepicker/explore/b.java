package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.explore;

import ho.p;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16381b;

    public /* synthetic */ b(int i10, int i11) {
        this.f16380a = i11;
        this.f16381b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f16380a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return VoicePickerExploreScreenKt.t(this.f16381b, mVar, intValue);
            case 1:
                return VoicePickerExploreScreenKt.i(this.f16381b, mVar, intValue);
            case 2:
                return VoicePickerExploreScreenKt.b(this.f16381b, mVar, intValue);
            case 3:
                return VoicePickerExploreScreenKt.g(this.f16381b, mVar, intValue);
            case 4:
                return VoicePickerExploreScreenKt.f(this.f16381b, mVar, intValue);
            default:
                return VoicePickerExploreScreenKt.A(this.f16381b, mVar, intValue);
        }
    }
}
