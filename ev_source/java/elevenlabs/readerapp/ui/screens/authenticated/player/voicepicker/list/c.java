package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list;

import ho.l;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListBaseViewModel$handleObserveVoices$1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListBaseViewModel$handleSyncVoices$1;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicesListContract;
import java.util.List;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16426b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f16425a = i10;
        this.f16426b = obj;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        switch (this.f16425a) {
            case 0:
                return VoicesListBaseViewModel$handleObserveVoices$1.AnonymousClass2.a((List) this.f16426b, (VoicesListContract.State) obj);
            default:
                return VoicesListBaseViewModel$handleSyncVoices$1.AnonymousClass3.a((SyncStatus) this.f16426b, (VoicesListContract.State) obj);
        }
    }
}
