package io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes;

import a2.k3;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c3.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import f4.f1;
import io.elevenlabs.domain.model.Soundscape;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesContract;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.CalloutKt;
import io.elevenlabs.ui.components.CalloutType;
import io.elevenlabs.ui.components.ChipGroupKt;
import io.elevenlabs.ui.components.SliderKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.components.primitives.VerticalGradientKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import q2.k5;
import q2.y2;
import q2.y4;
import r1.c3;
import r1.d2;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import r1.x0;
import r1.z1;
import rd.c1;
import s4.y0;
import sn.z;
import t2.u;
import tn.t;
import u2.q;
import u2.r;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tH\u0003¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0013\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\tH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a5\u0010\u001c\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001aO\u0010'\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010%\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b'\u0010(\u001a;\u00100\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010-\u001a\u00020,H\u0003¢\u0006\u0004\b.\u0010/\u001a-\u00101\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b1\u00102\u001a\u0019\u00103\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b3\u0010\u001f\u001a/\u00106\u001a\u00020\u00032\u0006\u00104\u001a\u00020 2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b6\u00107\u001a\u000f\u00108\u001a\u00020\u0003H\u0001¢\u0006\u0004\b8\u00109\u001a\u000f\u0010:\u001a\u00020\u0003H\u0001¢\u0006\u0004\b:\u00109\u001a\u000f\u0010;\u001a\u00020\u0003H\u0001¢\u0006\u0004\b;\u00109\u001a\u000f\u0010<\u001a\u00020\u0003H\u0001¢\u0006\u0004\b<\u00109\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?\"\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020)0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?¨\u0006A²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesViewModel;", "viewModel", "Lkotlin/Function0;", "Lsn/z;", "navigateBack", "SoundscapesScreen", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesViewModel;Lho/a;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$Event;", "onEvent", "SoundscapesUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$State;Lho/l;Lu2/m;I)V", "", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;", "categories", "selectedCategory", "onCategorySelected", "FilterChips", "(Ljava/util/List;Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapeCategory;Lho/l;Lu2/m;I)V", "", FirebaseAnalytics.Param.LEVEL, "onLevelChange", "Li3/t;", "modifier", "VolumeControl", "(FLho/l;Li3/t;Lu2/m;II)V", "SoundscapeList", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/player/soundscapes/SoundscapesContract$State;Lho/l;Li3/t;Lu2/m;II)V", "FeedbackCallout", "(Li3/t;Lu2/m;II)V", "", DiagnosticsEntry.NAME_KEY, "", "isSelected", "onClick", "isDownloading", "iconSlot", "SoundscapeListItem", "(Ljava/lang/String;ZLho/a;Li3/t;ZLho/p;Lu2/m;II)V", "Lio/elevenlabs/domain/model/Soundscape;", "soundscape", "isPlaying", "Lh5/f;", "size", "SoundscapeIcon-FJfuzF0", "(Lio/elevenlabs/domain/model/Soundscape;ZZLi3/t;FLu2/m;II)V", "SoundscapeIcon", "SoundscapeControls", "(Lho/l;Li3/t;Lu2/m;II)V", "LoadingState", "message", "onRetry", "ErrorState", "(Ljava/lang/String;Lho/a;Li3/t;Lu2/m;II)V", "Preview_SoundscapesScreen_Content_Few", "(Lu2/m;I)V", "Preview_SoundscapesScreen_Content_Many", "Preview_SoundscapesScreen_Loading", "Preview_SoundscapesScreen_Error", "", "placeholderIcons", "Ljava/util/List;", "previewSoundscapes", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SoundscapesScreenKt {
    private static final List<Integer> placeholderIcons = ig.f.I(Integer.valueOf(R.drawable.soundscape_1), Integer.valueOf(R.drawable.soundscape_2), Integer.valueOf(R.drawable.soundscape_3), Integer.valueOf(R.drawable.soundscape_4), Integer.valueOf(R.drawable.soundscape_5), Integer.valueOf(R.drawable.soundscape_6), Integer.valueOf(R.drawable.soundscape_7), Integer.valueOf(R.drawable.soundscape_8), Integer.valueOf(R.drawable.soundscape_9), Integer.valueOf(R.drawable.soundscape_10), Integer.valueOf(R.drawable.soundscape_11), Integer.valueOf(R.drawable.soundscape_12), Integer.valueOf(R.drawable.soundscape_13), Integer.valueOf(R.drawable.soundscape_14), Integer.valueOf(R.drawable.soundscape_15), Integer.valueOf(R.drawable.soundscape_16), Integer.valueOf(R.drawable.soundscape_17), Integer.valueOf(R.drawable.soundscape_18), Integer.valueOf(R.drawable.soundscape_19), Integer.valueOf(R.drawable.soundscape_20));
    private static final List<Soundscape> previewSoundscapes;

    static {
        t tVar = t.f33547a;
        previewSoundscapes = ig.f.I(new Soundscape("ambient_rain", "Ambient Rain", "Focus", "", "", null, tVar), new Soundscape("ocean_waves", "Ocean Waves", "Focus", "", "", null, tVar), new Soundscape("forest_night", "Forest Night", "Nature", "", "checksum3", null, tVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ErrorState(String str, ho.a aVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(-1460638439);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
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
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                i3.t G = r1.d.G(p2.d(tVar4, 1.0f), 32, u.P, 2);
                f1 d10 = p.d(i3.d.f13001e, false);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                i3.t c5 = i3.a.c(G, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                h4.e eVar = h4.g.f11907f;
                r.J(eVar, d10, qVar);
                h4.e eVar2 = h4.g.f11906e;
                r.J(eVar2, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar3 = h4.g.f11908g;
                r.y(qVar, valueOf, eVar3);
                h4.d dVar = h4.g.f11909h;
                r.F(dVar, qVar);
                h4.e eVar4 = h4.g.f11905d;
                r.J(eVar4, c5, qVar);
                u0 u0Var = r1.j.f29228a;
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i17 = ElevenLabsTheme.$stable;
                x a10 = w.a(r1.j.g(elevenLabsTheme.getSpacings(qVar, i17).m2351getX10D9Ej5fM()), i3.d.B0, qVar, 0);
                int i18 = i12;
                int hashCode2 = Long.hashCode(qVar.T);
                o l7 = qVar.l();
                i3.t c10 = i3.a.c(qVar2, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(eVar, a10, qVar);
                r.J(eVar2, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                r.J(eVar4, c10, qVar);
                j7.d(str, null, defpackage.f.A(elevenLabsTheme, qVar, i17), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i17).getBodyMedium700(), qVar, i18 & 14, 0, 130042);
                qVar = qVar;
                ButtonKt.Button(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.common_retry), aVar, new x0(i3.d.C0), ButtonSize.Medium, ButtonVariant.Primary, null, null, false, false, false, qVar, (i18 & 112) | 27648, 992);
                qVar.p(true);
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new im.a(i10, str, aVar, tVar3, i11, 2);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z ErrorState$lambda$1(String str, ho.a aVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        ErrorState(str, aVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void FeedbackCallout(i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(2038532140);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (qVar.f(tVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i14 != 0) {
                tVar = i3.q.f13017a;
            }
            Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
            CalloutType.Large large = new CalloutType.Large(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_soundscapes_feedback_title), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_soundscapes_feedback_subtitle));
            int i15 = R.drawable.soundscapes_callout;
            boolean h10 = qVar.h(context);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new d(context, 4);
                qVar.h0(L);
            }
            CalloutKt.Callout(large, i15, (ho.a) L, p2.e(tVar, 1.0f), qVar, CalloutType.Large.$stable, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.t(tVar, i10, i11, 3);
        }
    }

    public static final z FeedbackCallout$lambda$0$0(Context context) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://form.typeform.com/to/N5Cp6lip")));
        } catch (Throwable unused) {
        }
        return z.f31622a;
    }

    public static final z FeedbackCallout$lambda$1(i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        FeedbackCallout(tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final void FilterChips(List<? extends SoundscapeCategory> list, SoundscapeCategory soundscapeCategory, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(-217422203);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(soundscapeCategory)) {
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
        boolean z10 = false;
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.t v9 = p2.v(p2.e(i3.q.f13017a, 1.0f), null, 3);
            f1 d10 = p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.t c5 = i3.a.c(v9, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            if ((i11 & 896) == 256) {
                z10 = true;
            }
            Object L = qVar.L();
            if (z10 || L == u2.l.f33918a) {
                L = new e(lVar, 0);
                qVar.h0(L);
            }
            ChipGroupKt.ChipGroup(null, (ho.l) L, new b(1), list, soundscapeCategory, null, null, qVar, (i11 << 9) & 64512, 97);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 18, list, soundscapeCategory, lVar);
        }
    }

    public static final z FilterChips$lambda$0$0$0(ho.l lVar, SoundscapeCategory soundscapeCategory) {
        soundscapeCategory.getClass();
        lVar.invoke(soundscapeCategory);
        return z.f31622a;
    }

    public static final String FilterChips$lambda$0$1(SoundscapeCategory soundscapeCategory, u2.m mVar, int i10) {
        String R;
        soundscapeCategory.getClass();
        q qVar = (q) mVar;
        qVar.X(-2124958031);
        Integer labelRes = soundscapeCategory.getLabelRes();
        if (labelRes == null) {
            qVar.X(-1101686282);
            qVar.p(false);
            R = null;
        } else {
            qVar.X(-1101686281);
            R = kj.c.R(qVar, labelRes.intValue());
            qVar.p(false);
        }
        if (R == null) {
            R = soundscapeCategory.fallbackDisplayName();
        }
        qVar.p(false);
        return R;
    }

    public static final z FilterChips$lambda$1(List list, SoundscapeCategory soundscapeCategory, ho.l lVar, int i10, u2.m mVar, int i11) {
        FilterChips(list, soundscapeCategory, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void LoadingState(i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        int i13;
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1549691410);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (qVar.f(tVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i14 != 0) {
                tVar = i3.q.f13017a;
            }
            i3.t d10 = p2.d(tVar, 1.0f);
            f1 d11 = p.d(i3.d.f13001e, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.t c5 = i3.a.c(d10, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, d11, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            y4.a(null, 0L, u.P, 0L, 0, u.P, qVar, 0, 63);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.t(tVar, i10, i11, 2);
        }
    }

    public static final z LoadingState$lambda$1(i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        LoadingState(tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_SoundscapesScreen_Content_Few(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1208902692);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$SoundscapesScreenKt.INSTANCE.m1536getLambda$1572457102$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 15);
        }
    }

    public static final z Preview_SoundscapesScreen_Content_Few$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SoundscapesScreen_Content_Few(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SoundscapesScreen_Content_Many(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1330119655);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$SoundscapesScreenKt.INSTANCE.m1535getLambda$1350132463$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 14);
        }
    }

    public static final z Preview_SoundscapesScreen_Content_Many$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SoundscapesScreen_Content_Many(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SoundscapesScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-2015926222);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$SoundscapesScreenKt.INSTANCE.m1537getLambda$1918080440$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 16);
        }
    }

    public static final z Preview_SoundscapesScreen_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SoundscapesScreen_Error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SoundscapesScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-72435098);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$SoundscapesScreenKt.INSTANCE.m1539getLambda$531919108$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.e(i10, 13);
        }
    }

    public static final z Preview_SoundscapesScreen_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SoundscapesScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SoundscapeControls(ho.l lVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        float f10;
        boolean z10;
        int i14;
        q qVar = (q) mVar;
        qVar.Z(-408320873);
        if ((i10 & 6) == 0) {
            if (qVar.h(lVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            boolean z11 = false;
            if ((i12 & 19) == 18) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                if (i15 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                i3.t E = r1.d.E(p2.e(tVar4, 1.0f), 16);
                k2 a10 = i2.a(r1.j.g(12), i3.d.f13004y0, qVar, 6);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                i3.t c5 = i3.a.c(E, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(h4.g.f11907f, a10, qVar);
                r.J(h4.g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar);
                r.J(h4.g.f11905d, c5, qVar);
                String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_voice_picker_reset);
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonVariant buttonVariant = ButtonVariant.Secondary;
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f10 = Float.MAX_VALUE;
                } else {
                    f10 = 1.0f;
                }
                m1 m1Var = new m1(f10, true);
                int i16 = i12 & 14;
                if (i16 == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z10 || L == eVar) {
                    L = new d(lVar, 0);
                    qVar.h0(L);
                }
                i3.t tVar5 = tVar4;
                float f11 = 1.0f;
                ButtonKt.Button(R, (ho.a) L, m1Var, buttonSize, buttonVariant, null, null, false, false, false, qVar, 27648, 992);
                String R2 = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_voice_picker_save);
                ButtonVariant buttonVariant2 = ButtonVariant.Primary;
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f11 = Float.MAX_VALUE;
                }
                m1 m1Var2 = new m1(f11, true);
                if (i16 == 4) {
                    z11 = true;
                }
                Object L2 = qVar.L();
                if (z11 || L2 == eVar) {
                    L2 = new d(lVar, 1);
                    qVar.h0(L2);
                }
                ButtonKt.Button(R2, (ho.a) L2, m1Var2, buttonSize, buttonVariant2, null, null, false, false, false, qVar, 27648, 992);
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.core.p(lVar, tVar3, i10, i11, 16);
                return;
            }
            return;
        }
        tVar2 = tVar;
        boolean z112 = false;
        if ((i12 & 19) == 18) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z SoundscapeControls$lambda$0$0$0(ho.l lVar) {
        lVar.invoke(SoundscapesContract.Event.Reset.INSTANCE);
        return z.f31622a;
    }

    public static final z SoundscapeControls$lambda$0$1$0(ho.l lVar) {
        lVar.invoke(SoundscapesContract.Event.Save.INSTANCE);
        return z.f31622a;
    }

    public static final z SoundscapeControls$lambda$1(ho.l lVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        SoundscapeControls(lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0068  */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: SoundscapeIcon-FJfuzF0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1541SoundscapeIconFJfuzF0(final Soundscape soundscape, final boolean z6, final boolean z10, i3.t tVar, float f10, u2.m mVar, final int i10, final int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        int i14;
        float f11;
        int i15;
        boolean z11;
        final i3.t tVar3;
        final float f12;
        q qVar;
        r1 r10;
        float f13;
        h4.e eVar;
        float f14;
        h4.e eVar2;
        i3.t tVar4;
        i3.l lVar;
        h4.f fVar;
        h4.e eVar3;
        ?? r52;
        h4.d dVar;
        float f15;
        q qVar2;
        boolean z12;
        q qVar3;
        q qVar4;
        int i16;
        int i17;
        int i18;
        f4.p pVar = f4.q.f8839b;
        q qVar5 = (q) mVar;
        qVar5.Z(-1393378144);
        if ((i10 & 6) == 0) {
            if (qVar5.h(soundscape)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar5.g(z6)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar5.g(z10)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        int i19 = i11 & 8;
        if (i19 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar5.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                f11 = f10;
                if (qVar5.c(f11)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((i12 & 9363) != 9362) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (qVar5.O(i12 & 1, z11)) {
                    i3.q qVar6 = i3.q.f13017a;
                    if (i19 != 0) {
                        tVar2 = qVar6;
                    }
                    if (i14 != 0) {
                        f13 = 48;
                    } else {
                        f13 = f11;
                    }
                    boolean f16 = qVar5.f(soundscape.getId());
                    Object L = qVar5.L();
                    if (f16 || L == u2.l.f33918a) {
                        int hashCode = soundscape.getId().hashCode();
                        List<Integer> list = placeholderIcons;
                        L = Integer.valueOf(list.get(Math.abs(hashCode % list.size())).intValue());
                        qVar5.h0(L);
                    }
                    int intValue = ((Number) L).intValue();
                    i3.t c5 = m3.h.c(p2.o(tVar2, f13), z1.h.f39128a);
                    i3.l lVar2 = i3.d.f13001e;
                    f1 d10 = p.d(lVar2, false);
                    int hashCode2 = Long.hashCode(qVar5.T);
                    o l4 = qVar5.l();
                    i3.t c10 = i3.a.c(c5, qVar5);
                    h4.h.f11920i.getClass();
                    h4.f fVar2 = h4.g.f11903b;
                    qVar5.b0();
                    if (qVar5.S) {
                        qVar5.k(fVar2);
                    } else {
                        qVar5.k0();
                    }
                    h4.e eVar4 = h4.g.f11907f;
                    r.J(eVar4, d10, qVar5);
                    h4.e eVar5 = h4.g.f11906e;
                    r.J(eVar5, l4, qVar5);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    h4.e eVar6 = h4.g.f11908g;
                    r.y(qVar5, valueOf, eVar6);
                    h4.d dVar2 = h4.g.f11909h;
                    r.F(dVar2, qVar5);
                    h4.e eVar7 = h4.g.f11905d;
                    r.J(eVar7, c10, qVar5);
                    if (soundscape.getIconUrl() == null) {
                        qVar5.X(1902149164);
                        eVar3 = eVar6;
                        dVar = dVar2;
                        q qVar7 = qVar5;
                        float f17 = f13;
                        eVar = eVar5;
                        f14 = f17;
                        eVar2 = eVar7;
                        tVar4 = tVar2;
                        r52 = 0;
                        lVar = lVar2;
                        fVar = fVar2;
                        n.c(kd.a.M(intValue, qVar5, 0), soundscape.getName(), p2.d(qVar6, 1.0f), null, pVar, u.P, null, qVar7, u3.c.$stable | 24960, 104);
                        qVar7.p(false);
                        f15 = 1.0f;
                        qVar2 = qVar7;
                    } else {
                        float f18 = f13;
                        eVar = eVar5;
                        f14 = f18;
                        eVar2 = eVar7;
                        tVar4 = tVar2;
                        lVar = lVar2;
                        fVar = fVar2;
                        eVar3 = eVar6;
                        r52 = 0;
                        qVar5.X(1902423576);
                        ad.h hVar = new ad.h((Context) qVar5.j(AndroidCompositionLocals_androidKt.f2291b));
                        hVar.f1788c = soundscape.getIconUrl();
                        hVar.b();
                        hVar.f1804t = Integer.valueOf(intValue);
                        dVar = dVar2;
                        f15 = 1.0f;
                        qc.m.b(hVar.a(), soundscape.getName(), p2.d(qVar6, 1.0f), null, pVar, null, qVar5, 1573248, 4024);
                        q qVar8 = qVar5;
                        qVar8.p(false);
                        qVar2 = qVar8;
                    }
                    if (z6) {
                        qVar2.X(1902858661);
                        i3.t h10 = n.h(p2.d(qVar6, f15), p3.x.b(0.6f, p3.x.f26427b), h0.f26395b);
                        f1 d11 = p.d(lVar, r52);
                        int hashCode3 = Long.hashCode(qVar2.T);
                        o l7 = qVar2.l();
                        i3.t c11 = i3.a.c(h10, qVar2);
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(fVar);
                        } else {
                            qVar2.k0();
                        }
                        r.J(eVar4, d11, qVar2);
                        r.J(eVar, l7, qVar2);
                        defpackage.f.u(hashCode3, qVar2, eVar3, qVar2, dVar);
                        r.J(eVar2, c11, qVar2);
                        u2.m mVar2 = qVar2;
                        y2.a(kd.a.M(R.drawable.pause_lg, qVar2, r52), null, p2.o(qVar6, 24), p3.x.f26431f, mVar2, u3.c.$stable | 3504, 0);
                        q qVar9 = mVar2;
                        z12 = true;
                        qVar9.p(true);
                        qVar9.p(r52);
                        qVar3 = qVar9;
                    } else {
                        z12 = true;
                        qVar2.X(1903353576);
                        qVar2.p(r52);
                        qVar3 = qVar2;
                    }
                    if (z10) {
                        qVar3.X(1903390652);
                        i3.t d12 = p2.d(qVar6, 1.0f);
                        long j4 = p3.x.f26431f;
                        u2.m mVar3 = qVar3;
                        y4.a(d12, p3.x.b(0.8f, j4), 3, p3.x.b(0.3f, j4), 0, u.P, mVar3, 3510, 48);
                        q qVar10 = mVar3;
                        qVar10.p(r52);
                        qVar4 = qVar10;
                    } else {
                        qVar3.X(1903648200);
                        qVar3.p(r52);
                        qVar4 = qVar3;
                    }
                    qVar4.p(z12);
                    f12 = f14;
                    tVar3 = tVar4;
                    qVar = qVar4;
                } else {
                    q qVar11 = qVar5;
                    qVar11.R();
                    tVar3 = tVar2;
                    f12 = f11;
                    qVar = qVar11;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.h
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            z SoundscapeIcon_FJfuzF0$lambda$2;
                            int intValue2 = ((Integer) obj2).intValue();
                            SoundscapeIcon_FJfuzF0$lambda$2 = SoundscapesScreenKt.SoundscapeIcon_FJfuzF0$lambda$2(Soundscape.this, z6, z10, tVar3, f12, i10, i11, (u2.m) obj, intValue2);
                            return SoundscapeIcon_FJfuzF0$lambda$2;
                        }
                    };
                    return;
                }
                return;
            }
            f11 = f10;
            if ((i12 & 9363) != 9362) {
            }
            if (qVar5.O(i12 & 1, z11)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        f11 = f10;
        if ((i12 & 9363) != 9362) {
        }
        if (qVar5.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z SoundscapeIcon_FJfuzF0$lambda$2(Soundscape soundscape, boolean z6, boolean z10, i3.t tVar, float f10, int i10, int i11, u2.m mVar, int i12) {
        m1541SoundscapeIconFJfuzF0(soundscape, z6, z10, tVar, f10, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SoundscapeList(SoundscapesContract.State state, ho.l lVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        boolean z10;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(1626553668);
        if ((i10 & 6) == 0) {
            if (qVar.h(state)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                i3.t h10 = n.h(p2.e(qVar2, 1.0f), ib.i.d(ElevenLabsTheme.INSTANCE, qVar, ElevenLabsTheme.$stable), h0.f26395b);
                float f10 = 16;
                x a10 = w.a(r1.j.g(f10), i3.d.B0, qVar, 6);
                i3.t tVar5 = tVar4;
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                i3.t c5 = i3.a.c(h10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(h4.g.f11907f, a10, qVar);
                r.J(h4.g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar);
                r.J(h4.g.f11905d, c5, qVar);
                List<SoundscapeCategory> categories = state.getCategories();
                SoundscapeCategory selectedCategory = state.getSelectedCategory();
                int i17 = i12 & 112;
                if (i17 == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z10 || L == eVar) {
                    L = new e(lVar, 1);
                    qVar.h0(L);
                }
                FilterChips(categories, selectedCategory, (ho.l) L, qVar, 0);
                float mixerLevel = state.getMixerLevel();
                if (i17 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object L2 = qVar.L();
                if (z11 || L2 == eVar) {
                    L2 = new e(lVar, 2);
                    qVar.h0(L2);
                }
                VolumeControl(mixerLevel, (ho.l) L2, r1.d.G(qVar2, f10, u.P, 2), qVar, 384, 0);
                d2 d10 = r1.d.d(f10, u.P, 2);
                boolean h11 = qVar.h(state);
                if (i17 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z13 = h11 | z12;
                Object L3 = qVar.L();
                if (z13 || L3 == eVar) {
                    L3 = new io.elevenlabs.data.database.entities.reads.h(state, lVar, 14);
                    qVar.h0(L3);
                }
                qVar = qVar;
                c1.c(tVar5, null, d10, false, null, null, null, false, null, (ho.l) L3, qVar, ((i12 >> 6) & 14) | 384, 506);
                qVar.p(true);
                tVar3 = tVar5;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.home.v3.elements.c(state, lVar, tVar3, i10, i11, 7);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z SoundscapeList$lambda$0$0$0(ho.l lVar, SoundscapeCategory soundscapeCategory) {
        soundscapeCategory.getClass();
        lVar.invoke(new SoundscapesContract.Event.SelectTab(soundscapeCategory));
        return z.f31622a;
    }

    public static final z SoundscapeList$lambda$0$1$0(ho.l lVar, float f10) {
        lVar.invoke(new SoundscapesContract.Event.UpdateMixerLevel(f10));
        return z.f31622a;
    }

    public static final z SoundscapeList$lambda$0$2$0(final SoundscapesContract.State state, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        t1.t.c(tVar, null, null, new c3.j(new i(state, 1), true, 1308662617), 3);
        t1.t.c(tVar, null, null, new c3.j(new g(state, lVar), true, -1322498302), 3);
        final List<Soundscape> filteredSoundscapes = state.getFilteredSoundscapes();
        final l lVar2 = new l(5);
        final SoundscapesScreenKt$SoundscapeList$lambda$0$2$0$$inlined$items$default$1 soundscapesScreenKt$SoundscapeList$lambda$0$2$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt$SoundscapeList$lambda$0$2$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Soundscape) obj);
            }

            @Override // ho.l
            public final Void invoke(Soundscape soundscape) {
                return null;
            }
        };
        ((t1.i) tVar).u(filteredSoundscapes.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt$SoundscapeList$lambda$0$2$0$$inlined$items$default$2
            public final Object invoke(int i10) {
                return ho.l.this.invoke(filteredSoundscapes.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt$SoundscapeList$lambda$0$2$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(filteredSoundscapes.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt$SoundscapeList$lambda$0$2$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, u2.m mVar, int i11) {
                int i12;
                boolean z6;
                String str;
                final boolean z10;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((q) mVar).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i11 | i14;
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
                    final Soundscape soundscape = (Soundscape) filteredSoundscapes.get(i10);
                    qVar.X(-90851221);
                    Soundscape selectedSoundscape = state.getSelectedSoundscape();
                    if (selectedSoundscape != null) {
                        str = selectedSoundscape.getId();
                    } else {
                        str = null;
                    }
                    boolean c5 = kotlin.jvm.internal.m.c(str, soundscape.getId());
                    final boolean c10 = kotlin.jvm.internal.m.c(state.getPlayingPreviewId(), soundscape.getId());
                    Float soundscapeProgress = state.soundscapeProgress(soundscape.getId());
                    if (soundscapeProgress != null && soundscapeProgress.floatValue() < 1.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String name = soundscape.getName();
                    boolean g10 = qVar.g(c10) | qVar.h(soundscape) | qVar.f(lVar);
                    Object L = qVar.L();
                    if (g10 || L == u2.l.f33918a) {
                        final ho.l lVar3 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt$SoundscapeList$1$3$1$4$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1543invoke() {
                                Object playPreview;
                                if (c10) {
                                    playPreview = SoundscapesContract.Event.StopPreview.INSTANCE;
                                } else {
                                    playPreview = new SoundscapesContract.Event.PlayPreview(soundscape);
                                }
                                lVar3.invoke(playPreview);
                                lVar3.invoke(new SoundscapesContract.Event.SelectSoundscape(soundscape));
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1543invoke();
                                return z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    SoundscapesScreenKt.SoundscapeListItem(name, c5, (ho.a) L, null, z10, c3.k.d(-1295450198, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.SoundscapesScreenKt$SoundscapeList$1$3$1$4$2
                        public final void invoke(u2.m mVar2, int i15) {
                            boolean z11;
                            if ((i15 & 3) != 2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            q qVar2 = (q) mVar2;
                            if (qVar2.O(i15 & 1, z11)) {
                                SoundscapesScreenKt.m1541SoundscapeIconFJfuzF0(Soundscape.this, c10, z10, null, u.P, qVar2, 0, 24);
                            } else {
                                qVar2.R();
                            }
                        }

                        @Override // ho.p
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((u2.m) obj, ((Number) obj2).intValue());
                            return z.f31622a;
                        }
                    }, qVar), qVar, 196608, 8);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, 802480018));
        t1.t.c(tVar, null, null, ComposableSingletons$SoundscapesScreenKt.INSTANCE.m1540getLambda$664115423$app_productionRelease(), 3);
        return z.f31622a;
    }

    public static final z SoundscapeList$lambda$0$2$0$0(SoundscapesContract.State state, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        String R;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            r1.d.g(p2.f(qVar2, 24), qVar);
            Integer labelRes = state.getSelectedCategory().getLabelRes();
            if (labelRes == null) {
                qVar.X(949995118);
                qVar.p(false);
                R = null;
            } else {
                qVar.X(949995119);
                R = kj.c.R(qVar, labelRes.intValue());
                qVar.p(false);
            }
            if (R == null) {
                R = state.getSelectedCategory().fallbackDisplayName();
            }
            String Q = kj.c.Q(io.elevenlabs.readerapp.R.string.player_soundscapes_list_title, new Object[]{R}, qVar);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            j7.d(Q, r1.d.I(qVar2, u.P, u.P, u.P, 8, 7), defpackage.f.A(elevenLabsTheme, qVar, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getSubtitleMedium700(), qVar, 48, 0, 131064);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SoundscapeList$lambda$0$2$0$1(SoundscapesContract.State state, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        boolean z10;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_soundscapes_turn_off);
            if (state.getSelectedSoundscape() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean h10 = qVar.h(state) | qVar.f(lVar);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new c(state, lVar, 0);
                qVar.h0(L);
            }
            SoundscapeListItem(R, z10, (ho.a) L, null, false, ComposableSingletons$SoundscapesScreenKt.INSTANCE.m1538getLambda$315750360$app_productionRelease(), qVar, 196608, 24);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SoundscapeList$lambda$0$2$0$1$0$0(SoundscapesContract.State state, ho.l lVar) {
        if (state.getPlayingPreviewId() != null) {
            lVar.invoke(SoundscapesContract.Event.StopPreview.INSTANCE);
        }
        lVar.invoke(new SoundscapesContract.Event.SelectSoundscape(null));
        return z.f31622a;
    }

    public static final Object SoundscapeList$lambda$0$2$0$2(Soundscape soundscape) {
        soundscape.getClass();
        return soundscape.getId();
    }

    public static final z SoundscapeList$lambda$1(SoundscapesContract.State state, ho.l lVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        SoundscapeList(state, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SoundscapeListItem(String str, boolean z6, ho.a aVar, i3.t tVar, boolean z10, ho.p pVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        i3.t tVar2;
        int i13;
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        i3.t tVar3;
        boolean z13;
        r1 r10;
        boolean z14;
        int i16;
        int i17;
        int i18;
        int i19;
        q qVar = (q) mVar;
        qVar.Z(-101176069);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z6)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i10 & 384) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i17 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        } else {
            aVar2 = aVar;
        }
        int i20 = i11 & 8;
        if (i20 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                z11 = z10;
                if (qVar.g(z11)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                if ((196608 & i10) == 0) {
                    if (qVar.h(pVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (qVar.O(i12 & 1, z12)) {
                    i3.q qVar2 = i3.q.f13017a;
                    if (i20 != 0) {
                        tVar2 = qVar2;
                    }
                    if (i14 != 0) {
                        z14 = false;
                    } else {
                        z14 = z11;
                    }
                    i3.t b10 = p2.b(p2.e(tVar2, 1.0f), u.P, 72, 1);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    int i21 = ElevenLabsTheme.$stable;
                    i3.t p10 = n.p(m3.h.c(b10, elevenLabsTheme.getShapes(qVar, i21).getSm()), false, null, null, null, aVar2, 15);
                    k2 a10 = i2.a(r1.j.g(12), i3.d.f13005z0, qVar, 54);
                    int hashCode = Long.hashCode(qVar.T);
                    o l4 = qVar.l();
                    i3.t c5 = i3.a.c(p10, qVar);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar.b0();
                    int i22 = i12;
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    h4.e eVar = h4.g.f11907f;
                    r.J(eVar, a10, qVar);
                    h4.e eVar2 = h4.g.f11906e;
                    r.J(eVar2, l4, qVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar3 = h4.g.f11908g;
                    r.y(qVar, valueOf, eVar3);
                    h4.d dVar = h4.g.f11909h;
                    r.F(dVar, qVar);
                    h4.e eVar4 = h4.g.f11905d;
                    r.J(eVar4, c5, qVar);
                    pVar.invoke(qVar, Integer.valueOf((i22 >> 15) & 14));
                    y0 subtitleMedium700 = elevenLabsTheme.getTypo(qVar, i21).getSubtitleMedium700();
                    long b11 = defpackage.f.b(elevenLabsTheme, qVar, i21);
                    boolean z15 = z14;
                    i3.t tVar4 = tVar2;
                    if (1.0f <= 0.0d) {
                        s1.a.a("invalid weight; must be greater than zero");
                    }
                    j7.d(str, new m1(1.0f, true), b11, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, subtitleMedium700, qVar, i22 & 14, 24960, 110584);
                    qVar = qVar;
                    i3.t o6 = p2.o(qVar2, 24);
                    f1 d10 = p.d(i3.d.f13001e, false);
                    int hashCode2 = Long.hashCode(qVar.T);
                    o l7 = qVar.l();
                    i3.t c10 = i3.a.c(o6, qVar);
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar);
                    } else {
                        qVar.k0();
                    }
                    r.J(eVar, d10, qVar);
                    r.J(eVar2, l7, qVar);
                    defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
                    r.J(eVar4, c10, qVar);
                    if (z15) {
                        qVar.X(-1604819405);
                        y4.a(p2.o(qVar2, 20), defpackage.f.A(elevenLabsTheme, qVar, i21), 2, 0L, 0, u.P, qVar, 390, 56);
                        qVar = qVar;
                        qVar.p(false);
                    } else if (z6) {
                        qVar.X(-1160139517);
                        y2.a(kd.a.M(R.drawable.check_1, qVar, 0), null, null, defpackage.f.b(elevenLabsTheme, qVar, i21), qVar, u3.c.$stable | 48, 4);
                        qVar.p(false);
                    } else {
                        qVar.X(-1604359427);
                        qVar.p(false);
                    }
                    qVar.p(true);
                    qVar.p(true);
                    z13 = z15;
                    tVar3 = tVar4;
                } else {
                    qVar.R();
                    tVar3 = tVar2;
                    z13 = z11;
                }
                r10 = qVar.r();
                if (r10 != null) {
                    r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.x(str, z6, aVar, tVar3, z13, pVar, i10, i11);
                    return;
                }
                return;
            }
            z11 = z10;
            if ((196608 & i10) == 0) {
            }
            if ((74899 & i12) != 74898) {
            }
            if (qVar.O(i12 & 1, z12)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        tVar2 = tVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        z11 = z10;
        if ((196608 & i10) == 0) {
        }
        if ((74899 & i12) != 74898) {
        }
        if (qVar.O(i12 & 1, z12)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z SoundscapeListItem$lambda$1(String str, boolean z6, ho.a aVar, i3.t tVar, boolean z10, ho.p pVar, int i10, int i11, u2.m mVar, int i12) {
        SoundscapeListItem(str, z6, aVar, tVar, z10, pVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SoundscapesScreen(SoundscapesViewModel soundscapesViewModel, ho.a aVar, u2.m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        SoundscapesViewModel soundscapesViewModel2;
        q7.c cVar;
        SoundscapesViewModel soundscapesViewModel3;
        boolean z10;
        Object L;
        boolean h10;
        Object L2;
        int i13;
        int i14;
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(-1559530484);
        if ((i10 & 6) == 0) {
            if ((i11 & 1) == 0 && qVar.h(soundscapesViewModel)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        boolean z11 = true;
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 1) != 0) {
                    i12 &= -15;
                }
            } else if ((i11 & 1) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    soundscapesViewModel3 = (SoundscapesViewModel) gg.b.j0(e0.f20562a.b(SoundscapesViewModel.class), a10, null, o6, cVar, qVar);
                    i12 &= -15;
                    qVar.q();
                    z0 m10 = c1.m(soundscapesViewModel3.getStateFlow(), qVar, 0);
                    boolean h11 = qVar.h(soundscapesViewModel3);
                    if ((i12 & 112) != 32) {
                        z11 = false;
                    }
                    z10 = h11 | z11;
                    L = qVar.L();
                    u2.e eVar = u2.l.f33918a;
                    if (!z10 || L == eVar) {
                        L = new SoundscapesScreenKt$SoundscapesScreen$1$1(soundscapesViewModel3, aVar, null);
                        qVar.h0(L);
                    }
                    r.f((ho.p) L, z.f31622a, qVar);
                    SoundscapesContract.State SoundscapesScreen$lambda$0 = SoundscapesScreen$lambda$0(m10);
                    h10 = qVar.h(soundscapesViewModel3);
                    L2 = qVar.L();
                    if (!h10 || L2 == eVar) {
                        L2 = new SoundscapesScreenKt$SoundscapesScreen$2$1(soundscapesViewModel3);
                        qVar.h0(L2);
                    }
                    SoundscapesUI(SoundscapesScreen$lambda$0, (ho.l) ((oo.g) L2), qVar, 0);
                    soundscapesViewModel2 = soundscapesViewModel3;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            soundscapesViewModel3 = soundscapesViewModel;
            qVar.q();
            z0 m102 = c1.m(soundscapesViewModel3.getStateFlow(), qVar, 0);
            boolean h112 = qVar.h(soundscapesViewModel3);
            if ((i12 & 112) != 32) {
            }
            z10 = h112 | z11;
            L = qVar.L();
            u2.e eVar2 = u2.l.f33918a;
            if (!z10) {
            }
            L = new SoundscapesScreenKt$SoundscapesScreen$1$1(soundscapesViewModel3, aVar, null);
            qVar.h0(L);
            r.f((ho.p) L, z.f31622a, qVar);
            SoundscapesContract.State SoundscapesScreen$lambda$02 = SoundscapesScreen$lambda$0(m102);
            h10 = qVar.h(soundscapesViewModel3);
            L2 = qVar.L();
            if (!h10) {
            }
            L2 = new SoundscapesScreenKt$SoundscapesScreen$2$1(soundscapesViewModel3);
            qVar.h0(L2);
            SoundscapesUI(SoundscapesScreen$lambda$02, (ho.l) ((oo.g) L2), qVar, 0);
            soundscapesViewModel2 = soundscapesViewModel3;
        } else {
            qVar.R();
            soundscapesViewModel2 = soundscapesViewModel;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(soundscapesViewModel2, aVar, i10, i11, 17);
        }
    }

    private static final SoundscapesContract.State SoundscapesScreen$lambda$0(s2 s2Var) {
        return (SoundscapesContract.State) s2Var.getValue();
    }

    public static final z SoundscapesScreen$lambda$3(SoundscapesViewModel soundscapesViewModel, ho.a aVar, int i10, int i11, u2.m mVar, int i12) {
        SoundscapesScreen(soundscapesViewModel, aVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void SoundscapesUI(SoundscapesContract.State state, final ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        q qVar = (q) mVar;
        qVar.Z(798741302);
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
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            WeakHashMap weakHashMap = c3.f29142x;
            k5.a(null, c3.k.d(407984626, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.player.soundscapes.f
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z SoundscapesUI$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    SoundscapesUI$lambda$0 = SoundscapesScreenKt.SoundscapesUI$lambda$0(ho.l.this, (u2.m) obj, intValue);
                    return SoundscapesUI$lambda$0;
                }
            }, qVar), null, null, null, 0, 0L, 0L, u0.e(qVar).f29154l, c3.k.d(1761562823, true, new g(lVar, state), qVar), qVar, 805306416, 253);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(state, lVar, i10, 16);
        }
    }

    public static final z SoundscapesUI$lambda$0(ho.l lVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderKt.Header(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_soundscapes_soundscapes), null, c3.k.d(-1943893586, true, new i(lVar, 0), qVar), null, null, 0, qVar, 384, 58);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SoundscapesUI$lambda$0$0(ho.l lVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            int i11 = R.drawable.close;
            String R = kj.c.R(qVar, R.string.accessibility_bottom_sheet_dialog_close);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new d(lVar, 3);
                qVar.h0(L);
            }
            ButtonIconKt.ButtonIcon(i11, R, (ho.a) L, null, ButtonIconVariant.Secondary, ButtonIconSize.Medium, false, false, false, qVar, 221184, 456);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SoundscapesUI$lambda$0$0$0$0(ho.l lVar) {
        lVar.invoke(SoundscapesContract.Event.Close.INSTANCE);
        return z.f31622a;
    }

    public static final z SoundscapesUI$lambda$1(ho.l lVar, SoundscapesContract.State state, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        float f10;
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
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t D = r1.d.D(p2.d(qVar2, 1.0f), z1Var);
            x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            i3.t c5 = i3.a.c(D, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            r.J(eVar4, c5, qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            f1 d10 = p.d(i3.d.f12998b, false);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            i3.t c10 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, d10, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c10, qVar);
            if (state.isLoading()) {
                qVar.X(937813649);
                LoadingState(null, qVar, 0, 1);
                qVar.p(false);
            } else if (state.getErrorMessage() != null) {
                qVar.X(937815947);
                String j4 = defpackage.f.j(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_soundscapes_load_error), "\n\n", state.getErrorMessage());
                boolean f11 = qVar.f(lVar);
                Object L = qVar.L();
                if (f11 || L == u2.l.f33918a) {
                    L = new d(lVar, 2);
                    qVar.h0(L);
                }
                ErrorState(j4, (ho.a) L, null, qVar, 0, 4);
                qVar.p(false);
            } else {
                qVar.X(937824147);
                f10 = 1.0f;
                SoundscapeList(state, lVar, null, qVar, 0, 4);
                qVar.p(false);
                i3.t b10 = r1.t.f29349a.b(p2.f(p2.e(qVar2, f10), 50), i3.d.Z);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i13 = ElevenLabsTheme.$stable;
                VerticalGradientKt.VerticalGradient(b10, ig.f.I(new p3.x(p3.x.b(u.P, elevenLabsTheme.getColor(qVar, i13).getBackground().m2003getPrimary0d7_KjU())), new p3.x(ib.i.d(elevenLabsTheme, qVar, i13))), qVar, 0, 0);
                qVar.p(true);
                SoundscapeControls(lVar, null, qVar, 0, 2);
                qVar.p(true);
            }
            f10 = 1.0f;
            i3.t b102 = r1.t.f29349a.b(p2.f(p2.e(qVar2, f10), 50), i3.d.Z);
            ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
            int i132 = ElevenLabsTheme.$stable;
            VerticalGradientKt.VerticalGradient(b102, ig.f.I(new p3.x(p3.x.b(u.P, elevenLabsTheme2.getColor(qVar, i132).getBackground().m2003getPrimary0d7_KjU())), new p3.x(ib.i.d(elevenLabsTheme2, qVar, i132))), qVar, 0, 0);
            qVar.p(true);
            SoundscapeControls(lVar, null, qVar, 0, 2);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SoundscapesUI$lambda$1$0$0$0$0(ho.l lVar) {
        lVar.invoke(SoundscapesContract.Event.Retry.INSTANCE);
        return z.f31622a;
    }

    public static final z SoundscapesUI$lambda$2(SoundscapesContract.State state, ho.l lVar, int i10, u2.m mVar, int i11) {
        SoundscapesUI(state, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void VolumeControl(float f10, ho.l lVar, i3.t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        i3.t tVar2;
        int i13;
        boolean z6;
        i3.t tVar3;
        r1 r10;
        i3.t tVar4;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(1801615041);
        if ((i10 & 6) == 0) {
            if (qVar.c(f10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 147) == 146) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i12 & 1, z6)) {
                i3.q qVar2 = i3.q.f13017a;
                if (i16 != 0) {
                    tVar4 = qVar2;
                } else {
                    tVar4 = tVar2;
                }
                x a10 = w.a(r1.j.g(16), i3.d.B0, qVar, 6);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                i3.t c5 = i3.a.c(tVar4, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar);
                } else {
                    qVar.k0();
                }
                r.J(h4.g.f11907f, a10, qVar);
                r.J(h4.g.f11906e, l4, qVar);
                r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                r.F(h4.g.f11909h, qVar);
                r.J(h4.g.f11905d, c5, qVar);
                String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_soundscapes_volume);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i17 = ElevenLabsTheme.$stable;
                j7.d(R, null, defpackage.f.A(elevenLabsTheme, qVar, i17), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i17).getSubtitleMedium700(), qVar, 0, 0, 131066);
                SliderKt.Slider(f10, lVar, kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_soundscapes_volume), p2.e(qVar2, 1.0f), String.valueOf(jo.a.y(100 * f10)), null, new no.c(u.P, 1.0f), qVar, (i12 & 112) | (i12 & 14) | 3072, 32);
                qVar.p(true);
                tVar3 = tVar4;
            } else {
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.queue.b(f10, lVar, tVar3, i10, i11, 1);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((i12 & 147) == 146) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z VolumeControl$lambda$1(float f10, ho.l lVar, i3.t tVar, int i10, int i11, u2.m mVar, int i12) {
        VolumeControl(f10, lVar, tVar, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }
}
