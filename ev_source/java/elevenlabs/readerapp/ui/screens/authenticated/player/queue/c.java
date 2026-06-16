package io.elevenlabs.readerapp.ui.screens.authenticated.player.queue;

import ho.l;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.PlayerQueueContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements p {
    public final /* synthetic */ Object Y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16285a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f16286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f16287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sn.d f16290f;

    public /* synthetic */ c(float f10, PlayerQueueContract.UiState uiState, l lVar, p pVar, l lVar2, int i10) {
        this.f16286b = f10;
        this.f16289e = uiState;
        this.f16287c = lVar;
        this.Y = pVar;
        this.f16290f = lVar2;
        this.f16288d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z PlayerQueueUI_AjpBEmI$lambda$9;
        z VoicePickerRecentsScreenUI_AjpBEmI$lambda$2;
        switch (this.f16285a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PlayerQueueUI_AjpBEmI$lambda$9 = PlayerQueueScreenKt.PlayerQueueUI_AjpBEmI$lambda$9(this.f16286b, (PlayerQueueContract.UiState) this.f16289e, this.f16287c, (p) this.Y, (l) this.f16290f, this.f16288d, (m) obj, intValue);
                return PlayerQueueUI_AjpBEmI$lambda$9;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                VoicePickerRecentsScreenUI_AjpBEmI$lambda$2 = VoicePickerRecentsScreenKt.VoicePickerRecentsScreenUI_AjpBEmI$lambda$2(this.f16286b, (VoicesListContract.State) this.f16289e, (ho.a) this.f16290f, (VoicePickerSharedContract.State) this.Y, this.f16287c, this.f16288d, (m) obj, intValue2);
                return VoicePickerRecentsScreenUI_AjpBEmI$lambda$2;
        }
    }

    public /* synthetic */ c(float f10, VoicesListContract.State state, ho.a aVar, VoicePickerSharedContract.State state2, l lVar, int i10) {
        this.f16286b = f10;
        this.f16289e = state;
        this.f16290f = aVar;
        this.Y = state2;
        this.f16287c = lVar;
        this.f16288d = i10;
    }
}
