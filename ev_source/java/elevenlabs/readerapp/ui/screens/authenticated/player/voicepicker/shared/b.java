package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import ho.l;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ho.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f16509b;

    public /* synthetic */ b(l lVar, int i10) {
        this.f16508a = i10;
        this.f16509b = lVar;
    }

    @Override // ho.a
    public final Object invoke() {
        z VoicePickerSharedDeleteConfirmationDialog$lambda$0$0;
        z VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$0$0;
        switch (this.f16508a) {
            case 0:
                VoicePickerSharedDeleteConfirmationDialog$lambda$0$0 = VoicePickerSharedDeleteConfirmationDialogKt.VoicePickerSharedDeleteConfirmationDialog$lambda$0$0(this.f16509b);
                return VoicePickerSharedDeleteConfirmationDialog$lambda$0$0;
            default:
                VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$0$0 = VoicePickerSharedFavoriteRemoveConfirmationDialogKt.VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$0$0(this.f16509b);
                return VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$0$0;
        }
    }
}
