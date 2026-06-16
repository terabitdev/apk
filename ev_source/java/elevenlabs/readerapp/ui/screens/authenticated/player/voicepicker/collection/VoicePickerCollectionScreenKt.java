package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection;

import a2.o0;
import androidx.room.m0;
import c3.j;
import c3.k;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f2.i;
import f4.f1;
import h4.h;
import i3.t;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCollection;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionState;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.VoicePickerVoiceRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.sections.VoicePickerSectionsListKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedFavoriteRemoveConfirmationDialogKt;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import oo.g;
import pl.f;
import q2.k5;
import r1.c3;
import r1.d2;
import r1.l2;
import r1.p;
import r1.p2;
import r1.u0;
import r1.z1;
import rd.c1;
import sn.z;
import t2.u;
import tn.o;
import u2.h0;
import u2.i0;
import u2.l;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aA\u0010\u0010\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0015\u0010\u0013¨\u0006\u0016²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionRoute;", "route", "Lkotlin/Function0;", "Lsn/z;", "navigateBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionViewModel;", "viewModel", "VoicePickerCollectionScreen", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionRoute;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "onSharedEvent", "VoicePickerCollectionScreenUI", "(Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/collection/VoicePickerCollectionState;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Lu2/m;I)V", "Preview_VoiceCollectionScreen_Loading", "(Lu2/m;I)V", "Preview_VoiceCollectionScreen_Error", "Preview_VoiceCollectionScreen_Data", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerCollectionScreenKt {
    public static final void Preview_VoiceCollectionScreen_Data(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1742965552);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            List<Voice> stubVoicesList = VoicesFactoryKt.stubVoicesList();
            VoicePickerCollectionState.Data data = new VoicePickerCollectionState.Data(new VoiceCollection("1", "Sci-fi Essentials", "", ""), stubVoicesList);
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(new VoicePickerMode.VoicePicker(""), null, null, ((Voice) o.w0(stubVoicesList)).getVoiceId(), ((Voice) o.w0(stubVoicesList)).getVoiceId(), false, null, false, null, null, null, null, false, 8166, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new c(0);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new e(3);
                qVar.h0(L2);
            }
            VoicePickerCollectionScreenUI(aVar, data, state, (ho.l) L2, qVar, 3078);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 18);
        }
    }

    public static final z Preview_VoiceCollectionScreen_Data$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceCollectionScreen_Data$lambda$2(int i10, m mVar, int i11) {
        Preview_VoiceCollectionScreen_Data(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceCollectionScreen_Error(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1913660030);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerCollectionState.Error error = VoicePickerCollectionState.Error.INSTANCE;
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new c(1);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new e(4);
                qVar.h0(L2);
            }
            VoicePickerCollectionScreenUI(aVar, error, state, (ho.l) L2, qVar, 3126);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 19);
        }
    }

    public static final z Preview_VoiceCollectionScreen_Error$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceCollectionScreen_Error$lambda$2(int i10, m mVar, int i11) {
        Preview_VoiceCollectionScreen_Error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceCollectionScreen_Loading(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(547483854);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            VoicePickerCollectionState.Loading loading = VoicePickerCollectionState.Loading.INSTANCE;
            VoicePickerSharedContract.State state = new VoicePickerSharedContract.State(null, null, null, null, null, false, null, false, null, null, null, null, false, 8191, null);
            Object L = qVar.L();
            u2.e eVar = l.f33918a;
            if (L == eVar) {
                L = new c(2);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new e(2);
                qVar.h0(L2);
            }
            VoicePickerCollectionScreenUI(aVar, loading, state, (ho.l) L2, qVar, 3126);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 17);
        }
    }

    public static final z Preview_VoiceCollectionScreen_Loading$lambda$1$0(VoicePickerSharedContract.Event event) {
        event.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceCollectionScreen_Loading$lambda$2(int i10, m mVar, int i11) {
        Preview_VoiceCollectionScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        if ((r17 & 4) != 0) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoicePickerCollectionScreen(VoicePickerCollectionRoute voicePickerCollectionRoute, ho.a aVar, VoicePickerCollectionViewModel voicePickerCollectionViewModel, m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        q7.e f02;
        int i13;
        int i14;
        int i15;
        voicePickerCollectionRoute.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(923304329);
        if ((i10 & 6) == 0) {
            if (qVar.f(voicePickerCollectionRoute)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0 && qVar.h(voicePickerCollectionViewModel)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        boolean z10 = true;
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            int i16 = i10 & 1;
            u2.e eVar = l.f33918a;
            if (i16 != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 4) != 0) {
                    if ((i12 & 14) != 4) {
                        z10 = false;
                    }
                    Object L = qVar.L();
                    if (z10 || L == eVar) {
                        L = new d(voicePickerCollectionRoute, 2);
                        qVar.h0(L);
                    }
                    ho.l lVar = (ho.l) L;
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            f02 = m0.f0(((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras(), lVar);
                        } else {
                            f02 = m0.f0(q7.a.f28123b, lVar);
                        }
                        voicePickerCollectionViewModel = (VoicePickerCollectionViewModel) gg.b.j0(e0.f20562a.b(VoicePickerCollectionViewModel.class), a10, null, o6, f02, qVar);
                        i12 &= -897;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                z0 m10 = c1.m(voicePickerCollectionViewModel.getStateFlow(), qVar, 0);
                z0 m11 = c1.m(voicePickerCollectionViewModel.getSharedState(), qVar, 0);
                boolean h10 = qVar.h(voicePickerCollectionViewModel);
                Object L2 = qVar.L();
                if (h10 || L2 == eVar) {
                    L2 = new d(voicePickerCollectionViewModel, 3);
                    qVar.h0(L2);
                }
                r.c(z.f31622a, (ho.l) L2, qVar);
                VoicePickerCollectionState VoicePickerCollectionScreen$lambda$1 = VoicePickerCollectionScreen$lambda$1(m10);
                VoicePickerSharedContract.State VoicePickerCollectionScreen$lambda$2 = VoicePickerCollectionScreen$lambda$2(m11);
                boolean h11 = qVar.h(voicePickerCollectionViewModel);
                Object L3 = qVar.L();
                if (h11 || L3 == eVar) {
                    L3 = new VoicePickerCollectionScreenKt$VoicePickerCollectionScreen$3$1(voicePickerCollectionViewModel);
                    qVar.h0(L3);
                }
                VoicePickerCollectionScreenUI(aVar, VoicePickerCollectionScreen$lambda$1, VoicePickerCollectionScreen$lambda$2, (ho.l) ((g) L3), qVar, (i12 >> 3) & 14);
                qVar = qVar;
            }
        } else {
            qVar.R();
        }
        VoicePickerCollectionViewModel voicePickerCollectionViewModel2 = voicePickerCollectionViewModel;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(voicePickerCollectionRoute, aVar, voicePickerCollectionViewModel2, i10, i11, 8);
        }
    }

    public static final VoicePickerCollectionViewModel VoicePickerCollectionScreen$lambda$0$0(VoicePickerCollectionRoute voicePickerCollectionRoute, VoicePickerCollectionViewModel.Factory factory) {
        factory.getClass();
        return factory.create(voicePickerCollectionRoute);
    }

    private static final VoicePickerCollectionState VoicePickerCollectionScreen$lambda$1(s2 s2Var) {
        return (VoicePickerCollectionState) s2Var.getValue();
    }

    private static final VoicePickerSharedContract.State VoicePickerCollectionScreen$lambda$2(s2 s2Var) {
        return (VoicePickerSharedContract.State) s2Var.getValue();
    }

    public static final h0 VoicePickerCollectionScreen$lambda$3$0(final VoicePickerCollectionViewModel voicePickerCollectionViewModel, i0 i0Var) {
        i0Var.getClass();
        return new h0() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionScreenKt$VoicePickerCollectionScreen$lambda$3$0$$inlined$onDispose$1
            @Override // u2.h0
            public void dispose() {
                VoicePickerCollectionViewModel.this.onSharedEvent(VoicePickerSharedContract.Event.CancelVoicePreview.INSTANCE);
            }
        };
    }

    public static final z VoicePickerCollectionScreen$lambda$5(VoicePickerCollectionRoute voicePickerCollectionRoute, ho.a aVar, VoicePickerCollectionViewModel voicePickerCollectionViewModel, int i10, int i11, m mVar, int i12) {
        VoicePickerCollectionScreen(voicePickerCollectionRoute, aVar, voicePickerCollectionViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void VoicePickerCollectionScreenUI(ho.a aVar, VoicePickerCollectionState voicePickerCollectionState, VoicePickerSharedContract.State state, ho.l lVar, m mVar, int i10) {
        int i11;
        boolean z6;
        q qVar;
        int i12;
        int i13;
        boolean h10;
        int i14;
        int i15;
        aVar.getClass();
        voicePickerCollectionState.getClass();
        state.getClass();
        lVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-1258918325);
        if ((i10 & 6) == 0) {
            if (qVar2.h(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = qVar2.f(voicePickerCollectionState);
            } else {
                h10 = qVar2.h(voicePickerCollectionState);
            }
            if (h10) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(state)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(lVar)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            int i16 = i11;
            k5.a(null, k.d(-172762617, true, new i(voicePickerCollectionState, aVar, 8), qVar2), null, null, null, 0, 0L, 0L, u0.e(qVar2).f29154l, k.d(-2027953508, true, new fm.o(voicePickerCollectionState, state, lVar, 17), qVar2), qVar2, 805306416, 253);
            qVar = qVar2;
            VoicePickerSharedFavoriteRemoveConfirmationDialogKt.VoicePickerSharedFavoriteRemoveConfirmationDialog(state, lVar, qVar, (i16 >> 6) & 126);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.d(aVar, voicePickerCollectionState, state, lVar, i10, 6);
        }
    }

    public static final z VoicePickerCollectionScreenUI$lambda$0(VoicePickerCollectionState voicePickerCollectionState, final ho.a aVar, m mVar, int i10) {
        boolean z6;
        String str;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (voicePickerCollectionState instanceof VoicePickerCollectionState.Data) {
                str = ((VoicePickerCollectionState.Data) voicePickerCollectionState).getCollection().getTitle();
            } else {
                if (!(voicePickerCollectionState instanceof VoicePickerCollectionState.Error) && !(voicePickerCollectionState instanceof VoicePickerCollectionState.NotFound) && !(voicePickerCollectionState instanceof VoicePickerCollectionState.Loading)) {
                    c6.p();
                    return null;
                }
                str = "";
            }
            HeaderActionsKt.HeaderActions((t) null, str, k.d(1814790220, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.b
                @Override // ho.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    z VoicePickerCollectionScreenUI$lambda$0$0;
                    int intValue = ((Integer) obj3).intValue();
                    VoicePickerCollectionScreenUI$lambda$0$0 = VoicePickerCollectionScreenKt.VoicePickerCollectionScreenUI$lambda$0$0(ho.a.this, (l2) obj, (m) obj2, intValue);
                    return VoicePickerCollectionScreenUI$lambda$0$0;
                }
            }, qVar), (ho.q) null, (i3.f) null, qVar, 384, 25);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoicePickerCollectionScreenUI$lambda$0$0(ho.a aVar, l2 l2Var, m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonWithBackgroundKt.BackButtonWithBackground(aVar, u.P, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoicePickerCollectionScreenUI$lambda$1(VoicePickerCollectionState voicePickerCollectionState, VoicePickerSharedContract.State state, ho.l lVar, z1 z1Var, m mVar, int i10) {
        int i11;
        boolean z6;
        q qVar;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(z1Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar2 = (q) mVar;
        if (qVar2.O(i11 & 1, z6)) {
            i3.q qVar3 = i3.q.f13017a;
            t D = r1.d.D(p2.d(qVar3, 1.0f), z1Var);
            f1 d10 = p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            t c5 = i3.a.c(D, qVar2);
            h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(h4.g.f11907f, d10, qVar2);
            r.J(h4.g.f11906e, l4, qVar2);
            r.y(qVar2, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar2);
            r.J(h4.g.f11905d, c5, qVar2);
            if (voicePickerCollectionState instanceof VoicePickerCollectionState.Data) {
                qVar2.X(51263520);
                d2 f10 = r1.d.f(u.P, u.P, u.P, ElevenLabsTheme.INSTANCE.getSpacings(qVar2, ElevenLabsTheme.$stable).m2355getX3D9Ej5fM(), 7);
                t d11 = p2.d(qVar3, 1.0f);
                boolean h10 = qVar2.h(voicePickerCollectionState) | qVar2.h(state) | qVar2.f(lVar);
                Object L = qVar2.L();
                if (h10 || L == l.f33918a) {
                    L = new o0((VoicePickerCollectionState.Data) voicePickerCollectionState, state, lVar, 28);
                    qVar2.h0(L);
                }
                c1.c(d11, null, f10, false, null, null, null, false, null, (ho.l) L, qVar2, 6, 506);
                qVar = qVar2;
                qVar.p(false);
            } else {
                qVar = qVar2;
                if (voicePickerCollectionState instanceof VoicePickerCollectionState.NotFound) {
                    qVar.X(51929896);
                    ErrorScreenKt.m1836ErrorScreenV9fs2A(null, null, kj.c.R(qVar, R.string.collection_not_found), null, null, 0L, qVar, 0, 59);
                    qVar.p(false);
                } else if (voicePickerCollectionState instanceof VoicePickerCollectionState.Error) {
                    qVar.X(52134155);
                    ErrorScreenKt.m1836ErrorScreenV9fs2A(null, null, null, null, null, 0L, qVar, 0, 63);
                    qVar.p(false);
                } else if (voicePickerCollectionState instanceof VoicePickerCollectionState.Loading) {
                    qVar.X(52246127);
                    VoicePickerSectionsListKt.VoicePickerSectionsLoadingList(8, qVar, 6);
                    qVar.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(140198295, qVar, false);
                }
            }
            qVar.p(true);
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final z VoicePickerCollectionScreenUI$lambda$1$0$0$0(VoicePickerCollectionState voicePickerCollectionState, final VoicePickerSharedContract.State state, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        final List<Voice> voices = ((VoicePickerCollectionState.Data) voicePickerCollectionState).getVoices();
        ((t1.i) tVar).u(voices.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionScreenKt$VoicePickerCollectionScreenUI$lambda$1$0$0$0$$inlined$itemsIndexed$default$2
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                voices.get(i10);
                return null;
            }
        }, new j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.collection.VoicePickerCollectionScreenKt$VoicePickerCollectionScreenUI$lambda$1$0$0$0$$inlined$itemsIndexed$default$3
            public final void invoke(t1.b bVar, int i10, m mVar, int i11) {
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((q) mVar).d(i10)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                q qVar = (q) mVar;
                if (qVar.O(i12 & 1, z6)) {
                    Voice voice = (Voice) voices.get(i10);
                    qVar.X(-1077333033);
                    VoicePickerVoiceRowKt.VoicePickerVoiceRow(voice, state, lVar, false, false, qVar, 0, 24);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, 2039820996));
        return z.f31622a;
    }

    public static final z VoicePickerCollectionScreenUI$lambda$2(ho.a aVar, VoicePickerCollectionState voicePickerCollectionState, VoicePickerSharedContract.State state, ho.l lVar, int i10, m mVar, int i11) {
        VoicePickerCollectionScreenUI(aVar, voicePickerCollectionState, state, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
