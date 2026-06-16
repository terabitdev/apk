package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created;

import ho.l;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.favorites.VoicePickerFavoritesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import t1.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f16373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16374c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f16376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16377f;

    public /* synthetic */ b(float f10, p pVar, l lVar, z zVar, int i10) {
        this.f16372a = 2;
        this.f16373b = f10;
        this.f16374c = pVar;
        this.f16376e = lVar;
        this.f16375d = zVar;
        this.f16377f = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z VoicePickerCreatedScreenUI_Kz89ssw$lambda$2;
        sn.z VoicePickerFavoritesScreenUI_Kz89ssw$lambda$2;
        sn.z PlayerQueueLayout_Kz89ssw$lambda$1;
        switch (this.f16372a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                VoicePickerCreatedScreenUI_Kz89ssw$lambda$2 = VoicePickerCreatedScreenKt.VoicePickerCreatedScreenUI_Kz89ssw$lambda$2(this.f16373b, (VoicesListContract.State) this.f16374c, (VoicePickerSharedContract.State) this.f16375d, this.f16376e, this.f16377f, (m) obj, intValue);
                return VoicePickerCreatedScreenUI_Kz89ssw$lambda$2;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                VoicePickerFavoritesScreenUI_Kz89ssw$lambda$2 = VoicePickerFavoritesScreenKt.VoicePickerFavoritesScreenUI_Kz89ssw$lambda$2(this.f16373b, (VoicesListContract.State) this.f16374c, (VoicePickerSharedContract.State) this.f16375d, this.f16376e, this.f16377f, (m) obj, intValue2);
                return VoicePickerFavoritesScreenUI_Kz89ssw$lambda$2;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                PlayerQueueLayout_Kz89ssw$lambda$1 = PlayerQueueScreenKt.PlayerQueueLayout_Kz89ssw$lambda$1(this.f16373b, (p) this.f16374c, this.f16376e, (z) this.f16375d, this.f16377f, (m) obj, intValue3);
                return PlayerQueueLayout_Kz89ssw$lambda$1;
        }
    }

    public /* synthetic */ b(float f10, VoicesListContract.State state, VoicePickerSharedContract.State state2, l lVar, int i10, int i11) {
        this.f16372a = i11;
        this.f16373b = f10;
        this.f16374c = state;
        this.f16375d = state2;
        this.f16376e = lVar;
        this.f16377f = i10;
    }
}
