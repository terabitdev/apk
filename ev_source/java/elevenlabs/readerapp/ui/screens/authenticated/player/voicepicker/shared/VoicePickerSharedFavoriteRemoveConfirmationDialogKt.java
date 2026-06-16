package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared;

import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "Lsn/z;", "onSharedEvent", "VoicePickerSharedFavoriteRemoveConfirmationDialog", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Lu2/m;I)V", "Preview_VoicePickerSharedFavoriteRemoveConfirmationDialog", "(Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerSharedFavoriteRemoveConfirmationDialogKt {
    public static final void Preview_VoicePickerSharedFavoriteRemoveConfirmationDialog(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1002057356);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, new VoicePickerSharedContract.RemoveFavoriteConfirmationDialogState.Shown(VoicesFactoryKt.stubVoice()), null, null, false, 7679, null);
            Object L = qVar.L();
            if (L == l.f33918a) {
                L = new j(2);
                qVar.h0(L);
            }
            VoicePickerSharedFavoriteRemoveConfirmationDialog(state, (ho.l) L, qVar, 48);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.filter.e(i10, 27);
        }
    }

    public static final z Preview_VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$0$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$1(int i10, m mVar, int i11) {
        Preview_VoicePickerSharedFavoriteRemoveConfirmationDialog(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void VoicePickerSharedFavoriteRemoveConfirmationDialog(VoicePickerSharedContract.State state, ho.l lVar, m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        state.getClass();
        lVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(524317139);
        if ((i10 & 6) == 0) {
            if (qVar.h(state)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        boolean z11 = true;
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            VoicePickerSharedContract.RemoveFavoriteConfirmationDialogState favoritesRemoveConfirmationState = state.getFavoritesRemoveConfirmationState();
            if (favoritesRemoveConfirmationState instanceof VoicePickerSharedContract.RemoveFavoriteConfirmationDialogState.Shown) {
                qVar.X(-863873597);
                int i14 = i11 & 112;
                if (i14 == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar.L();
                u2.e eVar = l.f33918a;
                if (z10 || L == eVar) {
                    L = new b(lVar, 1);
                    qVar.h0(L);
                }
                ho.a aVar = (ho.a) L;
                if (i14 != 32) {
                    z11 = false;
                }
                boolean h10 = qVar.h(favoritesRemoveConfirmationState) | z11;
                Object L2 = qVar.L();
                if (h10 || L2 == eVar) {
                    L2 = new c(lVar, (VoicePickerSharedContract.RemoveFavoriteConfirmationDialogState.Shown) favoritesRemoveConfirmationState, 1);
                    qVar.h0(L2);
                }
                ConfirmationDialogKt.ConfirmationDialog(aVar, (ho.a) L2, null, kj.c.Q(R.string.remove_voice_from_favorites_confirmation_title, new Object[]{((VoicePickerSharedContract.RemoveFavoriteConfirmationDialogState.Shown) favoritesRemoveConfirmationState).getVoice().getName()}, qVar), kj.c.R(qVar, R.string.common_dismiss), kj.c.R(qVar, R.string.remove_voice_from_favorites_confirmation_action_short), false, qVar, 1572864, 4);
                qVar.p(false);
            } else if (kotlin.jvm.internal.m.c(favoritesRemoveConfirmationState, VoicePickerSharedContract.RemoveFavoriteConfirmationDialogState.Hidden.INSTANCE)) {
                qVar.X(-863097171);
                qVar.p(false);
            } else {
                throw com.google.android.gms.internal.play_billing.b.h(1357602219, qVar, false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new d(state, lVar, i10, 1);
        }
    }

    public static final z VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$0$0(ho.l lVar) {
        lVar.invoke(VoicePickerSharedContract.Event.DismissRemoveFavoriteConfirmation.INSTANCE);
        return z.f31622a;
    }

    public static final z VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$1$0(ho.l lVar, VoicePickerSharedContract.RemoveFavoriteConfirmationDialogState removeFavoriteConfirmationDialogState) {
        lVar.invoke(new VoicePickerSharedContract.Event.RemoveFavorite(((VoicePickerSharedContract.RemoveFavoriteConfirmationDialogState.Shown) removeFavoriteConfirmationDialogState).getVoice().getVoiceId()));
        return z.f31622a;
    }

    public static final z VoicePickerSharedFavoriteRemoveConfirmationDialog$lambda$2(VoicePickerSharedContract.State state, ho.l lVar, int i10, m mVar, int i11) {
        VoicePickerSharedFavoriteRemoveConfirmationDialog(state, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
