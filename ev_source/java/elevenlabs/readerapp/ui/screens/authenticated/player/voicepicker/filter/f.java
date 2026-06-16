package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import ho.l;
import io.elevenlabs.ui.extensions.LazyListExtensionsKt;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16411b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f16410a = i10;
        this.f16411b = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$5$0$0;
        boolean reachedEnd$default;
        switch (this.f16410a) {
            case 0:
                VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$5$0$0 = VoicePickerFilteredListScreenKt.VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$5$0$0((l) this.f16411b);
                return VoicePickerFilteredListScreenUI_PBTpf3Q$lambda$5$0$0;
            default:
                reachedEnd$default = LazyListExtensionsKt.reachedEnd$default((t1.z) this.f16411b, 0, 1, null);
                return Boolean.valueOf(reachedEnd$default);
        }
    }
}
