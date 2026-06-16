package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter;

import ho.p;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.recents.VoicePickerRecentsScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerTabsKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.search.VoicePickerSearchListScreenKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerDesignVoiceSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerSectionsListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedDeleteConfirmationDialogKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedFavoriteRemoveConfirmationDialogKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationScreenKt;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16409b;

    public /* synthetic */ e(int i10, int i11) {
        this.f16408a = i11;
        this.f16409b = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z Preview_VoicePicker$lambda$3;
        int i10 = this.f16408a;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return VoicePickerFilteredListScreenKt.r(this.f16409b, mVar, intValue);
            case 1:
                return VoicePickerFilteredListScreenKt.i(this.f16409b, mVar, intValue);
            case 2:
                return VoicePickerFilteredListScreenKt.q(this.f16409b, mVar, intValue);
            case 3:
                return VoicePickerFilteredListScreenKt.o(this.f16409b, mVar, intValue);
            case 4:
                return VoicePickerRecentsScreenKt.o(this.f16409b, mVar, intValue);
            case 5:
                return VoicePickerRecentsScreenKt.n(this.f16409b, mVar, intValue);
            case 6:
                return VoicePickerRecentsScreenKt.h(this.f16409b, mVar, intValue);
            case 7:
                return VoicePickerRecentsScreenKt.q(this.f16409b, mVar, intValue);
            case 8:
                return VoicePickerRecentsScreenKt.k(this.f16409b, mVar, intValue);
            case 9:
                return VoicePickerHeaderKt.l(this.f16409b, mVar, intValue);
            case 10:
                return VoicePickerHeaderKt.a(this.f16409b, mVar, intValue);
            case 11:
                return VoicePickerHeaderKt.E(this.f16409b, mVar, intValue);
            case 12:
                return VoicePickerHeaderKt.I(this.f16409b, mVar, intValue);
            case 13:
                return VoicePickerHeaderKt.e(this.f16409b, mVar, intValue);
            case 14:
                return VoicePickerHeaderKt.c(this.f16409b, mVar, intValue);
            case 15:
                return VoicePickerHeaderKt.t(this.f16409b, mVar, intValue);
            case 16:
                return VoicePickerHeaderKt.j(this.f16409b, mVar, intValue);
            case 17:
                return VoicePickerHeaderKt.K(this.f16409b, mVar, intValue);
            case 18:
                Preview_VoicePicker$lambda$3 = VoicePickerScreenKt.Preview_VoicePicker$lambda$3(this.f16409b, mVar, intValue);
                return Preview_VoicePicker$lambda$3;
            case 19:
                return VoicePickerTabsKt.b(this.f16409b, mVar, intValue);
            case 20:
                return VoicePickerSearchListScreenKt.k(this.f16409b, mVar, intValue);
            case 21:
                return VoicePickerSearchListScreenKt.l(this.f16409b, mVar, intValue);
            case 22:
                return VoicePickerSearchListScreenKt.g(this.f16409b, mVar, intValue);
            case 23:
                return VoicePickerDesignVoiceSectionKt.b(this.f16409b, mVar, intValue);
            case 24:
                return VoicePickerSectionsListKt.b(this.f16409b, mVar, intValue);
            case 25:
                return VoicePickerSectionsListKt.h(this.f16409b, mVar, intValue);
            case 26:
                return VoicePickerSharedDeleteConfirmationDialogKt.a(this.f16409b, mVar, intValue);
            case 27:
                return VoicePickerSharedFavoriteRemoveConfirmationDialogKt.a(this.f16409b, mVar, intValue);
            case 28:
                return PronunciationScreenKt.e(this.f16409b, mVar, intValue);
            default:
                return PronunciationScreenKt.m(this.f16409b, mVar, intValue);
        }
    }
}
