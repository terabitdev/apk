package io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.FileProvider;
import androidx.fragment.app.n0;
import c3.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import f4.f1;
import i3.t;
import io.elevenlabs.readerapp.BuildConfig;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.ReadShareDetailsScreenKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.VideoPlayerKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.x;
import q2.j7;
import r1.c3;
import r1.m1;
import r1.p;
import r1.p2;
import r1.u0;
import r1.w;
import sn.z;
import t2.u;
import u2.q;
import u2.r;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a3\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"", "bookmarkId", "voiceId", "Lkotlin/Function0;", "Lsn/z;", "onClose", "Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkShareDetailsViewModel;", "vm", "BookmarkShareDetailsScreen", "(Ljava/lang/String;Ljava/lang/String;Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkShareDetailsViewModel;Lu2/m;II)V", "Landroid/net/Uri;", "videoUri", "BookmarkShareContent", "(Landroid/net/Uri;Lu2/m;I)V", "Landroid/content/Context;", "context", "Lj/j;", "Landroid/content/Intent;", "Lm/a;", "shareLauncher", "handleInstagramShare", "(Landroid/content/Context;Landroid/net/Uri;Lj/j;Lio/elevenlabs/readerapp/ui/screens/authenticated/bookmarks/BookmarkShareDetailsViewModel;)V", "handleTwitterShare", "handleMoreShare", "(Landroid/content/Context;Landroid/net/Uri;Lj/j;)V", "BOOKMARK_SHARE_TAG", "Ljava/lang/String;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class BookmarkShareDetailsScreenKt {
    private static final String BOOKMARK_SHARE_TAG = "BookmarkShareDetails";

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookmarkShareAction.values().length];
            try {
                iArr[BookmarkShareAction.Instagram.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookmarkShareAction.Twitter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BookmarkShareAction.More.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final void BookmarkShareContent(final Uri uri, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        q qVar = (q) mVar;
        qVar.Z(1228289023);
        if ((i10 & 6) == 0) {
            if (qVar.h(uri)) {
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
            t d10 = p2.d(i3.q.f13017a, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            t c5 = m3.h.c(r1.d.G(d10, elevenLabsTheme.getSpacings(qVar, i13).m2353getX2D9Ej5fM(), u.P, 2), elevenLabsTheme.getShapes(qVar, i13).getXl());
            f1 d11 = p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c10 = i3.a.c(c5, qVar);
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
            r.J(h4.g.f11905d, c10, qVar);
            VideoPlayerKt.VideoPlayerCacheProvider(c3.k.d(1255565769, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.bookmarks.f
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z BookmarkShareContent$lambda$0$0;
                    int intValue = ((Integer) obj2).intValue();
                    BookmarkShareContent$lambda$0$0 = BookmarkShareDetailsScreenKt.BookmarkShareContent$lambda$0$0(uri, (u2.m) obj, intValue);
                    return BookmarkShareContent$lambda$0$0;
                }
            }, qVar), qVar, 6);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new em.a(uri, i10, 4);
        }
    }

    public static final z BookmarkShareContent$lambda$0$0(Uri uri, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            VideoPlayerKt.m1885VideoPlayer_Ogyb9c(p2.d(i3.q.f13017a, 1.0f), uri, x.f26427b, (ho.a) null, (ho.a) null, (ho.a) null, true, true, true, (Float) null, false, 0, (u2.m) qVar, 114819462, 0, 3640);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z BookmarkShareContent$lambda$1(Uri uri, int i10, u2.m mVar, int i11) {
        BookmarkShareContent(uri, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x039b  */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BookmarkShareDetailsScreen(String str, String str2, ho.a aVar, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel2;
        boolean z6;
        BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel3;
        q7.c cVar;
        boolean z10;
        int i13;
        BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel4;
        ?? r42;
        BookmarkShareDetailsState bookmarkShareDetailsState;
        boolean z11;
        boolean z12;
        boolean z13;
        Object L;
        u2.e eVar;
        Object L2;
        boolean f10;
        Object L3;
        File videoFile;
        boolean z14;
        String substring;
        q qVar;
        boolean z15;
        BookmarkShareDetailsState bookmarkShareDetailsState2;
        Context context;
        j.j jVar;
        BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel5;
        boolean z16;
        float f11;
        int i14;
        int i15;
        int i16;
        int i17;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(2100350175);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.f(str2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                bookmarkShareDetailsViewModel2 = bookmarkShareDetailsViewModel;
                if (qVar2.h(bookmarkShareDetailsViewModel2)) {
                    i14 = 2048;
                    i12 |= i14;
                }
            } else {
                bookmarkShareDetailsViewModel2 = bookmarkShareDetailsViewModel;
            }
            i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i14;
        } else {
            bookmarkShareDetailsViewModel2 = bookmarkShareDetailsViewModel;
        }
        boolean z17 = true;
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i12 & 1, z6)) {
            qVar2.T();
            if ((i10 & 1) != 0 && !qVar2.y()) {
                qVar2.R();
                if ((i11 & 8) != 0) {
                    BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel6 = bookmarkShareDetailsViewModel2;
                    i13 = i12 & (-7169);
                    bookmarkShareDetailsViewModel4 = bookmarkShareDetailsViewModel6;
                    r42 = 0;
                    qVar2.q();
                    bookmarkShareDetailsState = (BookmarkShareDetailsState) r.o(bookmarkShareDetailsViewModel4.getStateFlow(), qVar2, r42).getValue();
                    Context context2 = (Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b);
                    boolean h10 = qVar2.h(bookmarkShareDetailsViewModel4);
                    if ((i13 & 14) == 4) {
                    }
                    boolean z18 = h10 | z11;
                    if ((i13 & 112) == 32) {
                    }
                    z13 = z18 | z12;
                    L = qVar2.L();
                    eVar = u2.l.f33918a;
                    if (!z13) {
                    }
                    L = new BookmarkShareDetailsScreenKt$BookmarkShareDetailsScreen$1$1(bookmarkShareDetailsViewModel4, str, str2, null);
                    qVar2.h0(L);
                    r.g(str, str2, (ho.p) L, qVar2);
                    n0 n0Var = new n0(4);
                    L2 = qVar2.L();
                    if (L2 == eVar) {
                    }
                    j.j C = android.support.v4.media.session.b.C(n0Var, (ho.l) L2, qVar2, 48);
                    f10 = qVar2.f(bookmarkShareDetailsState.getVideoFile());
                    L3 = qVar2.L();
                    if (f10) {
                    }
                    videoFile = bookmarkShareDetailsState.getVideoFile();
                    if (videoFile != null) {
                    }
                    qVar2.h0(L3);
                    Uri uri = (Uri) L3;
                    i3.q qVar3 = i3.q.f13017a;
                    t d10 = p2.d(qVar3, 1.0f);
                    ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                    int i18 = ElevenLabsTheme.$stable;
                    t h11 = n.h(d10, elevenLabsTheme.getColors(qVar2, i18).getShareDetailsBackground(), h0.f26395b);
                    WeakHashMap weakHashMap = c3.f29142x;
                    t P = r1.d.P(h11, u0.e(qVar2).f29149g);
                    r1.x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
                    int hashCode = Long.hashCode(qVar2.T);
                    o l4 = qVar2.l();
                    t c5 = i3.a.c(P, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                    }
                    h4.e eVar2 = h4.g.f11907f;
                    r.J(eVar2, a10, qVar2);
                    h4.e eVar3 = h4.g.f11906e;
                    r.J(eVar3, l4, qVar2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    h4.e eVar4 = h4.g.f11908g;
                    r.y(qVar2, valueOf, eVar4);
                    h4.d dVar = h4.g.f11909h;
                    r.F(dVar, qVar2);
                    h4.e eVar5 = h4.g.f11905d;
                    r.J(eVar5, c5, qVar2);
                    int i19 = i13;
                    BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel7 = bookmarkShareDetailsViewModel4;
                    ReadShareDetailsScreenKt.ShareDetailsHeader(aVar, r1.d.I(qVar3, u.P, elevenLabsTheme.getSpacings(qVar2, i18).m2356getX4D9Ej5fM(), u.P, u.P, 13), qVar2, (i19 >> 6) & 14, 0);
                    if (bookmarkShareDetailsState.isLoading()) {
                    }
                    qVar2 = qVar;
                    qVar2.p(z15);
                    bookmarkShareDetailsViewModel3 = bookmarkShareDetailsViewModel7;
                }
            } else if ((i11 & 8) != 0) {
                androidx.lifecycle.r1 a11 = r7.a.a(qVar2);
                if (a11 != null) {
                    pl.f o6 = tb.a.o(a11, qVar2);
                    if (a11 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a11).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    z10 = false;
                    bookmarkShareDetailsViewModel2 = (BookmarkShareDetailsViewModel) gg.b.j0(e0.f20562a.b(BookmarkShareDetailsViewModel.class), a11, null, o6, cVar, qVar2);
                    i12 &= -7169;
                    BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel8 = bookmarkShareDetailsViewModel2;
                    i13 = i12;
                    bookmarkShareDetailsViewModel4 = bookmarkShareDetailsViewModel8;
                    r42 = z10;
                    qVar2.q();
                    bookmarkShareDetailsState = (BookmarkShareDetailsState) r.o(bookmarkShareDetailsViewModel4.getStateFlow(), qVar2, r42).getValue();
                    Context context22 = (Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b);
                    boolean h102 = qVar2.h(bookmarkShareDetailsViewModel4);
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = r42;
                    }
                    boolean z182 = h102 | z11;
                    if ((i13 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = r42;
                    }
                    z13 = z182 | z12;
                    L = qVar2.L();
                    eVar = u2.l.f33918a;
                    if (!z13 || L == eVar) {
                        L = new BookmarkShareDetailsScreenKt$BookmarkShareDetailsScreen$1$1(bookmarkShareDetailsViewModel4, str, str2, null);
                        qVar2.h0(L);
                    }
                    r.g(str, str2, (ho.p) L, qVar2);
                    n0 n0Var2 = new n0(4);
                    L2 = qVar2.L();
                    if (L2 == eVar) {
                        L2 = new i(1);
                        qVar2.h0(L2);
                    }
                    j.j C2 = android.support.v4.media.session.b.C(n0Var2, (ho.l) L2, qVar2, 48);
                    f10 = qVar2.f(bookmarkShareDetailsState.getVideoFile());
                    L3 = qVar2.L();
                    if (f10 && L3 != eVar) {
                        z14 = true;
                    } else {
                        videoFile = bookmarkShareDetailsState.getVideoFile();
                        if (videoFile != null) {
                            z5.a c10 = FileProvider.c(context22, BuildConfig.APPLICATION_ID);
                            try {
                                String canonicalPath = videoFile.getCanonicalPath();
                                Iterator it = c10.f39164b.entrySet().iterator();
                                Map.Entry entry = null;
                                while (true) {
                                    z14 = z17;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Map.Entry entry2 = (Map.Entry) it.next();
                                    String path = ((File) entry2.getValue()).getPath();
                                    if (FileProvider.a(canonicalPath).startsWith(FileProvider.a(path).concat(Separators.SLASH)) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                                        entry = entry2;
                                    }
                                    z17 = z14;
                                }
                                if (entry != null) {
                                    String path2 = ((File) entry.getValue()).getPath();
                                    if (path2.endsWith(Separators.SLASH)) {
                                        substring = canonicalPath.substring(path2.length());
                                    } else {
                                        substring = canonicalPath.substring(path2.length() + 1);
                                    }
                                    L3 = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(c10.f39163a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, Separators.SLASH)).build();
                                } else {
                                    c6.t(defpackage.f.i("Failed to find configured root that contains ", canonicalPath));
                                    return;
                                }
                            } catch (IOException unused) {
                                com.google.android.recaptcha.internal.a.f(videoFile, "Failed to resolve canonical path for ");
                                return;
                            }
                        } else {
                            z14 = true;
                            L3 = null;
                        }
                        qVar2.h0(L3);
                    }
                    Uri uri2 = (Uri) L3;
                    i3.q qVar32 = i3.q.f13017a;
                    t d102 = p2.d(qVar32, 1.0f);
                    ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                    int i182 = ElevenLabsTheme.$stable;
                    t h112 = n.h(d102, elevenLabsTheme2.getColors(qVar2, i182).getShareDetailsBackground(), h0.f26395b);
                    WeakHashMap weakHashMap2 = c3.f29142x;
                    t P2 = r1.d.P(h112, u0.e(qVar2).f29149g);
                    r1.x a102 = w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
                    int hashCode2 = Long.hashCode(qVar2.T);
                    o l42 = qVar2.l();
                    t c52 = i3.a.c(P2, qVar2);
                    h4.h.f11920i.getClass();
                    h4.f fVar2 = h4.g.f11903b;
                    qVar2.b0();
                    if (qVar2.S) {
                        qVar2.k(fVar2);
                    } else {
                        qVar2.k0();
                    }
                    h4.e eVar22 = h4.g.f11907f;
                    r.J(eVar22, a102, qVar2);
                    h4.e eVar32 = h4.g.f11906e;
                    r.J(eVar32, l42, qVar2);
                    Integer valueOf2 = Integer.valueOf(hashCode2);
                    h4.e eVar42 = h4.g.f11908g;
                    r.y(qVar2, valueOf2, eVar42);
                    h4.d dVar2 = h4.g.f11909h;
                    r.F(dVar2, qVar2);
                    h4.e eVar52 = h4.g.f11905d;
                    r.J(eVar52, c52, qVar2);
                    int i192 = i13;
                    BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel72 = bookmarkShareDetailsViewModel4;
                    ReadShareDetailsScreenKt.ShareDetailsHeader(aVar, r1.d.I(qVar32, u.P, elevenLabsTheme2.getSpacings(qVar2, i182).m2356getX4D9Ej5fM(), u.P, u.P, 13), qVar2, (i192 >> 6) & 14, 0);
                    if (bookmarkShareDetailsState.isLoading()) {
                        qVar2.X(-1339733598);
                        t e10 = p2.e(qVar32, 1.0f);
                        if (1.0f <= 0.0d) {
                            s1.a.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f11 = Float.MAX_VALUE;
                        } else {
                            f11 = 1.0f;
                        }
                        z15 = z14;
                        t f12 = ib.i.f(elevenLabsTheme2, qVar2, i182, e10.then(new m1(f11, z15)));
                        r1.x a12 = w.a(r1.j.f29232e, i3.d.C0, qVar2, 54);
                        int hashCode3 = Long.hashCode(qVar2.T);
                        o l7 = qVar2.l();
                        t c11 = i3.a.c(f12, qVar2);
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(fVar2);
                        } else {
                            qVar2.k0();
                        }
                        r.J(eVar22, a12, qVar2);
                        r.J(eVar32, l7, qVar2);
                        defpackage.f.u(hashCode3, qVar2, eVar42, qVar2, dVar2);
                        r.J(eVar52, c11, qVar2);
                        LoaderKt.m1840LoadereopBjH0(null, elevenLabsTheme2.getColors(qVar2, i182).getShareDetailsPrimaryText(), 0L, null, qVar2, 0, 13);
                        ib.i.p(elevenLabsTheme2, qVar2, i182, qVar32, qVar2);
                        j7.d(kj.c.R(qVar2, R.string.bookmark_options_sheet_share_loading), null, elevenLabsTheme2.getColors(qVar2, i182).getShareDetailsPrimaryText(), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme2.getTypo(qVar2, i182).getSubtitleMedium700(), qVar2, 0, 0, 130042);
                        qVar = qVar2;
                        qVar.p(z15);
                        qVar.p(false);
                    } else {
                        qVar = qVar2;
                        z15 = z14;
                        if (!wq.n.m0(bookmarkShareDetailsState.getError())) {
                            qVar.X(-1338936464);
                            String error = bookmarkShareDetailsState.getError();
                            if ((i192 & 896) == 256) {
                                z16 = z15;
                            } else {
                                z16 = false;
                            }
                            Object L4 = qVar.L();
                            if (z16 || L4 == eVar) {
                                L4 = new BookmarkShareDetailsScreenKt$BookmarkShareDetailsScreen$2$2$1(aVar, null);
                                qVar.h0(L4);
                            }
                            r.f((ho.p) L4, error, qVar);
                            qVar.p(false);
                        } else {
                            if (uri2 != null) {
                                qVar.X(-1338739769);
                                float f13 = 1.0f;
                                if (1.0f <= 0.0d) {
                                    s1.a.a("invalid weight; must be greater than zero");
                                }
                                if (1.0f > Float.MAX_VALUE) {
                                    f13 = Float.MAX_VALUE;
                                }
                                t G = r1.d.G(new m1(f13, true), elevenLabsTheme2.getSpacings(qVar, i182).m2353getX2D9Ej5fM(), u.P, 2);
                                f1 d11 = p.d(i3.d.f12997a, false);
                                int hashCode4 = Long.hashCode(qVar.T);
                                o l10 = qVar.l();
                                t c12 = i3.a.c(G, qVar);
                                qVar.b0();
                                if (qVar.S) {
                                    qVar.k(fVar2);
                                } else {
                                    qVar.k0();
                                }
                                r.J(eVar22, d11, qVar);
                                r.J(eVar32, l10, qVar);
                                defpackage.f.u(hashCode4, qVar, eVar42, qVar, dVar2);
                                r.J(eVar52, c12, qVar);
                                BookmarkShareContent(uri2, qVar, 0);
                                qVar.p(true);
                                if (bookmarkShareDetailsState.isDisclaimerShown()) {
                                    qVar.X(-1338499178);
                                    bookmarkShareDetailsViewModel5 = bookmarkShareDetailsViewModel72;
                                    boolean h12 = qVar.h(bookmarkShareDetailsViewModel5);
                                    Object L5 = qVar.L();
                                    if (h12 || L5 == eVar) {
                                        L5 = new g(bookmarkShareDetailsViewModel5, 0);
                                        qVar.h0(L5);
                                    }
                                    ho.a aVar2 = (ho.a) L5;
                                    bookmarkShareDetailsState2 = bookmarkShareDetailsState;
                                    context = context22;
                                    jVar = C2;
                                    boolean h13 = qVar.h(bookmarkShareDetailsState2) | qVar.h(context) | qVar.h(uri2) | qVar.h(jVar) | qVar.h(bookmarkShareDetailsViewModel5);
                                    Object L6 = qVar.L();
                                    if (h13 || L6 == eVar) {
                                        e eVar6 = new e(bookmarkShareDetailsState2, context, uri2, jVar, bookmarkShareDetailsViewModel5);
                                        bookmarkShareDetailsState2 = bookmarkShareDetailsState2;
                                        context = context;
                                        uri2 = uri2;
                                        jVar = jVar;
                                        bookmarkShareDetailsViewModel5 = bookmarkShareDetailsViewModel5;
                                        qVar.h0(eVar6);
                                        L6 = eVar6;
                                    }
                                    BookmarkShareDisclaimerSheetKt.BookmarkShareDisclaimerSheet(aVar2, (ho.a) L6, qVar, 0);
                                    qVar.p(false);
                                } else {
                                    bookmarkShareDetailsState2 = bookmarkShareDetailsState;
                                    context = context22;
                                    jVar = C2;
                                    bookmarkShareDetailsViewModel5 = bookmarkShareDetailsViewModel72;
                                    qVar.X(-1337431507);
                                    qVar.p(false);
                                }
                                boolean h14 = qVar.h(bookmarkShareDetailsState2) | qVar.h(bookmarkShareDetailsViewModel5) | qVar.h(context) | qVar.h(uri2) | qVar.h(jVar);
                                Object L7 = qVar.L();
                                if (h14 || L7 == eVar) {
                                    e eVar7 = new e(context, uri2, jVar, bookmarkShareDetailsViewModel5, bookmarkShareDetailsState2, 2);
                                    qVar.h0(eVar7);
                                    L7 = eVar7;
                                }
                                ho.a aVar3 = (ho.a) L7;
                                boolean h15 = qVar.h(bookmarkShareDetailsState2) | qVar.h(bookmarkShareDetailsViewModel5) | qVar.h(context) | qVar.h(uri2) | qVar.h(jVar);
                                Object L8 = qVar.L();
                                if (h15 || L8 == eVar) {
                                    e eVar8 = new e(context, uri2, jVar, bookmarkShareDetailsViewModel5, bookmarkShareDetailsState2, 3);
                                    qVar.h0(eVar8);
                                    L8 = eVar8;
                                }
                                ho.a aVar4 = (ho.a) L8;
                                boolean h16 = qVar.h(bookmarkShareDetailsState2) | qVar.h(bookmarkShareDetailsViewModel5) | qVar.h(context) | qVar.h(uri2) | qVar.h(jVar);
                                Object L9 = qVar.L();
                                if (!h16 && L9 != eVar) {
                                    bookmarkShareDetailsViewModel72 = bookmarkShareDetailsViewModel5;
                                } else {
                                    BookmarkShareDetailsState bookmarkShareDetailsState3 = bookmarkShareDetailsState2;
                                    BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel9 = bookmarkShareDetailsViewModel5;
                                    e eVar9 = new e(context, uri2, jVar, bookmarkShareDetailsState3, bookmarkShareDetailsViewModel9);
                                    bookmarkShareDetailsViewModel72 = bookmarkShareDetailsViewModel9;
                                    qVar.h0(eVar9);
                                    L9 = eVar9;
                                }
                                qVar2 = qVar;
                                ReadShareDetailsScreenKt.ShareActions(null, aVar3, aVar4, (ho.a) L9, r1.d.I(qVar32, u.P, u.P, u.P, elevenLabsTheme2.getSpacings(qVar, i182).m2358getX6D9Ej5fM(), 7), qVar2, 0, 1);
                                qVar2.p(false);
                            } else {
                                qVar2 = qVar;
                                qVar2.X(-1336273843);
                                qVar2.p(false);
                            }
                            z15 = true;
                            qVar2.p(z15);
                            bookmarkShareDetailsViewModel3 = bookmarkShareDetailsViewModel72;
                        }
                    }
                    qVar2 = qVar;
                    qVar2.p(z15);
                    bookmarkShareDetailsViewModel3 = bookmarkShareDetailsViewModel72;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            z10 = false;
            BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel82 = bookmarkShareDetailsViewModel2;
            i13 = i12;
            bookmarkShareDetailsViewModel4 = bookmarkShareDetailsViewModel82;
            r42 = z10;
            qVar2.q();
            bookmarkShareDetailsState = (BookmarkShareDetailsState) r.o(bookmarkShareDetailsViewModel4.getStateFlow(), qVar2, r42).getValue();
            Context context222 = (Context) qVar2.j(AndroidCompositionLocals_androidKt.f2291b);
            boolean h1022 = qVar2.h(bookmarkShareDetailsViewModel4);
            if ((i13 & 14) == 4) {
            }
            boolean z1822 = h1022 | z11;
            if ((i13 & 112) == 32) {
            }
            z13 = z1822 | z12;
            L = qVar2.L();
            eVar = u2.l.f33918a;
            if (!z13) {
            }
            L = new BookmarkShareDetailsScreenKt$BookmarkShareDetailsScreen$1$1(bookmarkShareDetailsViewModel4, str, str2, null);
            qVar2.h0(L);
            r.g(str, str2, (ho.p) L, qVar2);
            n0 n0Var22 = new n0(4);
            L2 = qVar2.L();
            if (L2 == eVar) {
            }
            j.j C22 = android.support.v4.media.session.b.C(n0Var22, (ho.l) L2, qVar2, 48);
            f10 = qVar2.f(bookmarkShareDetailsState.getVideoFile());
            L3 = qVar2.L();
            if (f10) {
            }
            videoFile = bookmarkShareDetailsState.getVideoFile();
            if (videoFile != null) {
            }
            qVar2.h0(L3);
            Uri uri22 = (Uri) L3;
            i3.q qVar322 = i3.q.f13017a;
            t d1022 = p2.d(qVar322, 1.0f);
            ElevenLabsTheme elevenLabsTheme22 = ElevenLabsTheme.INSTANCE;
            int i1822 = ElevenLabsTheme.$stable;
            t h1122 = n.h(d1022, elevenLabsTheme22.getColors(qVar2, i1822).getShareDetailsBackground(), h0.f26395b);
            WeakHashMap weakHashMap22 = c3.f29142x;
            t P22 = r1.d.P(h1122, u0.e(qVar2).f29149g);
            r1.x a1022 = w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode22 = Long.hashCode(qVar2.T);
            o l422 = qVar2.l();
            t c522 = i3.a.c(P22, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar22 = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
            }
            h4.e eVar222 = h4.g.f11907f;
            r.J(eVar222, a1022, qVar2);
            h4.e eVar322 = h4.g.f11906e;
            r.J(eVar322, l422, qVar2);
            Integer valueOf22 = Integer.valueOf(hashCode22);
            h4.e eVar422 = h4.g.f11908g;
            r.y(qVar2, valueOf22, eVar422);
            h4.d dVar22 = h4.g.f11909h;
            r.F(dVar22, qVar2);
            h4.e eVar522 = h4.g.f11905d;
            r.J(eVar522, c522, qVar2);
            int i1922 = i13;
            BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel722 = bookmarkShareDetailsViewModel4;
            ReadShareDetailsScreenKt.ShareDetailsHeader(aVar, r1.d.I(qVar322, u.P, elevenLabsTheme22.getSpacings(qVar2, i1822).m2356getX4D9Ej5fM(), u.P, u.P, 13), qVar2, (i1922 >> 6) & 14, 0);
            if (bookmarkShareDetailsState.isLoading()) {
            }
            qVar2 = qVar;
            qVar2.p(z15);
            bookmarkShareDetailsViewModel3 = bookmarkShareDetailsViewModel722;
        } else {
            qVar2.R();
            bookmarkShareDetailsViewModel3 = bookmarkShareDetailsViewModel2;
        }
        r1 r10 = qVar2.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l((Object) str, (Object) str2, aVar, (Object) bookmarkShareDetailsViewModel3, i10, i11, 8);
        }
    }

    private static final void BookmarkShareDetailsScreen$handleShareAction(BookmarkShareDetailsState bookmarkShareDetailsState, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel, BookmarkShareAction bookmarkShareAction, ho.a aVar) {
        if (bookmarkShareDetailsState.isUserImportedRead()) {
            bookmarkShareDetailsViewModel.showDisclaimer(bookmarkShareAction);
        } else {
            aVar.invoke();
        }
    }

    public static final z BookmarkShareDetailsScreen$lambda$1$0(m.a aVar) {
        aVar.getClass();
        return z.f31622a;
    }

    public static final z BookmarkShareDetailsScreen$lambda$3$3$0(BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel) {
        bookmarkShareDetailsViewModel.hideDisclaimer();
        return z.f31622a;
    }

    public static final z BookmarkShareDetailsScreen$lambda$3$4$0(BookmarkShareDetailsState bookmarkShareDetailsState, Context context, Uri uri, j.j jVar, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel) {
        int i10;
        BookmarkShareAction pendingBookmarkShareAction = bookmarkShareDetailsState.getPendingBookmarkShareAction();
        if (pendingBookmarkShareAction == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[pendingBookmarkShareAction.ordinal()];
        }
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        handleMoreShare(context, uri, jVar);
                    } else {
                        c6.p();
                        return null;
                    }
                } else {
                    handleTwitterShare(context, uri, jVar, bookmarkShareDetailsViewModel);
                }
            } else {
                handleInstagramShare(context, uri, jVar, bookmarkShareDetailsViewModel);
            }
        }
        return z.f31622a;
    }

    public static final z BookmarkShareDetailsScreen$lambda$3$5$0(Context context, Uri uri, j.j jVar, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel, BookmarkShareDetailsState bookmarkShareDetailsState) {
        BookmarkShareDetailsScreen$handleShareAction(bookmarkShareDetailsState, bookmarkShareDetailsViewModel, BookmarkShareAction.Instagram, new d(context, uri, jVar, bookmarkShareDetailsViewModel, 0));
        return z.f31622a;
    }

    public static final z BookmarkShareDetailsScreen$lambda$3$5$0$0(Context context, Uri uri, j.j jVar, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel) {
        handleInstagramShare(context, uri, jVar, bookmarkShareDetailsViewModel);
        return z.f31622a;
    }

    public static final z BookmarkShareDetailsScreen$lambda$3$6$0(Context context, Uri uri, j.j jVar, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel, BookmarkShareDetailsState bookmarkShareDetailsState) {
        BookmarkShareDetailsScreen$handleShareAction(bookmarkShareDetailsState, bookmarkShareDetailsViewModel, BookmarkShareAction.Twitter, new d(context, uri, jVar, bookmarkShareDetailsViewModel, 1));
        return z.f31622a;
    }

    public static final z BookmarkShareDetailsScreen$lambda$3$6$0$0(Context context, Uri uri, j.j jVar, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel) {
        handleTwitterShare(context, uri, jVar, bookmarkShareDetailsViewModel);
        return z.f31622a;
    }

    public static final z BookmarkShareDetailsScreen$lambda$3$7$0(Context context, Uri uri, j.j jVar, BookmarkShareDetailsState bookmarkShareDetailsState, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel) {
        BookmarkShareDetailsScreen$handleShareAction(bookmarkShareDetailsState, bookmarkShareDetailsViewModel, BookmarkShareAction.More, new c3.b(context, uri, jVar, 11));
        return z.f31622a;
    }

    public static final z BookmarkShareDetailsScreen$lambda$3$7$0$0(Context context, Uri uri, j.j jVar) {
        handleMoreShare(context, uri, jVar);
        return z.f31622a;
    }

    public static final z BookmarkShareDetailsScreen$lambda$4(String str, String str2, ho.a aVar, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel, int i10, int i11, u2.m mVar, int i12) {
        BookmarkShareDetailsScreen(str, str2, aVar, bookmarkShareDetailsViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final void handleInstagramShare(Context context, Uri uri, j.j jVar, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel) {
        try {
            Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
            intent.setDataAndType(uri, "video/*");
            intent.setFlags(1);
            intent.putExtra("interactive_asset_uri", uri);
            intent.setPackage("com.instagram.android");
            jVar.a(intent);
        } catch (ActivityNotFoundException e10) {
            bookmarkShareDetailsViewModel.getLogger().logError(BOOKMARK_SHARE_TAG, "Instagram sharing failed", e10);
            handleMoreShare(context, uri, jVar);
        }
    }

    private static final void handleMoreShare(Context context, Uri uri, j.j jVar) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.addFlags(1);
        intent.setDataAndType(uri, context.getContentResolver().getType(uri));
        intent.putExtra("android.intent.extra.STREAM", uri);
        Intent createChooser = Intent.createChooser(intent, null);
        createChooser.getClass();
        jVar.a(createChooser);
    }

    private static final void handleTwitterShare(Context context, Uri uri, j.j jVar, BookmarkShareDetailsViewModel bookmarkShareDetailsViewModel) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setPackage("com.twitter.android");
            intent.setType("video/*");
            intent.setFlags(1);
            intent.putExtra("android.intent.extra.STREAM", uri);
            jVar.a(intent);
        } catch (ActivityNotFoundException e10) {
            bookmarkShareDetailsViewModel.getLogger().logError(BOOKMARK_SHARE_TAG, "Twitter sharing failed", e10);
            handleMoreShare(context, uri, jVar);
        }
    }
}
