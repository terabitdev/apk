package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import ho.p;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16507a;

    public /* synthetic */ a(int i10) {
        this.f16507a = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f16507a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ComposableSingletons$PreviewVoicePickerSharedDeleteConfirmationDialogDefaultGroupPreviewVoicePickerSharedDeleteConfirmationDialog1Kt.a(mVar, intValue);
            case 1:
                return ComposableSingletons$PreviewVoicePickerSharedDeleteConfirmationDialogDefaultGroupPreviewVoicePickerSharedDeleteConfirmationDialogKt.a(mVar, intValue);
            case 2:
                return ComposableSingletons$PreviewVoicePickerSharedFavoriteRemoveConfirmationDialogDefaultGroupPreviewVoicePickerSharedFavoriteRemoveConfirmationDialog1Kt.a(mVar, intValue);
            default:
                return ComposableSingletons$PreviewVoicePickerSharedFavoriteRemoveConfirmationDialogDefaultGroupPreviewVoicePickerSharedFavoriteRemoveConfirmationDialogKt.a(mVar, intValue);
        }
    }
}
