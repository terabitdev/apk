package io.elevenlabs.ui.theme;

import ae.l;
import android.gov.nist.core.Separators;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import p.n;
import p3.h0;
import p3.x;
import s4.y0;
import w4.g0;
import w4.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0081\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bB\b\u0087\b\u0018\u00002\u00020\u0001Bé\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020\u0004\u0012\b\b\u0002\u0010(\u001a\u00020\u0004\u0012\b\b\u0002\u0010)\u001a\u00020\u0004\u0012\b\b\u0002\u0010*\u001a\u00020\u0004\u0012\b\b\u0002\u0010+\u001a\u00020\u0004\u0012\b\b\u0002\u0010,\u001a\u00020\u0004\u0012\b\b\u0002\u0010-\u001a\u00020\u0004\u0012\b\b\u0002\u0010.\u001a\u00020\u0004\u0012\b\b\u0002\u0010/\u001a\u00020\u0004\u0012\b\b\u0002\u00100\u001a\u00020\u0004\u0012\b\b\u0002\u00101\u001a\u00020\u0004\u0012\b\b\u0002\u00102\u001a\u00020\u0004\u0012\b\b\u0002\u00103\u001a\u00020\u0004\u0012\b\b\u0002\u00104\u001a\u00020\u0004\u0012\b\b\u0002\u00105\u001a\u00020\u0004\u0012\b\b\u0002\u00106\u001a\u00020\u0004\u0012\b\b\u0002\u00107\u001a\u00020\u0004\u0012\b\b\u0002\u00108\u001a\u00020\u0004\u0012\b\b\u0002\u00109\u001a\u00020\u0004\u0012\b\b\u0002\u0010:\u001a\u00020\u0004\u0012\b\b\u0002\u0010;\u001a\u00020\u0004\u0012\b\b\u0002\u0010<\u001a\u00020\u0004\u0012\b\b\u0002\u0010=\u001a\u00020\u0004\u0012\b\b\u0002\u0010>\u001a\u00020\u0004\u0012\b\b\u0002\u0010?\u001a\u00020\u0004\u0012\b\b\u0002\u0010@\u001a\u00020\u0004¢\u0006\u0004\bA\u0010BJ\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010F\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bH\u0010GJ\u0010\u0010I\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bI\u0010GJ\u0010\u0010J\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bJ\u0010GJ\u0010\u0010K\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bK\u0010GJ\u0010\u0010L\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bL\u0010GJ\u0010\u0010M\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bM\u0010GJ\u0010\u0010N\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bN\u0010GJ\u0010\u0010O\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bO\u0010GJ\u0010\u0010P\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bP\u0010GJ\u0010\u0010Q\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bQ\u0010GJ\u0010\u0010R\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bR\u0010GJ\u0010\u0010S\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bS\u0010GJ\u0010\u0010T\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bT\u0010GJ\u0010\u0010U\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bU\u0010GJ\u0010\u0010V\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bV\u0010GJ\u0010\u0010W\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bW\u0010GJ\u0010\u0010X\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bX\u0010GJ\u0010\u0010Y\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bY\u0010GJ\u0010\u0010Z\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bZ\u0010GJ\u0010\u0010[\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b[\u0010GJ\u0010\u0010\\\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\\\u0010GJ\u0010\u0010]\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b]\u0010GJ\u0010\u0010^\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b^\u0010GJ\u0010\u0010_\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b_\u0010GJ\u0010\u0010`\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b`\u0010GJ\u0010\u0010a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\ba\u0010GJ\u0010\u0010b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bb\u0010GJ\u0010\u0010c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bc\u0010GJ\u0010\u0010d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bd\u0010GJ\u0010\u0010e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\be\u0010GJ\u0010\u0010f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bf\u0010GJ\u0010\u0010g\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bg\u0010GJ\u0010\u0010h\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bh\u0010GJ\u0010\u0010i\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bi\u0010GJ\u0010\u0010j\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bj\u0010GJ\u0010\u0010k\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bk\u0010GJ\u0010\u0010l\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bl\u0010GJ\u0010\u0010m\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bm\u0010GJ\u0010\u0010n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bn\u0010GJ\u0010\u0010o\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bo\u0010GJ\u0010\u0010p\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bp\u0010GJ\u0010\u0010q\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bq\u0010GJ\u0010\u0010r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\br\u0010GJ\u0010\u0010s\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bs\u0010GJ\u0010\u0010t\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bt\u0010GJ\u0010\u0010u\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bu\u0010GJ\u0010\u0010v\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bv\u0010GJ\u0010\u0010w\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bw\u0010GJ\u0010\u0010x\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bx\u0010GJ\u0010\u0010y\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\by\u0010GJ\u0010\u0010z\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bz\u0010GJ\u0010\u0010{\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b{\u0010GJ\u0010\u0010|\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b|\u0010GJ\u0010\u0010}\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b}\u0010GJ\u0010\u0010~\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b~\u0010GJ\u0010\u0010\u007f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u007f\u0010GJ\u0012\u0010\u0080\u0001\u001a\u00020\u0004HÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010GJ\u0012\u0010\u0081\u0001\u001a\u00020\u0004HÆ\u0003¢\u0006\u0005\b\u0081\u0001\u0010GJ\u0012\u0010\u0082\u0001\u001a\u00020\u0004HÆ\u0003¢\u0006\u0005\b\u0082\u0001\u0010GJõ\u0004\u0010\u0085\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00042\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010>\u001a\u00020\u00042\b\b\u0002\u0010?\u001a\u00020\u00042\b\b\u0002\u0010@\u001a\u00020\u0004HÆ\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0014\u0010\u0087\u0001\u001a\u00030\u0086\u0001HÖ\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0014\u0010\u008a\u0001\u001a\u00030\u0089\u0001HÖ\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001f\u0010\u008e\u0001\u001a\u00030\u008d\u00012\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010DR\u0019\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010GR\u0019\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0006\u0010\u0092\u0001\u001a\u0005\b\u0094\u0001\u0010GR\u0019\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010\u0092\u0001\u001a\u0005\b\u0095\u0001\u0010GR\u0019\u0010\b\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\b\u0010\u0092\u0001\u001a\u0005\b\u0096\u0001\u0010GR\u0019\u0010\t\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\t\u0010\u0092\u0001\u001a\u0005\b\u0097\u0001\u0010GR\u0019\u0010\n\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\n\u0010\u0092\u0001\u001a\u0005\b\u0098\u0001\u0010GR\u0019\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010\u0092\u0001\u001a\u0005\b\u0099\u0001\u0010GR\u0019\u0010\f\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\f\u0010\u0092\u0001\u001a\u0005\b\u009a\u0001\u0010GR\u0019\u0010\r\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\r\u0010\u0092\u0001\u001a\u0005\b\u009b\u0001\u0010GR\u0019\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u0092\u0001\u001a\u0005\b\u009c\u0001\u0010GR\u0019\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u0092\u0001\u001a\u0005\b\u009d\u0001\u0010GR\u0019\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0010\u0010\u0092\u0001\u001a\u0005\b\u009e\u0001\u0010GR\u0019\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u0092\u0001\u001a\u0005\b\u009f\u0001\u0010GR\u0019\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010\u0092\u0001\u001a\u0005\b \u0001\u0010GR\u0019\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u0092\u0001\u001a\u0005\b¡\u0001\u0010GR\u0019\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0014\u0010\u0092\u0001\u001a\u0005\b¢\u0001\u0010GR\u0019\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u0092\u0001\u001a\u0005\b£\u0001\u0010GR\u0019\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u0092\u0001\u001a\u0005\b¤\u0001\u0010GR\u0019\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u0092\u0001\u001a\u0005\b¥\u0001\u0010GR\u0019\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010\u0092\u0001\u001a\u0005\b¦\u0001\u0010GR\u0019\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0019\u0010\u0092\u0001\u001a\u0005\b§\u0001\u0010GR\u0019\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u0092\u0001\u001a\u0005\b¨\u0001\u0010GR\u0019\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u0092\u0001\u001a\u0005\b©\u0001\u0010GR\u0019\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u0092\u0001\u001a\u0005\bª\u0001\u0010GR\u0019\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0092\u0001\u001a\u0005\b«\u0001\u0010GR\u0019\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u0092\u0001\u001a\u0005\b¬\u0001\u0010GR\u0019\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u0092\u0001\u001a\u0005\b\u00ad\u0001\u0010GR\u0019\u0010 \u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b \u0010\u0092\u0001\u001a\u0005\b®\u0001\u0010GR\u0019\u0010!\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b!\u0010\u0092\u0001\u001a\u0005\b¯\u0001\u0010GR\u0019\u0010\"\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0092\u0001\u001a\u0005\b°\u0001\u0010GR\u0019\u0010#\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b#\u0010\u0092\u0001\u001a\u0005\b±\u0001\u0010GR\u0019\u0010$\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0092\u0001\u001a\u0005\b²\u0001\u0010GR\u0019\u0010%\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b%\u0010\u0092\u0001\u001a\u0005\b³\u0001\u0010GR\u0019\u0010&\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b&\u0010\u0092\u0001\u001a\u0005\b´\u0001\u0010GR\u0019\u0010'\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b'\u0010\u0092\u0001\u001a\u0005\bµ\u0001\u0010GR\u0019\u0010(\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b(\u0010\u0092\u0001\u001a\u0005\b¶\u0001\u0010GR\u0019\u0010)\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b)\u0010\u0092\u0001\u001a\u0005\b·\u0001\u0010GR\u0019\u0010*\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b*\u0010\u0092\u0001\u001a\u0005\b¸\u0001\u0010GR\u0019\u0010+\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b+\u0010\u0092\u0001\u001a\u0005\b¹\u0001\u0010GR\u0019\u0010,\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b,\u0010\u0092\u0001\u001a\u0005\bº\u0001\u0010GR\u0019\u0010-\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b-\u0010\u0092\u0001\u001a\u0005\b»\u0001\u0010GR\u0019\u0010.\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b.\u0010\u0092\u0001\u001a\u0005\b¼\u0001\u0010GR\u0019\u0010/\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b/\u0010\u0092\u0001\u001a\u0005\b½\u0001\u0010GR\u0019\u00100\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b0\u0010\u0092\u0001\u001a\u0005\b¾\u0001\u0010GR\u0019\u00101\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b1\u0010\u0092\u0001\u001a\u0005\b¿\u0001\u0010GR\u0019\u00102\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b2\u0010\u0092\u0001\u001a\u0005\bÀ\u0001\u0010GR\u0019\u00103\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b3\u0010\u0092\u0001\u001a\u0005\bÁ\u0001\u0010GR\u0019\u00104\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b4\u0010\u0092\u0001\u001a\u0005\bÂ\u0001\u0010GR\u0019\u00105\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b5\u0010\u0092\u0001\u001a\u0005\bÃ\u0001\u0010GR\u0019\u00106\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b6\u0010\u0092\u0001\u001a\u0005\bÄ\u0001\u0010GR\u0019\u00107\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b7\u0010\u0092\u0001\u001a\u0005\bÅ\u0001\u0010GR\u0019\u00108\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b8\u0010\u0092\u0001\u001a\u0005\bÆ\u0001\u0010GR\u0019\u00109\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b9\u0010\u0092\u0001\u001a\u0005\bÇ\u0001\u0010GR\u0019\u0010:\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b:\u0010\u0092\u0001\u001a\u0005\bÈ\u0001\u0010GR\u0019\u0010;\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b;\u0010\u0092\u0001\u001a\u0005\bÉ\u0001\u0010GR\u0019\u0010<\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b<\u0010\u0092\u0001\u001a\u0005\bÊ\u0001\u0010GR\u0019\u0010=\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b=\u0010\u0092\u0001\u001a\u0005\bË\u0001\u0010GR\u0019\u0010>\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b>\u0010\u0092\u0001\u001a\u0005\bÌ\u0001\u0010GR\u0019\u0010?\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b?\u0010\u0092\u0001\u001a\u0005\bÍ\u0001\u0010GR\u0019\u0010@\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b@\u0010\u0092\u0001\u001a\u0005\bÎ\u0001\u0010G¨\u0006Ï\u0001"}, d2 = {"Lio/elevenlabs/ui/theme/ElevenLabsTypography;", "", "Lp3/x;", "defaultColor", "Ls4/y0;", "titleLarge400", "titleLarge500", "titleLarge600", "titleLarge700Inter", "titleLarge700Eleven", "titleXLarge700", "titleXLarge700Eleven", "titleMedium400", "titleMedium500", "titleMedium600", "titleMedium700", "titleMedium700Eleven", "titleSmall400", "titleSmall500", "titleSmall600", "titleSmall700", "subtitleLarge400", "subtitleLarge500", "subtitleLarge600", "subtitleLarge700", "subtitleMedium400", "subtitleMedium500", "subtitleMedium600", "subtitleMedium700", "subtitleSmall400", "subtitleSmall500", "subtitleSmall600", "subtitleSmall700", "bodyLarge400", "bodyLarge500", "bodyLarge600", "bodyLarge700", "bodyMedium400", "bodyMedium500", "bodyMedium600", "bodyMedium700", "bodySmall400", "bodySmall500", "bodySmall600", "bodySmall700", "bodyXSmall400", "bodyXSmall500", "bodyXSmall600", "bodyXSmall700", "bodyTiny400", "bodyTiny500", "bodyTiny600", "bodyTiny700", "pill400", "pill500", "pill600", "pill700", "buttonLargeEleven700", "buttonMediumEleven700", "buttonSmallEleven700", "buttonLargeDefault700", "buttonMediumDefault", "buttonSmallDefault", "bookText", "body", "<init>", "(JLs4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Lkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2", "()Ls4/y0;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "copy-BPJY2-g", "(JLs4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;Ls4/y0;)Lio/elevenlabs/ui/theme/ElevenLabsTypography;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getDefaultColor-0d7_KjU", "Ls4/y0;", "getTitleLarge400", "getTitleLarge500", "getTitleLarge600", "getTitleLarge700Inter", "getTitleLarge700Eleven", "getTitleXLarge700", "getTitleXLarge700Eleven", "getTitleMedium400", "getTitleMedium500", "getTitleMedium600", "getTitleMedium700", "getTitleMedium700Eleven", "getTitleSmall400", "getTitleSmall500", "getTitleSmall600", "getTitleSmall700", "getSubtitleLarge400", "getSubtitleLarge500", "getSubtitleLarge600", "getSubtitleLarge700", "getSubtitleMedium400", "getSubtitleMedium500", "getSubtitleMedium600", "getSubtitleMedium700", "getSubtitleSmall400", "getSubtitleSmall500", "getSubtitleSmall600", "getSubtitleSmall700", "getBodyLarge400", "getBodyLarge500", "getBodyLarge600", "getBodyLarge700", "getBodyMedium400", "getBodyMedium500", "getBodyMedium600", "getBodyMedium700", "getBodySmall400", "getBodySmall500", "getBodySmall600", "getBodySmall700", "getBodyXSmall400", "getBodyXSmall500", "getBodyXSmall600", "getBodyXSmall700", "getBodyTiny400", "getBodyTiny500", "getBodyTiny600", "getBodyTiny700", "getPill400", "getPill500", "getPill600", "getPill700", "getButtonLargeEleven700", "getButtonMediumEleven700", "getButtonSmallEleven700", "getButtonLargeDefault700", "getButtonMediumDefault", "getButtonSmallDefault", "getBookText", "getBody", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ElevenLabsTypography {
    public static final int $stable = 0;
    private final y0 body;
    private final y0 bodyLarge400;
    private final y0 bodyLarge500;
    private final y0 bodyLarge600;
    private final y0 bodyLarge700;
    private final y0 bodyMedium400;
    private final y0 bodyMedium500;
    private final y0 bodyMedium600;
    private final y0 bodyMedium700;
    private final y0 bodySmall400;
    private final y0 bodySmall500;
    private final y0 bodySmall600;
    private final y0 bodySmall700;
    private final y0 bodyTiny400;
    private final y0 bodyTiny500;
    private final y0 bodyTiny600;
    private final y0 bodyTiny700;
    private final y0 bodyXSmall400;
    private final y0 bodyXSmall500;
    private final y0 bodyXSmall600;
    private final y0 bodyXSmall700;
    private final y0 bookText;
    private final y0 buttonLargeDefault700;
    private final y0 buttonLargeEleven700;
    private final y0 buttonMediumDefault;
    private final y0 buttonMediumEleven700;
    private final y0 buttonSmallDefault;
    private final y0 buttonSmallEleven700;
    private final long defaultColor;
    private final y0 pill400;
    private final y0 pill500;
    private final y0 pill600;
    private final y0 pill700;
    private final y0 subtitleLarge400;
    private final y0 subtitleLarge500;
    private final y0 subtitleLarge600;
    private final y0 subtitleLarge700;
    private final y0 subtitleMedium400;
    private final y0 subtitleMedium500;
    private final y0 subtitleMedium600;
    private final y0 subtitleMedium700;
    private final y0 subtitleSmall400;
    private final y0 subtitleSmall500;
    private final y0 subtitleSmall600;
    private final y0 subtitleSmall700;
    private final y0 titleLarge400;
    private final y0 titleLarge500;
    private final y0 titleLarge600;
    private final y0 titleLarge700Eleven;
    private final y0 titleLarge700Inter;
    private final y0 titleMedium400;
    private final y0 titleMedium500;
    private final y0 titleMedium600;
    private final y0 titleMedium700;
    private final y0 titleMedium700Eleven;
    private final y0 titleSmall400;
    private final y0 titleSmall500;
    private final y0 titleSmall600;
    private final y0 titleSmall700;
    private final y0 titleXLarge700;
    private final y0 titleXLarge700Eleven;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ElevenLabsTypography(long j4, y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4, y0 y0Var5, y0 y0Var6, y0 y0Var7, y0 y0Var8, y0 y0Var9, y0 y0Var10, y0 y0Var11, y0 y0Var12, y0 y0Var13, y0 y0Var14, y0 y0Var15, y0 y0Var16, y0 y0Var17, y0 y0Var18, y0 y0Var19, y0 y0Var20, y0 y0Var21, y0 y0Var22, y0 y0Var23, y0 y0Var24, y0 y0Var25, y0 y0Var26, y0 y0Var27, y0 y0Var28, y0 y0Var29, y0 y0Var30, y0 y0Var31, y0 y0Var32, y0 y0Var33, y0 y0Var34, y0 y0Var35, y0 y0Var36, y0 y0Var37, y0 y0Var38, y0 y0Var39, y0 y0Var40, y0 y0Var41, y0 y0Var42, y0 y0Var43, y0 y0Var44, y0 y0Var45, y0 y0Var46, y0 y0Var47, y0 y0Var48, y0 y0Var49, y0 y0Var50, y0 y0Var51, y0 y0Var52, y0 y0Var53, y0 y0Var54, y0 y0Var55, y0 y0Var56, y0 y0Var57, y0 y0Var58, y0 y0Var59, y0 y0Var60, int i10, int i11, f fVar) {
        this(r78, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r3, r105, r106, r107, r108, r15, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r41, r64, r65, r66, r69, r91, r2, r31, r92, r93, r94, r95, r96, r97, r98, r0, null);
        int i12;
        y0 y0Var61;
        y0 y0Var62;
        int i13;
        y0 y0Var63;
        int i14;
        int i15;
        y0 y0Var64;
        int i16;
        y0 y0Var65;
        int i17;
        int i18;
        y0 y0Var66;
        int i19;
        int i20;
        y0 y0Var67;
        int i21;
        y0 y0Var68;
        y0 y0Var69;
        y0 y0Var70;
        y0 y0Var71;
        y0 y0Var72;
        y0 y0Var73;
        y0 y0Var74;
        y0 y0Var75;
        y0 y0Var76;
        y0 y0Var77;
        y0 y0Var78;
        y0 y0Var79;
        y0 y0Var80;
        y0 y0Var81;
        y0 y0Var82;
        y0 y0Var83;
        y0 y0Var84;
        y0 y0Var85;
        y0 y0Var86;
        y0 y0Var87;
        y0 y0Var88;
        y0 y0Var89;
        y0 y0Var90;
        y0 y0Var91;
        y0 y0Var92;
        y0 y0Var93;
        y0 y0Var94;
        y0 y0Var95;
        long e10 = (i10 & 1) != 0 ? h0.e(4278190080L) : j4;
        if ((i10 & 2) != 0) {
            i12 = 400;
            y0Var61 = new y0(e10, l.K(28), new g0(400), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(36), null, 16646104);
        } else {
            i12 = 400;
            y0Var61 = y0Var;
        }
        y0 withFontWeight = (i10 & 4) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var61, 500) : y0Var2;
        y0 withFontWeight2 = (i10 & 8) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var61, 600) : y0Var3;
        y0 withFontWeight3 = (i10 & 16) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var61, 700) : y0Var4;
        y0 a10 = (i10 & 32) != 0 ? y0.a(ElevenLabsTypographyKt.withFontWeight(y0Var61, 700), 0L, 0L, null, ElevenLabsTypographyKt.getElevenWaldenburg(), null, 0L, 0, 0L, null, null, 16777183) : y0Var5;
        if ((i10 & 64) != 0) {
            y0Var62 = new y0(0L, l.K(44), new g0(700), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(48), null, 16646105);
        } else {
            y0Var62 = y0Var6;
        }
        y0 a11 = (i10 & 128) != 0 ? y0.a(y0Var62, 0L, 0L, null, ElevenLabsTypographyKt.getElevenWaldenburg(), null, 0L, 0, 0L, null, null, 16777183) : y0Var7;
        if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
            long K = l.K(20);
            long K2 = l.K(28);
            u inter = ElevenLabsTypographyKt.getInter();
            g0 g0Var = new g0(i12);
            y0Var63 = y0Var61;
            i13 = 28;
            i14 = 500;
            i15 = 600;
            y0Var64 = new y0(e10, K, g0Var, inter, 0L, 0, K2, null, 16646104);
        } else {
            i13 = 28;
            y0Var63 = y0Var61;
            i14 = 500;
            i15 = 600;
            y0Var64 = y0Var8;
        }
        y0 withFontWeight4 = (i10 & 512) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var64, i14) : y0Var9;
        y0 withFontWeight5 = (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var64, i15) : y0Var10;
        y0 withFontWeight6 = (i10 & 2048) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var64, 700) : y0Var11;
        y0 a12 = (i10 & 4096) != 0 ? y0.a(withFontWeight6, 0L, 0L, null, ElevenLabsTypographyKt.getElevenWaldenburg(), null, 0L, 0, 0L, null, null, 16777183) : y0Var12;
        if ((i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            i16 = 14;
            y0Var65 = new y0(e10, l.K(14), new g0(400), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(20), null, 16646104);
        } else {
            i16 = 14;
            y0Var65 = y0Var13;
        }
        y0 withFontWeight7 = (i10 & 16384) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var65, i14) : y0Var14;
        y0 withFontWeight8 = (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var65, i15) : y0Var15;
        y0 withFontWeight9 = (i10 & 65536) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var65, 700) : y0Var16;
        if ((i10 & 131072) != 0) {
            i17 = 32768;
            i18 = 65536;
            y0Var66 = new y0(e10, l.K(16), new g0(400), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(24), null, 16646104);
        } else {
            i17 = 32768;
            i18 = 65536;
            y0Var66 = y0Var17;
        }
        y0 withFontWeight10 = (i10 & 262144) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var66, i14) : y0Var18;
        y0 withFontWeight11 = (i10 & 524288) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var66, i15) : y0Var19;
        y0 withFontWeight12 = (i10 & 1048576) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var66, 700) : y0Var20;
        if ((i10 & 2097152) != 0) {
            i19 = 2097152;
            i20 = 131072;
            y0Var67 = new y0(e10, l.K(i16), new g0(400), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(20), null, 16646104);
        } else {
            i19 = 2097152;
            i20 = 131072;
            y0Var67 = y0Var21;
        }
        y0 withFontWeight13 = (i10 & 4194304) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var67, i14) : y0Var22;
        y0 withFontWeight14 = (i10 & 8388608) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var67, i15) : y0Var23;
        y0 withFontWeight15 = (i10 & 16777216) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var67, 700) : y0Var24;
        if ((i10 & 33554432) != 0) {
            i21 = 33554432;
            y0Var68 = new y0(e10, l.K(12), new g0(400), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(20), null, 16646104);
        } else {
            i21 = 33554432;
            y0Var68 = y0Var25;
        }
        y0 withFontWeight16 = (i10 & 67108864) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var68, i14) : y0Var26;
        y0 withFontWeight17 = (i10 & 134217728) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var68, 600) : y0Var27;
        y0 withFontWeight18 = (i10 & 268435456) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var68, 700) : y0Var28;
        if ((536870912 & i10) != 0) {
            y0Var69 = new y0(e10, l.K(16), new g0(400), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(24), null, 16646104);
        } else {
            y0Var69 = y0Var29;
        }
        y0 withFontWeight19 = (i10 & 1073741824) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var69, 500) : y0Var30;
        y0 withFontWeight20 = (i10 & Integer.MIN_VALUE) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var69, 600) : y0Var31;
        y0 withFontWeight21 = (i11 & 1) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var69, 700) : y0Var32;
        if ((i11 & 2) != 0) {
            y0Var70 = y0Var69;
            y0Var71 = new y0(e10, l.K(15), new g0(400), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(22), null, 16646104);
        } else {
            y0Var70 = y0Var69;
            y0Var71 = y0Var33;
        }
        y0 withFontWeight22 = (i11 & 4) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var71, 500) : y0Var34;
        y0 withFontWeight23 = (i11 & 8) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var71, 600) : y0Var35;
        y0 withFontWeight24 = (i11 & 16) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var71, 700) : y0Var36;
        if ((i11 & 32) != 0) {
            y0Var72 = y0Var71;
            y0Var73 = new y0(e10, l.K(i16), new g0(400), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(20), null, 16646104);
        } else {
            y0Var72 = y0Var71;
            y0Var73 = y0Var37;
        }
        y0 withFontWeight25 = (i11 & 64) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var73, 500) : y0Var38;
        y0 withFontWeight26 = (i11 & 128) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var73, 600) : y0Var39;
        y0 withFontWeight27 = (i11 & RpcError.MAX_MESSAGE_BYTES) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var73, 700) : y0Var40;
        if ((i11 & 512) != 0) {
            y0Var74 = y0Var73;
            y0Var75 = new y0(e10, l.K(12), new g0(400), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(16), null, 16646104);
        } else {
            y0Var74 = y0Var73;
            y0Var75 = y0Var41;
        }
        y0 withFontWeight28 = (i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var75, 500) : y0Var42;
        y0 withFontWeight29 = (i11 & 2048) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var75, 600) : y0Var43;
        y0 withFontWeight30 = (i11 & 4096) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var75, 700) : y0Var44;
        if ((i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            y0Var76 = y0Var75;
            y0Var77 = new y0(e10, l.K(10), new g0(400), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(i16), null, 16646104);
        } else {
            y0Var76 = y0Var75;
            y0Var77 = y0Var45;
        }
        y0 withFontWeight31 = (i11 & 16384) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var77, 500) : y0Var46;
        y0 withFontWeight32 = (i11 & i17) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var77, 600) : y0Var47;
        y0 withFontWeight33 = (i11 & i18) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var77, 700) : y0Var48;
        if ((i11 & i20) != 0) {
            y0Var78 = y0Var77;
            y0Var79 = new y0(e10, l.K(i16), new g0(400), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(20), null, 16646104);
        } else {
            y0Var78 = y0Var77;
            y0Var79 = y0Var49;
        }
        y0 withFontWeight34 = (i11 & 262144) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var79, 500) : y0Var50;
        y0 withFontWeight35 = (i11 & 524288) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var79, 600) : y0Var51;
        y0 y0Var96 = withFontWeight34;
        y0 withFontWeight36 = (i11 & 1048576) != 0 ? ElevenLabsTypographyKt.withFontWeight(y0Var79, 700) : y0Var52;
        if ((i11 & i19) != 0) {
            y0Var80 = y0Var79;
            y0Var81 = new y0(e10, l.K(16), new g0(700), ElevenLabsTypographyKt.getElevenWaldenburg(), 0L, 0, l.K(24), null, 16646104);
        } else {
            y0Var80 = y0Var79;
            y0Var81 = y0Var53;
        }
        if ((i11 & 4194304) != 0) {
            y0Var82 = y0Var81;
            y0Var83 = new y0(e10, l.K(i16), new g0(700), ElevenLabsTypographyKt.getElevenWaldenburg(), 0L, 0, l.K(20), null, 16646104);
        } else {
            y0Var82 = y0Var81;
            y0Var83 = y0Var54;
        }
        if ((i11 & 8388608) != 0) {
            y0Var84 = y0Var83;
            y0Var85 = new y0(e10, l.K(12), new g0(700), ElevenLabsTypographyKt.getElevenWaldenburg(), 0L, 0, l.K(16), null, 16646104);
        } else {
            y0Var84 = y0Var83;
            y0Var85 = y0Var55;
        }
        if ((i11 & 16777216) != 0) {
            y0Var86 = y0Var85;
            y0Var87 = new y0(e10, l.K(16), new g0(700), ElevenLabsTypographyKt.getElevenWaldenburg(), 0L, 0, l.K(24), null, 16646104);
        } else {
            y0Var86 = y0Var85;
            y0Var87 = y0Var56;
        }
        if ((i11 & i21) != 0) {
            y0Var88 = y0Var87;
            y0Var89 = new y0(e10, l.K(i16), new g0(700), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(20), null, 16646104);
        } else {
            y0Var88 = y0Var87;
            y0Var89 = y0Var57;
        }
        if ((i11 & 67108864) != 0) {
            y0Var90 = y0Var89;
            y0Var91 = new y0(e10, l.K(12), new g0(700), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(16), null, 16646104);
        } else {
            y0Var90 = y0Var89;
            y0Var91 = y0Var58;
        }
        if ((i11 & 134217728) != 0) {
            y0Var92 = y0Var91;
            y0Var93 = new y0(e10, l.K(i16), new g0(400), ElevenLabsTypographyKt.getLibre(), 0L, 0, l.K(24), null, 16646104);
        } else {
            y0Var92 = y0Var91;
            y0Var93 = y0Var59;
        }
        if ((i11 & 268435456) != 0) {
            y0Var94 = y0Var93;
            y0Var95 = new y0(e10, l.K(18), new g0(400), ElevenLabsTypographyKt.getInter(), 0L, 0, l.K(i13), null, 16646104);
        } else {
            y0Var94 = y0Var93;
            y0Var95 = y0Var60;
        }
        y0 y0Var97 = y0Var64;
        long j10 = e10;
        y0 y0Var98 = withFontWeight4;
        y0 y0Var99 = withFontWeight5;
        y0 y0Var100 = a12;
        y0 y0Var101 = y0Var65;
        y0 y0Var102 = withFontWeight7;
        y0 y0Var103 = y0Var66;
        y0 y0Var104 = withFontWeight8;
        y0 y0Var105 = y0Var67;
        y0 y0Var106 = withFontWeight9;
        y0 y0Var107 = withFontWeight;
        y0 y0Var108 = withFontWeight2;
        y0 y0Var109 = withFontWeight3;
        y0 y0Var110 = a10;
        y0 y0Var111 = a11;
        y0 y0Var112 = y0Var62;
        y0 y0Var113 = y0Var63;
        y0 y0Var114 = withFontWeight6;
        y0 y0Var115 = withFontWeight10;
        y0 y0Var116 = withFontWeight11;
        y0 y0Var117 = withFontWeight12;
        y0 y0Var118 = withFontWeight13;
        y0 y0Var119 = withFontWeight14;
        y0 y0Var120 = withFontWeight15;
        y0 y0Var121 = withFontWeight16;
        y0 y0Var122 = withFontWeight17;
        y0 y0Var123 = withFontWeight18;
        y0 y0Var124 = withFontWeight20;
        y0 y0Var125 = withFontWeight21;
        y0 y0Var126 = withFontWeight22;
        y0 y0Var127 = withFontWeight23;
        y0 y0Var128 = withFontWeight24;
        y0 y0Var129 = y0Var72;
        y0 y0Var130 = y0Var70;
        y0 y0Var131 = withFontWeight25;
        y0 y0Var132 = withFontWeight26;
        y0 y0Var133 = withFontWeight27;
        y0 y0Var134 = withFontWeight28;
        y0 y0Var135 = withFontWeight29;
        y0 y0Var136 = withFontWeight30;
        y0 y0Var137 = y0Var76;
        y0 y0Var138 = y0Var74;
    }

    /* renamed from: copy-BPJY2-g$default, reason: not valid java name */
    public static /* synthetic */ ElevenLabsTypography m2362copyBPJY2g$default(ElevenLabsTypography elevenLabsTypography, long j4, y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4, y0 y0Var5, y0 y0Var6, y0 y0Var7, y0 y0Var8, y0 y0Var9, y0 y0Var10, y0 y0Var11, y0 y0Var12, y0 y0Var13, y0 y0Var14, y0 y0Var15, y0 y0Var16, y0 y0Var17, y0 y0Var18, y0 y0Var19, y0 y0Var20, y0 y0Var21, y0 y0Var22, y0 y0Var23, y0 y0Var24, y0 y0Var25, y0 y0Var26, y0 y0Var27, y0 y0Var28, y0 y0Var29, y0 y0Var30, y0 y0Var31, y0 y0Var32, y0 y0Var33, y0 y0Var34, y0 y0Var35, y0 y0Var36, y0 y0Var37, y0 y0Var38, y0 y0Var39, y0 y0Var40, y0 y0Var41, y0 y0Var42, y0 y0Var43, y0 y0Var44, y0 y0Var45, y0 y0Var46, y0 y0Var47, y0 y0Var48, y0 y0Var49, y0 y0Var50, y0 y0Var51, y0 y0Var52, y0 y0Var53, y0 y0Var54, y0 y0Var55, y0 y0Var56, y0 y0Var57, y0 y0Var58, y0 y0Var59, y0 y0Var60, int i10, int i11, Object obj) {
        long j10 = (i10 & 1) != 0 ? elevenLabsTypography.defaultColor : j4;
        return elevenLabsTypography.m2364copyBPJY2g(j10, (i10 & 2) != 0 ? elevenLabsTypography.titleLarge400 : y0Var, (i10 & 4) != 0 ? elevenLabsTypography.titleLarge500 : y0Var2, (i10 & 8) != 0 ? elevenLabsTypography.titleLarge600 : y0Var3, (i10 & 16) != 0 ? elevenLabsTypography.titleLarge700Inter : y0Var4, (i10 & 32) != 0 ? elevenLabsTypography.titleLarge700Eleven : y0Var5, (i10 & 64) != 0 ? elevenLabsTypography.titleXLarge700 : y0Var6, (i10 & 128) != 0 ? elevenLabsTypography.titleXLarge700Eleven : y0Var7, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? elevenLabsTypography.titleMedium400 : y0Var8, (i10 & 512) != 0 ? elevenLabsTypography.titleMedium500 : y0Var9, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? elevenLabsTypography.titleMedium600 : y0Var10, (i10 & 2048) != 0 ? elevenLabsTypography.titleMedium700 : y0Var11, (i10 & 4096) != 0 ? elevenLabsTypography.titleMedium700Eleven : y0Var12, (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? elevenLabsTypography.titleSmall400 : y0Var13, (i10 & 16384) != 0 ? elevenLabsTypography.titleSmall500 : y0Var14, (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? elevenLabsTypography.titleSmall600 : y0Var15, (i10 & 65536) != 0 ? elevenLabsTypography.titleSmall700 : y0Var16, (i10 & 131072) != 0 ? elevenLabsTypography.subtitleLarge400 : y0Var17, (i10 & 262144) != 0 ? elevenLabsTypography.subtitleLarge500 : y0Var18, (i10 & 524288) != 0 ? elevenLabsTypography.subtitleLarge600 : y0Var19, (i10 & 1048576) != 0 ? elevenLabsTypography.subtitleLarge700 : y0Var20, (i10 & 2097152) != 0 ? elevenLabsTypography.subtitleMedium400 : y0Var21, (i10 & 4194304) != 0 ? elevenLabsTypography.subtitleMedium500 : y0Var22, (i10 & 8388608) != 0 ? elevenLabsTypography.subtitleMedium600 : y0Var23, (i10 & 16777216) != 0 ? elevenLabsTypography.subtitleMedium700 : y0Var24, (i10 & 33554432) != 0 ? elevenLabsTypography.subtitleSmall400 : y0Var25, (i10 & 67108864) != 0 ? elevenLabsTypography.subtitleSmall500 : y0Var26, (i10 & 134217728) != 0 ? elevenLabsTypography.subtitleSmall600 : y0Var27, (i10 & 268435456) != 0 ? elevenLabsTypography.subtitleSmall700 : y0Var28, (i10 & 536870912) != 0 ? elevenLabsTypography.bodyLarge400 : y0Var29, (i10 & 1073741824) != 0 ? elevenLabsTypography.bodyLarge500 : y0Var30, (i10 & Integer.MIN_VALUE) != 0 ? elevenLabsTypography.bodyLarge600 : y0Var31, (i11 & 1) != 0 ? elevenLabsTypography.bodyLarge700 : y0Var32, (i11 & 2) != 0 ? elevenLabsTypography.bodyMedium400 : y0Var33, (i11 & 4) != 0 ? elevenLabsTypography.bodyMedium500 : y0Var34, (i11 & 8) != 0 ? elevenLabsTypography.bodyMedium600 : y0Var35, (i11 & 16) != 0 ? elevenLabsTypography.bodyMedium700 : y0Var36, (i11 & 32) != 0 ? elevenLabsTypography.bodySmall400 : y0Var37, (i11 & 64) != 0 ? elevenLabsTypography.bodySmall500 : y0Var38, (i11 & 128) != 0 ? elevenLabsTypography.bodySmall600 : y0Var39, (i11 & RpcError.MAX_MESSAGE_BYTES) != 0 ? elevenLabsTypography.bodySmall700 : y0Var40, (i11 & 512) != 0 ? elevenLabsTypography.bodyXSmall400 : y0Var41, (i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? elevenLabsTypography.bodyXSmall500 : y0Var42, (i11 & 2048) != 0 ? elevenLabsTypography.bodyXSmall600 : y0Var43, (i11 & 4096) != 0 ? elevenLabsTypography.bodyXSmall700 : y0Var44, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? elevenLabsTypography.bodyTiny400 : y0Var45, (i11 & 16384) != 0 ? elevenLabsTypography.bodyTiny500 : y0Var46, (i11 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? elevenLabsTypography.bodyTiny600 : y0Var47, (i11 & 65536) != 0 ? elevenLabsTypography.bodyTiny700 : y0Var48, (i11 & 131072) != 0 ? elevenLabsTypography.pill400 : y0Var49, (i11 & 262144) != 0 ? elevenLabsTypography.pill500 : y0Var50, (i11 & 524288) != 0 ? elevenLabsTypography.pill600 : y0Var51, (i11 & 1048576) != 0 ? elevenLabsTypography.pill700 : y0Var52, (i11 & 2097152) != 0 ? elevenLabsTypography.buttonLargeEleven700 : y0Var53, (i11 & 4194304) != 0 ? elevenLabsTypography.buttonMediumEleven700 : y0Var54, (i11 & 8388608) != 0 ? elevenLabsTypography.buttonSmallEleven700 : y0Var55, (i11 & 16777216) != 0 ? elevenLabsTypography.buttonLargeDefault700 : y0Var56, (i11 & 33554432) != 0 ? elevenLabsTypography.buttonMediumDefault : y0Var57, (i11 & 67108864) != 0 ? elevenLabsTypography.buttonSmallDefault : y0Var58, (i11 & 134217728) != 0 ? elevenLabsTypography.bookText : y0Var59, (i11 & 268435456) != 0 ? elevenLabsTypography.body : y0Var60);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getDefaultColor() {
        return this.defaultColor;
    }

    /* renamed from: component10, reason: from getter */
    public final y0 getTitleMedium500() {
        return this.titleMedium500;
    }

    /* renamed from: component11, reason: from getter */
    public final y0 getTitleMedium600() {
        return this.titleMedium600;
    }

    /* renamed from: component12, reason: from getter */
    public final y0 getTitleMedium700() {
        return this.titleMedium700;
    }

    /* renamed from: component13, reason: from getter */
    public final y0 getTitleMedium700Eleven() {
        return this.titleMedium700Eleven;
    }

    /* renamed from: component14, reason: from getter */
    public final y0 getTitleSmall400() {
        return this.titleSmall400;
    }

    /* renamed from: component15, reason: from getter */
    public final y0 getTitleSmall500() {
        return this.titleSmall500;
    }

    /* renamed from: component16, reason: from getter */
    public final y0 getTitleSmall600() {
        return this.titleSmall600;
    }

    /* renamed from: component17, reason: from getter */
    public final y0 getTitleSmall700() {
        return this.titleSmall700;
    }

    /* renamed from: component18, reason: from getter */
    public final y0 getSubtitleLarge400() {
        return this.subtitleLarge400;
    }

    /* renamed from: component19, reason: from getter */
    public final y0 getSubtitleLarge500() {
        return this.subtitleLarge500;
    }

    /* renamed from: component2, reason: from getter */
    public final y0 getTitleLarge400() {
        return this.titleLarge400;
    }

    /* renamed from: component20, reason: from getter */
    public final y0 getSubtitleLarge600() {
        return this.subtitleLarge600;
    }

    /* renamed from: component21, reason: from getter */
    public final y0 getSubtitleLarge700() {
        return this.subtitleLarge700;
    }

    /* renamed from: component22, reason: from getter */
    public final y0 getSubtitleMedium400() {
        return this.subtitleMedium400;
    }

    /* renamed from: component23, reason: from getter */
    public final y0 getSubtitleMedium500() {
        return this.subtitleMedium500;
    }

    /* renamed from: component24, reason: from getter */
    public final y0 getSubtitleMedium600() {
        return this.subtitleMedium600;
    }

    /* renamed from: component25, reason: from getter */
    public final y0 getSubtitleMedium700() {
        return this.subtitleMedium700;
    }

    /* renamed from: component26, reason: from getter */
    public final y0 getSubtitleSmall400() {
        return this.subtitleSmall400;
    }

    /* renamed from: component27, reason: from getter */
    public final y0 getSubtitleSmall500() {
        return this.subtitleSmall500;
    }

    /* renamed from: component28, reason: from getter */
    public final y0 getSubtitleSmall600() {
        return this.subtitleSmall600;
    }

    /* renamed from: component29, reason: from getter */
    public final y0 getSubtitleSmall700() {
        return this.subtitleSmall700;
    }

    /* renamed from: component3, reason: from getter */
    public final y0 getTitleLarge500() {
        return this.titleLarge500;
    }

    /* renamed from: component30, reason: from getter */
    public final y0 getBodyLarge400() {
        return this.bodyLarge400;
    }

    /* renamed from: component31, reason: from getter */
    public final y0 getBodyLarge500() {
        return this.bodyLarge500;
    }

    /* renamed from: component32, reason: from getter */
    public final y0 getBodyLarge600() {
        return this.bodyLarge600;
    }

    /* renamed from: component33, reason: from getter */
    public final y0 getBodyLarge700() {
        return this.bodyLarge700;
    }

    /* renamed from: component34, reason: from getter */
    public final y0 getBodyMedium400() {
        return this.bodyMedium400;
    }

    /* renamed from: component35, reason: from getter */
    public final y0 getBodyMedium500() {
        return this.bodyMedium500;
    }

    /* renamed from: component36, reason: from getter */
    public final y0 getBodyMedium600() {
        return this.bodyMedium600;
    }

    /* renamed from: component37, reason: from getter */
    public final y0 getBodyMedium700() {
        return this.bodyMedium700;
    }

    /* renamed from: component38, reason: from getter */
    public final y0 getBodySmall400() {
        return this.bodySmall400;
    }

    /* renamed from: component39, reason: from getter */
    public final y0 getBodySmall500() {
        return this.bodySmall500;
    }

    /* renamed from: component4, reason: from getter */
    public final y0 getTitleLarge600() {
        return this.titleLarge600;
    }

    /* renamed from: component40, reason: from getter */
    public final y0 getBodySmall600() {
        return this.bodySmall600;
    }

    /* renamed from: component41, reason: from getter */
    public final y0 getBodySmall700() {
        return this.bodySmall700;
    }

    /* renamed from: component42, reason: from getter */
    public final y0 getBodyXSmall400() {
        return this.bodyXSmall400;
    }

    /* renamed from: component43, reason: from getter */
    public final y0 getBodyXSmall500() {
        return this.bodyXSmall500;
    }

    /* renamed from: component44, reason: from getter */
    public final y0 getBodyXSmall600() {
        return this.bodyXSmall600;
    }

    /* renamed from: component45, reason: from getter */
    public final y0 getBodyXSmall700() {
        return this.bodyXSmall700;
    }

    /* renamed from: component46, reason: from getter */
    public final y0 getBodyTiny400() {
        return this.bodyTiny400;
    }

    /* renamed from: component47, reason: from getter */
    public final y0 getBodyTiny500() {
        return this.bodyTiny500;
    }

    /* renamed from: component48, reason: from getter */
    public final y0 getBodyTiny600() {
        return this.bodyTiny600;
    }

    /* renamed from: component49, reason: from getter */
    public final y0 getBodyTiny700() {
        return this.bodyTiny700;
    }

    /* renamed from: component5, reason: from getter */
    public final y0 getTitleLarge700Inter() {
        return this.titleLarge700Inter;
    }

    /* renamed from: component50, reason: from getter */
    public final y0 getPill400() {
        return this.pill400;
    }

    /* renamed from: component51, reason: from getter */
    public final y0 getPill500() {
        return this.pill500;
    }

    /* renamed from: component52, reason: from getter */
    public final y0 getPill600() {
        return this.pill600;
    }

    /* renamed from: component53, reason: from getter */
    public final y0 getPill700() {
        return this.pill700;
    }

    /* renamed from: component54, reason: from getter */
    public final y0 getButtonLargeEleven700() {
        return this.buttonLargeEleven700;
    }

    /* renamed from: component55, reason: from getter */
    public final y0 getButtonMediumEleven700() {
        return this.buttonMediumEleven700;
    }

    /* renamed from: component56, reason: from getter */
    public final y0 getButtonSmallEleven700() {
        return this.buttonSmallEleven700;
    }

    /* renamed from: component57, reason: from getter */
    public final y0 getButtonLargeDefault700() {
        return this.buttonLargeDefault700;
    }

    /* renamed from: component58, reason: from getter */
    public final y0 getButtonMediumDefault() {
        return this.buttonMediumDefault;
    }

    /* renamed from: component59, reason: from getter */
    public final y0 getButtonSmallDefault() {
        return this.buttonSmallDefault;
    }

    /* renamed from: component6, reason: from getter */
    public final y0 getTitleLarge700Eleven() {
        return this.titleLarge700Eleven;
    }

    /* renamed from: component60, reason: from getter */
    public final y0 getBookText() {
        return this.bookText;
    }

    /* renamed from: component61, reason: from getter */
    public final y0 getBody() {
        return this.body;
    }

    /* renamed from: component7, reason: from getter */
    public final y0 getTitleXLarge700() {
        return this.titleXLarge700;
    }

    /* renamed from: component8, reason: from getter */
    public final y0 getTitleXLarge700Eleven() {
        return this.titleXLarge700Eleven;
    }

    /* renamed from: component9, reason: from getter */
    public final y0 getTitleMedium400() {
        return this.titleMedium400;
    }

    /* renamed from: copy-BPJY2-g, reason: not valid java name */
    public final ElevenLabsTypography m2364copyBPJY2g(long defaultColor, y0 titleLarge400, y0 titleLarge500, y0 titleLarge600, y0 titleLarge700Inter, y0 titleLarge700Eleven, y0 titleXLarge700, y0 titleXLarge700Eleven, y0 titleMedium400, y0 titleMedium500, y0 titleMedium600, y0 titleMedium700, y0 titleMedium700Eleven, y0 titleSmall400, y0 titleSmall500, y0 titleSmall600, y0 titleSmall700, y0 subtitleLarge400, y0 subtitleLarge500, y0 subtitleLarge600, y0 subtitleLarge700, y0 subtitleMedium400, y0 subtitleMedium500, y0 subtitleMedium600, y0 subtitleMedium700, y0 subtitleSmall400, y0 subtitleSmall500, y0 subtitleSmall600, y0 subtitleSmall700, y0 bodyLarge400, y0 bodyLarge500, y0 bodyLarge600, y0 bodyLarge700, y0 bodyMedium400, y0 bodyMedium500, y0 bodyMedium600, y0 bodyMedium700, y0 bodySmall400, y0 bodySmall500, y0 bodySmall600, y0 bodySmall700, y0 bodyXSmall400, y0 bodyXSmall500, y0 bodyXSmall600, y0 bodyXSmall700, y0 bodyTiny400, y0 bodyTiny500, y0 bodyTiny600, y0 bodyTiny700, y0 pill400, y0 pill500, y0 pill600, y0 pill700, y0 buttonLargeEleven700, y0 buttonMediumEleven700, y0 buttonSmallEleven700, y0 buttonLargeDefault700, y0 buttonMediumDefault, y0 buttonSmallDefault, y0 bookText, y0 body) {
        n.s(titleLarge400, titleLarge500, titleLarge600, titleLarge700Inter, titleLarge700Eleven);
        n.s(titleXLarge700, titleXLarge700Eleven, titleMedium400, titleMedium500, titleMedium600);
        n.s(titleMedium700, titleMedium700Eleven, titleSmall400, titleSmall500, titleSmall600);
        n.s(titleSmall700, subtitleLarge400, subtitleLarge500, subtitleLarge600, subtitleLarge700);
        n.s(subtitleMedium400, subtitleMedium500, subtitleMedium600, subtitleMedium700, subtitleSmall400);
        n.s(subtitleSmall500, subtitleSmall600, subtitleSmall700, bodyLarge400, bodyLarge500);
        n.s(bodyLarge600, bodyLarge700, bodyMedium400, bodyMedium500, bodyMedium600);
        n.s(bodyMedium700, bodySmall400, bodySmall500, bodySmall600, bodySmall700);
        n.s(bodyXSmall400, bodyXSmall500, bodyXSmall600, bodyXSmall700, bodyTiny400);
        n.s(bodyTiny500, bodyTiny600, bodyTiny700, pill400, pill500);
        n.s(pill600, pill700, buttonLargeEleven700, buttonMediumEleven700, buttonSmallEleven700);
        buttonLargeDefault700.getClass();
        buttonMediumDefault.getClass();
        buttonSmallDefault.getClass();
        bookText.getClass();
        body.getClass();
        return new ElevenLabsTypography(defaultColor, titleLarge400, titleLarge500, titleLarge600, titleLarge700Inter, titleLarge700Eleven, titleXLarge700, titleXLarge700Eleven, titleMedium400, titleMedium500, titleMedium600, titleMedium700, titleMedium700Eleven, titleSmall400, titleSmall500, titleSmall600, titleSmall700, subtitleLarge400, subtitleLarge500, subtitleLarge600, subtitleLarge700, subtitleMedium400, subtitleMedium500, subtitleMedium600, subtitleMedium700, subtitleSmall400, subtitleSmall500, subtitleSmall600, subtitleSmall700, bodyLarge400, bodyLarge500, bodyLarge600, bodyLarge700, bodyMedium400, bodyMedium500, bodyMedium600, bodyMedium700, bodySmall400, bodySmall500, bodySmall600, bodySmall700, bodyXSmall400, bodyXSmall500, bodyXSmall600, bodyXSmall700, bodyTiny400, bodyTiny500, bodyTiny600, bodyTiny700, pill400, pill500, pill600, pill700, buttonLargeEleven700, buttonMediumEleven700, buttonSmallEleven700, buttonLargeDefault700, buttonMediumDefault, buttonSmallDefault, bookText, body, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElevenLabsTypography)) {
            return false;
        }
        ElevenLabsTypography elevenLabsTypography = (ElevenLabsTypography) other;
        if (x.c(this.defaultColor, elevenLabsTypography.defaultColor) && m.c(this.titleLarge400, elevenLabsTypography.titleLarge400) && m.c(this.titleLarge500, elevenLabsTypography.titleLarge500) && m.c(this.titleLarge600, elevenLabsTypography.titleLarge600) && m.c(this.titleLarge700Inter, elevenLabsTypography.titleLarge700Inter) && m.c(this.titleLarge700Eleven, elevenLabsTypography.titleLarge700Eleven) && m.c(this.titleXLarge700, elevenLabsTypography.titleXLarge700) && m.c(this.titleXLarge700Eleven, elevenLabsTypography.titleXLarge700Eleven) && m.c(this.titleMedium400, elevenLabsTypography.titleMedium400) && m.c(this.titleMedium500, elevenLabsTypography.titleMedium500) && m.c(this.titleMedium600, elevenLabsTypography.titleMedium600) && m.c(this.titleMedium700, elevenLabsTypography.titleMedium700) && m.c(this.titleMedium700Eleven, elevenLabsTypography.titleMedium700Eleven) && m.c(this.titleSmall400, elevenLabsTypography.titleSmall400) && m.c(this.titleSmall500, elevenLabsTypography.titleSmall500) && m.c(this.titleSmall600, elevenLabsTypography.titleSmall600) && m.c(this.titleSmall700, elevenLabsTypography.titleSmall700) && m.c(this.subtitleLarge400, elevenLabsTypography.subtitleLarge400) && m.c(this.subtitleLarge500, elevenLabsTypography.subtitleLarge500) && m.c(this.subtitleLarge600, elevenLabsTypography.subtitleLarge600) && m.c(this.subtitleLarge700, elevenLabsTypography.subtitleLarge700) && m.c(this.subtitleMedium400, elevenLabsTypography.subtitleMedium400) && m.c(this.subtitleMedium500, elevenLabsTypography.subtitleMedium500) && m.c(this.subtitleMedium600, elevenLabsTypography.subtitleMedium600) && m.c(this.subtitleMedium700, elevenLabsTypography.subtitleMedium700) && m.c(this.subtitleSmall400, elevenLabsTypography.subtitleSmall400) && m.c(this.subtitleSmall500, elevenLabsTypography.subtitleSmall500) && m.c(this.subtitleSmall600, elevenLabsTypography.subtitleSmall600) && m.c(this.subtitleSmall700, elevenLabsTypography.subtitleSmall700) && m.c(this.bodyLarge400, elevenLabsTypography.bodyLarge400) && m.c(this.bodyLarge500, elevenLabsTypography.bodyLarge500) && m.c(this.bodyLarge600, elevenLabsTypography.bodyLarge600) && m.c(this.bodyLarge700, elevenLabsTypography.bodyLarge700) && m.c(this.bodyMedium400, elevenLabsTypography.bodyMedium400) && m.c(this.bodyMedium500, elevenLabsTypography.bodyMedium500) && m.c(this.bodyMedium600, elevenLabsTypography.bodyMedium600) && m.c(this.bodyMedium700, elevenLabsTypography.bodyMedium700) && m.c(this.bodySmall400, elevenLabsTypography.bodySmall400) && m.c(this.bodySmall500, elevenLabsTypography.bodySmall500) && m.c(this.bodySmall600, elevenLabsTypography.bodySmall600) && m.c(this.bodySmall700, elevenLabsTypography.bodySmall700) && m.c(this.bodyXSmall400, elevenLabsTypography.bodyXSmall400) && m.c(this.bodyXSmall500, elevenLabsTypography.bodyXSmall500) && m.c(this.bodyXSmall600, elevenLabsTypography.bodyXSmall600) && m.c(this.bodyXSmall700, elevenLabsTypography.bodyXSmall700) && m.c(this.bodyTiny400, elevenLabsTypography.bodyTiny400) && m.c(this.bodyTiny500, elevenLabsTypography.bodyTiny500) && m.c(this.bodyTiny600, elevenLabsTypography.bodyTiny600) && m.c(this.bodyTiny700, elevenLabsTypography.bodyTiny700) && m.c(this.pill400, elevenLabsTypography.pill400) && m.c(this.pill500, elevenLabsTypography.pill500) && m.c(this.pill600, elevenLabsTypography.pill600) && m.c(this.pill700, elevenLabsTypography.pill700) && m.c(this.buttonLargeEleven700, elevenLabsTypography.buttonLargeEleven700) && m.c(this.buttonMediumEleven700, elevenLabsTypography.buttonMediumEleven700) && m.c(this.buttonSmallEleven700, elevenLabsTypography.buttonSmallEleven700) && m.c(this.buttonLargeDefault700, elevenLabsTypography.buttonLargeDefault700) && m.c(this.buttonMediumDefault, elevenLabsTypography.buttonMediumDefault) && m.c(this.buttonSmallDefault, elevenLabsTypography.buttonSmallDefault) && m.c(this.bookText, elevenLabsTypography.bookText) && m.c(this.body, elevenLabsTypography.body)) {
            return true;
        }
        return false;
    }

    public final y0 getBody() {
        return this.body;
    }

    public final y0 getBodyLarge400() {
        return this.bodyLarge400;
    }

    public final y0 getBodyLarge500() {
        return this.bodyLarge500;
    }

    public final y0 getBodyLarge600() {
        return this.bodyLarge600;
    }

    public final y0 getBodyLarge700() {
        return this.bodyLarge700;
    }

    public final y0 getBodyMedium400() {
        return this.bodyMedium400;
    }

    public final y0 getBodyMedium500() {
        return this.bodyMedium500;
    }

    public final y0 getBodyMedium600() {
        return this.bodyMedium600;
    }

    public final y0 getBodyMedium700() {
        return this.bodyMedium700;
    }

    public final y0 getBodySmall400() {
        return this.bodySmall400;
    }

    public final y0 getBodySmall500() {
        return this.bodySmall500;
    }

    public final y0 getBodySmall600() {
        return this.bodySmall600;
    }

    public final y0 getBodySmall700() {
        return this.bodySmall700;
    }

    public final y0 getBodyTiny400() {
        return this.bodyTiny400;
    }

    public final y0 getBodyTiny500() {
        return this.bodyTiny500;
    }

    public final y0 getBodyTiny600() {
        return this.bodyTiny600;
    }

    public final y0 getBodyTiny700() {
        return this.bodyTiny700;
    }

    public final y0 getBodyXSmall400() {
        return this.bodyXSmall400;
    }

    public final y0 getBodyXSmall500() {
        return this.bodyXSmall500;
    }

    public final y0 getBodyXSmall600() {
        return this.bodyXSmall600;
    }

    public final y0 getBodyXSmall700() {
        return this.bodyXSmall700;
    }

    public final y0 getBookText() {
        return this.bookText;
    }

    public final y0 getButtonLargeDefault700() {
        return this.buttonLargeDefault700;
    }

    public final y0 getButtonLargeEleven700() {
        return this.buttonLargeEleven700;
    }

    public final y0 getButtonMediumDefault() {
        return this.buttonMediumDefault;
    }

    public final y0 getButtonMediumEleven700() {
        return this.buttonMediumEleven700;
    }

    public final y0 getButtonSmallDefault() {
        return this.buttonSmallDefault;
    }

    public final y0 getButtonSmallEleven700() {
        return this.buttonSmallEleven700;
    }

    /* renamed from: getDefaultColor-0d7_KjU, reason: not valid java name */
    public final long m2365getDefaultColor0d7_KjU() {
        return this.defaultColor;
    }

    public final y0 getPill400() {
        return this.pill400;
    }

    public final y0 getPill500() {
        return this.pill500;
    }

    public final y0 getPill600() {
        return this.pill600;
    }

    public final y0 getPill700() {
        return this.pill700;
    }

    public final y0 getSubtitleLarge400() {
        return this.subtitleLarge400;
    }

    public final y0 getSubtitleLarge500() {
        return this.subtitleLarge500;
    }

    public final y0 getSubtitleLarge600() {
        return this.subtitleLarge600;
    }

    public final y0 getSubtitleLarge700() {
        return this.subtitleLarge700;
    }

    public final y0 getSubtitleMedium400() {
        return this.subtitleMedium400;
    }

    public final y0 getSubtitleMedium500() {
        return this.subtitleMedium500;
    }

    public final y0 getSubtitleMedium600() {
        return this.subtitleMedium600;
    }

    public final y0 getSubtitleMedium700() {
        return this.subtitleMedium700;
    }

    public final y0 getSubtitleSmall400() {
        return this.subtitleSmall400;
    }

    public final y0 getSubtitleSmall500() {
        return this.subtitleSmall500;
    }

    public final y0 getSubtitleSmall600() {
        return this.subtitleSmall600;
    }

    public final y0 getSubtitleSmall700() {
        return this.subtitleSmall700;
    }

    public final y0 getTitleLarge400() {
        return this.titleLarge400;
    }

    public final y0 getTitleLarge500() {
        return this.titleLarge500;
    }

    public final y0 getTitleLarge600() {
        return this.titleLarge600;
    }

    public final y0 getTitleLarge700Eleven() {
        return this.titleLarge700Eleven;
    }

    public final y0 getTitleLarge700Inter() {
        return this.titleLarge700Inter;
    }

    public final y0 getTitleMedium400() {
        return this.titleMedium400;
    }

    public final y0 getTitleMedium500() {
        return this.titleMedium500;
    }

    public final y0 getTitleMedium600() {
        return this.titleMedium600;
    }

    public final y0 getTitleMedium700() {
        return this.titleMedium700;
    }

    public final y0 getTitleMedium700Eleven() {
        return this.titleMedium700Eleven;
    }

    public final y0 getTitleSmall400() {
        return this.titleSmall400;
    }

    public final y0 getTitleSmall500() {
        return this.titleSmall500;
    }

    public final y0 getTitleSmall600() {
        return this.titleSmall600;
    }

    public final y0 getTitleSmall700() {
        return this.titleSmall700;
    }

    public final y0 getTitleXLarge700() {
        return this.titleXLarge700;
    }

    public final y0 getTitleXLarge700Eleven() {
        return this.titleXLarge700Eleven;
    }

    public int hashCode() {
        long j4 = this.defaultColor;
        int i10 = x.f26439n;
        return this.body.hashCode() + c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(c.d(Long.hashCode(j4) * 31, 31, this.titleLarge400), 31, this.titleLarge500), 31, this.titleLarge600), 31, this.titleLarge700Inter), 31, this.titleLarge700Eleven), 31, this.titleXLarge700), 31, this.titleXLarge700Eleven), 31, this.titleMedium400), 31, this.titleMedium500), 31, this.titleMedium600), 31, this.titleMedium700), 31, this.titleMedium700Eleven), 31, this.titleSmall400), 31, this.titleSmall500), 31, this.titleSmall600), 31, this.titleSmall700), 31, this.subtitleLarge400), 31, this.subtitleLarge500), 31, this.subtitleLarge600), 31, this.subtitleLarge700), 31, this.subtitleMedium400), 31, this.subtitleMedium500), 31, this.subtitleMedium600), 31, this.subtitleMedium700), 31, this.subtitleSmall400), 31, this.subtitleSmall500), 31, this.subtitleSmall600), 31, this.subtitleSmall700), 31, this.bodyLarge400), 31, this.bodyLarge500), 31, this.bodyLarge600), 31, this.bodyLarge700), 31, this.bodyMedium400), 31, this.bodyMedium500), 31, this.bodyMedium600), 31, this.bodyMedium700), 31, this.bodySmall400), 31, this.bodySmall500), 31, this.bodySmall600), 31, this.bodySmall700), 31, this.bodyXSmall400), 31, this.bodyXSmall500), 31, this.bodyXSmall600), 31, this.bodyXSmall700), 31, this.bodyTiny400), 31, this.bodyTiny500), 31, this.bodyTiny600), 31, this.bodyTiny700), 31, this.pill400), 31, this.pill500), 31, this.pill600), 31, this.pill700), 31, this.buttonLargeEleven700), 31, this.buttonMediumEleven700), 31, this.buttonSmallEleven700), 31, this.buttonLargeDefault700), 31, this.buttonMediumDefault), 31, this.buttonSmallDefault), 31, this.bookText);
    }

    public String toString() {
        String i10 = x.i(this.defaultColor);
        y0 y0Var = this.titleLarge400;
        y0 y0Var2 = this.titleLarge500;
        y0 y0Var3 = this.titleLarge600;
        y0 y0Var4 = this.titleLarge700Inter;
        y0 y0Var5 = this.titleLarge700Eleven;
        y0 y0Var6 = this.titleXLarge700;
        y0 y0Var7 = this.titleXLarge700Eleven;
        y0 y0Var8 = this.titleMedium400;
        y0 y0Var9 = this.titleMedium500;
        y0 y0Var10 = this.titleMedium600;
        y0 y0Var11 = this.titleMedium700;
        y0 y0Var12 = this.titleMedium700Eleven;
        y0 y0Var13 = this.titleSmall400;
        y0 y0Var14 = this.titleSmall500;
        y0 y0Var15 = this.titleSmall600;
        y0 y0Var16 = this.titleSmall700;
        y0 y0Var17 = this.subtitleLarge400;
        y0 y0Var18 = this.subtitleLarge500;
        y0 y0Var19 = this.subtitleLarge600;
        y0 y0Var20 = this.subtitleLarge700;
        y0 y0Var21 = this.subtitleMedium400;
        y0 y0Var22 = this.subtitleMedium500;
        y0 y0Var23 = this.subtitleMedium600;
        y0 y0Var24 = this.subtitleMedium700;
        y0 y0Var25 = this.subtitleSmall400;
        y0 y0Var26 = this.subtitleSmall500;
        y0 y0Var27 = this.subtitleSmall600;
        y0 y0Var28 = this.subtitleSmall700;
        y0 y0Var29 = this.bodyLarge400;
        y0 y0Var30 = this.bodyLarge500;
        y0 y0Var31 = this.bodyLarge600;
        y0 y0Var32 = this.bodyLarge700;
        y0 y0Var33 = this.bodyMedium400;
        y0 y0Var34 = this.bodyMedium500;
        y0 y0Var35 = this.bodyMedium600;
        y0 y0Var36 = this.bodyMedium700;
        y0 y0Var37 = this.bodySmall400;
        y0 y0Var38 = this.bodySmall500;
        y0 y0Var39 = this.bodySmall600;
        y0 y0Var40 = this.bodySmall700;
        y0 y0Var41 = this.bodyXSmall400;
        y0 y0Var42 = this.bodyXSmall500;
        y0 y0Var43 = this.bodyXSmall600;
        y0 y0Var44 = this.bodyXSmall700;
        y0 y0Var45 = this.bodyTiny400;
        y0 y0Var46 = this.bodyTiny500;
        y0 y0Var47 = this.bodyTiny600;
        y0 y0Var48 = this.bodyTiny700;
        y0 y0Var49 = this.pill400;
        y0 y0Var50 = this.pill500;
        y0 y0Var51 = this.pill600;
        y0 y0Var52 = this.pill700;
        y0 y0Var53 = this.buttonLargeEleven700;
        y0 y0Var54 = this.buttonMediumEleven700;
        y0 y0Var55 = this.buttonSmallEleven700;
        y0 y0Var56 = this.buttonLargeDefault700;
        y0 y0Var57 = this.buttonMediumDefault;
        y0 y0Var58 = this.buttonSmallDefault;
        y0 y0Var59 = this.bookText;
        y0 y0Var60 = this.body;
        StringBuilder sb = new StringBuilder("ElevenLabsTypography(defaultColor=");
        sb.append(i10);
        sb.append(", titleLarge400=");
        sb.append(y0Var);
        sb.append(", titleLarge500=");
        n.q(sb, y0Var2, ", titleLarge600=", y0Var3, ", titleLarge700Inter=");
        n.q(sb, y0Var4, ", titleLarge700Eleven=", y0Var5, ", titleXLarge700=");
        n.q(sb, y0Var6, ", titleXLarge700Eleven=", y0Var7, ", titleMedium400=");
        n.q(sb, y0Var8, ", titleMedium500=", y0Var9, ", titleMedium600=");
        n.q(sb, y0Var10, ", titleMedium700=", y0Var11, ", titleMedium700Eleven=");
        n.q(sb, y0Var12, ", titleSmall400=", y0Var13, ", titleSmall500=");
        n.q(sb, y0Var14, ", titleSmall600=", y0Var15, ", titleSmall700=");
        n.q(sb, y0Var16, ", subtitleLarge400=", y0Var17, ", subtitleLarge500=");
        n.q(sb, y0Var18, ", subtitleLarge600=", y0Var19, ", subtitleLarge700=");
        n.q(sb, y0Var20, ", subtitleMedium400=", y0Var21, ", subtitleMedium500=");
        n.q(sb, y0Var22, ", subtitleMedium600=", y0Var23, ", subtitleMedium700=");
        n.q(sb, y0Var24, ", subtitleSmall400=", y0Var25, ", subtitleSmall500=");
        n.q(sb, y0Var26, ", subtitleSmall600=", y0Var27, ", subtitleSmall700=");
        n.q(sb, y0Var28, ", bodyLarge400=", y0Var29, ", bodyLarge500=");
        n.q(sb, y0Var30, ", bodyLarge600=", y0Var31, ", bodyLarge700=");
        n.q(sb, y0Var32, ", bodyMedium400=", y0Var33, ", bodyMedium500=");
        n.q(sb, y0Var34, ", bodyMedium600=", y0Var35, ", bodyMedium700=");
        n.q(sb, y0Var36, ", bodySmall400=", y0Var37, ", bodySmall500=");
        n.q(sb, y0Var38, ", bodySmall600=", y0Var39, ", bodySmall700=");
        n.q(sb, y0Var40, ", bodyXSmall400=", y0Var41, ", bodyXSmall500=");
        n.q(sb, y0Var42, ", bodyXSmall600=", y0Var43, ", bodyXSmall700=");
        n.q(sb, y0Var44, ", bodyTiny400=", y0Var45, ", bodyTiny500=");
        n.q(sb, y0Var46, ", bodyTiny600=", y0Var47, ", bodyTiny700=");
        n.q(sb, y0Var48, ", pill400=", y0Var49, ", pill500=");
        n.q(sb, y0Var50, ", pill600=", y0Var51, ", pill700=");
        n.q(sb, y0Var52, ", buttonLargeEleven700=", y0Var53, ", buttonMediumEleven700=");
        n.q(sb, y0Var54, ", buttonSmallEleven700=", y0Var55, ", buttonLargeDefault700=");
        n.q(sb, y0Var56, ", buttonMediumDefault=", y0Var57, ", buttonSmallDefault=");
        n.q(sb, y0Var58, ", bookText=", y0Var59, ", body=");
        sb.append(y0Var60);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public /* synthetic */ ElevenLabsTypography(long j4, y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4, y0 y0Var5, y0 y0Var6, y0 y0Var7, y0 y0Var8, y0 y0Var9, y0 y0Var10, y0 y0Var11, y0 y0Var12, y0 y0Var13, y0 y0Var14, y0 y0Var15, y0 y0Var16, y0 y0Var17, y0 y0Var18, y0 y0Var19, y0 y0Var20, y0 y0Var21, y0 y0Var22, y0 y0Var23, y0 y0Var24, y0 y0Var25, y0 y0Var26, y0 y0Var27, y0 y0Var28, y0 y0Var29, y0 y0Var30, y0 y0Var31, y0 y0Var32, y0 y0Var33, y0 y0Var34, y0 y0Var35, y0 y0Var36, y0 y0Var37, y0 y0Var38, y0 y0Var39, y0 y0Var40, y0 y0Var41, y0 y0Var42, y0 y0Var43, y0 y0Var44, y0 y0Var45, y0 y0Var46, y0 y0Var47, y0 y0Var48, y0 y0Var49, y0 y0Var50, y0 y0Var51, y0 y0Var52, y0 y0Var53, y0 y0Var54, y0 y0Var55, y0 y0Var56, y0 y0Var57, y0 y0Var58, y0 y0Var59, y0 y0Var60, f fVar) {
        this(j4, y0Var, y0Var2, y0Var3, y0Var4, y0Var5, y0Var6, y0Var7, y0Var8, y0Var9, y0Var10, y0Var11, y0Var12, y0Var13, y0Var14, y0Var15, y0Var16, y0Var17, y0Var18, y0Var19, y0Var20, y0Var21, y0Var22, y0Var23, y0Var24, y0Var25, y0Var26, y0Var27, y0Var28, y0Var29, y0Var30, y0Var31, y0Var32, y0Var33, y0Var34, y0Var35, y0Var36, y0Var37, y0Var38, y0Var39, y0Var40, y0Var41, y0Var42, y0Var43, y0Var44, y0Var45, y0Var46, y0Var47, y0Var48, y0Var49, y0Var50, y0Var51, y0Var52, y0Var53, y0Var54, y0Var55, y0Var56, y0Var57, y0Var58, y0Var59, y0Var60);
    }

    private ElevenLabsTypography(long j4, y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4, y0 y0Var5, y0 y0Var6, y0 y0Var7, y0 y0Var8, y0 y0Var9, y0 y0Var10, y0 y0Var11, y0 y0Var12, y0 y0Var13, y0 y0Var14, y0 y0Var15, y0 y0Var16, y0 y0Var17, y0 y0Var18, y0 y0Var19, y0 y0Var20, y0 y0Var21, y0 y0Var22, y0 y0Var23, y0 y0Var24, y0 y0Var25, y0 y0Var26, y0 y0Var27, y0 y0Var28, y0 y0Var29, y0 y0Var30, y0 y0Var31, y0 y0Var32, y0 y0Var33, y0 y0Var34, y0 y0Var35, y0 y0Var36, y0 y0Var37, y0 y0Var38, y0 y0Var39, y0 y0Var40, y0 y0Var41, y0 y0Var42, y0 y0Var43, y0 y0Var44, y0 y0Var45, y0 y0Var46, y0 y0Var47, y0 y0Var48, y0 y0Var49, y0 y0Var50, y0 y0Var51, y0 y0Var52, y0 y0Var53, y0 y0Var54, y0 y0Var55, y0 y0Var56, y0 y0Var57, y0 y0Var58, y0 y0Var59, y0 y0Var60) {
        n.s(y0Var, y0Var2, y0Var3, y0Var4, y0Var5);
        n.s(y0Var6, y0Var7, y0Var8, y0Var9, y0Var10);
        n.s(y0Var11, y0Var12, y0Var13, y0Var14, y0Var15);
        n.s(y0Var16, y0Var17, y0Var18, y0Var19, y0Var20);
        n.s(y0Var21, y0Var22, y0Var23, y0Var24, y0Var25);
        n.s(y0Var26, y0Var27, y0Var28, y0Var29, y0Var30);
        n.s(y0Var31, y0Var32, y0Var33, y0Var34, y0Var35);
        n.s(y0Var36, y0Var37, y0Var38, y0Var39, y0Var40);
        n.s(y0Var41, y0Var42, y0Var43, y0Var44, y0Var45);
        n.s(y0Var46, y0Var47, y0Var48, y0Var49, y0Var50);
        n.s(y0Var51, y0Var52, y0Var53, y0Var54, y0Var55);
        n.s(y0Var56, y0Var57, y0Var58, y0Var59, y0Var60);
        this.defaultColor = j4;
        this.titleLarge400 = y0Var;
        this.titleLarge500 = y0Var2;
        this.titleLarge600 = y0Var3;
        this.titleLarge700Inter = y0Var4;
        this.titleLarge700Eleven = y0Var5;
        this.titleXLarge700 = y0Var6;
        this.titleXLarge700Eleven = y0Var7;
        this.titleMedium400 = y0Var8;
        this.titleMedium500 = y0Var9;
        this.titleMedium600 = y0Var10;
        this.titleMedium700 = y0Var11;
        this.titleMedium700Eleven = y0Var12;
        this.titleSmall400 = y0Var13;
        this.titleSmall500 = y0Var14;
        this.titleSmall600 = y0Var15;
        this.titleSmall700 = y0Var16;
        this.subtitleLarge400 = y0Var17;
        this.subtitleLarge500 = y0Var18;
        this.subtitleLarge600 = y0Var19;
        this.subtitleLarge700 = y0Var20;
        this.subtitleMedium400 = y0Var21;
        this.subtitleMedium500 = y0Var22;
        this.subtitleMedium600 = y0Var23;
        this.subtitleMedium700 = y0Var24;
        this.subtitleSmall400 = y0Var25;
        this.subtitleSmall500 = y0Var26;
        this.subtitleSmall600 = y0Var27;
        this.subtitleSmall700 = y0Var28;
        this.bodyLarge400 = y0Var29;
        this.bodyLarge500 = y0Var30;
        this.bodyLarge600 = y0Var31;
        this.bodyLarge700 = y0Var32;
        this.bodyMedium400 = y0Var33;
        this.bodyMedium500 = y0Var34;
        this.bodyMedium600 = y0Var35;
        this.bodyMedium700 = y0Var36;
        this.bodySmall400 = y0Var37;
        this.bodySmall500 = y0Var38;
        this.bodySmall600 = y0Var39;
        this.bodySmall700 = y0Var40;
        this.bodyXSmall400 = y0Var41;
        this.bodyXSmall500 = y0Var42;
        this.bodyXSmall600 = y0Var43;
        this.bodyXSmall700 = y0Var44;
        this.bodyTiny400 = y0Var45;
        this.bodyTiny500 = y0Var46;
        this.bodyTiny600 = y0Var47;
        this.bodyTiny700 = y0Var48;
        this.pill400 = y0Var49;
        this.pill500 = y0Var50;
        this.pill600 = y0Var51;
        this.pill700 = y0Var52;
        this.buttonLargeEleven700 = y0Var53;
        this.buttonMediumEleven700 = y0Var54;
        this.buttonSmallEleven700 = y0Var55;
        this.buttonLargeDefault700 = y0Var56;
        this.buttonMediumDefault = y0Var57;
        this.buttonSmallDefault = y0Var58;
        this.bookText = y0Var59;
        this.body = y0Var60;
    }
}
