package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import ho.l;
import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoicePickerSharedContract.State f16514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f16515c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16516d;

    public /* synthetic */ d(VoicePickerSharedContract.State state, l lVar, int i10, int i11) {
        this.f16513a = i11;
        this.f16514b = state;
        this.f16515c = lVar;
        this.f16516d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z VoicePickerSharedDeleteConfirmationDialog$lambda$2;
        z VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$2;
        int i10 = this.f16513a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                VoicePickerSharedDeleteConfirmationDialog$lambda$2 = VoicePickerSharedDeleteConfirmationDialogKt.VoicePickerSharedDeleteConfirmationDialog$lambda$2(this.f16514b, this.f16515c, this.f16516d, mVar, intValue);
                return VoicePickerSharedDeleteConfirmationDialog$lambda$2;
            default:
                VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$2 = VoicePickerSharedFavoriteRemoveConfirmationDialogKt.VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$2(this.f16514b, this.f16515c, this.f16516d, mVar, intValue);
                return VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$2;
        }
    }
}
