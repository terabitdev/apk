package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import ho.l;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f16511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16512c;

    public /* synthetic */ c(l lVar, Object obj, int i10) {
        this.f16510a = i10;
        this.f16511b = lVar;
        this.f16512c = obj;
    }

    @Override // ho.a
    public final Object invoke() {
        z VoicePickerSharedDeleteConfirmationDialog$lambda$1$0;
        z VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$1$0;
        switch (this.f16510a) {
            case 0:
                VoicePickerSharedDeleteConfirmationDialog$lambda$1$0 = VoicePickerSharedDeleteConfirmationDialogKt.VoicePickerSharedDeleteConfirmationDialog$lambda$1$0(this.f16511b, (VoicePickerSharedContract.DeleteVoiceConfirmationDialogState.Shown) this.f16512c);
                return VoicePickerSharedDeleteConfirmationDialog$lambda$1$0;
            default:
                VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$1$0 = VoicePickerSharedFavoriteRemoveConfirmationDialogKt.VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$1$0(this.f16511b, (VoicePickerSharedContract.RemoveFavoriteConfirmationDialogState.Shown) this.f16512c);
                return VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$1$0;
        }
    }
}
