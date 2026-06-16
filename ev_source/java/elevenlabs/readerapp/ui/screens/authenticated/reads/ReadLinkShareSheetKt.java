package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadShareResult;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.ErrorContainerKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u001a7\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a;\u0010\u0015\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001a3\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/elevenlabs/domain/model/ReadMeta;", "read", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareOption;", "shareOption", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareViewModel;", "vm", "ReadLinkShareSheet", "(Lio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareOption;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lj/j;", "Landroid/content/Intent;", "Lm/a;", "shareLauncher", "", Constants.ScionAnalytics.PARAM_LABEL, "handleWhatsAppShare", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareState;Lj/j;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareViewModel;Ljava/lang/String;)V", "handleTwitterShare", "handleMoreShare", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareState;Lj/j;Ljava/lang/String;)V", "ReadShareSheetUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ReadLinkShareState;Lu2/m;I)V", "Preview_ReadShareSheet_Idle", "(Lu2/m;I)V", "Preview_ReadShareSheet_Error", "SHARE_TAG", "Ljava/lang/String;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ReadLinkShareSheetKt {
    private static final String SHARE_TAG = "ReadLinkShare";

    public static final void Preview_ReadShareSheet_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2146262126);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadShareSheetUI(new ReadLinkShareState(false, null, "Some error", null, null, 27, null), qVar, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 6);
        }
    }

    public static final sn.z Preview_ReadShareSheet_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadShareSheet_Error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ReadShareSheet_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-696242842);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ReadShareSheetUI(new ReadLinkShareState(false, null, null, null, null, 31, null), qVar, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 5);
        }
    }

    public static final sn.z Preview_ReadShareSheet_Idle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ReadShareSheet_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        if ((r27 & 8) != 0) goto L147;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReadLinkShareSheet(ReadMeta readMeta, ReadLinkShareOption readLinkShareOption, ho.a aVar, ReadLinkShareViewModel readLinkShareViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ReadLinkShareViewModel readLinkShareViewModel2;
        boolean z6;
        q7.c cVar;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        int i15;
        int i16;
        readMeta.getClass();
        readLinkShareOption.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(736638078);
        if ((i10 & 6) == 0) {
            if (qVar.h(readMeta)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.d(readLinkShareOption.ordinal())) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                readLinkShareViewModel2 = readLinkShareViewModel;
                if (qVar.h(readLinkShareViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                readLinkShareViewModel2 = readLinkShareViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            readLinkShareViewModel2 = readLinkShareViewModel;
        }
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
                        readLinkShareViewModel2 = (ReadLinkShareViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(ReadLinkShareViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                boolean h10 = qVar.h(readLinkShareViewModel2) | qVar.h(readMeta);
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z13 = z10 | h10;
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z13 || L == eVar) {
                    L = new ReadLinkShareSheetKt$ReadLinkShareSheet$1$1(readLinkShareViewModel2, readMeta, readLinkShareOption, null);
                    qVar.h0(L);
                }
                u2.r.f((ho.p) L, readMeta, qVar);
                ReadLinkShareState readLinkShareState = (ReadLinkShareState) u2.r.o(readLinkShareViewModel2.getStateFlow(), qVar, 0).getValue();
                androidx.fragment.app.n0 n0Var = new androidx.fragment.app.n0(4);
                boolean h11 = qVar.h(readLinkShareViewModel2);
                int i17 = i12 & 896;
                if (i17 == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z14 = h11 | z11;
                Object L2 = qVar.L();
                if (z14 || L2 == eVar) {
                    L2 = new h(readLinkShareViewModel2, aVar, 9);
                    qVar.h0(L2);
                }
                j.j C = android.support.v4.media.session.b.C(n0Var, (ho.l) L2, qVar, 0);
                String R = kj.c.R(qVar, R.string.share_choose_an_app);
                ReadShareResult data = readLinkShareState.getData();
                boolean h12 = qVar.h(readLinkShareState) | qVar.h(C) | qVar.h(readLinkShareViewModel2) | qVar.f(R);
                Object L3 = qVar.L();
                if (h12 || L3 == eVar) {
                    ReadLinkShareSheetKt$ReadLinkShareSheet$2$1 readLinkShareSheetKt$ReadLinkShareSheet$2$1 = new ReadLinkShareSheetKt$ReadLinkShareSheet$2$1(readLinkShareState, C, readLinkShareViewModel2, R, null);
                    qVar.h0(readLinkShareSheetKt$ReadLinkShareSheet$2$1);
                    L3 = readLinkShareSheetKt$ReadLinkShareSheet$2$1;
                }
                u2.r.f((ho.p) L3, data, qVar);
                boolean h13 = qVar.h(readLinkShareViewModel2);
                if (i17 == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z15 = h13 | z12;
                Object L4 = qVar.L();
                if (z15 || L4 == eVar) {
                    L4 = new x(readLinkShareViewModel2, aVar, 2);
                    qVar.h0(L4);
                }
                BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, 0L, t2.u.P, (ho.a) L4, false, (ho.r) c3.k.d(435910192, true, new q(readLinkShareState, 1), qVar), (u2.m) qVar, 1572864, 47);
                qVar = qVar;
            }
        } else {
            qVar.R();
        }
        ReadLinkShareViewModel readLinkShareViewModel3 = readLinkShareViewModel2;
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) readMeta, (Object) readLinkShareOption, aVar, (Object) readLinkShareViewModel3, i10, i11, 28);
        }
    }

    private static final void ReadLinkShareSheet$dismiss(ReadLinkShareViewModel readLinkShareViewModel, ho.a aVar) {
        readLinkShareViewModel.dismissed();
        aVar.invoke();
    }

    public static final sn.z ReadLinkShareSheet$lambda$1$0(ReadLinkShareViewModel readLinkShareViewModel, ho.a aVar, m.a aVar2) {
        aVar2.getClass();
        ReadLinkShareSheet$dismiss(readLinkShareViewModel, aVar);
        return sn.z.f31622a;
    }

    public static final sn.z ReadLinkShareSheet$lambda$3$0(ReadLinkShareViewModel readLinkShareViewModel, ho.a aVar) {
        ReadLinkShareSheet$dismiss(readLinkShareViewModel, aVar);
        return sn.z.f31622a;
    }

    public static final sn.z ReadLinkShareSheet$lambda$4(ReadLinkShareState readLinkShareState, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        ReadShareSheetUI(readLinkShareState, mVar, 0);
        return sn.z.f31622a;
    }

    public static final sn.z ReadLinkShareSheet$lambda$5(ReadMeta readMeta, ReadLinkShareOption readLinkShareOption, ho.a aVar, ReadLinkShareViewModel readLinkShareViewModel, int i10, int i11, u2.m mVar, int i12) {
        ReadLinkShareSheet(readMeta, readLinkShareOption, aVar, readLinkShareViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    private static final void ReadShareSheetUI(ReadLinkShareState readLinkShareState, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-238603548);
        if ((i10 & 6) == 0) {
            if (qVar.h(readLinkShareState)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t f10 = ib.i.f(elevenLabsTheme, qVar, i13, e10);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.C0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(f10, qVar);
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
            if (!wq.n.m0(readLinkShareState.getError())) {
                qVar.X(-1583774655);
                ErrorContainerKt.ErrorContainer(readLinkShareState.getError(), qVar, 0);
                qVar.p(false);
                z10 = true;
            } else {
                qVar.X(-1583709493);
                LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar, 0, 15);
                ib.i.p(elevenLabsTheme, qVar, i13, qVar2, qVar);
                j7.d(kj.c.R(qVar, R.string.share_read_link_loading), null, 0L, 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getSubtitleMedium700(), qVar, 0, 0, 130046);
                qVar = qVar;
                qVar.p(false);
                z10 = true;
            }
            qVar.p(z10);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new em.a(readLinkShareState, i10, 7);
        }
    }

    public static final sn.z ReadShareSheetUI$lambda$1(ReadLinkShareState readLinkShareState, int i10, u2.m mVar, int i11) {
        ReadShareSheetUI(readLinkShareState, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void handleMoreShare(ReadLinkShareState readLinkShareState, j.j jVar, String str) {
        String str2;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        ReadShareResult data = readLinkShareState.getData();
        if (data != null) {
            str2 = data.getUrl();
        } else {
            str2 = null;
        }
        intent.putExtra("android.intent.extra.TEXT", str2);
        Intent createChooser = Intent.createChooser(intent, str);
        createChooser.getClass();
        jVar.a(createChooser);
    }

    public static final void handleTwitterShare(ReadLinkShareState readLinkShareState, j.j jVar, ReadLinkShareViewModel readLinkShareViewModel, String str) {
        String str2;
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            ReadShareResult data = readLinkShareState.getData();
            if (data != null) {
                str2 = data.getUrl();
            } else {
                str2 = null;
            }
            intent.putExtra("android.intent.extra.TEXT", str2);
            intent.setPackage("com.twitter.android");
            jVar.a(intent);
        } catch (ActivityNotFoundException e10) {
            readLinkShareViewModel.getLogger().logError(SHARE_TAG, "Twitter sharing failed", e10);
            handleMoreShare(readLinkShareState, jVar, str);
        }
    }

    public static final void handleWhatsAppShare(ReadLinkShareState readLinkShareState, j.j jVar, ReadLinkShareViewModel readLinkShareViewModel, String str) {
        String str2;
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            ReadShareResult data = readLinkShareState.getData();
            if (data != null) {
                str2 = data.getUrl();
            } else {
                str2 = null;
            }
            intent.putExtra("android.intent.extra.TEXT", str2);
            intent.setPackage("com.whatsapp");
            jVar.a(intent);
        } catch (ActivityNotFoundException e10) {
            readLinkShareViewModel.getLogger().logError(SHARE_TAG, "Whatsapp sharing failed", e10);
            handleMoreShare(readLinkShareState, jVar, str);
        }
    }
}
