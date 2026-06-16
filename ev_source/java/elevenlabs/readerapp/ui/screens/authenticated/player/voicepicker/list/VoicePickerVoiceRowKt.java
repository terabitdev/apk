package io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list;

import a2.k3;
import a2.q0;
import c3.j;
import c3.k;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import defpackage.f;
import ho.l;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.model.VoiceCategory;
import io.elevenlabs.domain.model.VoiceKt;
import io.elevenlabs.readerapp.ui.components.VoiceFavoriteButtonKt;
import io.elevenlabs.readerapp.ui.components.VoiceFavoriteButtonState;
import io.elevenlabs.readerapp.ui.components.VoiceRowKt;
import io.elevenlabs.readerapp.ui.components.e0;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.VoicePickerMode;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.shared.VoicePickerSharedContract;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import u2.e;
import u2.m;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aG\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/elevenlabs/domain/model/Voice;", "voice", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;", "sharedState", "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$Event;", "Lsn/z;", "onSharedEvent", "", "markAsRecentWhenSelected", "handleContainerPress", "VoicePickerVoiceRow", "(Lio/elevenlabs/domain/model/Voice;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;ZZLu2/m;II)V", "VoicePickerVoiceRowFavoriteButton", "(Lio/elevenlabs/domain/model/Voice;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/voicepicker/shared/VoicePickerSharedContract$State;Lho/l;Lu2/m;I)V", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class VoicePickerVoiceRowKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VoicePickerVoiceRow(final Voice voice, VoicePickerSharedContract.State state, final l lVar, boolean z6, boolean z10, m mVar, int i10, int i11) {
        int i12;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        int i15;
        boolean z13;
        q qVar;
        boolean z14;
        boolean z15;
        r1 r10;
        final boolean z16;
        boolean z17;
        boolean z18;
        ho.a aVar;
        ho.a aVar2;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        int i16;
        int i17;
        int i18;
        voice.getClass();
        state.getClass();
        lVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(428661290);
        if ((i10 & 6) == 0) {
            if (qVar2.h(voice)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(state)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        int i19 = i11 & 8;
        if (i19 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            z11 = z6;
            if (qVar2.g(z11)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                z12 = z10;
                if (qVar2.g(z12)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((i12 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (qVar2.O(i12 & 1, z13)) {
                    if (i19 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if (i14 != 0) {
                        z17 = true;
                    } else {
                        z17 = z12;
                    }
                    boolean f10 = qVar2.f(state.getSelectedVoiceId()) | qVar2.f(voice.getVoiceId()) | qVar2.f(state.getMode());
                    Object L = qVar2.L();
                    e eVar = u2.l.f33918a;
                    if (f10 || L == eVar) {
                        VoicePickerMode mode = state.getMode();
                        if (mode instanceof VoicePickerMode.VoicePicker) {
                            z18 = kotlin.jvm.internal.m.c(state.getSelectedVoiceId(), voice.getVoiceId());
                        } else {
                            if (!(mode instanceof VoicePickerMode.VoicesTab) && mode != null) {
                                c6.p();
                                return;
                            }
                            z18 = false;
                        }
                        L = Boolean.valueOf(z18);
                        qVar2.h0(L);
                    }
                    boolean booleanValue = ((Boolean) L).booleanValue();
                    float m2355getX3D9Ej5fM = ElevenLabsTheme.INSTANCE.getSpacings(qVar2, ElevenLabsTheme.$stable).m2355getX3D9Ej5fM();
                    String voiceId = voice.getVoiceId();
                    if (z17) {
                        qVar2.X(1311438677);
                        if ((i12 & 896) == 256) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        boolean h10 = z21 | qVar2.h(voice);
                        if ((i12 & 7168) == 2048) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        boolean z23 = h10 | z22;
                        Object L2 = qVar2.L();
                        if (z23 || L2 == eVar) {
                            final int i20 = 0;
                            L2 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.a
                                @Override // ho.a
                                public final Object invoke() {
                                    z VoicePickerVoiceRow$lambda$1$0;
                                    z VoicePickerVoiceRow$lambda$3$0;
                                    switch (i20) {
                                        case 0:
                                            VoicePickerVoiceRow$lambda$1$0 = VoicePickerVoiceRowKt.VoicePickerVoiceRow$lambda$1$0(lVar, voice, z16);
                                            return VoicePickerVoiceRow$lambda$1$0;
                                        default:
                                            VoicePickerVoiceRow$lambda$3$0 = VoicePickerVoiceRowKt.VoicePickerVoiceRow$lambda$3$0(lVar, voice, z16);
                                            return VoicePickerVoiceRow$lambda$3$0;
                                    }
                                }
                            };
                            qVar2.h0(L2);
                        }
                        aVar = (ho.a) L2;
                        qVar2.p(false);
                    } else {
                        qVar2.X(1311694396);
                        qVar2.p(false);
                        aVar = null;
                    }
                    String name = voice.getName();
                    String subtitle = voice.getSubtitle();
                    if (subtitle == null) {
                        subtitle = voice.getDescription();
                    }
                    String useCase = voice.getUseCase();
                    boolean z24 = false;
                    String imageUrl = voice.getImageUrl();
                    if (voice.getCategory() == VoiceCategory.Famous) {
                        aVar2 = aVar;
                        z19 = true;
                    } else {
                        aVar2 = aVar;
                        z19 = false;
                    }
                    boolean c5 = kotlin.jvm.internal.m.c(state.getPlayingPreviewVoiceId(), voice.getVoiceId());
                    j d10 = k.d(522238855, true, new q0(state, voice, lVar, 6), qVar2);
                    if ((i12 & 896) == 256) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    boolean h11 = z20 | qVar2.h(voice);
                    if ((i12 & 7168) == 2048) {
                        z24 = true;
                    }
                    boolean z25 = h11 | z24;
                    Object L3 = qVar2.L();
                    if (z25 || L3 == eVar) {
                        final int i21 = 1;
                        L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.list.a
                            @Override // ho.a
                            public final Object invoke() {
                                z VoicePickerVoiceRow$lambda$1$0;
                                z VoicePickerVoiceRow$lambda$3$0;
                                switch (i21) {
                                    case 0:
                                        VoicePickerVoiceRow$lambda$1$0 = VoicePickerVoiceRowKt.VoicePickerVoiceRow$lambda$1$0(lVar, voice, z16);
                                        return VoicePickerVoiceRow$lambda$1$0;
                                    default:
                                        VoicePickerVoiceRow$lambda$3$0 = VoicePickerVoiceRowKt.VoicePickerVoiceRow$lambda$3$0(lVar, voice, z16);
                                        return VoicePickerVoiceRow$lambda$3$0;
                                }
                            }
                        };
                        qVar2.h0(L3);
                    }
                    qVar = qVar2;
                    VoiceRowKt.m1108VoiceRowLYuG0Iw(voiceId, aVar2, name, subtitle, useCase, imageUrl, z19, booleanValue, d10, false, c5, (ho.a) L3, m2355getX3D9Ej5fM, null, qVar, 905969664, 3072, 0);
                    z14 = z16;
                    z15 = z17;
                } else {
                    qVar = qVar2;
                    qVar.R();
                    z14 = z11;
                    z15 = z12;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new e0(voice, state, lVar, z14, z15, i10, i11, 3);
                    return;
                }
                return;
            }
            z12 = z10;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar2.O(i12 & 1, z13)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        z11 = z6;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        z12 = z10;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar2.O(i12 & 1, z13)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z VoicePickerVoiceRow$lambda$1$0(l lVar, Voice voice, boolean z6) {
        lVar.invoke(new VoicePickerSharedContract.Event.SelectVoice(voice, z6));
        return z.f31622a;
    }

    public static final z VoicePickerVoiceRow$lambda$2(VoicePickerSharedContract.State state, Voice voice, l lVar, m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            if (state.canChangeVoices()) {
                qVar.X(1646238530);
                VoicePickerVoiceRowFavoriteButton(voice, state, lVar, qVar, 0);
                qVar.p(false);
            } else {
                qVar.X(1646447067);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z VoicePickerVoiceRow$lambda$3$0(l lVar, Voice voice, boolean z6) {
        lVar.invoke(new VoicePickerSharedContract.Event.PreviewVoice(voice, z6));
        return z.f31622a;
    }

    public static final z VoicePickerVoiceRow$lambda$4(Voice voice, VoicePickerSharedContract.State state, l lVar, boolean z6, boolean z10, int i10, int i11, m mVar, int i12) {
        VoicePickerVoiceRow(voice, state, lVar, z6, z10, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final void VoicePickerVoiceRowFavoriteButton(Voice voice, VoicePickerSharedContract.State state, l lVar, m mVar, int i10) {
        int i11;
        boolean z6;
        VoiceFavoriteButtonState nonFavorite;
        int i12;
        int i13;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(-290441472);
        if ((i10 & 6) == 0) {
            if (qVar.h(voice)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(state)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        boolean z10 = true;
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            if (state.getFavoriteChangeInProgressVoiceIds().contains(voice.getVoiceId())) {
                qVar.X(1817469583);
                nonFavorite = new VoiceFavoriteButtonState.Loading(f.b(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), null);
                qVar.p(false);
            } else if (VoiceKt.isFavorited(voice)) {
                qVar.X(1817650158);
                nonFavorite = new VoiceFavoriteButtonState.Favorite(f.b(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), null);
                qVar.p(false);
            } else {
                qVar.X(1817818891);
                nonFavorite = new VoiceFavoriteButtonState.NonFavorite(f.b(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), null);
                qVar.p(false);
            }
            if ((i11 & 896) != 256) {
                z10 = false;
            }
            boolean h10 = qVar.h(voice) | z10;
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new b(lVar, voice, 0);
                qVar.h0(L);
            }
            VoiceFavoriteButtonKt.VoiceFavoriteButton(nonFavorite, (ho.a) L, qVar, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 19, voice, state, lVar);
        }
    }

    public static final z VoicePickerVoiceRowFavoriteButton$lambda$0$0(l lVar, Voice voice) {
        Object addFavorite;
        if (VoiceKt.isFavorited(voice)) {
            addFavorite = new VoicePickerSharedContract.Event.ConfirmRemoveFavorite(voice);
        } else {
            addFavorite = new VoicePickerSharedContract.Event.AddFavorite(voice.getVoiceId());
        }
        lVar.invoke(addFavorite);
        return z.f31622a;
    }

    public static final z VoicePickerVoiceRowFavoriteButton$lambda$1(Voice voice, VoicePickerSharedContract.State state, l lVar, int i10, m mVar, int i11) {
        VoicePickerVoiceRowFavoriteButton(voice, state, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
