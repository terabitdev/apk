package io.elevenlabs.readerapp.ui.screens.authenticated.voices;

import a2.n2;
import androidx.lifecycle.j1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCategory;
import io.elevenlabs.domain.model.VoiceKt;
import io.elevenlabs.readerapp.ui.components.ReadMetaRowKt;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonContainerKt;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullScreenLoaderKt;
import io.elevenlabs.ui.components.MarkdownTextKt;
import io.elevenlabs.ui.components.MetaChipKt;
import io.elevenlabs.ui.components.MetaChipVariant;
import io.elevenlabs.ui.components.VoiceAvatarKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.components.primitives.VerticalGradientKt;
import io.elevenlabs.ui.extensions.BoxShadow;
import io.elevenlabs.ui.extensions.BoxShadowKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import q2.k5;
import r1.c3;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.o1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import r1.z1;
import sn.z;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aC\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\u000e\u001a\u00020\u00032\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001aS\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u001e\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u000f\u0010\u001a\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u0017\u001a\u000f\u0010\u001b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001b\u0010\u0017\u001a\u000f\u0010\u001c\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u0017\u001a\u000f\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u0017\u001a\u000f\u0010\u001e\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001e\u0010\u0017\u001a\u000f\u0010\u001f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001f\u0010\u0017¨\u0006\"²\u0006\u000e\u0010!\u001a\u00020 8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "voiceId", "Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lkotlin/Function1;", "onNavigateToRead", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/VoiceDetailsViewModel;", "vm", "VoiceDetailsScreen", "(Ljava/lang/String;Lho/a;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/VoiceDetailsViewModel;Lu2/m;II)V", "action", "Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/VoiceDetailsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "VoiceDetailsScreenUI", "(Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/VoiceDetailsState;Lho/a;Lho/l;Lu2/m;II)V", "Lr1/z1;", "contentPadding", "VoiceDataUI", "(Lr1/z1;Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/VoiceDetailsState;Lho/l;Lho/l;Lu2/m;I)V", "VoiceActionButtons", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/voices/VoiceDetailsState;Lho/l;Lu2/m;I)V", "Preview_VoiceDetailsScreen_Idle", "(Lu2/m;I)V", "Preview_VoiceDetailsScreen_Loading", "Preview_VoiceDetailsScreen_Error", "Preview_VoiceDetailsScreen_Premade", "Preview_VoiceDetailsScreen_Premade_With_Image", "Preview_VoiceDetailsScreen_Famous", "Preview_VoiceDetailsScreen_VoiceRecommendations", "Preview_VoiceDetailsScreen_VoiceRecommendations_loading", "Preview_VoiceDetailsScreen_VoiceRecommendations_Favorite", "", "showConfirmationDialog", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoiceDetailsScreenKt {
    public static final void Preview_VoiceDetailsScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1561483688);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new q(15);
                qVar.h0(L);
            }
            VoiceDetailsScreenUI((ho.l) L, new VoiceDetailsState(false, "Some error", null, null, false, false, false, null, 252, null), null, null, qVar, 6, 12);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j(i10, 4);
        }
    }

    public static final z Preview_VoiceDetailsScreen_Error$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceDetailsScreen_Error$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceDetailsScreen_Error(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceDetailsScreen_Famous(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1696686119);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Voice copy$default = Voice.copy$default(VoicesFactoryKt.stubVoice(), null, null, null, null, null, null, null, null, null, null, false, null, "https://via.placeholder.com/150", VoiceCategory.Famous, null, null, 53247, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new q(9);
                qVar.h0(L);
            }
            VoiceDetailsScreenUI((ho.l) L, new VoiceDetailsState(false, null, null, copy$default, false, false, false, null, 246, null), null, null, qVar, 6, 12);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.u(i10, 29);
        }
    }

    public static final z Preview_VoiceDetailsScreen_Famous$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceDetailsScreen_Famous$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceDetailsScreen_Famous(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceDetailsScreen_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1532170720);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new q(10);
                qVar.h0(L);
            }
            VoiceDetailsScreenUI((ho.l) L, new VoiceDetailsState(false, null, null, null, false, false, false, null, 255, null), null, null, qVar, 6, 12);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j(i10, 0);
        }
    }

    public static final z Preview_VoiceDetailsScreen_Idle$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceDetailsScreen_Idle$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceDetailsScreen_Idle(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceDetailsScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(968093556);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new q(16);
                qVar.h0(L);
            }
            VoiceDetailsScreenUI((ho.l) L, new VoiceDetailsState(true, null, null, null, false, false, false, null, 254, null), null, null, qVar, 6, 12);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j(i10, 5);
        }
    }

    public static final z Preview_VoiceDetailsScreen_Loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceDetailsScreen_Loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceDetailsScreen_Loading(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceDetailsScreen_Premade(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(200700920);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new q(4);
                qVar.h0(L);
            }
            VoiceDetailsScreenUI((ho.l) L, new VoiceDetailsState(false, null, null, VoicesFactoryKt.stubVoice(), false, false, false, null, 246, null), null, null, qVar, 6, 12);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.u(i10, 27);
        }
    }

    public static final z Preview_VoiceDetailsScreen_Premade$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceDetailsScreen_Premade$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceDetailsScreen_Premade(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceDetailsScreen_Premade_With_Image(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(486384011);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Voice copy$default = Voice.copy$default(VoicesFactoryKt.stubVoice(), null, null, null, null, null, null, null, null, null, null, false, null, "https://placehold.co/400", null, null, null, 61439, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new q(13);
                qVar.h0(L);
            }
            VoiceDetailsScreenUI((ho.l) L, new VoiceDetailsState(false, null, null, copy$default, false, false, false, null, 246, null), null, null, qVar, 6, 12);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j(i10, 1);
        }
    }

    public static final z Preview_VoiceDetailsScreen_Premade_With_Image$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceDetailsScreen_Premade_With_Image$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceDetailsScreen_Premade_With_Image(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceDetailsScreen_VoiceRecommendations(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-151909844);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Voice copy$default = Voice.copy$default(VoicesFactoryKt.stubVoice(), null, null, null, null, null, null, null, null, null, null, false, null, "https://via.placeholder.com/150", VoiceCategory.Famous, null, null, 53247, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new q(14);
                qVar.h0(L);
            }
            VoiceDetailsScreenUI((ho.l) L, new VoiceDetailsState(false, null, null, copy$default, false, false, false, ReadsFactoryKt.stubReadMetaList$default(5, null, 2, null), 118, null), null, null, qVar, 6, 12);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j(i10, 2);
        }
    }

    public static final z Preview_VoiceDetailsScreen_VoiceRecommendations$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceDetailsScreen_VoiceRecommendations$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceDetailsScreen_VoiceRecommendations(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceDetailsScreen_VoiceRecommendations_Favorite(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-97716803);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Voice copy$default = Voice.copy$default(VoicesFactoryKt.stubVoice(), null, null, null, null, null, null, null, null, null, null, false, null, "https://via.placeholder.com/150", VoiceCategory.Famous, 1337L, null, 36863, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new q(7);
                qVar.h0(L);
            }
            VoiceDetailsScreenUI((ho.l) L, new VoiceDetailsState(false, null, null, copy$default, false, false, false, ReadsFactoryKt.stubReadMetaList$default(5, null, 2, null), 118, null), null, null, qVar, 6, 12);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.u(i10, 28);
        }
    }

    public static final z Preview_VoiceDetailsScreen_VoiceRecommendations_Favorite$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceDetailsScreen_VoiceRecommendations_Favorite$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceDetailsScreen_VoiceRecommendations_Favorite(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_VoiceDetailsScreen_VoiceRecommendations_loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-924119729);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Voice copy$default = Voice.copy$default(VoicesFactoryKt.stubVoice(), null, null, null, null, null, null, null, null, null, null, false, null, "https://via.placeholder.com/150", VoiceCategory.Famous, null, null, 53247, null);
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new q(11);
                qVar.h0(L);
            }
            VoiceDetailsScreenUI((ho.l) L, new VoiceDetailsState(false, null, null, copy$default, false, false, true, null, 182, null), null, null, qVar, 6, 12);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j(i10, 3);
        }
    }

    public static final z Preview_VoiceDetailsScreen_VoiceRecommendations_loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z Preview_VoiceDetailsScreen_VoiceRecommendations_loading$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_VoiceDetailsScreen_VoiceRecommendations_loading(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void VoiceActionButtons(final VoiceDetailsState voiceDetailsState, ho.l lVar, u2.m mVar, final int i10) {
        int i11;
        boolean z6;
        final int i12;
        r1 r10;
        ho.p pVar;
        int i13;
        boolean z10;
        int i14;
        String R;
        boolean z11;
        z0 z0Var;
        boolean z12;
        int i15;
        int i16;
        final ho.l lVar2 = lVar;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1444637463);
        if ((i10 & 6) == 0) {
            if (qVar.h(voiceDetailsState)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        final int i17 = 1;
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            if (voiceDetailsState.getVoice() == null) {
                r10 = qVar.r();
                if (r10 != null) {
                    pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.d
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            z VoiceActionButtons$lambda$2;
                            z VoiceActionButtons$lambda$0;
                            int i18 = i17;
                            u2.m mVar2 = (u2.m) obj;
                            int intValue = ((Integer) obj2).intValue();
                            switch (i18) {
                                case 0:
                                    VoiceActionButtons$lambda$2 = VoiceDetailsScreenKt.VoiceActionButtons$lambda$2(voiceDetailsState, lVar2, i10, mVar2, intValue);
                                    return VoiceActionButtons$lambda$2;
                                default:
                                    VoiceActionButtons$lambda$0 = VoiceDetailsScreenKt.VoiceActionButtons$lambda$0(voiceDetailsState, lVar2, i10, mVar2, intValue);
                                    return VoiceActionButtons$lambda$0;
                            }
                        }
                    };
                    r10.f34012d = pVar;
                }
                return;
            }
            i3.t e10 = p2.e(i3.q.f13017a, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i18 = ElevenLabsTheme.$stable;
            i3.t G = r1.d.G(l1.n.t(r1.d.I(e10, t2.u.P, t2.u.P, t2.u.P, elevenLabsTheme.getSpacings(qVar, i18).m2358getX6D9Ej5fM(), 7), l1.n.x(qVar), 14), elevenLabsTheme.getSpacings(qVar, i18).m2358getX6D9Ej5fM(), t2.u.P, 2);
            u0 u0Var = r1.j.f29228a;
            k2 a10 = i2.a(r1.j.h(elevenLabsTheme.getSpacings(qVar, i18).m2356getX4D9Ej5fM(), i3.d.C0), i3.d.f13004y0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(G, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            if (voiceDetailsState.isPlaying()) {
                i13 = R.drawable.pause;
            } else {
                i13 = R.drawable.headphones;
            }
            String R2 = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.voice_details_preview);
            ButtonVariant buttonVariant = ButtonVariant.Secondary;
            ButtonSize buttonSize = ButtonSize.Small;
            int i19 = i11 & 112;
            if (i19 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (z10 || L == eVar) {
                L = new l(lVar2, 1);
                qVar.h0(L);
            }
            i12 = 0;
            ButtonKt.Button(R2, (ho.a) L, null, buttonSize, buttonVariant, Integer.valueOf(i13), null, false, false, false, qVar, 27648, 964);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = u2.r.A(Boolean.FALSE);
                qVar.h0(L2);
            }
            z0 z0Var2 = (z0) L2;
            if (VoiceKt.isFavorited(voiceDetailsState.getVoice())) {
                i14 = R.drawable.heart_filled;
            } else {
                i14 = R.drawable.heart;
            }
            if (VoiceKt.isFavorited(voiceDetailsState.getVoice())) {
                qVar.X(1479638910);
                R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.voice_details_added_to_favorites);
                qVar.p(false);
            } else {
                qVar.X(1479756896);
                R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.voice_details_add_to_favorites);
                qVar.p(false);
            }
            boolean isActionLoading = voiceDetailsState.isActionLoading();
            if (VoiceKt.isFavorited(voiceDetailsState.getVoice())) {
                buttonVariant = ButtonVariant.Primary;
            }
            boolean h10 = qVar.h(voiceDetailsState);
            if (i19 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = h10 | z11;
            Object L3 = qVar.L();
            if (z13 || L3 == eVar) {
                L3 = new m(voiceDetailsState, lVar, z0Var2, 0);
                qVar.h0(L3);
            }
            ButtonKt.Button(R, (ho.a) L3, null, buttonSize, buttonVariant, Integer.valueOf(i14), null, isActionLoading, false, false, qVar, 3072, 836);
            if (VoiceActionButtons$lambda$1$2(z0Var2)) {
                qVar.X(1480351879);
                Object L4 = qVar.L();
                if (L4 == eVar) {
                    z0Var = z0Var2;
                    L4 = new n(z0Var, 0);
                    qVar.h0(L4);
                } else {
                    z0Var = z0Var2;
                }
                ho.a aVar = (ho.a) L4;
                if (i19 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Object L5 = qVar.L();
                if (!z12 && L5 != eVar) {
                    lVar2 = lVar;
                } else {
                    lVar2 = lVar;
                    L5 = new c(lVar2, z0Var, 0);
                    qVar.h0(L5);
                }
                ConfirmationDialogKt.ConfirmationDialog(aVar, (ho.a) L5, null, kj.c.Q(io.elevenlabs.readerapp.R.string.remove_voice_from_favorites_confirmation_title, new Object[]{voiceDetailsState.getVoice().getName()}, qVar), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.voice_details_delete_confirm_action_dismiss), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.remove_voice_from_favorites_confirmation_action_short), false, qVar, 1572870, 4);
                qVar.p(false);
            } else {
                lVar2 = lVar;
                qVar.X(1481097615);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            i12 = 0;
            qVar.R();
        }
        r10 = qVar.r();
        if (r10 != null) {
            pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.d
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z VoiceActionButtons$lambda$2;
                    z VoiceActionButtons$lambda$0;
                    int i182 = i12;
                    u2.m mVar2 = (u2.m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i182) {
                        case 0:
                            VoiceActionButtons$lambda$2 = VoiceDetailsScreenKt.VoiceActionButtons$lambda$2(voiceDetailsState, lVar2, i10, mVar2, intValue);
                            return VoiceActionButtons$lambda$2;
                        default:
                            VoiceActionButtons$lambda$0 = VoiceDetailsScreenKt.VoiceActionButtons$lambda$0(voiceDetailsState, lVar2, i10, mVar2, intValue);
                            return VoiceActionButtons$lambda$0;
                    }
                }
            };
            r10.f34012d = pVar;
        }
    }

    public static final z VoiceActionButtons$lambda$0(VoiceDetailsState voiceDetailsState, ho.l lVar, int i10, u2.m mVar, int i11) {
        VoiceActionButtons(voiceDetailsState, lVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final z VoiceActionButtons$lambda$1$0$0(ho.l lVar) {
        lVar.invoke(new q(5));
        return z.f31622a;
    }

    public static final z VoiceActionButtons$lambda$1$0$0$0(VoiceDetailsViewModel voiceDetailsViewModel) {
        voiceDetailsViewModel.getClass();
        voiceDetailsViewModel.togglePreview();
        return z.f31622a;
    }

    private static final boolean VoiceActionButtons$lambda$1$2(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void VoiceActionButtons$lambda$1$3(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z VoiceActionButtons$lambda$1$4$0(VoiceDetailsState voiceDetailsState, ho.l lVar, z0 z0Var) {
        if (VoiceKt.isFavorited(voiceDetailsState.getVoice())) {
            VoiceActionButtons$lambda$1$3(z0Var, true);
        } else {
            lVar.invoke(new q(3));
        }
        return z.f31622a;
    }

    public static final z VoiceActionButtons$lambda$1$4$0$0(VoiceDetailsViewModel voiceDetailsViewModel) {
        voiceDetailsViewModel.getClass();
        voiceDetailsViewModel.toggleVoiceFavorite();
        return z.f31622a;
    }

    public static final z VoiceActionButtons$lambda$1$5$0(z0 z0Var) {
        VoiceActionButtons$lambda$1$3(z0Var, false);
        return z.f31622a;
    }

    public static final z VoiceActionButtons$lambda$1$6$0(ho.l lVar, z0 z0Var) {
        VoiceActionButtons$lambda$1$3(z0Var, false);
        lVar.invoke(new q(12));
        return z.f31622a;
    }

    public static final z VoiceActionButtons$lambda$1$6$0$0(VoiceDetailsViewModel voiceDetailsViewModel) {
        voiceDetailsViewModel.getClass();
        voiceDetailsViewModel.toggleVoiceFavorite();
        return z.f31622a;
    }

    public static final z VoiceActionButtons$lambda$2(VoiceDetailsState voiceDetailsState, ho.l lVar, int i10, u2.m mVar, int i11) {
        VoiceActionButtons(voiceDetailsState, lVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v28 */
    private static final void VoiceDataUI(final z1 z1Var, final VoiceDetailsState voiceDetailsState, final ho.l lVar, final ho.l lVar2, u2.m mVar, final int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        r1 r10;
        ho.p pVar;
        r1.e eVar;
        boolean z10;
        ElevenLabsTheme elevenLabsTheme;
        int i12;
        i3.q qVar2;
        ?? r62;
        u2.q qVar3;
        ElevenLabsTheme elevenLabsTheme2;
        int i13;
        i3.q qVar4;
        h4.f fVar;
        h4.e eVar2;
        h4.d dVar;
        ElevenLabsTheme elevenLabsTheme3;
        h4.e eVar3;
        h4.e eVar4;
        h4.e eVar5;
        h4.f fVar2;
        int i14;
        boolean z11;
        int i15;
        i3.q qVar5;
        boolean z12;
        u2.q qVar6;
        u2.q qVar7;
        boolean z13;
        boolean z14;
        boolean z15;
        u2.q qVar8;
        int i16;
        int i17;
        int i18;
        int i19;
        u2.q qVar9 = (u2.q) mVar;
        qVar9.Z(-281167034);
        if ((i10 & 6) == 0) {
            if (qVar9.f(z1Var)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i11 = i19 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar9.h(voiceDetailsState)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i11 |= i18;
        }
        if ((i10 & 384) == 0) {
            if (qVar9.h(lVar)) {
                i17 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i17 = 128;
            }
            i11 |= i17;
        }
        if ((i10 & 3072) == 0) {
            if (qVar9.h(lVar2)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i16;
        }
        int i20 = i11;
        if ((i20 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar9.O(i20 & 1, z6)) {
            Voice voice = voiceDetailsState.getVoice();
            if (voice == null) {
                r10 = qVar9.r();
                if (r10 != null) {
                    final int i21 = 0;
                    pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.g
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            z VoiceDataUI$lambda$0;
                            z VoiceDataUI$lambda$2;
                            switch (i21) {
                                case 0:
                                    int intValue = ((Integer) obj2).intValue();
                                    VoiceDataUI$lambda$0 = VoiceDetailsScreenKt.VoiceDataUI$lambda$0(z1Var, voiceDetailsState, lVar, lVar2, i10, (u2.m) obj, intValue);
                                    return VoiceDataUI$lambda$0;
                                default:
                                    int intValue2 = ((Integer) obj2).intValue();
                                    VoiceDataUI$lambda$2 = VoiceDetailsScreenKt.VoiceDataUI$lambda$2(z1Var, voiceDetailsState, lVar, lVar2, i10, (u2.m) obj, intValue2);
                                    return VoiceDataUI$lambda$2;
                            }
                        }
                    };
                    r10.f34012d = pVar;
                }
                return;
            }
            i3.q qVar10 = i3.q.f13017a;
            i3.t D = r1.d.D(l1.n.y(p2.d(qVar10, 1.0f), l1.n.x(qVar9), true, true), z1Var);
            r1.e eVar6 = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            x a10 = w.a(eVar6, jVar, qVar9, 0);
            int hashCode = Long.hashCode(qVar9.T);
            c3.o l4 = qVar9.l();
            i3.t c5 = i3.a.c(D, qVar9);
            h4.h.f11920i.getClass();
            h4.f fVar3 = h4.g.f11903b;
            qVar9.b0();
            if (qVar9.S) {
                qVar9.k(fVar3);
            } else {
                qVar9.k0();
            }
            h4.e eVar7 = h4.g.f11907f;
            u2.r.J(eVar7, a10, qVar9);
            h4.e eVar8 = h4.g.f11906e;
            u2.r.J(eVar8, l4, qVar9);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar9 = h4.g.f11908g;
            u2.r.y(qVar9, valueOf, eVar9);
            h4.d dVar2 = h4.g.f11909h;
            u2.r.F(dVar2, qVar9);
            h4.e eVar10 = h4.g.f11905d;
            u2.r.J(eVar10, c5, qVar9);
            i3.t e10 = p2.e(qVar10, 1.0f);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar9.T);
            c3.o l7 = qVar9.l();
            i3.t c10 = i3.a.c(e10, qVar9);
            qVar9.b0();
            if (qVar9.S) {
                qVar9.k(fVar3);
            } else {
                qVar9.k0();
            }
            u2.r.J(eVar7, d10, qVar9);
            u2.r.J(eVar8, l7, qVar9);
            defpackage.f.u(hashCode2, qVar9, eVar9, qVar9, dVar2);
            u2.r.J(eVar10, c10, qVar9);
            ElevenLabsTheme elevenLabsTheme4 = ElevenLabsTheme.INSTANCE;
            int i22 = ElevenLabsTheme.$stable;
            VerticalGradientKt.VerticalGradient(r1.t.f29349a.a(), ig.f.I(new p3.x(ib.i.d(elevenLabsTheme4, qVar9, i22)), new p3.x(elevenLabsTheme4.getColor(qVar9, i22).getBackground().m2005getSecondary0d7_KjU())), qVar9, 0, 0);
            x a11 = w.a(eVar6, jVar, qVar9, 0);
            int hashCode3 = Long.hashCode(qVar9.T);
            c3.o l10 = qVar9.l();
            i3.t c11 = i3.a.c(qVar10, qVar9);
            qVar9.b0();
            if (qVar9.S) {
                qVar9.k(fVar3);
            } else {
                qVar9.k0();
            }
            u2.r.J(eVar7, a11, qVar9);
            u2.r.J(eVar8, l10, qVar9);
            defpackage.f.u(hashCode3, qVar9, eVar9, qVar9, dVar2);
            u2.r.J(eVar10, c11, qVar9);
            i3.t G = r1.d.G(p2.e(qVar10, 1.0f), elevenLabsTheme4.getSpacings(qVar9, i22).m2358getX6D9Ej5fM(), t2.u.P, 2);
            x a12 = w.a(eVar6, i3.d.C0, qVar9, 48);
            int hashCode4 = Long.hashCode(qVar9.T);
            c3.o l11 = qVar9.l();
            i3.t c12 = i3.a.c(G, qVar9);
            qVar9.b0();
            if (qVar9.S) {
                qVar9.k(fVar3);
            } else {
                qVar9.k0();
            }
            u2.r.J(eVar7, a12, qVar9);
            u2.r.J(eVar8, l11, qVar9);
            defpackage.f.u(hashCode4, qVar9, eVar9, qVar9, dVar2);
            u2.r.J(eVar10, c12, qVar9);
            r1.d.g(p2.f(qVar10, elevenLabsTheme4.getSpacings(qVar9, i22).m2351getX10D9Ej5fM()), qVar9);
            String voiceId = voice.getVoiceId();
            i3.t boxShadow = BoxShadowKt.boxShadow(p2.o(qVar10, 100), new BoxShadow[]{new BoxShadow(h0.c(637534208), (float) 16.18d, (float) (-9.25d), (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits((float) 24.85d) & 4294967295L), false, 16, null)}, elevenLabsTheme4.getShapes(qVar9, i22).getFull(), false);
            String imageUrl = voice.getImageUrl();
            VoiceCategory category = voice.getCategory();
            VoiceCategory voiceCategory = VoiceCategory.Famous;
            if (category == voiceCategory) {
                eVar = eVar6;
                z10 = true;
            } else {
                eVar = eVar6;
                z10 = false;
            }
            r1.e eVar11 = eVar;
            VoiceAvatarKt.VoiceAvatar(voiceId, imageUrl, boxShadow, z10, false, qVar9, 0, 16);
            r1.d.g(p2.f(qVar10, elevenLabsTheme4.getSpacings(qVar9, i22).m2358getX6D9Ej5fM()), qVar9);
            j7.d(voice.getName(), null, 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme4.getTypo(qVar9, i22).getTitleLarge700Inter(), qVar9, 0, 0, 130046);
            u2.q qVar11 = qVar9;
            String subtitle = voice.getSubtitle();
            if (subtitle == null || wq.n.m0(subtitle)) {
                elevenLabsTheme = elevenLabsTheme4;
                i12 = i22;
                qVar2 = qVar10;
                r62 = 0;
                qVar11.X(-379997964);
                qVar11.p(false);
                qVar3 = qVar11;
            } else {
                qVar11.X(-380391013);
                r1.d.g(p2.f(qVar10, elevenLabsTheme4.getSpacings(qVar11, i22).m2353getX2D9Ej5fM()), qVar11);
                elevenLabsTheme = elevenLabsTheme4;
                qVar2 = qVar10;
                i12 = i22;
                j7.d(subtitle, null, ib.i.w(elevenLabsTheme4, qVar11, i22), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme4.getTypo(qVar11, i22).getPill700(), qVar11, 0, 0, 130042);
                u2.q qVar12 = qVar11;
                r62 = 0;
                qVar12.p(false);
                qVar3 = qVar12;
            }
            if (voice.getCategory() == voiceCategory) {
                qVar3.X(-379923719);
                ElevenLabsTheme elevenLabsTheme5 = elevenLabsTheme;
                i13 = i12;
                qVar4 = qVar2;
                r1.d.g(p2.f(qVar4, elevenLabsTheme5.getSpacings(qVar3, i13).m2357getX5D9Ej5fM()), qVar3);
                MetaChipKt.MetaChip(kj.c.R(qVar3, io.elevenlabs.readerapp.R.string.voice_details_iconic_voice), R.drawable.star_lines, (MetaChipVariant) null, qVar3, 0, 4);
                qVar3.p(r62);
                elevenLabsTheme2 = elevenLabsTheme5;
            } else {
                elevenLabsTheme2 = elevenLabsTheme;
                i13 = i12;
                qVar4 = qVar2;
                qVar3.X(-379621004);
                qVar3.p(r62);
            }
            r1.d.g(p2.f(qVar4, elevenLabsTheme2.getSpacings(qVar3, i13).m2358getX6D9Ej5fM()), qVar3);
            qVar3.p(true);
            VoiceActionButtons(voiceDetailsState, lVar, qVar3, (i20 >> 3) & 126);
            qVar3.p(true);
            qVar3.p(true);
            i3.t G2 = r1.d.G(qVar4, t2.u.P, elevenLabsTheme2.getSpacings(qVar3, i13).m2357getX5D9Ej5fM(), 1);
            WeakHashMap weakHashMap = c3.f29142x;
            i3.t d11 = p2.d(r1.d.P(G2, new o1(u0.e(qVar3).f29154l, 32)), 1.0f);
            x a13 = w.a(r1.j.f29232e, jVar, qVar3, 6);
            int hashCode5 = Long.hashCode(qVar3.T);
            c3.o l12 = qVar3.l();
            i3.t c13 = i3.a.c(d11, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                fVar = fVar3;
                qVar3.k(fVar);
            } else {
                fVar = fVar3;
                qVar3.k0();
            }
            u2.r.J(eVar7, a13, qVar3);
            u2.r.J(eVar8, l12, qVar3);
            defpackage.f.u(hashCode5, qVar3, eVar9, qVar3, dVar2);
            u2.r.J(eVar10, c13, qVar3);
            String description = voice.getDescription();
            if (description == null || wq.n.m0(description)) {
                eVar2 = eVar7;
                dVar = dVar2;
                elevenLabsTheme3 = elevenLabsTheme2;
                eVar3 = eVar8;
                eVar4 = eVar10;
                eVar5 = eVar9;
                fVar2 = fVar;
                i14 = i20;
                z11 = true;
                i15 = i13;
                qVar5 = qVar4;
                z12 = r62;
                qVar3.X(279246128);
                qVar3.p(z12);
                qVar6 = qVar3;
            } else {
                qVar3.X(278697397);
                i3.q qVar13 = qVar4;
                i3.t G3 = r1.d.G(p2.e(qVar4, 1.0f), elevenLabsTheme2.getSpacings(qVar3, i13).m2357getX5D9Ej5fM(), t2.u.P, 2);
                x a14 = w.a(eVar11, jVar, qVar3, r62);
                int hashCode6 = Long.hashCode(qVar3.T);
                c3.o l13 = qVar3.l();
                i3.t c14 = i3.a.c(G3, qVar3);
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(fVar);
                } else {
                    qVar3.k0();
                }
                u2.r.J(eVar7, a14, qVar3);
                u2.r.J(eVar8, l13, qVar3);
                defpackage.f.u(hashCode6, qVar3, eVar9, qVar3, dVar2);
                u2.r.J(eVar10, c14, qVar3);
                u2.q qVar14 = qVar3;
                i14 = i20;
                eVar2 = eVar7;
                fVar2 = fVar;
                eVar4 = eVar10;
                eVar5 = eVar9;
                dVar = dVar2;
                eVar3 = eVar8;
                j7.d(kj.c.R(qVar3, io.elevenlabs.readerapp.R.string.voice_details_about), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme2.getTypo(qVar3, i13).getSubtitleMedium700(), qVar14, 0, 0, 131070);
                ElevenLabsTheme elevenLabsTheme6 = elevenLabsTheme2;
                i15 = i13;
                qVar5 = qVar13;
                ib.i.p(elevenLabsTheme6, qVar14, i15, qVar5, qVar14);
                MarkdownTextKt.m1841MarkdownText6lElgYI(description, null, 0L, 0, null, null, null, null, 0, qVar14, 0, 510);
                u2.q qVar15 = qVar14;
                z11 = true;
                qVar15.p(true);
                z12 = false;
                qVar15.p(false);
                qVar6 = qVar15;
                elevenLabsTheme3 = elevenLabsTheme6;
            }
            if (voiceDetailsState.isRecommendedReadsLoading()) {
                qVar6.X(279306516);
                i3.t x10 = ib.i.x(elevenLabsTheme3, qVar6, i15, p2.e(qVar5, 1.0f));
                f1 d12 = r1.p.d(i3.d.f13001e, z12);
                int hashCode7 = Long.hashCode(qVar6.T);
                c3.o l14 = qVar6.l();
                i3.t c15 = i3.a.c(x10, qVar6);
                qVar6.b0();
                if (qVar6.S) {
                    qVar6.k(fVar2);
                } else {
                    qVar6.k0();
                }
                u2.r.J(eVar2, d12, qVar6);
                u2.r.J(eVar3, l14, qVar6);
                defpackage.f.u(hashCode7, qVar6, eVar5, qVar6, dVar);
                u2.r.J(eVar4, c15, qVar6);
                u2.q qVar16 = qVar6;
                FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(true, null, 0L, qVar16, 6, 6);
                u2.q qVar17 = qVar16;
                qVar17.p(z11);
                qVar17.p(z12);
                z13 = z11;
                qVar8 = qVar17;
            } else {
                if (!voiceDetailsState.getSampleReads().isEmpty()) {
                    qVar6.X(279681492);
                    r1.d.g(p2.f(qVar5, elevenLabsTheme3.getSpacings(qVar6, i15).m2358getX6D9Ej5fM()), qVar6);
                    u2.q qVar18 = qVar6;
                    i3.q qVar19 = qVar5;
                    j7.d(kj.c.R(qVar6, io.elevenlabs.readerapp.R.string.voice_details_recommended_reads), r1.d.G(qVar5, elevenLabsTheme3.getSpacings(qVar6, i15).m2357getX5D9Ej5fM(), t2.u.P, 2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme3.getTypo(qVar6, i15).getSubtitleMedium700(), qVar18, 0, 0, 131068);
                    u2.q qVar20 = qVar18;
                    ib.i.p(elevenLabsTheme3, qVar20, i15, qVar19, qVar20);
                    Iterator<ReadMeta> it = voiceDetailsState.getSampleReads().iterator();
                    u2.q qVar21 = qVar20;
                    while (it.hasNext()) {
                        ReadMeta next = it.next();
                        String title = next.getTitle();
                        i3.t e11 = p2.e(qVar19, 1.0f);
                        int i23 = i14;
                        if ((i23 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean h10 = qVar21.h(next) | z14;
                        Object L = qVar21.L();
                        if (!h10 && L != u2.l.f33918a) {
                            z15 = true;
                        } else {
                            z15 = true;
                            L = new c(lVar2, next, 1);
                            qVar21.h0(L);
                        }
                        u2.q qVar22 = qVar21;
                        ButtonContainerKt.m1780ButtonContainer83mGB3Q(title, (ho.a) L, e11, 0L, false, 0, null, false, null, c3.k.d(900848243, z15, new h(next, 0), qVar21), qVar22, 805306752, 504);
                        it = it;
                        qVar21 = qVar22;
                        i14 = i23;
                    }
                    qVar21.p(false);
                    qVar7 = qVar21;
                } else {
                    qVar6.X(280600208);
                    qVar6.p(z12);
                    qVar7 = qVar6;
                }
                z13 = true;
                qVar8 = qVar7;
            }
            qVar8.p(z13);
            qVar8.p(z13);
            qVar = qVar8;
        } else {
            u2.q qVar23 = qVar9;
            qVar23.R();
            qVar = qVar23;
        }
        r10 = qVar.r();
        if (r10 != null) {
            final int i24 = 1;
            pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.g
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z VoiceDataUI$lambda$0;
                    z VoiceDataUI$lambda$2;
                    switch (i24) {
                        case 0:
                            int intValue = ((Integer) obj2).intValue();
                            VoiceDataUI$lambda$0 = VoiceDetailsScreenKt.VoiceDataUI$lambda$0(z1Var, voiceDetailsState, lVar, lVar2, i10, (u2.m) obj, intValue);
                            return VoiceDataUI$lambda$0;
                        default:
                            int intValue2 = ((Integer) obj2).intValue();
                            VoiceDataUI$lambda$2 = VoiceDetailsScreenKt.VoiceDataUI$lambda$2(z1Var, voiceDetailsState, lVar, lVar2, i10, (u2.m) obj, intValue2);
                            return VoiceDataUI$lambda$2;
                    }
                }
            };
            r10.f34012d = pVar;
        }
    }

    public static final z VoiceDataUI$lambda$0(z1 z1Var, VoiceDetailsState voiceDetailsState, ho.l lVar, ho.l lVar2, int i10, u2.m mVar, int i11) {
        VoiceDataUI(z1Var, voiceDetailsState, lVar, lVar2, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final z VoiceDataUI$lambda$1$1$2$0(ho.l lVar, ReadMeta readMeta) {
        lVar.invoke(readMeta.getReadId());
        return z.f31622a;
    }

    public static final z VoiceDataUI$lambda$1$1$3(ReadMeta readMeta, r1.s sVar, u2.m mVar, int i10) {
        boolean z6;
        sVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMetaRowKt.ReadMetaRow(readMeta, p2.e(i3.q.f13017a, 1.0f), qVar, 48, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoiceDataUI$lambda$2(z1 z1Var, VoiceDetailsState voiceDetailsState, ho.l lVar, ho.l lVar2, int i10, u2.m mVar, int i11) {
        VoiceDataUI(z1Var, voiceDetailsState, lVar, lVar2, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if ((r20 & 8) != 0) goto L128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoiceDetailsScreen(String str, ho.a aVar, ho.l lVar, VoiceDetailsViewModel voiceDetailsViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar2;
        VoiceDetailsViewModel voiceDetailsViewModel2;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        int i16;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1433713402);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        } else {
            lVar2 = lVar;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                voiceDetailsViewModel2 = voiceDetailsViewModel;
                if (qVar.h(voiceDetailsViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                voiceDetailsViewModel2 = voiceDetailsViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            voiceDetailsViewModel2 = voiceDetailsViewModel;
        }
        boolean z10 = false;
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 8) != 0) {
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        j1 j02 = gg.b.j0(e0.f20562a.b(VoiceDetailsViewModel.class), a10, null, o6, cVar, qVar);
                        qVar = qVar;
                        voiceDetailsViewModel2 = (VoiceDetailsViewModel) j02;
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                VoiceDetailsState voiceDetailsState = (VoiceDetailsState) u2.r.o(voiceDetailsViewModel2.getStateFlow(), qVar, 0).getValue();
                boolean h10 = qVar.h(voiceDetailsViewModel2);
                if ((i12 & 14) == 4) {
                    z10 = true;
                }
                boolean z11 = h10 | z10;
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z11 || L == eVar) {
                    L = new VoiceDetailsScreenKt$VoiceDetailsScreen$1$1(voiceDetailsViewModel2, str, null);
                    qVar.h0(L);
                }
                u2.r.f((ho.p) L, str, qVar);
                boolean h11 = qVar.h(voiceDetailsViewModel2);
                Object L2 = qVar.L();
                if (h11 || L2 == eVar) {
                    L2 = new e(voiceDetailsViewModel2, 0);
                    qVar.h0(L2);
                }
                VoiceDetailsScreenUI((ho.l) L2, voiceDetailsState, aVar, lVar2, qVar, (i12 << 3) & 8064, 0);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new f(str, aVar, lVar, voiceDetailsViewModel2, i10, i11, 0);
        }
    }

    public static final z VoiceDetailsScreen$lambda$1$0(VoiceDetailsViewModel voiceDetailsViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(voiceDetailsViewModel);
        return z.f31622a;
    }

    public static final z VoiceDetailsScreen$lambda$2(String str, ho.a aVar, ho.l lVar, VoiceDetailsViewModel voiceDetailsViewModel, int i10, int i11, u2.m mVar, int i12) {
        VoiceDetailsScreen(str, aVar, lVar, voiceDetailsViewModel, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void VoiceDetailsScreenUI(ho.l lVar, VoiceDetailsState voiceDetailsState, ho.a aVar, ho.l lVar2, u2.m mVar, int i10, int i11) {
        Object obj;
        int i12;
        ho.a aVar2;
        int i13;
        int i14;
        Object obj2;
        int i15;
        boolean z6;
        u2.q qVar;
        ho.a aVar3;
        Object obj3;
        r1 r10;
        ho.a aVar4;
        Object obj4;
        int i16;
        int i17;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-289061721);
        if ((i10 & 6) == 0) {
            obj = lVar;
            if (qVar2.h(obj)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            obj = lVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(voiceDetailsState)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            aVar2 = aVar;
            if (qVar2.h(aVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i11 & 8;
            if (i14 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                obj2 = lVar2;
                if (qVar2.h(obj2)) {
                    i15 = 2048;
                } else {
                    i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i12 |= i15;
                if ((i12 & 1171) != 1170) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (qVar2.O(i12 & 1, z6)) {
                    Object obj5 = u2.l.f33918a;
                    if (i18 != 0) {
                        Object L = qVar2.L();
                        if (L == obj5) {
                            L = new i(0);
                            qVar2.h0(L);
                        }
                        aVar4 = (ho.a) L;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i14 != 0) {
                        Object L2 = qVar2.L();
                        if (L2 == obj5) {
                            L2 = new q(6);
                            qVar2.h0(L2);
                        }
                        obj4 = (ho.l) L2;
                    } else {
                        obj4 = obj2;
                    }
                    aVar3 = aVar4;
                    qVar = qVar2;
                    k5.a(null, null, null, null, null, 0, 0L, 0L, null, c3.k.d(1853599416, true, new n2(voiceDetailsState, obj, obj4, aVar4, 13), qVar2), qVar, 805306368, 511);
                    obj3 = obj4;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    aVar3 = aVar2;
                    obj3 = obj2;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new f((Object) lVar, (Object) voiceDetailsState, aVar3, obj3, i10, i11, 1);
                    return;
                }
                return;
            }
            obj2 = lVar2;
            if ((i12 & 1171) != 1170) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        aVar2 = aVar;
        i14 = i11 & 8;
        if (i14 == 0) {
        }
        obj2 = lVar2;
        if ((i12 & 1171) != 1170) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z VoiceDetailsScreenUI$lambda$1$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z VoiceDetailsScreenUI$lambda$2(VoiceDetailsState voiceDetailsState, final ho.l lVar, ho.l lVar2, ho.a aVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
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
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar2, 1.0f);
            f1 d11 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, d11, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            if (voiceDetailsState.getVoice() != null) {
                qVar.X(1389429168);
                VoiceDataUI(z1Var, voiceDetailsState, lVar, lVar2, qVar, i11 & 14);
                qVar.p(false);
            } else {
                qVar.X(1389663652);
                qVar.p(false);
            }
            if (!wq.n.m0(voiceDetailsState.getError())) {
                qVar.X(1389725001);
                ErrorScreenKt.m1836ErrorScreenV9fs2A(r1.d.D(p2.d(qVar2, 1.0f), z1Var), null, voiceDetailsState.getError(), c3.k.d(-638249898, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.voices.k
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        z VoiceDetailsScreenUI$lambda$2$0$0;
                        int intValue = ((Integer) obj2).intValue();
                        VoiceDetailsScreenUI$lambda$2$0$0 = VoiceDetailsScreenKt.VoiceDetailsScreenUI$lambda$2$0$0(ho.l.this, (u2.m) obj, intValue);
                        return VoiceDetailsScreenUI$lambda$2$0$0;
                    }
                }, qVar), null, 0L, qVar, 3072, 50);
                qVar = qVar;
                qVar.p(false);
            } else {
                qVar.X(1390273732);
                qVar.p(false);
            }
            FullScreenLoaderKt.m1838FullScreenLoaderFNF3uiM(voiceDetailsState.isLoading(), null, 0L, qVar, 0, 6);
            u2.q qVar3 = qVar;
            HeaderActionsKt.HeaderActions((i3.t) null, (String) null, (ho.q) null, c3.k.d(-1059528776, true, new h(aVar, 1), qVar), (i3.f) null, qVar3, 3072, 23);
            qVar3.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoiceDetailsScreenUI$lambda$2$0$0(ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.common_retry);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new l(lVar, 0);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, p2.e(i3.q.f13017a, 1.0f), null, null, null, null, false, false, false, qVar, 384, 1016);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoiceDetailsScreenUI$lambda$2$0$0$0$0(ho.l lVar) {
        lVar.invoke(new q(8));
        return z.f31622a;
    }

    public static final z VoiceDetailsScreenUI$lambda$2$0$0$0$0$0(VoiceDetailsViewModel voiceDetailsViewModel) {
        voiceDetailsViewModel.getClass();
        voiceDetailsViewModel.retry();
        return z.f31622a;
    }

    public static final z VoiceDetailsScreenUI$lambda$2$0$1(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ButtonIconKt.ButtonIcon(R.drawable.close, kj.c.R(qVar, R.string.accessibility_bottom_sheet_dialog_close), aVar, null, ButtonIconVariant.Secondary, ButtonIconSize.Medium, false, false, false, qVar, 221184, 456);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoiceDetailsScreenUI$lambda$3(ho.l lVar, VoiceDetailsState voiceDetailsState, ho.a aVar, ho.l lVar2, int i10, int i11, u2.m mVar, int i12) {
        VoiceDetailsScreenUI(lVar, voiceDetailsState, aVar, lVar2, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
