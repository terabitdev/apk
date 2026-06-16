package io.elevenlabs.highlighter;

import a2.k3;
import a2.q1;
import a7.n1;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c4.l0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import f4.f1;
import i4.j1;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterContent;
import io.elevenlabs.domain.model.ChapterContentKt;
import io.elevenlabs.domain.model.ChapterSlot;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.highlighter.HighlightFocus;
import io.elevenlabs.highlighter.HighlighterPosition;
import io.elevenlabs.player.BackgroundPlayerAction;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.extensions.CoilExtensionsKt;
import io.elevenlabs.ui.theme.ColorScheme;
import io.elevenlabs.ui.theme.ElevenLabsSpacings;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsTypography;
import io.livekit.android.rpc.RpcError;
import ir.z1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import n1.s3;
import oo.f0;
import p3.b1;
import p3.h0;
import p3.v0;
import p4.a0;
import q2.j7;
import r1.d2;
import r1.d3;
import r1.i2;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import rd.c1;
import rd.s0;
import s4.c0;
import s4.p0;
import s4.x0;
import s4.y0;
import t1.b0;
import u2.r;
import u2.r1;
import u2.s2;
import u2.t2;
import u2.z0;
import ws.e0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a)\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a,\u0010\u0017\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0093\u0002\u00104\u001a\u00020 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020 0\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 0\"2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 0\"2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020 0\"2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00132\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020 0\"2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0014\b\u0002\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 0\"H\u0007¢\u0006\u0004\b4\u00105\u001a%\u0010:\u001a\u00020\u00012\f\u00108\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00109\u001a\u00020\u0001H\u0002¢\u0006\u0004\b:\u0010;\u001a-\u0010B\u001a\u00020A2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<062\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>H\u0002¢\u0006\u0004\bB\u0010C\u001a\u001f\u0010I\u001a\u00020H2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0003¢\u0006\u0004\bI\u0010J\u001a±\u0001\u0010U\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010G\u001a\u00020F2\u0006\u0010L\u001a\u00020K2\b\u0010M\u001a\u0004\u0018\u00010\u001d2\b\u0010N\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00002\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O062\u0006\u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u00132\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020 0\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020 0\"2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 0\"2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010T\u001a\u00020)H\u0001¢\u0006\u0004\bU\u0010V\u001a7\u0010[\u001a\u00020)*\u00020)2\u0006\u0010W\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020X2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020 0\"H\u0003¢\u0006\u0004\b[\u0010\\\u001a#\u0010_\u001a\u00020\t*\u00020\t2\u0006\u0010]\u001a\u00020\u00012\u0006\u0010^\u001a\u00020\u0001H\u0002¢\u0006\u0004\b_\u0010`\u001a\u009d\u0001\u0010a\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010L\u001a\u00020K2\u0006\u0010G\u001a\u00020F2\b\u0010M\u001a\u0004\u0018\u00010\u001d2\b\u0010N\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00002\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O062\u0006\u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u00132\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020 0\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020 0\"2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 0\"H\u0001¢\u0006\u0004\ba\u0010b\u001a\u00ad\u0001\u0010e\u001a\u00020 2\u0006\u0010L\u001a\u00020K2\u0006\u0010c\u001a\u00020\u00132\u0006\u0010d\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010G\u001a\u00020F2\b\u0010M\u001a\u0004\u0018\u00010\u001d2\b\u0010N\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001a\u00020\u00002\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O062\u0006\u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u00132\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020 0\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020 0\"2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 0\"H\u0003¢\u0006\u0004\be\u0010f\u001a+\u0010g\u001a\u00020 2\u0006\u0010L\u001a\u00020K2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020 0\"H\u0001¢\u0006\u0004\bg\u0010h\u001a\u000f\u0010i\u001a\u00020 H\u0001¢\u0006\u0004\bi\u0010j\u001a\u0017\u0010k\u001a\u00020 2\u0006\u0010L\u001a\u00020KH\u0001¢\u0006\u0004\bk\u0010l\u001a\u0017\u0010m\u001a\u00020 2\u0006\u0010L\u001a\u00020KH\u0001¢\u0006\u0004\bm\u0010l\u001a-\u0010p\u001a\u00020 2\u0006\u0010L\u001a\u00020K2\u0006\u0010o\u001a\u00020n2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0001¢\u0006\u0004\bp\u0010q\u001a%\u0010r\u001a\u00020 2\u0006\u0010L\u001a\u00020K2\f\u00100\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0001¢\u0006\u0004\br\u0010s\u001a5\u0010x\u001a\u00020)*\u00020)2\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020 0\"2\u000e\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010v0u¢\u0006\u0004\bx\u0010y\u001a#\u0010|\u001a\u00020<*\u00020<2\u0006\u0010z\u001a\u00020>2\u0006\u0010{\u001a\u00020>H\u0002¢\u0006\u0004\b|\u0010}\u001a,\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020<06*\u00020v2\u0006\u0010~\u001a\u00020\u00012\u0006\u0010\u007f\u001a\u00020\u0001H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a7\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020<06*\u00020v2\u0006\u0010~\u001a\u00020\u00012\u0006\u0010\u007f\u001a\u00020\u00012\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001aH\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0005\b\u0000\u0010\u0085\u00012\u0006\u0010]\u001a\u00020\u00012\u0006\u0010^\u001a\u00020\u00012\u0013\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\"H\u0080\bø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001aE\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00012\u0006\u0010]\u001a\u00020\u00012\u0006\u0010^\u001a\u00020\u00012\u0007\u0010\u0089\u0001\u001a\u00020\t2\u0007\u0010\u008a\u0001\u001a\u00020\t2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O06H\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a!\u0010\u008f\u0001\u001a\u00030\u008e\u00012\f\u00108\u001a\b\u0012\u0004\u0012\u00020706H\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001aV\u0010\u0097\u0001\u001a\u00020 2\u0007\u0010\u0091\u0001\u001a\u0002072\"\u0010\u0095\u0001\u001a\u001d\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0005\u0012\u00030\u0094\u0001\u0012\u0004\u0012\u00020\u00010\u0093\u00010\u0092\u00012\u0015\u0010\u0096\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0005\u0012\u00030\u0094\u00010\u0092\u0001H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a5\u0010\u009b\u0001\u001a\u00030\u009a\u00012\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u001d2\f\u00108\u001a\b\u0012\u0004\u0012\u000207062\u0007\u0010\u0015\u001a\u00030\u008e\u0001H\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a8\u0010\u009f\u0001\u001a\u0011\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u009e\u00012\f\u00108\u001a\b\u0012\u0004\u0012\u000207062\u0007\u0010\u0016\u001a\u00030\u009d\u0001H\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001\u001aV\u0010§\u0001\u001a\u00020D*\u00030¡\u00012\u0006\u0010G\u001a\u00020F2\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0¢\u00012\u0007\u0010¤\u0001\u001a\u00020\u00012\u000e\u0010¦\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u0001062\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O06H\u0002¢\u0006\u0006\b§\u0001\u0010¨\u0001\u001a`\u0010¬\u0001\u001a\u00020 *\u00030©\u00012\u0007\u0010L\u001a\u00030¡\u00012\u0006\u0010G\u001a\u00020F2\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0¢\u00012\u0007\u0010¤\u0001\u001a\u00020\u00012\u000f\u0010«\u0001\u001a\n\u0012\u0005\u0012\u00030\u008b\u00010ª\u00012\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O06H\u0002¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001\u001aX\u0010²\u0001\u001a\u00020 *\u00030©\u00012\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0¢\u00012\f\b\u0002\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00012\f\b\u0002\u0010±\u0001\u001a\u0005\u0018\u00010°\u00012\u0013\u0010\u0004\u001a\u000f\u0012\u0005\u0012\u00030©\u0001\u0012\u0004\u0012\u00020 0\"H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001\u001a \u0010µ\u0001\u001a\u00020 *\u00030©\u00012\u0007\u0010L\u001a\u00030´\u0001H\u0002¢\u0006\u0006\bµ\u0001\u0010¶\u0001\u001a\u0019\u0010·\u0001\u001a\u0004\u0018\u00010\t*\u00030¡\u0001H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001\u001a\u0016\u0010¹\u0001\u001a\u00020\u0013*\u00020KH\u0002¢\u0006\u0006\b¹\u0001\u0010º\u0001\u001a\u001c\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020K06*\u00020KH\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001\u001a\u0018\u0010½\u0001\u001a\u0004\u0018\u00010K*\u00020KH\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001\u001a\u001c\u0010¿\u0001\u001a\u0004\u0018\u00010K2\u0006\u0010L\u001a\u00020\tH\u0000¢\u0006\u0006\b¿\u0001\u0010À\u0001\"\u0017\u0010Á\u0001\u001a\u00020\u00018\u0006X\u0086T¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001\"\u0017\u0010Ã\u0001\u001a\u00020\u00018\u0002X\u0082T¢\u0006\b\n\u0006\bÃ\u0001\u0010Â\u0001\"\u0017\u0010Ä\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001\"\u0017\u0010Æ\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\b\n\u0006\bÆ\u0001\u0010Å\u0001\"\u0018\u0010Ç\u0001\u001a\u00030\u0094\u00018\u0000X\u0080T¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006É\u0001²\u0006\u000e\u0010R\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010Y\u001a\u00020X8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/highlighter/HighlighterData;", "", "chapterIndex", "Lio/elevenlabs/domain/model/ChapterContent;", FirebaseAnalytics.Param.CONTENT, "viewportCenter", "applyContentAndCap", "(Lio/elevenlabs/highlighter/HighlighterData;ILio/elevenlabs/domain/model/ChapterContent;I)Lio/elevenlabs/highlighter/HighlighterData;", "localIndex", "", "chapterElementKey", "(II)Ljava/lang/String;", "chapterPlaceholderKey", "(I)Ljava/lang/String;", "", SubscriberAttributeKt.JSON_NAME_KEY, "chapterIndexFromKey", "(Ljava/lang/Object;)Ljava/lang/Integer;", "Lt1/z;", "", "animate", FirebaseAnalytics.Param.INDEX, "offset", "scrollAndGetIfAnimated", "(Lt1/z;ZIILwn/c;)Ljava/lang/Object;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;", "config", "Lir/z1;", "Lio/elevenlabs/highlighter/HighlighterPosition;", "positionFlow", "Lkotlin/Function0;", "Lsn/z;", "onScroll", "Lkotlin/Function1;", "Lio/elevenlabs/highlighter/WordTapTarget;", "onWordClick", "onImageClick", "onBookmarkClick", "Lt1/b;", "header", "Li3/t;", "modifier", "Lr1/z1;", "contentPadding", "listState", "showShareButton", "onShareClick", "onGetTheFullReadClick", "onScrollDirectionChanged", "onBackgroundTap", "onCurrentChapterChanged", "Highlighter", "(Lio/elevenlabs/highlighter/HighlighterData;Lio/elevenlabs/domain/model/UserConfig$PlayerConfig;Lir/z1;Lho/a;Lho/l;Lho/l;Lho/l;Lho/q;Li3/t;Lr1/z1;Lt1/z;ZLho/a;Lho/a;Lho/l;Lho/a;Lho/l;Lu2/m;III)V", "", "Lio/elevenlabs/domain/model/ChapterSlot;", "slots", "globalIdx", "lazyItemIndexForGlobalElement", "(Ljava/util/List;I)I", "Lo3/c;", "rects", "", "extraGrowthPx", "cornerRadiusPx", "Lp3/v0;", "buildActiveParagraphPath", "(Ljava/util/List;FF)Lp3/v0;", "Lio/elevenlabs/highlighter/AnnotationData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/elevenlabs/highlighter/Styling;", "styling", "Lio/elevenlabs/highlighter/TextBoundsDrawerState;", "rememberTextBoundsDrawerState", "(Lio/elevenlabs/highlighter/AnnotationData;Lio/elevenlabs/highlighter/Styling;Lu2/m;I)Lio/elevenlabs/highlighter/TextBoundsDrawerState;", "Lorg/jsoup/nodes/k;", "element", "currentPosition", "currentItemIndex", "Lio/elevenlabs/domain/model/Chapter;", "chapters", "lazyListState", "scrollJustJumped", "onScrollJumped", "decorationBoxModifier", "TextElement", "(ILio/elevenlabs/highlighter/Styling;Lorg/jsoup/nodes/k;Lio/elevenlabs/highlighter/HighlighterPosition;Ljava/lang/Integer;Lio/elevenlabs/highlighter/HighlighterData;Ljava/util/List;Lt1/z;ZLho/l;Lho/l;Lho/l;Li3/t;Li3/t;Lu2/m;III)V", "elementIndex", "Ly4/w;", "textFieldValue", "onTextFieldValueChange", "setupTextContextMenu", "(Li3/t;ILy4/w;Lho/l;Lu2/m;I)Li3/t;", "start", "end", "safeSubstring", "(Ljava/lang/String;II)Ljava/lang/String;", "ListElement", "(ILorg/jsoup/nodes/k;Lio/elevenlabs/highlighter/Styling;Lio/elevenlabs/highlighter/HighlighterPosition;Ljava/lang/Integer;Lio/elevenlabs/highlighter/HighlighterData;Ljava/util/List;Lt1/z;ZLho/l;Lho/l;Lho/l;Lu2/m;II)V", "isOrdered", "indentLevel", "ListElementContent", "(Lorg/jsoup/nodes/k;ZIILio/elevenlabs/highlighter/Styling;Lio/elevenlabs/highlighter/HighlighterPosition;Ljava/lang/Integer;Lio/elevenlabs/highlighter/HighlighterData;Ljava/util/List;Lt1/z;ZLho/l;Lho/l;Lho/l;Lu2/m;II)V", "ImageElement", "(Lorg/jsoup/nodes/k;Lho/l;Lu2/m;I)V", "DividerElement", "(Lu2/m;I)V", "InfoElement", "(Lorg/jsoup/nodes/k;Lu2/m;I)V", "SpeakerNameElement", "Lio/elevenlabs/ui/theme/ColorScheme;", "colors", "FeedbackSectionElement", "(Lorg/jsoup/nodes/k;Lio/elevenlabs/ui/theme/ColorScheme;Lho/a;Lu2/m;I)V", "SampleActionSectionElement", "(Lorg/jsoup/nodes/k;Lho/a;Lu2/m;I)V", "onClick", "Lu2/s2;", "Ls4/u0;", "layoutResult", "pressIndicator", "(Li3/t;Lho/l;Lu2/s2;)Li3/t;", "horizontally", "vertically", "expand", "(Lo3/c;FF)Lo3/c;", "startOffset", "endOffset", "getSentenceBounds", "(Ls4/u0;II)Ljava/util/List;", "flattenForFullParagraphs", "getBoundingBoxes", "(Ls4/u0;IIZ)Ljava/util/List;", TokenNames.R, "transform", "fastMapRange", "(IILho/l;)Ljava/util/List;", "cAttribute", "tsAttribute", "Lio/elevenlabs/highlighter/WordAnnotation;", "buildWordAnnotation", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/elevenlabs/highlighter/WordAnnotation;", "Lio/elevenlabs/highlighter/HighlighterDocumentIndex;", "buildHighlighterDocumentIndexFromSlots", "(Ljava/util/List;)Lio/elevenlabs/highlighter/HighlighterDocumentIndex;", "slot", "", "Ljava/util/TreeMap;", "", "timestamps", "elementLastTs", "populateTimestampsForSlot", "(Lio/elevenlabs/domain/model/ChapterSlot;Ljava/util/Map;Ljava/util/Map;)V", "position", "Lio/elevenlabs/highlighter/HighlightFocus;", "computeHighlightFocusFromSlots", "(Lio/elevenlabs/highlighter/HighlighterPosition;Ljava/util/List;Lio/elevenlabs/highlighter/HighlighterDocumentIndex;)Lio/elevenlabs/highlighter/HighlightFocus;", "", "Lsn/k;", "locateOffsetInSlots", "(Ljava/util/List;J)Lsn/k;", "Lorg/jsoup/nodes/r;", "Ljava/util/Stack;", "stylesStack", "paragraphIdent", "Lio/elevenlabs/highlighter/BookmarkHighlight;", "bookmarks", "toAnnotatedString", "(Lorg/jsoup/nodes/r;Lio/elevenlabs/highlighter/Styling;Ljava/util/Stack;ILjava/util/List;Ljava/util/List;)Lio/elevenlabs/highlighter/AnnotationData;", "Ls4/e;", "", "annotations", "append", "(Ls4/e;Lorg/jsoup/nodes/r;Lio/elevenlabs/highlighter/Styling;Ljava/util/Stack;ILjava/util/List;Ljava/util/List;)V", "Ls4/c0;", "paragraphStyle", "Ls4/p0;", "spanStyle", "withStylesSafe", "(Ls4/e;Ljava/util/Stack;Ls4/c0;Ls4/p0;Lho/l;)V", "Lorg/jsoup/nodes/y;", "appendTextElement", "(Ls4/e;Lorg/jsoup/nodes/y;)V", "getText", "(Lorg/jsoup/nodes/r;)Ljava/lang/String;", "hasNestedLists", "(Lorg/jsoup/nodes/k;)Z", "getNestedLists", "(Lorg/jsoup/nodes/k;)Ljava/util/List;", "getContentBeforeNestedLists", "(Lorg/jsoup/nodes/k;)Lorg/jsoup/nodes/k;", "parseSingleElement", "(Ljava/lang/String;)Lorg/jsoup/nodes/k;", "MAX_LOADED_CHAPTERS", TokenNames.I, "HEADER_ELEMENTS_COUNT", "TAG_CHARACTER", "Ljava/lang/String;", "TAG_TIMESTAMP", "END_OF_ELEMENT_TOLERANCE_S", "D", "highlighter_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class HighlighterKt {
    public static final double END_OF_ELEMENT_TOLERANCE_S = 2.0d;
    private static final int HEADER_ELEMENTS_COUNT = 1;
    public static final int MAX_LOADED_CHAPTERS = 7;
    private static final String TAG_CHARACTER = "c";
    private static final String TAG_TIMESTAMP = "ts";

    public static final void DividerElement(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-388920512);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            DividerKt.m1827DivideriJQMabo(r1.d.G(p2.e(i3.q.f13017a, 1.0f), t2.u.P, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2356getX4D9Ej5fM(), 1), 0L, qVar, 0, 2);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.e(i10, 15);
        }
    }

    public static final sn.z DividerElement$lambda$0(int i10, u2.m mVar, int i11) {
        DividerElement(mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void FeedbackSectionElement(org.jsoup.nodes.k kVar, ColorScheme colorScheme, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        long j4;
        h4.f fVar;
        boolean z10;
        int i12;
        boolean h10;
        int i13;
        int i14;
        kVar.getClass();
        colorScheme.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(2084131729);
        if ((i10 & 6) == 0) {
            if (qVar.h(kVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = qVar.f(colorScheme);
            } else {
                h10 = qVar.h(colorScheme);
            }
            if (h10) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i12 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            Object L = qVar.L();
            String str = null;
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                us.g.z("h3");
                xs.e e10 = jo.a.e(new xs.h(vs.a.d("h3"), 9, false), kVar);
                e10.getClass();
                org.jsoup.nodes.k kVar2 = (org.jsoup.nodes.k) tn.o.y0(e10);
                if (kVar2 != null) {
                    L = kVar2.a0();
                } else {
                    L = null;
                }
                qVar.h0(L);
            }
            String str2 = (String) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                xs.e V = kVar.V("feedback-button-share");
                V.getClass();
                org.jsoup.nodes.k kVar3 = (org.jsoup.nodes.k) tn.o.y0(V);
                if (kVar3 != null) {
                    L2 = kVar3.a0();
                } else {
                    L2 = null;
                }
                qVar.h0(L2);
            }
            String str3 = (String) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                xs.e V2 = kVar.V("feedback-guest-orb");
                V2.getClass();
                org.jsoup.nodes.k kVar4 = (org.jsoup.nodes.k) tn.o.y0(V2);
                if (kVar4 != null) {
                    L3 = kVar4.d("src");
                } else {
                    L3 = null;
                }
                qVar.h0(L3);
            }
            String str4 = (String) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                xs.e V3 = kVar.V("feedback-host-orb");
                V3.getClass();
                org.jsoup.nodes.k kVar5 = (org.jsoup.nodes.k) tn.o.y0(V3);
                if (kVar5 != null) {
                    str = kVar5.d("src");
                }
                qVar.h0(str);
                L4 = str;
            }
            String str5 = (String) L4;
            if (str2 != null && str3 != null) {
                qVar.X(321769546);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i15 = ElevenLabsTheme.$stable;
                b1 lg2 = elevenLabsTheme.getShapes(qVar, i15).getLg();
                i3.q qVar2 = i3.q.f13017a;
                i3.t c5 = m3.h.c(qVar2, lg2);
                if (colorScheme.isDark()) {
                    j4 = 4281348144L;
                } else {
                    j4 = 4294309365L;
                }
                i3.t f10 = ib.i.f(elevenLabsTheme, qVar, i15, l1.n.h(c5, h0.e(j4), h0.f26395b));
                u0 u0Var = r1.j.f29228a;
                i3.k kVar6 = i3.d.f13004y0;
                int i16 = i11;
                k2 a10 = i2.a(u0Var, kVar6, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c10 = i3.a.c(f10, qVar);
                h4.h.f11920i.getClass();
                h4.f fVar2 = h4.g.f11903b;
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar2);
                } else {
                    qVar.k0();
                }
                h4.e eVar2 = h4.g.f11907f;
                r.J(eVar2, a10, qVar);
                h4.e eVar3 = h4.g.f11906e;
                r.J(eVar3, l4, qVar);
                Integer valueOf = Integer.valueOf(hashCode);
                h4.e eVar4 = h4.g.f11908g;
                r.y(qVar, valueOf, eVar4);
                h4.d dVar = h4.g.f11909h;
                r.F(dVar, qVar);
                h4.e eVar5 = h4.g.f11905d;
                r.J(eVar5, c10, qVar);
                float f11 = 1.0f;
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f11 = Float.MAX_VALUE;
                }
                m1 m1Var = new m1(f11, true);
                r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                int hashCode2 = Long.hashCode(qVar.T);
                c3.o l7 = qVar.l();
                i3.t c11 = i3.a.c(m1Var, qVar);
                qVar.b0();
                if (qVar.S) {
                    qVar.k(fVar2);
                } else {
                    qVar.k0();
                }
                r.J(eVar2, a11, qVar);
                r.J(eVar3, l7, qVar);
                defpackage.f.u(hashCode2, qVar, eVar4, qVar, dVar);
                r.J(eVar5, c11, qVar);
                j7.d(str2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i15).getSubtitleMedium700(), qVar, 6, 0, 131070);
                ib.i.p(elevenLabsTheme, qVar, i15, qVar2, qVar);
                k2 a12 = i2.a(u0Var, kVar6, qVar, 0);
                int hashCode3 = Long.hashCode(qVar.T);
                c3.o l10 = qVar.l();
                i3.t c12 = i3.a.c(qVar2, qVar);
                qVar.b0();
                if (qVar.S) {
                    fVar = fVar2;
                    qVar.k(fVar);
                } else {
                    fVar = fVar2;
                    qVar.k0();
                }
                r.J(eVar2, a12, qVar);
                r.J(eVar3, l10, qVar);
                defpackage.f.u(hashCode3, qVar, eVar4, qVar, dVar);
                r.J(eVar5, c12, qVar);
                float f12 = 1.0f;
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                h4.f fVar3 = fVar;
                if (1.0f > Float.MAX_VALUE) {
                    f12 = Float.MAX_VALUE;
                }
                ButtonKt.Button(str3, aVar, new m1(f12, true), ButtonSize.Medium, null, null, null, false, false, false, qVar, ((i16 >> 3) & 112) | 3078, 1008);
                qVar = qVar;
                qVar.p(true);
                qVar.p(true);
                r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i15).m2356getX4D9Ej5fM()), qVar);
                if (str5 != null && str4 != null) {
                    qVar.X(-1708112971);
                    f1 d10 = r1.p.d(i3.d.f12997a, false);
                    int hashCode4 = Long.hashCode(qVar.T);
                    c3.o l11 = qVar.l();
                    i3.t c13 = i3.a.c(qVar2, qVar);
                    qVar.b0();
                    if (qVar.S) {
                        qVar.k(fVar3);
                    } else {
                        qVar.k0();
                    }
                    r.J(eVar2, d10, qVar);
                    r.J(eVar3, l11, qVar);
                    defpackage.f.u(hashCode4, qVar, eVar4, qVar, dVar);
                    r.J(eVar5, c13, qVar);
                    t2 t2Var = AndroidCompositionLocals_androidKt.f2291b;
                    ad.h hVar = new ad.h((Context) qVar.j(t2Var));
                    hVar.f1788c = str5;
                    hVar.b();
                    ad.i a13 = hVar.a();
                    float f13 = 18;
                    i3.t I = r1.d.I(qVar2, t2.u.P, f13, t2.u.P, t2.u.P, 13);
                    float f14 = 37;
                    i3.t c14 = m3.h.c(p2.o(I, f14), elevenLabsTheme.getShapes(qVar, i15).getFull());
                    f4.p pVar = f4.q.f8840c;
                    qc.m.b(a13, null, c14, null, pVar, null, qVar, 1572912, 4024);
                    ad.h hVar2 = new ad.h((Context) qVar.j(t2Var));
                    hVar2.f1788c = str4;
                    hVar2.b();
                    qc.m.b(hVar2.a(), null, m3.h.c(p2.o(r1.d.I(qVar2, f13, t2.u.P, t2.u.P, t2.u.P, 14), f14), elevenLabsTheme.getShapes(qVar, i15).getFull()), null, pVar, null, qVar, 1572912, 4024);
                    qVar.p(true);
                    z10 = false;
                    qVar.p(false);
                } else {
                    z10 = false;
                    qVar.X(-1706978030);
                    qVar.p(false);
                }
                qVar.p(true);
                qVar.p(z10);
            } else {
                qVar.X(323775153);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k3(i10, 6, kVar, colorScheme, aVar);
        }
    }

    public static final sn.z FeedbackSectionElement$lambda$5(org.jsoup.nodes.k kVar, ColorScheme colorScheme, ho.a aVar, int i10, u2.m mVar, int i11) {
        FeedbackSectionElement(kVar, colorScheme, aVar, mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x04e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0519 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0601 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Highlighter(final HighlighterData highlighterData, final UserConfig.PlayerConfig playerConfig, final z1 z1Var, final ho.a aVar, final ho.l lVar, final ho.l lVar2, final ho.l lVar3, final ho.q qVar, i3.t tVar, r1.z1 z1Var2, t1.z zVar, boolean z6, ho.a aVar2, ho.a aVar3, ho.l lVar4, ho.a aVar4, ho.l lVar5, u2.m mVar, final int i10, final int i11, final int i12) {
        int i13;
        i3.t tVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        final t1.z zVar2;
        final boolean z10;
        final ho.a aVar5;
        final ho.l lVar6;
        final ho.a aVar6;
        final ho.l lVar7;
        u2.q qVar2;
        final i3.t tVar3;
        final r1.z1 z1Var3;
        final ho.a aVar7;
        r1 r1Var;
        ho.p pVar;
        t1.z zVar3;
        ho.a aVar8;
        r1.z1 z1Var4;
        ho.a aVar9;
        ho.a aVar10;
        ho.l lVar8;
        ho.l lVar9;
        ho.a aVar11;
        ho.a aVar12;
        ho.l lVar10;
        ho.a aVar13;
        i3.t tVar4;
        final t1.z zVar4;
        int i19;
        boolean z11;
        r1.z1 z1Var5;
        ho.a aVar14;
        final ho.l lVar11;
        ho.a aVar15;
        int i20;
        List list;
        boolean z12;
        boolean z13;
        Object L;
        ho.l lVar12;
        boolean z14;
        boolean f10;
        Object L2;
        b4.d dVar;
        boolean z15;
        Object L3;
        d2 d2Var;
        int i21;
        boolean h10;
        Object obj;
        d2 d2Var2;
        ho.a aVar16;
        ho.l lVar13;
        ho.l lVar14;
        r1.z1 z1Var6;
        int i22;
        t1.z zVar5;
        ho.a aVar17;
        ho.a aVar18;
        boolean z16;
        u2.q qVar3;
        int i23;
        playerConfig.getClass();
        z1Var.getClass();
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        qVar.getClass();
        u2.q qVar4 = (u2.q) mVar;
        qVar4.Z(-867533377);
        if ((i10 & 6) == 0) {
            i13 = (qVar4.h(highlighterData) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= qVar4.h(playerConfig) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= qVar4.h(z1Var) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        int i24 = i10 & 3072;
        int i25 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i24 == 0) {
            i13 |= qVar4.h(aVar) ? 2048 : 1024;
        }
        int i26 = i10 & 24576;
        int i27 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i26 == 0) {
            i13 |= qVar4.h(lVar) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i13 |= qVar4.h(lVar2) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i13 |= qVar4.h(lVar3) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i13 |= qVar4.h(qVar) ? 8388608 : 4194304;
        }
        int i28 = i12 & RpcError.MAX_MESSAGE_BYTES;
        if (i28 != 0) {
            i13 |= 100663296;
            tVar2 = tVar;
        } else {
            tVar2 = tVar;
            if ((i10 & 100663296) == 0) {
                i13 |= qVar4.f(tVar2) ? 67108864 : 33554432;
            }
        }
        int i29 = i12 & 512;
        if (i29 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            i13 |= qVar4.f(z1Var2) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            if ((i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 && qVar4.f(zVar)) {
                i23 = 4;
                i14 = i11 | i23;
            }
            i23 = 2;
            i14 = i11 | i23;
        } else {
            i14 = i11;
        }
        int i30 = i12 & 2048;
        if (i30 != 0) {
            i14 |= 48;
            i15 = i30;
        } else if ((i11 & 48) == 0) {
            i15 = i30;
            i14 |= qVar4.g(z6) ? 32 : 16;
        } else {
            i15 = i30;
        }
        int i31 = i14;
        int i32 = i13;
        int i33 = i12 & 4096;
        if (i33 != 0) {
            i16 = i31 | 384;
        } else {
            int i34 = i31;
            if ((i11 & 384) == 0) {
                i34 |= qVar4.h(aVar2) ? RpcError.MAX_MESSAGE_BYTES : 128;
            }
            i16 = i34;
        }
        int i35 = i12 & UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i35 != 0) {
            i17 = i16 | 3072;
        } else {
            int i36 = i16;
            if ((i11 & 3072) == 0) {
                if (qVar4.h(aVar3)) {
                    i25 = 2048;
                }
                i17 = i36 | i25;
            } else {
                i17 = i36;
            }
        }
        int i37 = i12 & 16384;
        if (i37 != 0) {
            i18 = i17 | 24576;
        } else {
            int i38 = i17;
            if ((i11 & 24576) == 0) {
                if (qVar4.h(lVar4)) {
                    i27 = 16384;
                }
                i18 = i38 | i27;
            } else {
                i18 = i38;
            }
        }
        int i39 = i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
        if (i39 != 0) {
            i18 |= 196608;
        } else if ((i11 & 196608) == 0) {
            i18 |= qVar4.h(aVar4) ? 131072 : 65536;
        }
        int i40 = i12 & 65536;
        if (i40 != 0) {
            i18 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            i18 |= qVar4.h(lVar5) ? 1048576 : 524288;
        }
        if (qVar4.O(i32 & 1, ((i32 & 306783379) == 306783378 && (i18 & 599187) == 599186) ? false : true)) {
            qVar4.T();
            int i41 = i10 & 1;
            Object obj2 = u2.l.f33918a;
            if (i41 != 0 && !qVar4.y()) {
                qVar4.R();
                if ((i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    i18 &= -15;
                }
                z1Var5 = z1Var2;
                zVar4 = zVar;
                aVar13 = aVar2;
                lVar11 = lVar4;
                aVar12 = aVar4;
                lVar10 = lVar5;
                tVar4 = tVar2;
                i19 = i18;
                z11 = z6;
                aVar14 = aVar3;
            } else {
                if (i28 != 0) {
                    tVar2 = i3.q.f13017a;
                }
                r1.z1 d10 = i29 != 0 ? r1.d.d(t2.u.P, t2.u.P, 3) : z1Var2;
                if ((i12 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    zVar3 = b0.a(0, qVar4, 3);
                    i18 &= -15;
                } else {
                    zVar3 = zVar;
                }
                boolean z17 = i15 != 0 ? true : z6;
                if (i33 != 0) {
                    Object L4 = qVar4.L();
                    if (L4 == obj2) {
                        L4 = new io.elevenlabs.data.model.response.d(28);
                        qVar4.h0(L4);
                    }
                    aVar8 = (ho.a) L4;
                } else {
                    aVar8 = aVar2;
                }
                if (i35 != 0) {
                    Object L5 = qVar4.L();
                    if (L5 == obj2) {
                        z1Var4 = d10;
                        L5 = new io.elevenlabs.data.model.response.d(29);
                        qVar4.h0(L5);
                    } else {
                        z1Var4 = d10;
                    }
                    aVar9 = (ho.a) L5;
                } else {
                    z1Var4 = d10;
                    aVar9 = aVar3;
                }
                if (i37 != 0) {
                    Object L6 = qVar4.L();
                    if (L6 == obj2) {
                        aVar10 = aVar9;
                        L6 = new fm.d(28);
                        qVar4.h0(L6);
                    } else {
                        aVar10 = aVar9;
                    }
                    lVar8 = (ho.l) L6;
                } else {
                    aVar10 = aVar9;
                    lVar8 = lVar4;
                }
                if (i39 != 0) {
                    Object L7 = qVar4.L();
                    if (L7 == obj2) {
                        lVar9 = lVar8;
                        L7 = new d(0);
                        qVar4.h0(L7);
                    } else {
                        lVar9 = lVar8;
                    }
                    aVar11 = (ho.a) L7;
                } else {
                    lVar9 = lVar8;
                    aVar11 = aVar4;
                }
                if (i40 != 0) {
                    Object L8 = qVar4.L();
                    if (L8 == obj2) {
                        aVar15 = aVar11;
                        L8 = new fm.d(29);
                        qVar4.h0(L8);
                    } else {
                        aVar15 = aVar11;
                    }
                    aVar12 = aVar15;
                    lVar10 = (ho.l) L8;
                } else {
                    aVar12 = aVar11;
                    lVar10 = lVar5;
                }
                aVar13 = aVar8;
                tVar4 = tVar2;
                zVar4 = zVar3;
                i19 = i18;
                z11 = z17;
                z1Var5 = z1Var4;
                aVar14 = aVar10;
                lVar11 = lVar9;
            }
            qVar4.q();
            if (highlighterData != null && !highlighterData.getSlots().isEmpty()) {
                final ho.a aVar19 = aVar13;
                Object L9 = qVar4.L();
                if (L9 == obj2) {
                    L9 = new b4.a() { // from class: io.elevenlabs.highlighter.HighlighterKt$Highlighter$nestedScrollConnection$1$1
                        @Override // b4.a
                        /* renamed from: onPostFling-RZ2iAVY */
                        public /* bridge */ Object mo72onPostFlingRZ2iAVY(long j4, long j10, wn.c<? super h5.q> cVar) {
                            return super.mo72onPostFlingRZ2iAVY(j4, j10, cVar);
                        }

                        @Override // b4.a
                        /* renamed from: onPostScroll-DzOQY0M */
                        public long mo73onPostScrollDzOQY0M(long consumed, long available, int source) {
                            if (Float.intBitsToFloat((int) (consumed & 4294967295L)) < -10.0f) {
                                lVar11.invoke(Boolean.FALSE);
                                return 0L;
                            }
                            return 0L;
                        }

                        @Override // b4.a
                        /* renamed from: onPreFling-QWom1Mo */
                        public /* bridge */ Object mo74onPreFlingQWom1Mo(long j4, wn.c<? super h5.q> cVar) {
                            return super.mo74onPreFlingQWom1Mo(j4, cVar);
                        }

                        @Override // b4.a
                        /* renamed from: onPreScroll-OzD1aCk */
                        public long mo75onPreScrollOzD1aCk(long available, int source) {
                            ho.a.this.invoke();
                            if (Float.intBitsToFloat((int) (available & 4294967295L)) > t2.u.P) {
                                lVar11.invoke(Boolean.TRUE);
                                return 0L;
                            }
                            return 0L;
                        }
                    };
                    qVar4.h0(L9);
                }
                HighlighterKt$Highlighter$nestedScrollConnection$1$1 highlighterKt$Highlighter$nestedScrollConnection$1$1 = (HighlighterKt$Highlighter$nestedScrollConnection$1$1) L9;
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i42 = ElevenLabsTheme.$stable;
                final ho.a aVar20 = aVar14;
                ElevenLabsTypography typo = elevenLabsTheme.getTypo(qVar4, i42);
                ho.l lVar15 = lVar11;
                ElevenLabsSpacings spacings = elevenLabsTheme.getSpacings(qVar4, i42);
                final ColorScheme color = elevenLabsTheme.getColor(qVar4, i42);
                h5.c cVar = (h5.c) qVar4.j(j1.f13129h);
                boolean f11 = qVar4.f(playerConfig) | qVar4.f(cVar) | qVar4.f(typo) | qVar4.f(color) | qVar4.f(spacings);
                Object L10 = qVar4.L();
                if (f11 || L10 == obj2) {
                    L10 = new Styling(playerConfig, cVar, typo, color, spacings);
                    qVar4.h0(L10);
                }
                final Styling styling = (Styling) L10;
                HighlighterPosition highlighterPosition = (HighlighterPosition) r.o(z1Var, qVar4, (i32 >> 6) & 14).getValue();
                boolean f12 = qVar4.f(highlighterData.getSlots());
                Object L11 = qVar4.L();
                if (f12 || L11 == obj2) {
                    L11 = buildHighlighterDocumentIndexFromSlots(highlighterData.getSlots());
                    qVar4.h0(L11);
                }
                HighlighterDocumentIndex highlighterDocumentIndex = (HighlighterDocumentIndex) L11;
                boolean f13 = qVar4.f(highlighterData.getSlots());
                Object L12 = qVar4.L();
                if (f13 || L12 == obj2) {
                    List<ChapterSlot> slots = highlighterData.getSlots();
                    i20 = i19;
                    ArrayList arrayList = new ArrayList(tn.p.a0(slots, 10));
                    Iterator<T> it = slots.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ChapterSlot) it.next()).getChapter());
                    }
                    qVar4.h0(arrayList);
                    L12 = arrayList;
                } else {
                    i20 = i19;
                }
                List list2 = (List) L12;
                boolean f14 = qVar4.f(highlighterData.getSlots()) | qVar4.f(highlighterPosition) | qVar4.f(highlighterDocumentIndex);
                Object L13 = qVar4.L();
                if (f14 || L13 == obj2) {
                    L13 = computeHighlightFocusFromSlots(highlighterPosition, highlighterData.getSlots(), highlighterDocumentIndex);
                    qVar4.h0(L13);
                }
                final HighlightFocus highlightFocus = (HighlightFocus) L13;
                boolean g10 = qVar4.g(highlighterData.getFollowingContent()) | qVar4.f(highlightFocus) | qVar4.f(highlighterData.getSlots());
                Object L14 = qVar4.L();
                if (g10 || L14 == obj2) {
                    if (highlighterData.getFollowingContent()) {
                        HighlightFocus.ActiveElement activeElement = highlightFocus instanceof HighlightFocus.ActiveElement ? (HighlightFocus.ActiveElement) highlightFocus : null;
                        if (activeElement != null) {
                            L14 = Integer.valueOf(lazyItemIndexForGlobalElement(highlighterData.getSlots(), activeElement.getElementIndex()));
                            qVar4.h0(L14);
                        }
                    }
                    L14 = null;
                    qVar4.h0(L14);
                }
                final Integer num = (Integer) L14;
                Object L15 = qVar4.L();
                if (L15 == obj2) {
                    L15 = r.A(Boolean.FALSE);
                    qVar4.h0(L15);
                }
                final z0 z0Var = (z0) L15;
                boolean f15 = qVar4.f(num);
                int i43 = (i20 & 14) ^ 6;
                if (i43 <= 4 || !qVar4.f(zVar4)) {
                    list = list2;
                    if ((i20 & 6) != 4) {
                        z12 = false;
                        z13 = f15 | z12;
                        L = qVar4.L();
                        if (!z13 || L == obj2) {
                            L = new HighlighterKt$Highlighter$7$1(num, zVar4, z0Var, null);
                            qVar4.h0(L);
                        }
                        r.f((ho.p) L, num, qVar4);
                        z0 H = r.H(lVar10, qVar4);
                        if (i43 > 4 || !qVar4.f(zVar4)) {
                            lVar12 = lVar10;
                            if ((i20 & 6) != 4) {
                                z14 = false;
                                f10 = z14 | qVar4.f(H);
                                L2 = qVar4.L();
                                if (!f10 || L2 == obj2) {
                                    dVar = null;
                                    L2 = new HighlighterKt$Highlighter$8$1(zVar4, H, null);
                                    qVar4.h0(L2);
                                } else {
                                    dVar = null;
                                }
                                r.f((ho.p) L2, zVar4, qVar4);
                                h5.m mVar2 = (h5.m) qVar4.j(j1.f13135n);
                                i3.t a10 = b4.f.a(p2.d(tVar4, 1.0f), highlighterKt$Highlighter$nestedScrollConnection$1$1, dVar);
                                z15 = (i20 & 458752) == 131072;
                                L3 = qVar4.L();
                                if (!z15 || L3 == obj2) {
                                    L3 = new HighlighterKt$Highlighter$9$1(aVar12);
                                    qVar4.h0(L3);
                                }
                                i3.t b10 = l0.b(a10, aVar12, (PointerInputEventHandler) L3);
                                ElevenLabsTheme elevenLabsTheme2 = ElevenLabsTheme.INSTANCE;
                                int i44 = ElevenLabsTheme.$stable;
                                i3.t tVar5 = tVar4;
                                d2Var = new d2(r1.d.m(z1Var5, mVar2) + elevenLabsTheme2.getSpacings(qVar4, i44).m2357getX5D9Ej5fM(), z1Var5.d() + elevenLabsTheme2.getSpacings(qVar4, i44).m2355getX3D9Ej5fM(), r1.d.l(z1Var5, mVar2) + elevenLabsTheme2.getSpacings(qVar4, i44).m2357getX5D9Ej5fM(), z1Var5.a() + elevenLabsTheme2.getSpacings(qVar4, i44).m2355getX3D9Ej5fM());
                                final List list3 = list;
                                i21 = i20;
                                h10 = ((i32 & 29360128) == 8388608) | qVar4.h(highlightFocus) | qVar4.h(styling) | qVar4.f(num) | qVar4.h(highlighterData) | qVar4.h(list3) | ((i43 <= 4 && qVar4.f(zVar4)) || (i20 & 6) == 4) | ((i32 & 57344) == 16384) | ((i32 & 3670016) == 1048576) | ((i32 & 458752) == 131072) | ((i20 & 112) == 32) | qVar4.h(color) | ((i21 & 896) == 256) | ((i21 & 7168) == 2048);
                                Object L16 = qVar4.L();
                                if (!h10 || L16 == obj2) {
                                    d2Var2 = d2Var;
                                    aVar16 = aVar12;
                                    lVar13 = lVar15;
                                    lVar14 = lVar12;
                                    z1Var6 = z1Var5;
                                    i22 = i21;
                                    final boolean z18 = z11;
                                    obj = new ho.l() { // from class: io.elevenlabs.highlighter.f
                                        @Override // ho.l
                                        public final Object invoke(Object obj3) {
                                            sn.z Highlighter$lambda$18$0;
                                            Highlighter$lambda$18$0 = HighlighterKt.Highlighter$lambda$18$0(HighlighterData.this, qVar, styling, num, list3, zVar4, lVar, lVar3, lVar2, z18, color, aVar19, aVar20, highlightFocus, z0Var, (t1.t) obj3);
                                            return Highlighter$lambda$18$0;
                                        }
                                    };
                                    zVar5 = zVar4;
                                    aVar17 = aVar19;
                                    aVar18 = aVar20;
                                    z16 = z18;
                                    qVar3 = qVar4;
                                    qVar3.h0(obj);
                                } else {
                                    z16 = z11;
                                    aVar17 = aVar19;
                                    d2Var2 = d2Var;
                                    zVar5 = zVar4;
                                    qVar3 = qVar4;
                                    aVar16 = aVar12;
                                    obj = L16;
                                    lVar13 = lVar15;
                                    lVar14 = lVar12;
                                    aVar18 = aVar20;
                                    z1Var6 = z1Var5;
                                    i22 = i21;
                                }
                                t1.z zVar6 = zVar5;
                                c1.c(b10, zVar6, d2Var2, false, null, null, null, false, null, (ho.l) obj, qVar3, (i22 << 3) & 112, 504);
                                zVar2 = zVar6;
                                qVar2 = qVar3;
                                z10 = z16;
                                aVar5 = aVar17;
                                aVar7 = aVar18;
                                z1Var3 = z1Var6;
                                lVar6 = lVar13;
                                aVar6 = aVar16;
                                lVar7 = lVar14;
                                tVar3 = tVar5;
                            }
                        } else {
                            lVar12 = lVar10;
                        }
                        z14 = true;
                        f10 = z14 | qVar4.f(H);
                        L2 = qVar4.L();
                        if (f10) {
                        }
                        dVar = null;
                        L2 = new HighlighterKt$Highlighter$8$1(zVar4, H, null);
                        qVar4.h0(L2);
                        r.f((ho.p) L2, zVar4, qVar4);
                        h5.m mVar22 = (h5.m) qVar4.j(j1.f13135n);
                        i3.t a102 = b4.f.a(p2.d(tVar4, 1.0f), highlighterKt$Highlighter$nestedScrollConnection$1$1, dVar);
                        if ((i20 & 458752) == 131072) {
                        }
                        L3 = qVar4.L();
                        if (!z15) {
                        }
                        L3 = new HighlighterKt$Highlighter$9$1(aVar12);
                        qVar4.h0(L3);
                        i3.t b102 = l0.b(a102, aVar12, (PointerInputEventHandler) L3);
                        ElevenLabsTheme elevenLabsTheme22 = ElevenLabsTheme.INSTANCE;
                        int i442 = ElevenLabsTheme.$stable;
                        i3.t tVar52 = tVar4;
                        d2Var = new d2(r1.d.m(z1Var5, mVar22) + elevenLabsTheme22.getSpacings(qVar4, i442).m2357getX5D9Ej5fM(), z1Var5.d() + elevenLabsTheme22.getSpacings(qVar4, i442).m2355getX3D9Ej5fM(), r1.d.l(z1Var5, mVar22) + elevenLabsTheme22.getSpacings(qVar4, i442).m2357getX5D9Ej5fM(), z1Var5.a() + elevenLabsTheme22.getSpacings(qVar4, i442).m2355getX3D9Ej5fM());
                        final List list32 = list;
                        i21 = i20;
                        h10 = ((i32 & 29360128) == 8388608) | qVar4.h(highlightFocus) | qVar4.h(styling) | qVar4.f(num) | qVar4.h(highlighterData) | qVar4.h(list32) | ((i43 <= 4 && qVar4.f(zVar4)) || (i20 & 6) == 4) | ((i32 & 57344) == 16384) | ((i32 & 3670016) == 1048576) | ((i32 & 458752) == 131072) | ((i20 & 112) == 32) | qVar4.h(color) | ((i21 & 896) == 256) | ((i21 & 7168) == 2048);
                        Object L162 = qVar4.L();
                        if (h10) {
                        }
                        d2Var2 = d2Var;
                        aVar16 = aVar12;
                        lVar13 = lVar15;
                        lVar14 = lVar12;
                        z1Var6 = z1Var5;
                        i22 = i21;
                        final boolean z182 = z11;
                        obj = new ho.l() { // from class: io.elevenlabs.highlighter.f
                            @Override // ho.l
                            public final Object invoke(Object obj3) {
                                sn.z Highlighter$lambda$18$0;
                                Highlighter$lambda$18$0 = HighlighterKt.Highlighter$lambda$18$0(HighlighterData.this, qVar, styling, num, list32, zVar4, lVar, lVar3, lVar2, z182, color, aVar19, aVar20, highlightFocus, z0Var, (t1.t) obj3);
                                return Highlighter$lambda$18$0;
                            }
                        };
                        zVar5 = zVar4;
                        aVar17 = aVar19;
                        aVar18 = aVar20;
                        z16 = z182;
                        qVar3 = qVar4;
                        qVar3.h0(obj);
                        t1.z zVar62 = zVar5;
                        c1.c(b102, zVar62, d2Var2, false, null, null, null, false, null, (ho.l) obj, qVar3, (i22 << 3) & 112, 504);
                        zVar2 = zVar62;
                        qVar2 = qVar3;
                        z10 = z16;
                        aVar5 = aVar17;
                        aVar7 = aVar18;
                        z1Var3 = z1Var6;
                        lVar6 = lVar13;
                        aVar6 = aVar16;
                        lVar7 = lVar14;
                        tVar3 = tVar52;
                    }
                } else {
                    list = list2;
                }
                z12 = true;
                z13 = f15 | z12;
                L = qVar4.L();
                if (!z13) {
                }
                L = new HighlighterKt$Highlighter$7$1(num, zVar4, z0Var, null);
                qVar4.h0(L);
                r.f((ho.p) L, num, qVar4);
                z0 H2 = r.H(lVar10, qVar4);
                if (i43 > 4) {
                }
                lVar12 = lVar10;
                if ((i20 & 6) != 4) {
                }
                z14 = true;
                f10 = z14 | qVar4.f(H2);
                L2 = qVar4.L();
                if (f10) {
                }
                dVar = null;
                L2 = new HighlighterKt$Highlighter$8$1(zVar4, H2, null);
                qVar4.h0(L2);
                r.f((ho.p) L2, zVar4, qVar4);
                h5.m mVar222 = (h5.m) qVar4.j(j1.f13135n);
                i3.t a1022 = b4.f.a(p2.d(tVar4, 1.0f), highlighterKt$Highlighter$nestedScrollConnection$1$1, dVar);
                if ((i20 & 458752) == 131072) {
                }
                L3 = qVar4.L();
                if (!z15) {
                }
                L3 = new HighlighterKt$Highlighter$9$1(aVar12);
                qVar4.h0(L3);
                i3.t b1022 = l0.b(a1022, aVar12, (PointerInputEventHandler) L3);
                ElevenLabsTheme elevenLabsTheme222 = ElevenLabsTheme.INSTANCE;
                int i4422 = ElevenLabsTheme.$stable;
                i3.t tVar522 = tVar4;
                d2Var = new d2(r1.d.m(z1Var5, mVar222) + elevenLabsTheme222.getSpacings(qVar4, i4422).m2357getX5D9Ej5fM(), z1Var5.d() + elevenLabsTheme222.getSpacings(qVar4, i4422).m2355getX3D9Ej5fM(), r1.d.l(z1Var5, mVar222) + elevenLabsTheme222.getSpacings(qVar4, i4422).m2357getX5D9Ej5fM(), z1Var5.a() + elevenLabsTheme222.getSpacings(qVar4, i4422).m2355getX3D9Ej5fM());
                final List list322 = list;
                i21 = i20;
                h10 = ((i32 & 29360128) == 8388608) | qVar4.h(highlightFocus) | qVar4.h(styling) | qVar4.f(num) | qVar4.h(highlighterData) | qVar4.h(list322) | ((i43 <= 4 && qVar4.f(zVar4)) || (i20 & 6) == 4) | ((i32 & 57344) == 16384) | ((i32 & 3670016) == 1048576) | ((i32 & 458752) == 131072) | ((i20 & 112) == 32) | qVar4.h(color) | ((i21 & 896) == 256) | ((i21 & 7168) == 2048);
                Object L1622 = qVar4.L();
                if (h10) {
                }
                d2Var2 = d2Var;
                aVar16 = aVar12;
                lVar13 = lVar15;
                lVar14 = lVar12;
                z1Var6 = z1Var5;
                i22 = i21;
                final boolean z1822 = z11;
                obj = new ho.l() { // from class: io.elevenlabs.highlighter.f
                    @Override // ho.l
                    public final Object invoke(Object obj3) {
                        sn.z Highlighter$lambda$18$0;
                        Highlighter$lambda$18$0 = HighlighterKt.Highlighter$lambda$18$0(HighlighterData.this, qVar, styling, num, list322, zVar4, lVar, lVar3, lVar2, z1822, color, aVar19, aVar20, highlightFocus, z0Var, (t1.t) obj3);
                        return Highlighter$lambda$18$0;
                    }
                };
                zVar5 = zVar4;
                aVar17 = aVar19;
                aVar18 = aVar20;
                z16 = z1822;
                qVar3 = qVar4;
                qVar3.h0(obj);
                t1.z zVar622 = zVar5;
                c1.c(b1022, zVar622, d2Var2, false, null, null, null, false, null, (ho.l) obj, qVar3, (i22 << 3) & 112, 504);
                zVar2 = zVar622;
                qVar2 = qVar3;
                z10 = z16;
                aVar5 = aVar17;
                aVar7 = aVar18;
                z1Var3 = z1Var6;
                lVar6 = lVar13;
                aVar6 = aVar16;
                lVar7 = lVar14;
                tVar3 = tVar522;
            } else {
                final boolean z19 = z11;
                final i3.t tVar6 = tVar4;
                final r1.z1 z1Var7 = z1Var5;
                final t1.z zVar7 = zVar4;
                final ho.a aVar21 = aVar12;
                final ho.l lVar16 = lVar10;
                final ho.l lVar17 = lVar11;
                final ho.a aVar22 = aVar14;
                final ho.a aVar23 = aVar13;
                r1 r10 = qVar4.r();
                if (r10 != null) {
                    final int i45 = 0;
                    pVar = new ho.p() { // from class: io.elevenlabs.highlighter.e
                        @Override // ho.p
                        public final Object invoke(Object obj3, Object obj4) {
                            sn.z Highlighter$lambda$5;
                            sn.z Highlighter$lambda$19;
                            u2.m mVar3 = (u2.m) obj3;
                            switch (i45) {
                                case 0:
                                    Highlighter$lambda$5 = HighlighterKt.Highlighter$lambda$5(highlighterData, playerConfig, z1Var, aVar, lVar, lVar2, lVar3, qVar, tVar6, z1Var7, zVar7, z19, aVar23, aVar22, lVar17, aVar21, lVar16, i10, i11, i12, mVar3, ((Integer) obj4).intValue());
                                    return Highlighter$lambda$5;
                                default:
                                    Highlighter$lambda$19 = HighlighterKt.Highlighter$lambda$19(highlighterData, playerConfig, z1Var, aVar, lVar, lVar2, lVar3, qVar, tVar6, z1Var7, zVar7, z19, aVar23, aVar22, lVar17, aVar21, lVar16, i10, i11, i12, mVar3, ((Integer) obj4).intValue());
                                    return Highlighter$lambda$19;
                            }
                        }
                    };
                    r1Var = r10;
                    r1Var.f34012d = pVar;
                }
                return;
            }
        } else {
            qVar4.R();
            zVar2 = zVar;
            z10 = z6;
            aVar5 = aVar2;
            lVar6 = lVar4;
            aVar6 = aVar4;
            lVar7 = lVar5;
            qVar2 = qVar4;
            tVar3 = tVar2;
            z1Var3 = z1Var2;
            aVar7 = aVar3;
        }
        r1 r11 = qVar2.r();
        if (r11 != null) {
            final int i46 = 1;
            pVar = new ho.p() { // from class: io.elevenlabs.highlighter.e
                @Override // ho.p
                public final Object invoke(Object obj3, Object obj4) {
                    sn.z Highlighter$lambda$5;
                    sn.z Highlighter$lambda$19;
                    u2.m mVar3 = (u2.m) obj3;
                    switch (i46) {
                        case 0:
                            Highlighter$lambda$5 = HighlighterKt.Highlighter$lambda$5(highlighterData, playerConfig, z1Var, aVar, lVar, lVar2, lVar3, qVar, tVar3, z1Var3, zVar2, z10, aVar5, aVar7, lVar6, aVar6, lVar7, i10, i11, i12, mVar3, ((Integer) obj4).intValue());
                            return Highlighter$lambda$5;
                        default:
                            Highlighter$lambda$19 = HighlighterKt.Highlighter$lambda$19(highlighterData, playerConfig, z1Var, aVar, lVar, lVar2, lVar3, qVar, tVar3, z1Var3, zVar2, z10, aVar5, aVar7, lVar6, aVar6, lVar7, i10, i11, i12, mVar3, ((Integer) obj4).intValue());
                            return Highlighter$lambda$19;
                    }
                }
            };
            r1Var = r11;
            r1Var.f34012d = pVar;
        }
    }

    private static final boolean Highlighter$lambda$13(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    public static final void Highlighter$lambda$14(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final sn.z Highlighter$lambda$18$0(final HighlighterData highlighterData, final ho.q qVar, final Styling styling, final Integer num, final List list, final t1.z zVar, final ho.l lVar, final ho.l lVar2, final ho.l lVar3, final boolean z6, final ColorScheme colorScheme, final ho.a aVar, final ho.a aVar2, final HighlightFocus highlightFocus, final z0 z0Var, t1.t tVar) {
        tVar.getClass();
        final int i10 = 0;
        String str = null;
        t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.highlighter.j
            @Override // ho.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                sn.z Highlighter$lambda$18$0$0;
                sn.z Highlighter$lambda$18$0$5;
                switch (i10) {
                    case 0:
                        Highlighter$lambda$18$0$0 = HighlighterKt.Highlighter$lambda$18$0$0((ho.q) qVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                        return Highlighter$lambda$18$0$0;
                    default:
                        Highlighter$lambda$18$0$5 = HighlighterKt.Highlighter$lambda$18$0$5((ChapterSlot) qVar, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                        return Highlighter$lambda$18$0$5;
                }
            }
        }, true, -76923446), 3);
        for (final ChapterSlot chapterSlot : highlighterData.getSlots()) {
            final ChapterContent content = chapterSlot.getContent();
            if (content == null) {
                final int i11 = 1;
                t1.t.c(tVar, chapterPlaceholderKey(chapterSlot.getChapter().getIndex()), str, new c3.j(new ho.q() { // from class: io.elevenlabs.highlighter.j
                    @Override // ho.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        sn.z Highlighter$lambda$18$0$0;
                        sn.z Highlighter$lambda$18$0$5;
                        switch (i11) {
                            case 0:
                                Highlighter$lambda$18$0$0 = HighlighterKt.Highlighter$lambda$18$0$0((ho.q) chapterSlot, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                                return Highlighter$lambda$18$0$0;
                            default:
                                Highlighter$lambda$18$0$5 = HighlighterKt.Highlighter$lambda$18$0$5((ChapterSlot) chapterSlot, (t1.b) obj, (u2.m) obj2, ((Integer) obj3).intValue());
                                return Highlighter$lambda$18$0$5;
                        }
                    }
                }, true, 908973421), 2);
            } else {
                t1.t.d(tVar, content.getElements().size(), new g(chapterSlot, 2), new c3.j(new ho.r() { // from class: io.elevenlabs.highlighter.k
                    @Override // ho.r
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        sn.z Highlighter$lambda$18$0$7;
                        int intValue = ((Integer) obj4).intValue();
                        Highlighter$lambda$18$0$7 = HighlighterKt.Highlighter$lambda$18$0$7(ChapterSlot.this, content, styling, num, highlighterData, list, zVar, lVar, lVar2, lVar3, z6, colorScheme, aVar, aVar2, highlightFocus, z0Var, (t1.b) obj, ((Integer) obj2).intValue(), (u2.m) obj3, intValue);
                        return Highlighter$lambda$18$0$7;
                    }
                }, true, 2003236379), 4);
                str = null;
            }
        }
        return sn.z.f31622a;
    }

    public static final sn.z Highlighter$lambda$18$0$0(ho.q qVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        bVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(bVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar2 = (u2.q) mVar;
        if (qVar2.O(i10 & 1, z6)) {
            qVar.invoke(bVar, qVar2, Integer.valueOf(i10 & 14));
        } else {
            qVar2.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z Highlighter$lambda$18$0$5(ChapterSlot chapterSlot, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(p2.f(i3.q.f13017a, chapterSlot.getEstimatedHeightDp()), qVar);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final Object Highlighter$lambda$18$0$6(ChapterSlot chapterSlot, int i10) {
        return chapterElementKey(chapterSlot.getChapter().getIndex(), i10);
    }

    public static final sn.z Highlighter$lambda$18$0$7(ChapterSlot chapterSlot, ChapterContent chapterContent, Styling styling, Integer num, HighlighterData highlighterData, List list, t1.z zVar, ho.l lVar, ho.l lVar2, ho.l lVar3, boolean z6, ColorScheme colorScheme, ho.a aVar, ho.a aVar2, HighlightFocus highlightFocus, z0 z0Var, t1.b bVar, int i10, u2.m mVar, int i11) {
        int i12;
        bVar.getClass();
        if ((i11 & 48) == 0) {
            i12 = i11 | (((u2.q) mVar).d(i10) ? 32 : 16);
        } else {
            i12 = i11;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i12 & 1, (i12 & 145) != 144)) {
            Highlighter$lambda$18$0$RenderElementBody(styling, num, highlighterData, list, zVar, lVar, lVar2, lVar3, z6, colorScheme, aVar, aVar2, highlightFocus, z0Var, chapterSlot.getFirstElementIndex() + i10, chapterContent.getElements().get(i10), qVar, 0);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    private static final void Highlighter$lambda$18$0$LocalTextElement(Styling styling, Integer num, HighlighterData highlighterData, List<Chapter> list, t1.z zVar, ho.l lVar, ho.l lVar2, HighlightFocus highlightFocus, z0 z0Var, int i10, org.jsoup.nodes.k kVar, i3.t tVar, i3.t tVar2, u2.m mVar, int i11, int i12) {
        i3.t tVar3;
        i3.t tVar4;
        HighlightFocus highlightFocus2;
        int i13;
        if ((i12 & 4) != 0) {
            tVar3 = i3.q.f13017a;
        } else {
            tVar3 = tVar;
        }
        if ((i12 & 8) != 0) {
            tVar4 = styling.getTextElementModifier();
            i13 = i10;
            highlightFocus2 = highlightFocus;
        } else {
            tVar4 = tVar2;
            highlightFocus2 = highlightFocus;
            i13 = i10;
        }
        HighlighterPosition Highlighter$lambda$18$0$positionFor = Highlighter$lambda$18$0$positionFor(highlightFocus2, i13);
        boolean Highlighter$lambda$13 = Highlighter$lambda$13(z0Var);
        u2.q qVar = (u2.q) mVar;
        Object L = qVar.L();
        if (L == u2.l.f33918a) {
            L = new a(z0Var, 0);
            qVar.h0(L);
        }
        TextElement(i13, styling, kVar, Highlighter$lambda$18$0$positionFor, num, highlighterData, list, zVar, Highlighter$lambda$13, (ho.l) L, lVar, lVar2, tVar3, tVar4, qVar, (i11 & 14) | 805306368 | ((i11 << 3) & 896), i11 & 8064, 0);
    }

    public static final sn.z Highlighter$lambda$18$0$LocalTextElement$1$0(z0 z0Var, boolean z6) {
        Highlighter$lambda$14(z0Var, z6);
        return sn.z.f31622a;
    }

    private static final void Highlighter$lambda$18$0$RenderElementBody(Styling styling, Integer num, HighlighterData highlighterData, List<Chapter> list, t1.z zVar, ho.l lVar, ho.l lVar2, ho.l lVar3, boolean z6, ColorScheme colorScheme, ho.a aVar, ho.a aVar2, HighlightFocus highlightFocus, z0 z0Var, int i10, String str, u2.m mVar, int i11) {
        boolean z10;
        boolean z11;
        u2.q qVar = (u2.q) mVar;
        qVar.X(-306843575);
        if ((((i11 & 112) ^ 48) > 32 && qVar.f(str)) || (i11 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (z10 || L == eVar) {
            L = ParsedElementCache.INSTANCE.get(str);
            qVar.h0(L);
        }
        org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) L;
        if (kVar == null) {
            qVar.p(false);
            return;
        }
        e0 e0Var = kVar.f26057d;
        if (kotlin.jvm.internal.m.c(e0Var.f37411b, "ul") || kotlin.jvm.internal.m.c(e0Var.f37411b, "ol")) {
            z11 = false;
            qVar.X(-1486286114);
            HighlighterPosition Highlighter$lambda$18$0$positionFor = Highlighter$lambda$18$0$positionFor(highlightFocus, i10);
            boolean Highlighter$lambda$13 = Highlighter$lambda$13(z0Var);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new a(z0Var, 1);
                qVar.h0(L2);
            }
            ListElement(i10, kVar, styling, Highlighter$lambda$18$0$positionFor, num, highlighterData, list, zVar, Highlighter$lambda$13, (ho.l) L2, lVar, lVar2, qVar, 805306368 | (i11 & 14), 0);
            qVar = qVar;
            qVar.p(false);
        } else {
            if (kotlin.jvm.internal.m.c(e0Var.f37411b, "hr")) {
                qVar.X(-1485637687);
                DividerElement(qVar, 0);
                qVar.p(false);
            } else if (kotlin.jvm.internal.m.c(e0Var.f37411b, "img")) {
                qVar.X(-1485549213);
                ImageElement(kVar, lVar3, qVar, 0);
                qVar.p(false);
            } else if (kVar.W("podcast-warning") || kVar.W("info-box")) {
                z11 = false;
                qVar.X(-1485324773);
                InfoElement(kVar, qVar, 0);
                qVar.p(false);
            } else if (kVar.W("voice-row")) {
                qVar.X(-1485222380);
                SpeakerNameElement(kVar, qVar, 0);
                qVar.p(false);
            } else if (kVar.W("feedback-section")) {
                qVar.X(-1485099961);
                if (z6) {
                    qVar.X(-1485062916);
                    FeedbackSectionElement(kVar, colorScheme, aVar, qVar, ColorScheme.$stable << 3);
                    qVar.p(false);
                } else {
                    qVar.X(-1484850535);
                    qVar.p(false);
                }
                qVar.p(false);
            } else if (kVar.W("sample-action-section")) {
                qVar.X(-1484778429);
                SampleActionSectionElement(kVar, aVar2, qVar, 0);
                qVar.p(false);
            } else if (kVar.W("voice-text")) {
                qVar.X(-1484556314);
                i3.t I = r1.d.I(i3.q.f13017a, 36, t2.u.P, t2.u.P, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2358getX6D9Ej5fM(), 6);
                f1 d10 = r1.p.d(i3.d.f12997a, false);
                int hashCode = Long.hashCode(qVar.T);
                c3.o l4 = qVar.l();
                i3.t c5 = i3.a.c(I, qVar);
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
                Highlighter$lambda$18$0$LocalTextElement(styling, num, highlighterData, list, zVar, lVar, lVar2, highlightFocus, z0Var, i10, kVar, null, null, qVar, i11 & 14, 12);
                qVar.p(true);
                qVar.p(false);
                z11 = false;
            } else {
                qVar.X(-1484376359);
                Highlighter$lambda$18$0$LocalTextElement(styling, num, highlighterData, list, zVar, lVar, lVar2, highlightFocus, z0Var, i10, kVar, null, null, qVar, i11 & 14, 12);
                z11 = false;
                qVar.p(false);
            }
            z11 = false;
        }
        qVar.p(z11);
    }

    public static final sn.z Highlighter$lambda$18$0$RenderElementBody$3$0(z0 z0Var, boolean z6) {
        Highlighter$lambda$14(z0Var, z6);
        return sn.z.f31622a;
    }

    private static final HighlighterPosition Highlighter$lambda$18$0$positionFor(HighlightFocus highlightFocus, int i10) {
        HighlightFocus.ActiveElement activeElement;
        if (highlightFocus instanceof HighlightFocus.ActiveElement) {
            activeElement = (HighlightFocus.ActiveElement) highlightFocus;
        } else {
            activeElement = null;
        }
        if (activeElement == null || activeElement.getElementIndex() != i10) {
            return null;
        }
        return activeElement.getPosition();
    }

    public static final sn.z Highlighter$lambda$19(HighlighterData highlighterData, UserConfig.PlayerConfig playerConfig, z1 z1Var, ho.a aVar, ho.l lVar, ho.l lVar2, ho.l lVar3, ho.q qVar, i3.t tVar, r1.z1 z1Var2, t1.z zVar, boolean z6, ho.a aVar2, ho.a aVar3, ho.l lVar4, ho.a aVar4, ho.l lVar5, int i10, int i11, int i12, u2.m mVar, int i13) {
        Highlighter(highlighterData, playerConfig, z1Var, aVar, lVar, lVar2, lVar3, qVar, tVar, z1Var2, zVar, z6, aVar2, aVar3, lVar4, aVar4, lVar5, mVar, r.M(i10 | 1), r.M(i11), i12);
        return sn.z.f31622a;
    }

    public static final sn.z Highlighter$lambda$2$0(boolean z6) {
        return sn.z.f31622a;
    }

    public static final sn.z Highlighter$lambda$4$0(int i10) {
        return sn.z.f31622a;
    }

    public static final sn.z Highlighter$lambda$5(HighlighterData highlighterData, UserConfig.PlayerConfig playerConfig, z1 z1Var, ho.a aVar, ho.l lVar, ho.l lVar2, ho.l lVar3, ho.q qVar, i3.t tVar, r1.z1 z1Var2, t1.z zVar, boolean z6, ho.a aVar2, ho.a aVar3, ho.l lVar4, ho.a aVar4, ho.l lVar5, int i10, int i11, int i12, u2.m mVar, int i13) {
        Highlighter(highlighterData, playerConfig, z1Var, aVar, lVar, lVar2, lVar3, qVar, tVar, z1Var2, zVar, z6, aVar2, aVar3, lVar4, aVar4, lVar5, mVar, r.M(i10 | 1), r.M(i11), i12);
        return sn.z.f31622a;
    }

    public static final void ImageElement(org.jsoup.nodes.k kVar, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        kVar.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1795957575);
        if ((i10 & 6) == 0) {
            if (qVar.h(kVar)) {
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
            boolean f10 = qVar.f(kVar);
            Object L = qVar.L();
            Object obj = u2.l.f33918a;
            if (f10 || L == obj) {
                L = kVar.d("src");
                qVar.h0(L);
            }
            String str = (String) L;
            str.getClass();
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            i3.t c5 = i3.a.c(qVar2, qVar);
            h4.h.f11920i.getClass();
            ho.a aVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
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
            int i14 = i11;
            i3.t G = r1.d.G(p2.e(qVar2, 1.0f), t2.u.P, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2356getX4D9Ej5fM(), 1);
            Object L2 = qVar.L();
            if (L2 == obj) {
                L2 = new n(2);
                qVar.h0(L2);
            }
            i3.t c10 = p4.q.c(G, true, (ho.l) L2);
            Object L3 = qVar.L();
            if (L3 == obj) {
                L3 = new n(3);
                qVar.h0(L3);
            }
            i3.t b10 = p4.q.b(c10, (ho.l) L3);
            if ((i14 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean f11 = z10 | qVar.f(str);
            Object L4 = qVar.L();
            if (f11 || L4 == obj) {
                L4 = new l(lVar, str, 2);
                qVar.h0(L4);
            }
            i3.t p10 = l1.n.p(b10, false, null, null, null, (ho.a) L4, 15);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c11 = i3.a.c(p10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(aVar);
            } else {
                qVar.k0();
            }
            r.J(eVar, d10, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar4, c11, qVar);
            final float f12 = 300;
            ad.h srcOrData = CoilExtensionsKt.srcOrData(new ad.h((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b)), str, qVar, 0);
            srcOrData.b();
            ad.i a11 = srcOrData.a();
            qc.m.d(a11, null, c3.k.d(1735739082, true, new ho.r() { // from class: io.elevenlabs.highlighter.u
                @Override // ho.r
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    sn.z ImageElement$lambda$1$3$0;
                    int intValue = ((Integer) obj5).intValue();
                    ImageElement$lambda$1$3$0 = HighlighterKt.ImageElement$lambda$1$3$0(f12, (qc.x) obj2, (qc.e) obj3, (u2.m) obj4, intValue);
                    return ImageElement$lambda$1$3$0;
                }
            }, qVar), c3.k.d(-641710556, true, new v(f12, a11, 0), qVar), null, qVar, 221232, 0, 131020);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(kVar, lVar, i10, 4);
        }
    }

    public static final sn.z ImageElement$lambda$1$0$0(p4.b0 b0Var) {
        b0Var.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z ImageElement$lambda$1$1$0(p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.b(b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z ImageElement$lambda$1$2$0(ho.l lVar, String str) {
        lVar.invoke(str);
        return sn.z.f31622a;
    }

    public static final sn.z ImageElement$lambda$1$3$0(float f10, qc.x xVar, qc.e eVar, u2.m mVar, int i10) {
        boolean z6;
        xVar.getClass();
        eVar.getClass();
        if ((i10 & 129) != 128) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            r1.d.g(p2.f(i3.q.f13017a, f10), qVar);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ImageElement$lambda$1$3$1(float f10, ad.i iVar, qc.x xVar, qc.f fVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        float f11;
        boolean h10;
        int i12;
        xVar.getClass();
        fVar.getClass();
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = ((u2.q) mVar).f(fVar);
            } else {
                h10 = ((u2.q) mVar).h(fVar);
            }
            if (h10) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 145) != 144) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            long mo938getIntrinsicSizeNHjbRc = fVar.f28209a.mo938getIntrinsicSizeNHjbRc();
            int i13 = (int) (mo938getIntrinsicSizeNHjbRc >> 32);
            if (Float.intBitsToFloat(i13) > t2.u.P) {
                int i14 = (int) (mo938getIntrinsicSizeNHjbRc & 4294967295L);
                if (Float.intBitsToFloat(i14) > t2.u.P) {
                    f11 = Float.intBitsToFloat(i13) / Float.intBitsToFloat(i14);
                    qc.m.b(iVar, null, m3.h.d(r1.d.j(p2.h(i3.q.f13017a, t2.u.P, f10, 1), f11, true)), null, f4.q.f8840c, null, qVar, 1572912, 4024);
                }
            }
            f11 = 1.0f;
            qc.m.b(iVar, null, m3.h.d(r1.d.j(p2.h(i3.q.f13017a, t2.u.P, f10, 1), f11, true)), null, f4.q.f8840c, null, qVar, 1572912, 4024);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ImageElement$lambda$2(org.jsoup.nodes.k kVar, ho.l lVar, int i10, u2.m mVar, int i11) {
        ImageElement(kVar, lVar, mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void InfoElement(org.jsoup.nodes.k kVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        kVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-878119837);
        if ((i10 & 6) == 0) {
            if (qVar.h(kVar)) {
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
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t E = r1.d.E(l1.n.h(r1.d.G(i3.q.f13017a, t2.u.P, elevenLabsTheme.getSpacings(qVar, i13).m2357getX5D9Ej5fM(), 1), elevenLabsTheme.getColor(qVar, i13).getBackground().m2005getSecondary0d7_KjU(), elevenLabsTheme.getShapes(qVar, i13).getMd()), elevenLabsTheme.getSpacings(qVar, i13).m2355getX3D9Ej5fM());
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(E, qVar);
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
            String a02 = kVar.a0();
            a02.getClass();
            j7.d(a02, null, defpackage.f.A(elevenLabsTheme, qVar, i13), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i13).getBodyTiny500(), qVar, 0, 0, 131066);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b(kVar, i10, 1);
        }
    }

    public static final sn.z InfoElement$lambda$1(org.jsoup.nodes.k kVar, int i10, u2.m mVar, int i11) {
        InfoElement(kVar, mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void ListElement(int i10, org.jsoup.nodes.k kVar, Styling styling, HighlighterPosition highlighterPosition, Integer num, HighlighterData highlighterData, List<Chapter> list, t1.z zVar, boolean z6, ho.l lVar, ho.l lVar2, ho.l lVar3, u2.m mVar, int i11, int i12) {
        int i13;
        Styling styling2;
        Integer num2;
        HighlighterData highlighterData2;
        List<Chapter> list2;
        t1.z zVar2;
        boolean z10;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean h10;
        int i22;
        int i23;
        int i24;
        int i25;
        kVar.getClass();
        styling.getClass();
        highlighterData.getClass();
        list.getClass();
        zVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1521980192);
        if ((i11 & 6) == 0) {
            if (qVar.d(i10)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i13 = i25 | i11;
        } else {
            i13 = i11;
        }
        int i26 = 32;
        if ((i11 & 48) == 0) {
            if (qVar.h(kVar)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i13 |= i24;
        }
        if ((i11 & 384) == 0) {
            styling2 = styling;
            if (qVar.h(styling2)) {
                i23 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i23 = 128;
            }
            i13 |= i23;
        } else {
            styling2 = styling;
        }
        if ((i11 & 3072) == 0) {
            if ((i11 & 4096) == 0) {
                h10 = qVar.f(highlighterPosition);
            } else {
                h10 = qVar.h(highlighterPosition);
            }
            if (h10) {
                i22 = 2048;
            } else {
                i22 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i22;
        }
        if ((i11 & 24576) == 0) {
            num2 = num;
            if (qVar.f(num2)) {
                i21 = 16384;
            } else {
                i21 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i21;
        } else {
            num2 = num;
        }
        if ((196608 & i11) == 0) {
            highlighterData2 = highlighterData;
            if (qVar.h(highlighterData2)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i13 |= i20;
        } else {
            highlighterData2 = highlighterData;
        }
        if ((1572864 & i11) == 0) {
            list2 = list;
            if (qVar.h(list2)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i13 |= i19;
        } else {
            list2 = list;
        }
        if ((12582912 & i11) == 0) {
            zVar2 = zVar;
            if (qVar.f(zVar2)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i13 |= i18;
        } else {
            zVar2 = zVar;
        }
        if ((100663296 & i11) == 0) {
            z10 = z6;
            if (qVar.g(z10)) {
                i17 = 67108864;
            } else {
                i17 = 33554432;
            }
            i13 |= i17;
        } else {
            z10 = z6;
        }
        if ((i11 & 805306368) == 0) {
            if (qVar.h(lVar)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i13 |= i16;
        }
        if ((i12 & 6) == 0) {
            if (qVar.h(lVar2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i12 | i15;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            if (!qVar.h(lVar3)) {
                i26 = 16;
            }
            i14 |= i26;
        }
        if ((306783379 & i13) == 306783378 && (i14 & 19) == 18) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (qVar.O(i13 & 1, z11)) {
            i3.t G = r1.d.G(i3.q.f13017a, t2.u.P, styling2.getListVerticalSpacing(), 1);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
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
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            r.J(h4.g.f11905d, c5, qVar);
            int i27 = i13 << 6;
            int i28 = i14 << 6;
            ListElementContent(kVar, kotlin.jvm.internal.m.c(kVar.f26057d.f37411b, "ol"), 0, i10, styling2, highlighterPosition, num2, highlighterData2, list2, zVar2, z10, lVar, lVar2, lVar3, qVar, ((i13 >> 3) & 14) | 384 | ((i13 << 9) & 7168) | (57344 & i27) | (458752 & i27) | (3670016 & i27) | (29360128 & i27) | (234881024 & i27) | (i27 & 1879048192), ((i13 >> 24) & 126) | (i28 & 896) | (i28 & 7168));
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new s(i10, kVar, styling, highlighterPosition, num, highlighterData, list, zVar, z6, lVar, lVar2, lVar3, i11, i12);
        }
    }

    public static final sn.z ListElement$lambda$1(int i10, org.jsoup.nodes.k kVar, Styling styling, HighlighterPosition highlighterPosition, Integer num, HighlighterData highlighterData, List list, t1.z zVar, boolean z6, ho.l lVar, ho.l lVar2, ho.l lVar3, int i11, int i12, u2.m mVar, int i13) {
        ListElement(i10, kVar, styling, highlighterPosition, num, highlighterData, list, zVar, z6, lVar, lVar2, lVar3, mVar, r.M(i11 | 1), r.M(i12));
        return sn.z.f31622a;
    }

    private static final void ListElementContent(final org.jsoup.nodes.k kVar, final boolean z6, final int i10, final int i11, final Styling styling, final HighlighterPosition highlighterPosition, final Integer num, final HighlighterData highlighterData, final List<Chapter> list, final t1.z zVar, final boolean z10, final ho.l lVar, final ho.l lVar2, final ho.l lVar3, u2.m mVar, final int i12, final int i13) {
        org.jsoup.nodes.k kVar2;
        int i14;
        Styling styling2;
        u2.q qVar;
        u2.q qVar2;
        int i15;
        int i16;
        boolean z11;
        boolean z12;
        int i17 = i10;
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-1498346920);
        if ((i12 & 6) == 0) {
            kVar2 = kVar;
            i14 = (qVar3.h(kVar2) ? 4 : 2) | i12;
        } else {
            kVar2 = kVar;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= qVar3.g(z6) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= qVar3.d(i17) ? 256 : 128;
        }
        int i18 = i12 & 3072;
        int i19 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i18 == 0) {
            i14 |= qVar3.d(i11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            styling2 = styling;
            i14 |= qVar3.h(styling2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            styling2 = styling;
        }
        if ((i12 & 196608) == 0) {
            i14 |= (i12 & 262144) == 0 ? qVar3.f(highlighterPosition) : qVar3.h(highlighterPosition) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i14 |= qVar3.f(num) ? 1048576 : 524288;
        }
        if ((i12 & 12582912) == 0) {
            i14 |= qVar3.h(highlighterData) ? 8388608 : 4194304;
        }
        if ((i12 & 100663296) == 0) {
            i14 |= qVar3.h(list) ? 67108864 : 33554432;
        }
        if ((i12 & 805306368) == 0) {
            i14 |= qVar3.f(zVar) ? 536870912 : 268435456;
        }
        int i20 = i14;
        int i21 = (i13 & 6) == 0 ? (qVar3.g(z10) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i21 |= qVar3.h(lVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i21 |= qVar3.h(lVar2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if (qVar3.h(lVar3)) {
                i19 = 2048;
            }
            i21 |= i19;
        }
        if (qVar3.O(i20 & 1, ((i20 & 306783379) == 306783378 && (i21 & 1171) == 1170) ? false : true)) {
            kVar2.getClass();
            Iterator it = new ArrayList(kVar2.O()).iterator();
            int i22 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i23 = i22 + 1;
                if (i22 >= 0) {
                    org.jsoup.nodes.k kVar3 = (org.jsoup.nodes.k) next;
                    if (kotlin.jvm.internal.m.c(kVar3.f26057d.f37411b, "li")) {
                        qVar3.X(-418850950);
                        org.jsoup.nodes.k contentBeforeNestedLists = getContentBeforeNestedLists(kVar3);
                        List<org.jsoup.nodes.k> nestedLists = getNestedLists(kVar3);
                        i3.k kVar4 = i3.d.f13004y0;
                        float listIndentation = i17 * styling2.getListIndentation();
                        float listItemSpacing = styling2.getListItemSpacing();
                        i3.q qVar4 = i3.q.f13017a;
                        i3.t I = r1.d.I(qVar4, listIndentation, t2.u.P, t2.u.P, listItemSpacing, 6);
                        k2 a10 = i2.a(r1.j.f29228a, kVar4, qVar3, 48);
                        int hashCode = Long.hashCode(qVar3.T);
                        c3.o l4 = qVar3.l();
                        i3.t c5 = i3.a.c(I, qVar3);
                        h4.h.f11920i.getClass();
                        h4.f fVar = h4.g.f11903b;
                        qVar3.b0();
                        if (qVar3.S) {
                            qVar3.k(fVar);
                        } else {
                            qVar3.k0();
                        }
                        h4.e eVar = h4.g.f11907f;
                        r.J(eVar, a10, qVar3);
                        h4.e eVar2 = h4.g.f11906e;
                        r.J(eVar2, l4, qVar3);
                        Integer valueOf = Integer.valueOf(hashCode);
                        h4.e eVar3 = h4.g.f11908g;
                        r.y(qVar3, valueOf, eVar3);
                        h4.d dVar = h4.g.f11909h;
                        r.F(dVar, qVar3);
                        h4.e eVar4 = h4.g.f11905d;
                        r.J(eVar4, c5, qVar3);
                        String str = z6 ? i23 + Separators.DOT : "• ";
                        y0 listNumberOrBulletTextStyle = styling2.getListNumberOrBulletTextStyle();
                        String str2 = str;
                        long b10 = defpackage.f.b(ElevenLabsTheme.INSTANCE, qVar3, ElevenLabsTheme.$stable);
                        i3.t I2 = r1.d.I(p2.s(qVar4, styling2.getListIndentation()), t2.u.P, t2.u.P, styling2.getBulletSpacing(), t2.u.P, 11);
                        f4.v vVar = f4.d.f8741a;
                        u2.q qVar5 = qVar3;
                        i16 = i23;
                        int i24 = i21;
                        j7.d(str2, I2.then(new d3(vVar)), b10, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, listNumberOrBulletTextStyle, qVar5, 0, 0, 131064);
                        qVar2 = qVar5;
                        if (1.0f <= 0.0d) {
                            s1.a.a("invalid weight; must be greater than zero");
                        }
                        i3.t then = new m1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).then(new d3(vVar));
                        r1.x a11 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
                        int hashCode2 = Long.hashCode(qVar2.T);
                        c3.o l7 = qVar2.l();
                        i3.t c10 = i3.a.c(then, qVar2);
                        qVar2.b0();
                        if (qVar2.S) {
                            qVar2.k(fVar);
                        } else {
                            qVar2.k0();
                        }
                        r.J(eVar, a11, qVar2);
                        r.J(eVar2, l7, qVar2);
                        defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
                        r.J(eVar4, c10, qVar2);
                        if (contentBeforeNestedLists != null) {
                            qVar2.X(925008711);
                            int i25 = i20 >> 6;
                            int i26 = ((i20 >> 9) & 126) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (i25 & 29360128);
                            int i27 = i24 << 24;
                            int i28 = i26 | (234881024 & i27) | (i27 & 1879048192);
                            int i29 = i24 >> 6;
                            int i30 = (i29 & 14) | 3072 | (i29 & 112);
                            z11 = true;
                            z12 = false;
                            i15 = i24;
                            TextElement(i11, styling, contentBeforeNestedLists, highlighterPosition, num, highlighterData, list, zVar, z10, lVar, lVar2, lVar3, null, qVar4, qVar2, i28, i30, 4096);
                            qVar2 = qVar2;
                            qVar2.p(false);
                        } else {
                            z11 = true;
                            z12 = false;
                            i15 = i24;
                            qVar2.X(925832288);
                            qVar2.p(false);
                        }
                        qVar2.X(445510924);
                        for (org.jsoup.nodes.k kVar5 : nestedLists) {
                            u2.q qVar6 = qVar2;
                            ListElementContent(kVar5, kotlin.jvm.internal.m.c(kVar5.f26057d.f37411b, "ol"), i10 + 1, i11, styling, highlighterPosition, num, highlighterData, list, zVar, z10, lVar, lVar2, lVar3, qVar6, i20 & 2147482624, i15 & 8190);
                            qVar2 = qVar6;
                        }
                        qVar2.p(z12);
                        qVar2.p(z11);
                        qVar2.p(z11);
                        qVar2.p(z12);
                    } else {
                        qVar2 = qVar3;
                        i15 = i21;
                        i16 = i23;
                        qVar2.X(-415842059);
                        qVar2.p(false);
                    }
                    i17 = i10;
                    i22 = i16;
                    i21 = i15;
                    qVar3 = qVar2;
                    styling2 = styling;
                } else {
                    ig.f.U();
                    throw null;
                }
            }
            qVar = qVar3;
        } else {
            qVar = qVar3;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new ho.p() { // from class: io.elevenlabs.highlighter.i
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z ListElementContent$lambda$1;
                    int intValue = ((Integer) obj2).intValue();
                    ListElementContent$lambda$1 = HighlighterKt.ListElementContent$lambda$1(org.jsoup.nodes.k.this, z6, i10, i11, styling, highlighterPosition, num, highlighterData, list, zVar, z10, lVar, lVar2, lVar3, i12, i13, (u2.m) obj, intValue);
                    return ListElementContent$lambda$1;
                }
            };
        }
    }

    public static final sn.z ListElementContent$lambda$1(org.jsoup.nodes.k kVar, boolean z6, int i10, int i11, Styling styling, HighlighterPosition highlighterPosition, Integer num, HighlighterData highlighterData, List list, t1.z zVar, boolean z10, ho.l lVar, ho.l lVar2, ho.l lVar3, int i12, int i13, u2.m mVar, int i14) {
        ListElementContent(kVar, z6, i10, i11, styling, highlighterPosition, num, highlighterData, list, zVar, z10, lVar, lVar2, lVar3, mVar, r.M(i12 | 1), r.M(i13));
        return sn.z.f31622a;
    }

    public static final void SampleActionSectionElement(org.jsoup.nodes.k kVar, ho.a aVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        kVar.getClass();
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2117482030);
        if ((i10 & 6) == 0) {
            if (qVar.h(kVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
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
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                xs.e V = kVar.V("sample-action-button");
                V.getClass();
                org.jsoup.nodes.k kVar2 = (org.jsoup.nodes.k) tn.o.y0(V);
                if (kVar2 != null) {
                    L = kVar2.a0();
                } else {
                    L = null;
                }
                qVar.h0(L);
            }
            String str = (String) L;
            if (str != null) {
                qVar.X(-1722229206);
                FullWidthButtonKt.FullWidthButton(str, aVar, r1.d.G(p2.e(i3.q.f13017a, 1.0f), t2.u.P, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2356getX4D9Ej5fM(), 1), FullWidthButtonSize.Small, null, null, false, false, false, qVar, (i11 & 112) | 3078, 496);
                qVar.p(false);
            } else {
                qVar.X(-1721946672);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new a2.i(kVar, aVar, i10, 5);
        }
    }

    public static final sn.z SampleActionSectionElement$lambda$1(org.jsoup.nodes.k kVar, ho.a aVar, int i10, u2.m mVar, int i11) {
        SampleActionSectionElement(kVar, aVar, mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void SpeakerNameElement(org.jsoup.nodes.k kVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        kVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(199761859);
        if ((i10 & 6) == 0) {
            if (qVar.h(kVar)) {
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
            Object L = qVar.L();
            String str = null;
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                us.g.z("img");
                xs.e e10 = jo.a.e(new xs.h(vs.a.d("img"), 9, false), kVar);
                e10.getClass();
                org.jsoup.nodes.k kVar2 = (org.jsoup.nodes.k) tn.o.y0(e10);
                if (kVar2 != null) {
                    L = kVar2.d("src");
                } else {
                    L = null;
                }
                qVar.h0(L);
            }
            String str2 = (String) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                xs.e V = kVar.V("voice-name");
                V.getClass();
                org.jsoup.nodes.k kVar3 = (org.jsoup.nodes.k) tn.o.y0(V);
                if (kVar3 != null) {
                    str = kVar3.a0();
                }
                qVar.h0(str);
                L2 = str;
            }
            String str3 = (String) L2;
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.q qVar2 = i3.q.f13017a;
            i3.t c5 = i3.a.c(qVar2, qVar);
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
            if (str2 != null) {
                qVar.X(1952066795);
                ad.h hVar = new ad.h((Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b));
                hVar.f1788c = str2;
                hVar.b();
                ad.i a11 = hVar.a();
                i3.t o6 = p2.o(qVar2, 24);
                ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
                int i13 = ElevenLabsTheme.$stable;
                qc.m.b(a11, null, m3.h.c(o6, elevenLabsTheme.getShapes(qVar, i13).getFull()), null, f4.q.f8840c, null, qVar, 1572912, 4024);
                r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i13).m2355getX3D9Ej5fM()), qVar);
                qVar.p(false);
            } else {
                qVar.X(1952543451);
                qVar.p(false);
            }
            if (str3 != null) {
                qVar.X(1952594973);
                y0 subtitleMedium700 = ElevenLabsTheme.INSTANCE.getTypo(qVar, ElevenLabsTheme.$stable).getSubtitleMedium700();
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                j7.d(str3, new m1(1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, subtitleMedium700, qVar, 6, 0, 131068);
                qVar = qVar;
                qVar.p(false);
            } else {
                qVar.X(1952756731);
                qVar.p(false);
            }
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new b(kVar, i10, 0);
        }
    }

    public static final sn.z SpeakerNameElement$lambda$3(org.jsoup.nodes.k kVar, int i10, u2.m mVar, int i11) {
        SpeakerNameElement(kVar, mVar, r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextElement(int i10, Styling styling, org.jsoup.nodes.k kVar, HighlighterPosition highlighterPosition, Integer num, HighlighterData highlighterData, List<Chapter> list, t1.z zVar, boolean z6, ho.l lVar, final ho.l lVar2, ho.l lVar3, i3.t tVar, i3.t tVar2, u2.m mVar, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        u2.q qVar;
        i3.t tVar3;
        i3.t tVar4;
        r1 r10;
        i3.t tVar5;
        i3.t tVar6;
        int i17;
        int i18;
        Object obj;
        Styling styling2;
        Object highlighterKt$TextElement$1$1;
        final ho.l lVar4;
        Object obj2;
        u2.q qVar2;
        final TextBoundsDrawerState textBoundsDrawerState;
        i3.t tVar7;
        styling.getClass();
        kVar.getClass();
        highlighterData.getClass();
        list.getClass();
        zVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(883196497);
        if ((i11 & 6) == 0) {
            i14 = (qVar3.d(i10) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= qVar3.h(styling) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= qVar3.h(kVar) ? 256 : 128;
        }
        int i19 = i11 & 3072;
        int i20 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i19 == 0) {
            i14 |= (i11 & 4096) == 0 ? qVar3.f(highlighterPosition) : qVar3.h(highlighterPosition) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i14 |= qVar3.f(num) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((i11 & 196608) == 0) {
            i14 |= qVar3.h(highlighterData) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= qVar3.h(list) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= qVar3.f(zVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i14 |= qVar3.g(z6) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i14 |= qVar3.h(lVar) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i15 = i12 | (qVar3.h(lVar2) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i12 & 48) == 0) {
            i15 |= qVar3.h(lVar3) ? 32 : 16;
        }
        int i21 = i15;
        int i22 = i13 & 4096;
        if (i22 != 0) {
            i21 |= 384;
            i16 = i14;
        } else {
            i16 = i14;
            if ((i12 & 384) == 0) {
                i21 |= qVar3.f(tVar) ? 256 : 128;
                if ((i12 & 3072) == 0) {
                    if ((i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0 && qVar3.f(tVar2)) {
                        i20 = 2048;
                    }
                    i21 |= i20;
                }
                if (!qVar3.O(i16 & 1, (i16 & 306783379) == 306783378 || (i21 & 1171) != 1170)) {
                    qVar3.T();
                    if ((i11 & 1) != 0 && !qVar3.y()) {
                        qVar3.R();
                        if ((i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                            i21 &= -7169;
                        }
                        tVar6 = tVar;
                        tVar5 = tVar2;
                    } else {
                        i3.t tVar8 = i22 != 0 ? i3.q.f13017a : tVar;
                        if ((i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                            i21 &= -7169;
                            tVar6 = tVar8;
                            tVar5 = styling.getTextElementModifier();
                        } else {
                            tVar5 = tVar2;
                            tVar6 = tVar8;
                        }
                    }
                    int i23 = i21;
                    qVar3.q();
                    int i24 = i16 & 14;
                    boolean f10 = qVar3.f(highlighterData.getBookmarks()) | (i24 == 4) | qVar3.f(styling) | qVar3.f(list);
                    Object L = qVar3.L();
                    Object obj3 = u2.l.f33918a;
                    if (f10 || L == obj3) {
                        i17 = i24;
                        i18 = i16;
                        obj = obj3;
                        L = toAnnotatedString(kVar, styling, new Stack(), 0, highlighterData.getBookmarks(), list);
                        styling2 = styling;
                        qVar3.h0(L);
                    } else {
                        styling2 = styling;
                        i17 = i24;
                        obj = obj3;
                        i18 = i16;
                    }
                    AnnotationData annotationData = (AnnotationData) L;
                    s4.h text = annotationData.getText();
                    final List<WordAnnotation> annotations = annotationData.getAnnotations();
                    final List<BookmarkAnnotation> bookmarks = annotationData.getBookmarks();
                    TextBoundsDrawerState rememberTextBoundsDrawerState = rememberTextBoundsDrawerState(annotationData, styling2, qVar3, i18 & 112);
                    boolean f11 = qVar3.f(highlighterData.getSlots()) | (i17 == 4);
                    Object L2 = qVar3.L();
                    if (f11 || L2 == obj) {
                        L2 = Integer.valueOf(lazyItemIndexForGlobalElement(highlighterData.getSlots(), i10));
                        qVar3.h0(L2);
                    }
                    boolean z10 = num != null && ((Number) L2).intValue() == num.intValue() && highlighterData.getFollowingContent();
                    Object[] objArr = {num, Boolean.valueOf(z10), Integer.valueOf(rememberTextBoundsDrawerState.getSelectedPositionTop()), styling2};
                    boolean f12 = qVar3.f(rememberTextBoundsDrawerState) | ((i18 & 57344) == 16384) | qVar3.g(z10) | ((29360128 & i18) == 8388608) | ((234881024 & i18) == 67108864) | ((1879048192 & i18) == 536870912);
                    Object L3 = qVar3.L();
                    if (f12 || L3 == obj) {
                        lVar4 = lVar3;
                        obj2 = obj;
                        qVar2 = qVar3;
                        textBoundsDrawerState = rememberTextBoundsDrawerState;
                        tVar7 = tVar5;
                        highlighterKt$TextElement$1$1 = new HighlighterKt$TextElement$1$1(textBoundsDrawerState, num, z10, zVar, z6, lVar, null);
                        qVar2.h0(highlighterKt$TextElement$1$1);
                    } else {
                        lVar4 = lVar3;
                        highlighterKt$TextElement$1$1 = L3;
                        obj2 = obj;
                        qVar2 = qVar3;
                        textBoundsDrawerState = rememberTextBoundsDrawerState;
                        tVar7 = tVar5;
                    }
                    r.i(objArr, (ho.p) highlighterKt$TextElement$1$1, qVar2);
                    boolean f13 = qVar2.f(textBoundsDrawerState) | ((i18 & 7168) == 2048 || ((i18 & 4096) != 0 && qVar2.h(highlighterPosition)));
                    Object L4 = qVar2.L();
                    if (f13 || L4 == obj2) {
                        L4 = new l(textBoundsDrawerState, highlighterPosition, 0);
                        qVar2.h0(L4);
                    }
                    r.j((ho.a) L4, qVar2);
                    boolean f14 = qVar2.f(bookmarks) | qVar2.f(annotations) | ((i23 & 112) == 32) | ((i23 & 14) == 4);
                    Object L5 = qVar2.L();
                    if (f14 || L5 == obj2) {
                        L5 = new ho.l() { // from class: io.elevenlabs.highlighter.m
                            @Override // ho.l
                            public final Object invoke(Object obj4) {
                                sn.z TextElement$lambda$4$0;
                                TextElement$lambda$4$0 = HighlighterKt.TextElement$lambda$4$0(bookmarks, lVar4, annotations, lVar2, ((Integer) obj4).intValue());
                                return TextElement$lambda$4$0;
                            }
                        };
                        qVar2.h0(L5);
                    }
                    final ho.l lVar5 = (ho.l) L5;
                    Object L6 = qVar2.L();
                    if (L6 == obj2) {
                        L6 = r.A(null);
                        qVar2.h0(L6);
                    }
                    final z0 z0Var = (z0) L6;
                    boolean f15 = qVar2.f(text);
                    Object L7 = qVar2.L();
                    if (f15 || L7 == obj2) {
                        L7 = r.A(new y4.w(text, 0L, 6));
                        qVar2.h0(L7);
                    }
                    z0 z0Var2 = (z0) L7;
                    y4.w TextElement$lambda$7 = TextElement$lambda$7(z0Var2);
                    boolean f16 = qVar2.f(z0Var2);
                    Object L8 = qVar2.L();
                    if (f16 || L8 == obj2) {
                        L8 = new HighlighterKt$TextElement$3$1(z0Var2);
                        qVar2.h0(L8);
                    }
                    ho.l lVar6 = (ho.l) ((oo.g) L8);
                    y4.w TextElement$lambda$72 = TextElement$lambda$7(z0Var2);
                    boolean f17 = qVar2.f(z0Var2);
                    Object L9 = qVar2.L();
                    if (f17 || L9 == obj2) {
                        L9 = new HighlighterKt$TextElement$4$1(z0Var2);
                        qVar2.h0(L9);
                    }
                    int i25 = ((i18 << 3) & 112) | ((i23 >> 6) & 14);
                    qVar = qVar2;
                    i3.t tVar9 = tVar6;
                    i3.t tVar10 = setupTextContextMenu(tVar9, i10, TextElement$lambda$72, (ho.l) ((oo.g) L9), qVar, i25);
                    Object L10 = qVar.L();
                    if (L10 == obj2) {
                        L10 = new n(0);
                        qVar.h0(L10);
                    }
                    i3.t c5 = p4.q.c(tVar10, false, (ho.l) L10);
                    y0 textStyle = styling.getTextStyle();
                    boolean f18 = qVar.f(textBoundsDrawerState);
                    Object L11 = qVar.L();
                    if (f18 || L11 == obj2) {
                        L11 = new ho.l() { // from class: io.elevenlabs.highlighter.o
                            @Override // ho.l
                            public final Object invoke(Object obj4) {
                                sn.z TextElement$lambda$12$0;
                                TextElement$lambda$12$0 = HighlighterKt.TextElement$lambda$12$0(z0.this, textBoundsDrawerState, (s4.u0) obj4);
                                return TextElement$lambda$12$0;
                            }
                        };
                        qVar.h0(L11);
                    }
                    ho.l lVar7 = (ho.l) L11;
                    final i3.t tVar11 = tVar7;
                    a2.v.b(TextElement$lambda$7, lVar6, c5, false, true, textStyle, null, null, false, 0, 0, null, lVar7, null, null, c3.k.d(-1161578674, true, new ho.q() { // from class: io.elevenlabs.highlighter.p
                        @Override // ho.q
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            sn.z TextElement$lambda$13;
                            int intValue = ((Integer) obj6).intValue();
                            TextElement$lambda$13 = HighlighterKt.TextElement$lambda$13(i3.t.this, textBoundsDrawerState, lVar5, z0Var, (ho.p) obj4, (u2.m) obj5, intValue);
                            return TextElement$lambda$13;
                        }
                    }, qVar), qVar, 24576, 196608, 28616);
                    tVar3 = tVar9;
                    tVar4 = tVar11;
                } else {
                    qVar = qVar3;
                    qVar.R();
                    tVar3 = tVar;
                    tVar4 = tVar2;
                }
                r10 = qVar.r();
                if (r10 == null) {
                    r10.f34012d = new q(i10, styling, kVar, highlighterPosition, num, highlighterData, list, zVar, z6, lVar, lVar2, lVar3, tVar3, tVar4, i11, i12, i13);
                    return;
                }
                return;
            }
        }
        if ((i12 & 3072) == 0) {
        }
        if (!qVar3.O(i16 & 1, (i16 & 306783379) == 306783378 || (i21 & 1171) != 1170)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z TextElement$lambda$11$0(p4.b0 b0Var) {
        b0Var.getClass();
        oo.u[] uVarArr = p4.y.f26563a;
        a0 a0Var = p4.w.N;
        oo.u[] uVarArr2 = p4.y.f26563a;
        oo.u uVar = uVarArr2[26];
        b0Var.b(a0Var, Boolean.FALSE);
        s4.h hVar = new s4.h("");
        a0 a0Var2 = p4.w.F;
        oo.u uVar2 = uVarArr2[19];
        b0Var.b(a0Var2, hVar);
        return sn.z.f31622a;
    }

    public static final sn.z TextElement$lambda$12$0(z0 z0Var, TextBoundsDrawerState textBoundsDrawerState, s4.u0 u0Var) {
        u0Var.getClass();
        z0Var.setValue(u0Var);
        textBoundsDrawerState.onTextLayout(u0Var);
        return sn.z.f31622a;
    }

    public static final sn.z TextElement$lambda$13(i3.t tVar, TextBoundsDrawerState textBoundsDrawerState, ho.l lVar, z0 z0Var, ho.p pVar, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        pVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).h(pVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean f10 = qVar.f(textBoundsDrawerState);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new g(textBoundsDrawerState, 0);
                qVar.h0(L);
            }
            i3.t pressIndicator = pressIndicator(m3.h.e(tVar, (ho.l) L), lVar, z0Var);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(pressIndicator, qVar);
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
            j0.c.q(i10 & 14, pVar, qVar, true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z TextElement$lambda$13$0$0(TextBoundsDrawerState textBoundsDrawerState, r3.e eVar) {
        eVar.getClass();
        textBoundsDrawerState.draw(eVar);
        return sn.z.f31622a;
    }

    public static final sn.z TextElement$lambda$14(int i10, Styling styling, org.jsoup.nodes.k kVar, HighlighterPosition highlighterPosition, Integer num, HighlighterData highlighterData, List list, t1.z zVar, boolean z6, ho.l lVar, ho.l lVar2, ho.l lVar3, i3.t tVar, i3.t tVar2, int i11, int i12, int i13, u2.m mVar, int i14) {
        TextElement(i10, styling, kVar, highlighterPosition, num, highlighterData, list, zVar, z6, lVar, lVar2, lVar3, tVar, tVar2, mVar, r.M(i11 | 1), r.M(i12), i13);
        return sn.z.f31622a;
    }

    public static final sn.z TextElement$lambda$3$0(TextBoundsDrawerState textBoundsDrawerState, HighlighterPosition highlighterPosition) {
        textBoundsDrawerState.updatePosition(highlighterPosition);
        return sn.z.f31622a;
    }

    public static final sn.z TextElement$lambda$4$0(List list, ho.l lVar, List list2, ho.l lVar2, int i10) {
        Object obj;
        Object obj2;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                BookmarkAnnotation bookmarkAnnotation = (BookmarkAnnotation) obj2;
                if (bookmarkAnnotation.getStart() <= i10 && bookmarkAnnotation.getEnd() >= i10) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        BookmarkAnnotation bookmarkAnnotation2 = (BookmarkAnnotation) obj2;
        if (bookmarkAnnotation2 != null) {
            lVar.invoke(bookmarkAnnotation2.getId());
        } else {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                WordAnnotation wordAnnotation = (WordAnnotation) next;
                if (wordAnnotation.getStart() <= i10 && wordAnnotation.getEnd() >= i10) {
                    obj = next;
                    break;
                }
            }
            WordAnnotation wordAnnotation2 = (WordAnnotation) obj;
            if (wordAnnotation2 != null) {
                lVar2.invoke(new WordTapTarget(wordAnnotation2.getC(), wordAnnotation2.getTs(), wordAnnotation2.getAudioFileNumber()));
            }
        }
        return sn.z.f31622a;
    }

    private static final y4.w TextElement$lambda$7(z0 z0Var) {
        return (y4.w) z0Var.getValue();
    }

    private static final void append(s4.e eVar, org.jsoup.nodes.r rVar, Styling styling, Stack<Object> stack, int i10, List<WordAnnotation> list, List<Chapter> list2) {
        if (rVar instanceof org.jsoup.nodes.y) {
            appendTextElement(eVar, (org.jsoup.nodes.y) rVar);
            return;
        }
        if (rVar instanceof org.jsoup.nodes.k) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) rVar;
            e0 e0Var = kVar.f26057d;
            if (kotlin.jvm.internal.m.c(e0Var.f37411b, "br")) {
                eVar.d(Separators.RETURN);
                return;
            }
            String d10 = rVar.d(TAG_CHARACTER);
            d10.getClass();
            String d11 = rVar.d(TAG_TIMESTAMP);
            d11.getClass();
            int length = eVar.f31024a.length();
            withStylesSafe(eVar, stack, styling.getParagraphStyles().get(e0Var.f37411b), styling.getSpanStyles().get(e0Var.f37411b), new h(kVar, styling, stack, i10, list, list2));
            WordAnnotation buildWordAnnotation = buildWordAnnotation(length, eVar.f31024a.length(), d10, d11, list2);
            if (buildWordAnnotation != null) {
                list.add(buildWordAnnotation);
            }
            if (kVar.W("voice-row")) {
                eVar.append('\n');
            }
        }
    }

    public static final sn.z append$lambda$0(org.jsoup.nodes.r rVar, Styling styling, Stack stack, int i10, List list, List list2, s4.e eVar) {
        Character valueOf;
        org.jsoup.nodes.r s10;
        String text;
        eVar.getClass();
        List<org.jsoup.nodes.r> i11 = rVar.i();
        i11.getClass();
        for (org.jsoup.nodes.r rVar2 : i11) {
            rVar2.getClass();
            append(eVar, rVar2, styling, stack, i10, list, list2);
        }
        String a02 = ((org.jsoup.nodes.k) rVar).a0();
        a02.getClass();
        Character ch2 = null;
        if (a02.length() == 0) {
            valueOf = null;
        } else {
            valueOf = Character.valueOf(a02.charAt(a02.length() - 1));
        }
        if (valueOf != null && Character.isLetterOrDigit(valueOf.charValue()) && (s10 = rVar.s()) != null && (text = getText(s10)) != null) {
            if (text.length() != 0) {
                ch2 = Character.valueOf(text.charAt(0));
            }
            if (ch2 != null && !f0.r0(ch2.charValue())) {
                eVar.d(Separators.SP);
            }
        }
        return sn.z.f31622a;
    }

    private static final void appendTextElement(s4.e eVar, org.jsoup.nodes.y yVar) {
        String O = yVar.O();
        O.getClass();
        String M0 = wq.n.M0(O, '\n');
        if (M0.length() > 0) {
            eVar.d(M0);
        }
    }

    public static final HighlighterData applyContentAndCap(HighlighterData highlighterData, int i10, ChapterContent chapterContent, final int i11) {
        highlighterData.getClass();
        chapterContent.getClass();
        List<ChapterSlot> slots = highlighterData.getSlots();
        ArrayList arrayList = new ArrayList(tn.p.a0(slots, 10));
        for (ChapterSlot chapterSlot : slots) {
            if (chapterSlot.getChapter().getIndex() == i10) {
                chapterSlot = ChapterSlot.copy$default(chapterSlot, null, 0, 0, null, 0, chapterContent, 31, null);
            }
            arrayList.add(chapterSlot);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ChapterSlot) next).getContent() != null) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() <= 7) {
            return HighlighterData.copy$default(highlighterData, arrayList, false, null, null, 14, null);
        }
        vq.h t02 = vq.k.t0(new vq.f(new eo.m(tn.o.a1(new Comparator() { // from class: io.elevenlabs.highlighter.HighlighterKt$applyContentAndCap$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return wn.e.g(Integer.valueOf(Math.abs(((ChapterSlot) t11).getChapter().getIndex() - i11)), Integer.valueOf(Math.abs(((ChapterSlot) t10).getChapter().getIndex() - i11)));
            }
        }, arrayList2), 3), true, new t(i10, 0)), arrayList2.size() - 7);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = t02.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(Integer.valueOf(((ChapterSlot) it2.next()).getChapter().getIndex()));
        }
        if (linkedHashSet.isEmpty()) {
            return HighlighterData.copy$default(highlighterData, arrayList, false, null, null, 14, null);
        }
        vq.e eVar = new vq.e(vq.k.s0(new vq.f(new eo.m(arrayList, 3), true, new g(linkedHashSet, 4)), new n(1)));
        while (eVar.hasNext()) {
            ParsedElementCache.INSTANCE.evict((List) eVar.next());
        }
        ArrayList arrayList3 = new ArrayList(tn.p.a0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ChapterSlot chapterSlot2 = (ChapterSlot) it3.next();
            if (linkedHashSet.contains(Integer.valueOf(chapterSlot2.getChapter().getIndex()))) {
                chapterSlot2 = ChapterSlot.copy$default(chapterSlot2, null, 0, 0, null, 0, null, 31, null);
            }
            arrayList3.add(chapterSlot2);
        }
        return HighlighterData.copy$default(highlighterData, arrayList3, false, null, null, 14, null);
    }

    public static final boolean applyContentAndCap$lambda$3(int i10, ChapterSlot chapterSlot) {
        chapterSlot.getClass();
        if (chapterSlot.getChapter().getIndex() != i10) {
            return true;
        }
        return false;
    }

    public static final boolean applyContentAndCap$lambda$5(Set set, ChapterSlot chapterSlot) {
        chapterSlot.getClass();
        return set.contains(Integer.valueOf(chapterSlot.getChapter().getIndex()));
    }

    public static final List applyContentAndCap$lambda$6(ChapterSlot chapterSlot) {
        chapterSlot.getClass();
        ChapterContent content = chapterSlot.getContent();
        if (content != null) {
            return content.getElements();
        }
        return null;
    }

    public static final v0 buildActiveParagraphPath(List<o3.c> list, float f10, float f11) {
        int i10;
        long j4;
        float f12;
        if (list.isEmpty()) {
            return p3.k.a();
        }
        if (list.size() == 1) {
            o3.c cVar = (o3.c) tn.o.w0(list);
            p3.i a10 = p3.k.a();
            v0.c(a10, n0.l.c(cVar.f24766a - f10, cVar.f24767b - f10, cVar.f24768c + f10, cVar.f24769d + f10, f11, f11));
            return a10;
        }
        List a12 = tn.o.a1(new Comparator() { // from class: io.elevenlabs.highlighter.HighlighterKt$buildActiveParagraphPath$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return wn.e.g(Float.valueOf(((o3.c) t10).f24767b), Float.valueOf(((o3.c) t11).f24767b));
            }
        }, list);
        o3.c cVar2 = (o3.c) tn.o.w0(a12);
        o3.c cVar3 = (o3.c) a12.get(a12.size() - 2);
        o3.c cVar4 = (o3.c) tn.o.G0(a12);
        Iterator it = a12.iterator();
        if (it.hasNext()) {
            float f13 = ((o3.c) it.next()).f24766a;
            while (it.hasNext()) {
                f13 = Math.min(f13, ((o3.c) it.next()).f24766a);
            }
            float f14 = f13 - f10;
            float f15 = cVar2.f24767b - f10;
            Iterator it2 = a12.iterator();
            if (it2.hasNext()) {
                float f16 = ((o3.c) it2.next()).f24768c;
                while (it2.hasNext()) {
                    f16 = Math.max(f16, ((o3.c) it2.next()).f24768c);
                }
                float f17 = f16 + f10;
                float f18 = cVar4.f24768c + f10;
                float f19 = cVar4.f24769d + f10;
                float f20 = cVar3.f24769d + f10;
                if (Math.abs(f17 - f18) < f11) {
                    p3.i a11 = p3.k.a();
                    v0.c(a11, n0.l.c(f14, f15, f17, f19, f11, f11));
                    return a11;
                }
                float f21 = f11;
                char c5 = ' ';
                long j10 = 4294967295L;
                List I = ig.f.I(new o3.b((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L)), new o3.b((Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L)), new o3.b((Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f20) & 4294967295L)), new o3.b((Float.floatToRawIntBits(f20) & 4294967295L) | (Float.floatToRawIntBits(f18) << 32)), new o3.b((Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L)), new o3.b((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L)));
                p3.i a13 = p3.k.a();
                Path path = a13.f26399a;
                int size = I.size();
                int i11 = 0;
                while (i11 < size) {
                    long j11 = ((o3.b) I.get(((i11 - 1) + size) % size)).f24764a;
                    long j12 = ((o3.b) I.get(i11)).f24764a;
                    int i12 = i11 + 1;
                    char c10 = c5;
                    long j13 = j10;
                    long j14 = ((o3.b) I.get(i12 % size)).f24764a;
                    int i13 = i11;
                    long buildActiveParagraphPath$dir = buildActiveParagraphPath$dir(j12, j11);
                    long buildActiveParagraphPath$dir2 = buildActiveParagraphPath$dir(j14, j12);
                    float min = Math.min(f21, Math.min(buildActiveParagraphPath$len(j12, j11), buildActiveParagraphPath$len(j14, j12)) / 2.0f);
                    long g10 = o3.b.g(j12, o3.b.i(min, buildActiveParagraphPath$dir));
                    if (i13 == 0) {
                        i10 = size;
                        j4 = g10;
                        path.moveTo(Float.intBitsToFloat((int) (g10 >> c10)), Float.intBitsToFloat((int) (j4 & j13)));
                    } else {
                        i10 = size;
                        j4 = g10;
                        a13.f(Float.intBitsToFloat((int) (j4 >> c10)), Float.intBitsToFloat((int) (j4 & j13)));
                    }
                    long h10 = o3.b.h(o3.b.g(j12, o3.b.i(min, buildActiveParagraphPath$dir)), o3.b.i(min, buildActiveParagraphPath$dir2));
                    int i14 = (int) (h10 >> c10);
                    float intBitsToFloat = Float.intBitsToFloat(i14) - min;
                    int i15 = (int) (h10 & j13);
                    float intBitsToFloat2 = Float.intBitsToFloat(i15) - min;
                    float intBitsToFloat3 = Float.intBitsToFloat(i14) + min;
                    float intBitsToFloat4 = Float.intBitsToFloat(i15) + min;
                    int i16 = i10;
                    float buildActiveParagraphPath$angle = buildActiveParagraphPath$angle(o3.b.g(j4, h10));
                    if (buildActiveParagraphPath$cross(buildActiveParagraphPath$dir, buildActiveParagraphPath$dir2) > t2.u.P) {
                        f12 = 90.0f;
                    } else {
                        f12 = -90.0f;
                    }
                    if (a13.f26400b == null) {
                        a13.f26400b = new RectF();
                    }
                    RectF rectF = a13.f26400b;
                    rectF.getClass();
                    rectF.set(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4);
                    RectF rectF2 = a13.f26400b;
                    rectF2.getClass();
                    path.arcTo(rectF2, buildActiveParagraphPath$angle, f12, false);
                    c5 = c10;
                    f21 = f11;
                    i11 = i12;
                    j10 = j13;
                    size = i16;
                }
                path.close();
                return a13;
            }
            zr.o.a();
            return null;
        }
        zr.o.a();
        return null;
    }

    private static final float buildActiveParagraphPath$angle(long j4) {
        int i10 = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i10) > t2.u.P) {
            return t2.u.P;
        }
        if (Float.intBitsToFloat((int) (j4 & 4294967295L)) > t2.u.P) {
            return 90.0f;
        }
        if (Float.intBitsToFloat(i10) < t2.u.P) {
            return 180.0f;
        }
        return 270.0f;
    }

    private static final float buildActiveParagraphPath$cross(long j4, long j10) {
        return (Float.intBitsToFloat((int) (j10 & 4294967295L)) * Float.intBitsToFloat((int) (j4 >> 32))) - (Float.intBitsToFloat((int) (j10 >> 32)) * Float.intBitsToFloat((int) (j4 & 4294967295L)));
    }

    private static final long buildActiveParagraphPath$dir(long j4, long j10) {
        float signum = Math.signum(Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32)));
        float signum2 = Math.signum(Float.intBitsToFloat((int) (j4 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L)));
        return (Float.floatToRawIntBits(signum) << 32) | (Float.floatToRawIntBits(signum2) & 4294967295L);
    }

    private static final float buildActiveParagraphPath$len(long j4, long j10) {
        float intBitsToFloat;
        float intBitsToFloat2;
        int i10 = (int) (j4 >> 32);
        int i11 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            intBitsToFloat = Float.intBitsToFloat((int) (j4 & 4294967295L));
            intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        } else {
            intBitsToFloat = Float.intBitsToFloat(i10);
            intBitsToFloat2 = Float.intBitsToFloat(i11);
        }
        return Math.abs(intBitsToFloat - intBitsToFloat2);
    }

    public static final HighlighterDocumentIndex buildHighlighterDocumentIndexFromSlots(List<ChapterSlot> list) {
        list.getClass();
        if (list.isEmpty()) {
            return HighlighterDocumentIndex.INSTANCE.getEMPTY();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<ChapterSlot> it = list.iterator();
        while (it.hasNext()) {
            populateTimestampsForSlot(it.next(), linkedHashMap, linkedHashMap2);
        }
        return new HighlighterDocumentIndex(linkedHashMap, linkedHashMap2);
    }

    public static final WordAnnotation buildWordAnnotation(int i10, int i11, String str, String str2, List<Chapter> list) {
        Long Z;
        Double d10;
        str.getClass();
        str2.getClass();
        list.getClass();
        String str3 = null;
        if (str.length() == 0 || (Z = wq.u.Z(str)) == null) {
            return null;
        }
        long longValue = Z.longValue();
        if (str2.length() <= 0) {
            str2 = null;
        }
        if (str2 != null) {
            d10 = wq.t.M(str2);
        } else {
            d10 = null;
        }
        Chapter chapterFor = ChapterContentKt.chapterFor(list, longValue);
        if (chapterFor != null) {
            str3 = chapterFor.getAudioFileNumber();
        }
        return new WordAnnotation(i10, i11, longValue, d10, str3);
    }

    public static final String chapterElementKey(int i10, int i11) {
        return android.gov.nist.javax.sip.header.a.j(i10, "el:", ":", i11);
    }

    public static final Integer chapterIndexFromKey(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (wq.u.W(str, "el:", false)) {
                return wq.u.Y(str.substring(3, wq.n.j0(':', 3, 4, (CharSequence) obj)));
            }
            if (wq.u.W(str, "ph:", false)) {
                return wq.u.Y(str.substring(3));
            }
            return null;
        }
        return null;
    }

    public static final String chapterPlaceholderKey(int i10) {
        return defpackage.f.e(i10, "ph:");
    }

    public static final HighlightFocus computeHighlightFocusFromSlots(HighlighterPosition highlighterPosition, List<ChapterSlot> list, HighlighterDocumentIndex highlighterDocumentIndex) {
        Integer num;
        Object obj;
        Map.Entry<Double, Integer> floorEntry;
        list.getClass();
        highlighterDocumentIndex.getClass();
        if (highlighterPosition == null) {
            return HighlightFocus.None.INSTANCE;
        }
        Object obj2 = null;
        Object obj3 = null;
        Chapter chapter = null;
        if (highlighterPosition instanceof HighlighterPosition.Character) {
            HighlighterPosition.Character character = (HighlighterPosition.Character) highlighterPosition;
            sn.k locateOffsetInSlots = locateOffsetInSlots(list, character.getOffset());
            if (locateOffsetInSlots != null) {
                ChapterSlot chapterSlot = (ChapterSlot) locateOffsetInSlots.f31600a;
                return new HighlightFocus.ActiveElement(chapterSlot.getChapter(), chapterSlot.getFirstElementIndex() + ((Number) locateOffsetInSlots.f31601b).intValue(), highlighterPosition);
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ChapterSlot chapterSlot2 = (ChapterSlot) next;
                if (chapterSlot2.getContent() == null && character.getOffset() >= chapterSlot2.getChapter().getStartingCharOffset()) {
                    if (character.getOffset() < chapterSlot2.getChapter().getCharCount() + chapterSlot2.getChapter().getStartingCharOffset()) {
                        obj3 = next;
                        break;
                    }
                }
            }
            ChapterSlot chapterSlot3 = (ChapterSlot) obj3;
            if (chapterSlot3 != null) {
                return new HighlightFocus.ActiveElement(chapterSlot3.getChapter(), chapterSlot3.getFirstElementIndex(), highlighterPosition);
            }
            return HighlightFocus.None.INSTANCE;
        }
        if (highlighterPosition instanceof HighlighterPosition.Time) {
            HighlighterPosition.Time time = (HighlighterPosition.Time) highlighterPosition;
            TreeMap<Double, Integer> treeMap = highlighterDocumentIndex.getTimestampsByChapter().get(time.getAudioFileNumber());
            if (treeMap != null && (floorEntry = treeMap.floorEntry(Double.valueOf(time.getSeconds()))) != null) {
                num = floorEntry.getValue();
            } else {
                num = null;
            }
            if (num != null) {
                Double d10 = highlighterDocumentIndex.getElementLastTs().get(num);
                if (d10 != null && time.getSeconds() > d10.doubleValue() + 2.0d) {
                    return HighlightFocus.None.INSTANCE;
                }
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (kotlin.jvm.internal.m.c(((ChapterSlot) obj).getChapter().getAudioFileNumber(), time.getAudioFileNumber())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ChapterSlot chapterSlot4 = (ChapterSlot) obj;
                if (chapterSlot4 != null) {
                    chapter = chapterSlot4.getChapter();
                }
                return new HighlightFocus.ActiveElement(chapter, num.intValue(), highlighterPosition);
            }
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                ChapterSlot chapterSlot5 = (ChapterSlot) next2;
                if (chapterSlot5.getContent() == null && kotlin.jvm.internal.m.c(chapterSlot5.getChapter().getAudioFileNumber(), time.getAudioFileNumber())) {
                    obj2 = next2;
                    break;
                }
            }
            ChapterSlot chapterSlot6 = (ChapterSlot) obj2;
            if (chapterSlot6 != null) {
                return new HighlightFocus.ActiveElement(chapterSlot6.getChapter(), chapterSlot6.getFirstElementIndex(), highlighterPosition);
            }
            return HighlightFocus.None.INSTANCE;
        }
        c6.p();
        return null;
    }

    public static final o3.c expand(o3.c cVar, float f10, float f11) {
        return new o3.c(cVar.f24766a - f10, cVar.f24767b - f11, cVar.f24768c + f10, cVar.f24769d + f11);
    }

    public static final <R> List<R> fastMapRange(int i10, int i11, ho.l lVar) {
        lVar.getClass();
        ArrayList arrayList = new ArrayList((i11 - i10) + 1);
        if (i10 <= i11) {
            while (true) {
                arrayList.add(lVar.invoke(Integer.valueOf(i10)));
                if (i10 == i11) {
                    break;
                }
                i10++;
            }
        }
        return arrayList;
    }

    private static final List<o3.c> getBoundingBoxes(s4.u0 u0Var, int i10, int i11, boolean z6) {
        boolean z10;
        float f10;
        float g10;
        if (i10 == i11) {
            return tn.t.f33547a;
        }
        s4.x xVar = u0Var.f31145b;
        int d10 = xVar.d(i10);
        int d11 = xVar.d(i11);
        if (z6 && d10 != d11 && u0Var.h(d10) == i10 && xVar.c(d11, true) == i11) {
            return ig.f.H(new o3.c(t2.u.P, xVar.f(d10), (int) (u0Var.f31146c >> 32), xVar.b(d11)));
        }
        if (xVar.h(wq.n.g0(u0Var.f31144a.f31132a)) == e5.j.f8285a) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = new ArrayList((d11 - d10) + 1);
        if (d10 <= d11) {
            int i12 = d10;
            while (true) {
                float f11 = xVar.f(i12);
                float b10 = xVar.b(i12);
                if (i12 == d10) {
                    f10 = u0Var.e(i10, z10);
                } else {
                    f10 = u0Var.f(i12);
                }
                if (i12 == d11) {
                    g10 = u0Var.e(i11, z10);
                } else {
                    g10 = u0Var.g(i12);
                }
                arrayList.add(new o3.c(f10, f11, g10, b10));
                if (i12 == d11) {
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List getBoundingBoxes$default(s4.u0 u0Var, int i10, int i11, boolean z6, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z6 = false;
        }
        return getBoundingBoxes(u0Var, i10, i11, z6);
    }

    private static final org.jsoup.nodes.k getContentBeforeNestedLists(org.jsoup.nodes.k kVar) {
        if (!hasNestedLists(kVar)) {
            return kVar;
        }
        List<org.jsoup.nodes.r> i10 = kVar.i();
        i10.getClass();
        if (!i10.isEmpty()) {
            for (org.jsoup.nodes.r rVar : i10) {
                if (rVar instanceof org.jsoup.nodes.y) {
                    String O = ((org.jsoup.nodes.y) rVar).O();
                    O.getClass();
                    if (!wq.n.m0(O)) {
                        org.jsoup.nodes.k j4 = kVar.j();
                        j4.getClass();
                        ArrayList arrayList = new ArrayList(j4.O());
                        final fm.d dVar = new fm.d(27);
                        arrayList.removeIf(new Predicate() { // from class: io.elevenlabs.highlighter.c
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                boolean contentBeforeNestedLists$lambda$2;
                                contentBeforeNestedLists$lambda$2 = HighlighterKt.getContentBeforeNestedLists$lambda$2(fm.d.this, obj);
                                return contentBeforeNestedLists$lambda$2;
                            }
                        });
                        return j4;
                    }
                } else if (rVar instanceof org.jsoup.nodes.k) {
                    e0 e0Var = ((org.jsoup.nodes.k) rVar).f26057d;
                    if (!kotlin.jvm.internal.m.c(e0Var.f37411b, "ul") && !kotlin.jvm.internal.m.c(e0Var.f37411b, "ol")) {
                        org.jsoup.nodes.k j42 = kVar.j();
                        j42.getClass();
                        ArrayList arrayList2 = new ArrayList(j42.O());
                        final fm.d dVar2 = new fm.d(27);
                        arrayList2.removeIf(new Predicate() { // from class: io.elevenlabs.highlighter.c
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                boolean contentBeforeNestedLists$lambda$2;
                                contentBeforeNestedLists$lambda$2 = HighlighterKt.getContentBeforeNestedLists$lambda$2(fm.d.this, obj);
                                return contentBeforeNestedLists$lambda$2;
                            }
                        });
                        return j42;
                    }
                } else {
                    continue;
                }
            }
            return null;
        }
        return null;
    }

    public static final boolean getContentBeforeNestedLists$lambda$1(org.jsoup.nodes.k kVar) {
        kVar.getClass();
        e0 e0Var = kVar.f26057d;
        if (!kotlin.jvm.internal.m.c(e0Var.f37411b, "ul") && !kotlin.jvm.internal.m.c(e0Var.f37411b, "ol")) {
            return false;
        }
        return true;
    }

    public static final boolean getContentBeforeNestedLists$lambda$2(ho.l lVar, Object obj) {
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    private static final List<org.jsoup.nodes.k> getNestedLists(org.jsoup.nodes.k kVar) {
        kVar.getClass();
        ArrayList arrayList = new ArrayList(kVar.O());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            org.jsoup.nodes.k kVar2 = (org.jsoup.nodes.k) next;
            if (kotlin.jvm.internal.m.c(kVar2.f26057d.f37411b, "ul") || kotlin.jvm.internal.m.c(kVar2.f26057d.f37411b, "ol")) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final List<o3.c> getSentenceBounds(s4.u0 u0Var, int i10, int i11) {
        boolean z6;
        float f10;
        float g10;
        if (i10 == i11) {
            return tn.t.f33547a;
        }
        s4.x xVar = u0Var.f31145b;
        int d10 = xVar.d(i10);
        int d11 = xVar.d(i11);
        if (xVar.h(wq.n.g0(u0Var.f31144a.f31132a)) == e5.j.f8285a) {
            z6 = true;
        } else {
            z6 = false;
        }
        ArrayList arrayList = new ArrayList((d11 - d10) + 1);
        if (d10 <= d11) {
            int i12 = d10;
            while (true) {
                float f11 = xVar.f(i12);
                float b10 = xVar.b(i12);
                if (i12 == d10) {
                    f10 = u0Var.e(i10, z6);
                } else {
                    f10 = u0Var.f(i12);
                }
                if (i12 == d11) {
                    g10 = u0Var.e(i11, z6);
                } else {
                    g10 = u0Var.g(i12);
                }
                arrayList.add(new o3.c(f10, f11, g10, b10));
                if (i12 == d11) {
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    private static final String getText(org.jsoup.nodes.r rVar) {
        if (rVar instanceof org.jsoup.nodes.y) {
            return ((org.jsoup.nodes.y) rVar).O();
        }
        if (rVar instanceof org.jsoup.nodes.k) {
            return ((org.jsoup.nodes.k) rVar).a0();
        }
        return null;
    }

    private static final boolean hasNestedLists(org.jsoup.nodes.k kVar) {
        kVar.getClass();
        ArrayList arrayList = new ArrayList(kVar.O());
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                org.jsoup.nodes.k kVar2 = (org.jsoup.nodes.k) it.next();
                if (kotlin.jvm.internal.m.c(kVar2.f26057d.f37411b, "ul") || kotlin.jvm.internal.m.c(kVar2.f26057d.f37411b, "ol")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static final int lazyItemIndexForGlobalElement(List<ChapterSlot> list, int i10) {
        int i11;
        List<String> elements;
        Iterator<ChapterSlot> it = list.iterator();
        int i12 = 1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ChapterSlot next = it.next();
            ChapterContent content = next.getContent();
            int elementCount = next.getElementCount() + next.getFirstElementIndex();
            if (next.getFirstElementIndex() <= i10 && i10 < elementCount) {
                if (content != null) {
                    int firstElementIndex = i10 - next.getFirstElementIndex();
                    int size = content.getElements().size() - 1;
                    if (firstElementIndex > size) {
                        firstElementIndex = size;
                    }
                    if (firstElementIndex < 0) {
                        firstElementIndex = 0;
                    }
                    return i12 + firstElementIndex;
                }
            } else {
                if (content != null && (elements = content.getElements()) != null) {
                    i11 = elements.size();
                } else {
                    i11 = 1;
                }
                i12 += i11;
            }
        }
        return i12;
    }

    private static final sn.k locateOffsetInSlots(List<ChapterSlot> list, long j4) {
        Map<Long, Integer> offsetsToElementsMap;
        Integer num;
        for (ChapterSlot chapterSlot : list) {
            ChapterContent content = chapterSlot.getContent();
            if (content != null && (offsetsToElementsMap = content.getOffsetsToElementsMap()) != null && (num = offsetsToElementsMap.get(Long.valueOf(j4))) != null) {
                return new sn.k(chapterSlot, num);
            }
        }
        return null;
    }

    public static final org.jsoup.nodes.k parseSingleElement(String str) {
        char c5;
        str.getClass();
        ArrayList arrayList = new ArrayList(s0.B(str).b0().O());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) next;
            if (kotlin.jvm.internal.m.c(kVar.f26057d.f37411b, "p")) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                org.jsoup.nodes.r rVar = kVar;
                int i10 = 0;
                while (rVar != null) {
                    char c10 = 1;
                    if ((rVar instanceof org.jsoup.nodes.y) && !vs.f.f(((org.jsoup.nodes.y) rVar).I())) {
                        atomicBoolean.set(true);
                        c5 = 5;
                    } else {
                        c5 = 1;
                    }
                    if (c5 == 5) {
                        break;
                    }
                    if (c5 == 1 && rVar.g() > 0) {
                        rVar = (org.jsoup.nodes.r) rVar.l().get(0);
                        i10++;
                    } else {
                        while (rVar.s() == null && i10 > 0) {
                            if (c5 == 1 || c5 == 2) {
                                c5 = 1;
                            }
                            org.jsoup.nodes.k kVar2 = rVar.f26077a;
                            i10--;
                            if (c5 == 4) {
                                rVar.C();
                            }
                            c5 = 1;
                            rVar = kVar2;
                        }
                        if (c5 != 1 && c5 != 2) {
                            c10 = c5;
                        }
                        if (rVar == kVar) {
                            break;
                        }
                        org.jsoup.nodes.r s10 = rVar.s();
                        if (c10 == 4) {
                            rVar.C();
                        }
                        rVar = s10;
                    }
                }
                if (!atomicBoolean.get()) {
                }
            }
            arrayList2.add(next);
        }
        return (org.jsoup.nodes.k) tn.o.y0(arrayList2);
    }

    private static final void populateTimestampsForSlot(ChapterSlot chapterSlot, Map<String, TreeMap<Double, Integer>> map, Map<Integer, Double> map2) {
        String audioFileNumber;
        TreeMap<Double, Long> treeMap;
        ChapterContent content = chapterSlot.getContent();
        if (content != null && (audioFileNumber = chapterSlot.getChapter().getAudioFileNumber()) != null && (treeMap = content.getPositionConverter().getTsToOffset().get(audioFileNumber)) != null) {
            TreeMap<Double, Integer> treeMap2 = map.get(audioFileNumber);
            if (treeMap2 == null) {
                treeMap2 = new TreeMap<>();
                map.put(audioFileNumber, treeMap2);
            }
            TreeMap<Double, Integer> treeMap3 = treeMap2;
            for (Map.Entry<Double, Long> entry : treeMap.entrySet()) {
                double doubleValue = entry.getKey().doubleValue();
                Integer num = content.getOffsetsToElementsMap().get(Long.valueOf(entry.getValue().longValue()));
                if (num != null) {
                    int firstElementIndex = chapterSlot.getFirstElementIndex() + num.intValue();
                    treeMap3.putIfAbsent(Double.valueOf(doubleValue), Integer.valueOf(firstElementIndex));
                    Double d10 = map2.get(Integer.valueOf(firstElementIndex));
                    if (d10 == null || doubleValue > d10.doubleValue()) {
                        map2.put(Integer.valueOf(firstElementIndex), Double.valueOf(doubleValue));
                    }
                }
            }
        }
    }

    public static final i3.t pressIndicator(i3.t tVar, final ho.l lVar, final s2 s2Var) {
        tVar.getClass();
        lVar.getClass();
        s2Var.getClass();
        return l0.b(tVar, lVar, new PointerInputEventHandler() { // from class: io.elevenlabs.highlighter.HighlighterKt$pressIndicator$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @yn.e(c = "io.elevenlabs.highlighter.HighlighterKt$pressIndicator$1$1", f = "Highlighter.kt", l = {1473, 1479}, m = "invokeSuspend", v = 2)
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc4/b;", "Lsn/z;", "<anonymous>", "(Lc4/b;)V"}, k = 3, mv = {2, 3, 0})
            /* renamed from: io.elevenlabs.highlighter.HighlighterKt$pressIndicator$1$1, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1 extends yn.h implements ho.p {
                final /* synthetic */ s2 $layoutResult;
                final /* synthetic */ ho.l $onClick;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(s2 s2Var, ho.l lVar, wn.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.$layoutResult = s2Var;
                    this.$onClick = lVar;
                }

                @Override // yn.a
                public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$layoutResult, this.$onClick, cVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // ho.p
                public final Object invoke(c4.b bVar, wn.c<? super sn.z> cVar) {
                    return ((AnonymousClass1) create(bVar, cVar)).invokeSuspend(sn.z.f31622a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
                
                    if (r7 == r5) goto L15;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
                
                    return r5;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
                
                    if (n1.s3.b(r0, false, r2, r6) == r5) goto L15;
                 */
                @Override // yn.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    s4.u0 u0Var;
                    c4.b bVar = (c4.b) this.L$0;
                    int i10 = this.label;
                    c4.n nVar = c4.n.f4723a;
                    xn.a aVar = xn.a.f37986a;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                sn.a.g(obj);
                                c4.v vVar = (c4.v) obj;
                                sn.z zVar = sn.z.f31622a;
                                if (vVar != null && (u0Var = (s4.u0) this.$layoutResult.getValue()) != null) {
                                    this.$onClick.invoke(new Integer(u0Var.f31145b.g(vVar.f4757c)));
                                }
                                return zVar;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sn.a.g(obj);
                    } else {
                        sn.a.g(obj);
                        this.L$0 = bVar;
                        this.label = 1;
                    }
                    this.L$0 = null;
                    this.label = 2;
                    obj = s3.h(bVar, nVar, this);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(c4.a0 a0Var, wn.c<? super sn.z> cVar) {
                Object m10 = n1.g.m(a0Var, new AnonymousClass1(s2.this, lVar, null), cVar);
                if (m10 == xn.a.f37986a) {
                    return m10;
                }
                return sn.z.f31622a;
            }
        });
    }

    private static final TextBoundsDrawerState rememberTextBoundsDrawerState(AnnotationData annotationData, Styling styling, u2.m mVar, int i10) {
        u2.q qVar = (u2.q) mVar;
        boolean f10 = qVar.f(styling);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (f10 || L == eVar) {
            L = new TextBoundsDrawerState(annotationData, styling);
            qVar.h0(L);
        }
        TextBoundsDrawerState textBoundsDrawerState = (TextBoundsDrawerState) L;
        boolean f11 = qVar.f(textBoundsDrawerState) | qVar.h(annotationData);
        Object L2 = qVar.L();
        if (f11 || L2 == eVar) {
            L2 = new l(textBoundsDrawerState, annotationData, 1);
            qVar.h0(L2);
        }
        r.j((ho.a) L2, qVar);
        return textBoundsDrawerState;
    }

    public static final sn.z rememberTextBoundsDrawerState$lambda$1$0(TextBoundsDrawerState textBoundsDrawerState, AnnotationData annotationData) {
        textBoundsDrawerState.updateData(annotationData);
        return sn.z.f31622a;
    }

    private static final String safeSubstring(String str, int i10, int i11) {
        int m10;
        int m11;
        if (str.length() == 0 || (m10 = ae.l.m(i10, 0, str.length())) >= (m11 = ae.l.m(i11, 0, str.length()))) {
            return "";
        }
        return str.substring(Math.min(m10, m11), Math.max(m10, m11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
    
        if (r14.f(r1, r0, r4) == r10) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0100, code lost:
    
        if (r14.j(r1, r0, r4) != r10) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object scrollAndGetIfAnimated(t1.z zVar, boolean z6, int i10, int i11, wn.c<? super Boolean> cVar) {
        HighlighterKt$scrollAndGetIfAnimated$1 highlighterKt$scrollAndGetIfAnimated$1;
        int i12;
        int abs;
        boolean z10;
        double d10;
        t1.z zVar2;
        int i13;
        int i14 = i10;
        int i15 = i11;
        if (cVar instanceof HighlighterKt$scrollAndGetIfAnimated$1) {
            highlighterKt$scrollAndGetIfAnimated$1 = (HighlighterKt$scrollAndGetIfAnimated$1) cVar;
            int i16 = highlighterKt$scrollAndGetIfAnimated$1.label;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                highlighterKt$scrollAndGetIfAnimated$1.label = i16 - Integer.MIN_VALUE;
                Object obj = highlighterKt$scrollAndGetIfAnimated$1.result;
                i12 = highlighterKt$scrollAndGetIfAnimated$1.label;
                boolean z11 = true;
                xn.a aVar = xn.a.f37986a;
                if (i12 == 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                sn.a.g(obj);
                                z11 = false;
                                return Boolean.valueOf(z11);
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sn.a.g(obj);
                        return Boolean.valueOf(z11);
                    }
                    i13 = highlighterKt$scrollAndGetIfAnimated$1.I$3;
                    int i17 = highlighterKt$scrollAndGetIfAnimated$1.I$2;
                    double d11 = highlighterKt$scrollAndGetIfAnimated$1.D$0;
                    i15 = highlighterKt$scrollAndGetIfAnimated$1.I$1;
                    int i18 = highlighterKt$scrollAndGetIfAnimated$1.I$0;
                    boolean z12 = highlighterKt$scrollAndGetIfAnimated$1.Z$0;
                    zVar2 = (t1.z) highlighterKt$scrollAndGetIfAnimated$1.L$0;
                    sn.a.g(obj);
                    z10 = z12;
                    d10 = d11;
                    abs = i17;
                    i14 = i18;
                } else {
                    sn.a.g(obj);
                    abs = Math.abs((jo.a.x(((t1.q) zVar.h()).f31820k.size() * 0.3d) + zVar.f31876e.f31852b.h()) - i14);
                    int x10 = i15 - jo.a.x(((int) (((t1.q) zVar.h()).e() & 4294967295L)) * 0.3d);
                    highlighterKt$scrollAndGetIfAnimated$1.L$0 = zVar;
                    z10 = z6;
                    highlighterKt$scrollAndGetIfAnimated$1.Z$0 = z10;
                    highlighterKt$scrollAndGetIfAnimated$1.I$0 = i14;
                    highlighterKt$scrollAndGetIfAnimated$1.I$1 = i15;
                    highlighterKt$scrollAndGetIfAnimated$1.D$0 = 0.3d;
                    highlighterKt$scrollAndGetIfAnimated$1.I$2 = abs;
                    highlighterKt$scrollAndGetIfAnimated$1.I$3 = x10;
                    highlighterKt$scrollAndGetIfAnimated$1.label = 1;
                    Object a10 = zVar.a(l1.m1.f20999c, new n1(2, 3, null), highlighterKt$scrollAndGetIfAnimated$1);
                    if (a10 != aVar) {
                        a10 = sn.z.f31622a;
                    }
                    if (a10 != aVar) {
                        d10 = 0.3d;
                        zVar2 = zVar;
                        i13 = x10;
                    }
                    return aVar;
                }
                if (!z10 && abs < 5) {
                    highlighterKt$scrollAndGetIfAnimated$1.L$0 = null;
                    highlighterKt$scrollAndGetIfAnimated$1.Z$0 = z10;
                    highlighterKt$scrollAndGetIfAnimated$1.I$0 = i14;
                    highlighterKt$scrollAndGetIfAnimated$1.I$1 = i15;
                    highlighterKt$scrollAndGetIfAnimated$1.D$0 = d10;
                    highlighterKt$scrollAndGetIfAnimated$1.I$2 = abs;
                    highlighterKt$scrollAndGetIfAnimated$1.I$3 = i13;
                    highlighterKt$scrollAndGetIfAnimated$1.label = 2;
                } else {
                    highlighterKt$scrollAndGetIfAnimated$1.L$0 = null;
                    highlighterKt$scrollAndGetIfAnimated$1.Z$0 = z10;
                    highlighterKt$scrollAndGetIfAnimated$1.I$0 = i14;
                    highlighterKt$scrollAndGetIfAnimated$1.I$1 = i15;
                    highlighterKt$scrollAndGetIfAnimated$1.D$0 = d10;
                    highlighterKt$scrollAndGetIfAnimated$1.I$2 = abs;
                    highlighterKt$scrollAndGetIfAnimated$1.I$3 = i13;
                    highlighterKt$scrollAndGetIfAnimated$1.label = 3;
                }
                return aVar;
            }
        }
        highlighterKt$scrollAndGetIfAnimated$1 = new HighlighterKt$scrollAndGetIfAnimated$1(cVar);
        Object obj2 = highlighterKt$scrollAndGetIfAnimated$1.result;
        i12 = highlighterKt$scrollAndGetIfAnimated$1.label;
        boolean z112 = true;
        xn.a aVar2 = xn.a.f37986a;
        if (i12 == 0) {
        }
        if (!z10) {
        }
        highlighterKt$scrollAndGetIfAnimated$1.L$0 = null;
        highlighterKt$scrollAndGetIfAnimated$1.Z$0 = z10;
        highlighterKt$scrollAndGetIfAnimated$1.I$0 = i14;
        highlighterKt$scrollAndGetIfAnimated$1.I$1 = i15;
        highlighterKt$scrollAndGetIfAnimated$1.D$0 = d10;
        highlighterKt$scrollAndGetIfAnimated$1.I$2 = abs;
        highlighterKt$scrollAndGetIfAnimated$1.I$3 = i13;
        highlighterKt$scrollAndGetIfAnimated$1.label = 3;
    }

    private static final i3.t setupTextContextMenu(i3.t tVar, int i10, y4.w wVar, ho.l lVar, u2.m mVar, int i11) {
        boolean z6;
        boolean z10;
        u2.q qVar = (u2.q) mVar;
        TextSelectionMenuConfig textSelectionMenuConfig = (TextSelectionMenuConfig) qVar.j(TextSelectionMenuConfigKt.getLocalTextSelectionMenuConfig());
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (L == eVar) {
            L = tn.n.f1(new Object[]{d2.e.f7435b, d2.e.f7437d, "pronunciation", BackgroundPlayerAction.Bookmark.ACTION_ID});
            qVar.h0(L);
        }
        Set set = (Set) L;
        boolean h10 = qVar.h(textSelectionMenuConfig);
        boolean z11 = false;
        if ((((i11 & 896) ^ 384) > 256 && qVar.f(wVar)) || (i11 & 384) == 256) {
            z6 = true;
        } else {
            z6 = false;
        }
        boolean z12 = h10 | z6;
        if ((((i11 & 112) ^ 48) > 32 && qVar.d(i10)) || (i11 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = z12 | z10;
        if ((((i11 & 7168) ^ 3072) > 2048 && qVar.f(lVar)) || (i11 & 3072) == 2048) {
            z11 = true;
        }
        boolean z14 = z13 | z11;
        Object L2 = qVar.L();
        if (z14 || L2 == eVar) {
            L2 = new q1(i10, 1, lVar, (Object) textSelectionMenuConfig, (Object) wVar);
            qVar.h0(L2);
        }
        i3.t b10 = g2.k.b(tVar, (ho.l) L2);
        boolean h11 = qVar.h(set);
        Object L3 = qVar.L();
        if (h11 || L3 == eVar) {
            L3 = new g(set, 3);
            qVar.h0(L3);
        }
        return g2.k.d(b10, (ho.l) L3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        if (r0 != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final sn.z setupTextContextMenu$lambda$1$0(TextSelectionMenuConfig textSelectionMenuConfig, y4.w wVar, int i10, ho.l lVar, c2.a aVar) {
        boolean z6;
        y4.w wVar2;
        int i11;
        ho.l lVar2;
        boolean z10;
        aVar.getClass();
        for (TextSelectionMenuItem textSelectionMenuItem : textSelectionMenuConfig.getMenuItems()) {
            s4.h hVar = wVar.f38321a;
            long j4 = wVar.f38322b;
            String str = hVar.f31041b;
            int i12 = x0.f31169c;
            int i13 = (int) (j4 >> 32);
            int i14 = (int) (j4 & 4294967295L);
            String safeSubstring = safeSubstring(str, i13, i14);
            if (!wq.n.m0(safeSubstring)) {
                ho.r shouldShow = textSelectionMenuItem.getShouldShow();
                z6 = true;
                if (shouldShow != null) {
                    z10 = ((Boolean) shouldShow.invoke(Integer.valueOf(i10), Integer.valueOf(i13), Integer.valueOf(i14), safeSubstring)).booleanValue();
                } else {
                    z10 = true;
                }
            }
            z6 = false;
            if (z6) {
                wVar2 = wVar;
                i11 = i10;
                lVar2 = lVar;
                aVar.f4584a.a(new d2.d(textSelectionMenuItem.getId(), textSelectionMenuItem.getTitle(), 0, new q1(i11, 2, lVar2, (Object) wVar2, (Object) textSelectionMenuItem)));
            } else {
                wVar2 = wVar;
                i11 = i10;
                lVar2 = lVar;
            }
            i10 = i11;
            lVar = lVar2;
            wVar = wVar2;
        }
        return sn.z.f31622a;
    }

    public static final sn.z setupTextContextMenu$lambda$1$0$0$2(y4.w wVar, TextSelectionMenuItem textSelectionMenuItem, int i10, ho.l lVar, d2.g gVar) {
        gVar.getClass();
        String str = wVar.f38321a.f31041b;
        long j4 = wVar.f38322b;
        int i11 = x0.f31169c;
        int i12 = (int) (j4 >> 32);
        int i13 = (int) (j4 & 4294967295L);
        textSelectionMenuItem.getOnClick().invoke(Integer.valueOf(i10), Integer.valueOf(i12), Integer.valueOf(i13), safeSubstring(str, i12, i13));
        lVar.invoke(y4.w.b(wVar, null, x0.f31168b, 5));
        return sn.z.f31622a;
    }

    public static final boolean setupTextContextMenu$lambda$2$0(Set set, d2.b bVar) {
        bVar.getClass();
        return set.contains(bVar.f7428a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v9, types: [tn.t] */
    private static final AnnotationData toAnnotatedString(org.jsoup.nodes.r rVar, Styling styling, Stack<Object> stack, int i10, List<BookmarkHighlight> list, List<Chapter> list2) {
        Long l4;
        ?? r13;
        int i11;
        int length;
        ArrayList arrayList = new ArrayList();
        s4.e eVar = new s4.e();
        append(eVar, rVar, styling, stack, i10, arrayList, list2);
        s4.h k4 = eVar.k();
        String str = k4.f31041b;
        int H = tn.a0.H(tn.p.a0(arrayList, 10));
        if (H < 16) {
            H = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(Long.valueOf(((WordAnnotation) next).getC()), next);
        }
        WordAnnotation wordAnnotation = (WordAnnotation) tn.o.y0(arrayList);
        Long l7 = null;
        if (wordAnnotation != null) {
            l4 = Long.valueOf(wordAnnotation.getC());
        } else {
            l4 = null;
        }
        WordAnnotation wordAnnotation2 = (WordAnnotation) tn.o.H0(arrayList);
        if (wordAnnotation2 != null) {
            l7 = Long.valueOf(wordAnnotation2.getC());
        }
        if (l4 != null && l7 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                BookmarkHighlight bookmarkHighlight = (BookmarkHighlight) obj;
                if ((bookmarkHighlight.getStart() >= l4.longValue() && bookmarkHighlight.getStart() <= l7.longValue()) || ((bookmarkHighlight.getEnd() >= l4.longValue() && bookmarkHighlight.getEnd() <= l7.longValue()) || (bookmarkHighlight.getStart() < l4.longValue() && bookmarkHighlight.getEnd() > l7.longValue()))) {
                    arrayList2.add(obj);
                }
            }
            r13 = new ArrayList(tn.p.a0(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                BookmarkHighlight bookmarkHighlight2 = (BookmarkHighlight) it2.next();
                WordAnnotation wordAnnotation3 = (WordAnnotation) linkedHashMap.get(Long.valueOf(bookmarkHighlight2.getStart()));
                int i12 = 0;
                if (wordAnnotation3 != null) {
                    i11 = wordAnnotation3.getStart();
                } else {
                    i11 = 0;
                }
                WordAnnotation wordAnnotation4 = (WordAnnotation) linkedHashMap.get(Long.valueOf(bookmarkHighlight2.getEnd()));
                if (wordAnnotation4 != null) {
                    length = wordAnnotation4.getEnd();
                } else {
                    length = str.length();
                }
                String id2 = bookmarkHighlight2.getId();
                if (i11 >= 0) {
                    i12 = i11;
                }
                if (length >= i11) {
                    i11 = length;
                }
                int length2 = str.length();
                if (i11 > length2) {
                    i11 = length2;
                }
                r13.add(new BookmarkAnnotation(id2, i12, i11));
            }
        } else {
            r13 = tn.t.f33547a;
        }
        return new AnnotationData(k4, arrayList, r13);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[LOOP:0: B:15:0x0074->B:25:0x0074, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:7:0x0047, B:9:0x004f, B:12:0x0058, B:36:0x0062, B:37:0x0068, B:38:0x0069, B:11:0x0055), top: B:6:0x0047, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:7:0x0047, B:9:0x004f, B:12:0x0058, B:36:0x0062, B:37:0x0068, B:38:0x0069, B:11:0x0055), top: B:6:0x0047, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void withStylesSafe(s4.e eVar, Stack<Object> stack, c0 c0Var, p0 p0Var, ho.l lVar) {
        Stack stack2;
        if (c0Var != null) {
            try {
                if (stack == null || !stack.isEmpty()) {
                    Iterator<T> it = stack.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof c0) {
                            stack2 = new Stack();
                            while (!stack.isEmpty() && !(stack.peek() instanceof c0)) {
                                stack2.add(stack.pop());
                                eVar.f();
                            }
                            stack2.add(stack.pop());
                            eVar.f();
                            stack.push(c0Var);
                            eVar.j(c0Var);
                            if (p0Var == null) {
                                stack.push(p0Var);
                                eVar.i(p0Var);
                                try {
                                    lVar.invoke(eVar);
                                    eVar.f();
                                    stack.pop();
                                } finally {
                                }
                            } else {
                                lVar.invoke(eVar);
                            }
                            if (stack2 == null) {
                                while (!stack2.isEmpty()) {
                                    Object pop = stack2.pop();
                                    stack.push(pop);
                                    if (pop instanceof c0) {
                                        eVar.j((c0) pop);
                                    } else if (pop instanceof p0) {
                                        eVar.i((p0) pop);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                stack.push(c0Var);
                eVar.j(c0Var);
                if (p0Var == null) {
                }
                if (stack2 == null) {
                }
            } catch (Throwable th) {
                if (stack2 != null) {
                    while (!stack2.isEmpty()) {
                        Object pop2 = stack2.pop();
                        stack.push(pop2);
                        if (pop2 instanceof c0) {
                            eVar.j((c0) pop2);
                        } else if (pop2 instanceof p0) {
                            eVar.i((p0) pop2);
                        }
                    }
                }
                throw th;
            }
            stack2 = null;
        } else {
            if (p0Var != null) {
                stack.push(p0Var);
                eVar.i(p0Var);
                try {
                    lVar.invoke(eVar);
                    return;
                } finally {
                }
            }
            lVar.invoke(eVar);
        }
    }

    public static /* synthetic */ void withStylesSafe$default(s4.e eVar, Stack stack, c0 c0Var, p0 p0Var, ho.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c0Var = null;
        }
        if ((i10 & 4) != 0) {
            p0Var = null;
        }
        withStylesSafe(eVar, stack, c0Var, p0Var, lVar);
    }
}
