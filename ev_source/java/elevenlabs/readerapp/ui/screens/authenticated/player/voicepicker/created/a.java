package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.created;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.favorites.VoicePickerFavoritesScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import sn.z;
import t1.t;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoicesListContract.State f16369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VoicePickerSharedContract.State f16370c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f16371d;

    public /* synthetic */ a(VoicesListContract.State state, l lVar, VoicePickerSharedContract.State state2) {
        this.f16368a = 0;
        this.f16369b = state;
        this.f16371d = lVar;
        this.f16370c = state2;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z VoicePickerCreatedScreenUI_Kz89ssw$lambda$0$0;
        z VoicePickerFavoritesScreenUI_Kz89ssw$lambda$0$0;
        z VoicePickerRecentsScreenUI_AjpBEmI$lambda$0$0;
        switch (this.f16368a) {
            case 0:
                VoicePickerCreatedScreenUI_Kz89ssw$lambda$0$0 = VoicePickerCreatedScreenKt.VoicePickerCreatedScreenUI_Kz89ssw$lambda$0$0(this.f16369b, this.f16371d, this.f16370c, (t) obj);
                return VoicePickerCreatedScreenUI_Kz89ssw$lambda$0$0;
            case 1:
                VoicePickerFavoritesScreenUI_Kz89ssw$lambda$0$0 = VoicePickerFavoritesScreenKt.VoicePickerFavoritesScreenUI_Kz89ssw$lambda$0$0(this.f16369b, this.f16370c, this.f16371d, (t) obj);
                return VoicePickerFavoritesScreenUI_Kz89ssw$lambda$0$0;
            default:
                VoicePickerRecentsScreenUI_AjpBEmI$lambda$0$0 = VoicePickerRecentsScreenKt.VoicePickerRecentsScreenUI_AjpBEmI$lambda$0$0(this.f16369b, this.f16370c, this.f16371d, (t) obj);
                return VoicePickerRecentsScreenUI_AjpBEmI$lambda$0$0;
        }
    }

    public /* synthetic */ a(VoicesListContract.State state, VoicePickerSharedContract.State state2, l lVar, int i10) {
        this.f16368a = i10;
        this.f16369b = state;
        this.f16370c = state2;
        this.f16371d = lVar;
    }
}
