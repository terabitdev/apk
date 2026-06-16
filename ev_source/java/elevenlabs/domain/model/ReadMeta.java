package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.readerapp.ui.components.MetaStatKeys;
import io.livekit.android.rpc.RpcError;
import j0.c;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import p.n;
import tn.v;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0003\b\u008b\u0001\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÁ\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\u0006\u0010(\u001a\u00020\u0019\u0012\u0006\u0010)\u001a\u00020\u0019\u0012\b\u0010*\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010.\u001a\u00020\u0019\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00100\u001a\u00020\u0019\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u000105\u0012\b\u00106\u001a\u0004\u0018\u000107\u0012\b\u00108\u001a\u0004\u0018\u000109\u0012\b\u0010:\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010<\u001a\u00020\u0019\u0012\b\b\u0002\u0010=\u001a\u00020\u0019\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\b\b\u0002\u0010@\u001a\u00020\u0019\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C\u0012\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020?0F\u0012\b\b\u0002\u0010G\u001a\u00020\u0019\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010?\u0012\u0016\b\u0002\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010J\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010C\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bM\u0010NJ\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u000bHÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\tHÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\tHÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\u0011\u0010±\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010nJ\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\u0011\u0010´\u0001\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0002\u0010tJ\n\u0010µ\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u000107HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u000109HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010;HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0019HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010?HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010É\u0001\u001a\u0004\u0018\u00010CHÆ\u0003¢\u0006\u0003\u0010\u008f\u0001J\u0012\u0010Ê\u0001\u001a\u0004\u0018\u00010CHÆ\u0003¢\u0006\u0003\u0010\u008f\u0001J\u0010\u0010Ë\u0001\u001a\b\u0012\u0004\u0012\u00020?0FHÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0019HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010?HÆ\u0003J\u0018\u0010Î\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010JHÆ\u0003J\u0012\u0010Ï\u0001\u001a\u0004\u0018\u00010CHÆ\u0003¢\u0006\u0003\u0010\u008f\u0001J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0005\u0010Ñ\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u00192\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020\u00192\b\b\u0002\u0010)\u001a\u00020\u00192\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010.\u001a\u00020\u00192\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00100\u001a\u00020\u00192\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010<\u001a\u00020\u00192\b\b\u0002\u0010=\u001a\u00020\u00192\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\b\b\u0002\u0010@\u001a\u00020\u00192\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020?0F2\b\b\u0002\u0010G\u001a\u00020\u00192\n\b\u0002\u0010H\u001a\u0004\u0018\u00010?2\u0016\b\u0002\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010J2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010Ò\u0001J\u0016\u0010Ó\u0001\u001a\u00020\u00192\t\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\f\u0010Õ\u0001\u001a\u00030Ö\u0001HÖ\u0081\u0004J\u000b\u0010×\u0001\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010PR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bX\u0010WR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bY\u0010WR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010PR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b[\u0010UR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010PR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010PR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010PR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010PR\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bb\u0010UR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010PR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0011\u0010\u001a\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bf\u0010eR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010PR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010PR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\bi\u0010SR\u0011\u0010\u001e\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010eR\u0011\u0010\u001f\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bj\u0010eR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0015\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010o\u001a\u0004\bm\u0010nR\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010PR\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0015\u0010&\u001a\u0004\u0018\u00010'¢\u0006\n\n\u0002\u0010u\u001a\u0004\bs\u0010tR\u0011\u0010(\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b(\u0010eR\u0011\u0010)\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bv\u0010eR\u0013\u0010*\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bw\u0010WR\u0013\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010PR\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010PR\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010PR\u0011\u0010.\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b{\u0010eR\u0013\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b|\u0010PR\u0011\u00100\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b0\u0010eR\u0013\u00101\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010PR\u0015\u00104\u001a\u0004\u0018\u000105¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u00106\u001a\u0004\u0018\u000107¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0015\u00108\u001a\u0004\u0018\u000109¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0015\u0010:\u001a\u0004\u0018\u00010;¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0012\u0010<\u001a\u00020\u0019¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010eR\u0012\u0010=\u001a\u00020\u0019¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010eR\u0015\u0010>\u001a\u0004\u0018\u00010?¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0012\u0010@\u001a\u00020\u0019¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010eR\u0014\u0010A\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010PR\u0018\u0010B\u001a\u0004\u0018\u00010C¢\u0006\r\n\u0003\u0010\u0090\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010D\u001a\u0004\u0018\u00010C¢\u0006\r\n\u0003\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u008f\u0001R\u0019\u0010E\u001a\b\u0012\u0004\u0012\u00020?0F¢\u0006\n\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0011\u0010G\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bG\u0010eR\u0015\u0010H\u001a\u0004\u0018\u00010?¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u008b\u0001R!\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010J¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010K\u001a\u0004\u0018\u00010C¢\u0006\r\n\u0003\u0010\u0090\u0001\u001a\u0006\b\u0097\u0001\u0010\u008f\u0001R\u0014\u0010L\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010P¨\u0006Ø\u0001"}, d2 = {"Lio/elevenlabs/domain/model/ReadMeta;", "", "articleImageUrl", "", "author", "chapters", "", "Lio/elevenlabs/domain/model/Chapter;", "charCount", "", "createdAt", "Ljava/util/Date;", "updatedAt", "addedAt", "description", "lastListenedCharOffset", "readId", "source", "Lio/elevenlabs/domain/model/ReadSource;", "title", "subtitle", "url", "wordCount", "originalFileType", "hasOriginalAudio", "", "matureContent", FirebaseAnalytics.Param.ORIGIN, "contentType", "genre", "isBookType", "fromUserImport", MetaStatKeys.KEY_RATING, "Lio/elevenlabs/domain/model/Rating;", "userRating", "lastUsedVoiceId", "creationStatus", "Lio/elevenlabs/domain/model/ReadCreationStatus;", "creationProgress", "", "isArchived", "markedAsUnread", "completedAt", "publicationDate", "language", "publisherProfileId", "canDelete", "androidProductId", "isPaid", "offlineReadData", "Lio/elevenlabs/domain/model/OfflineReadData;", "previewAudio", "originalVoice", "Lio/elevenlabs/domain/model/OriginalVoice;", "voiceSelectionConfig", "Lio/elevenlabs/domain/model/VoiceSelectionConfig;", "sampleConfig", "Lio/elevenlabs/domain/model/SampleConfig;", "displayMode", "Lio/elevenlabs/domain/model/DisplayMode;", "inUserLibrary", "canUseAssistant", "audioType", "Lio/elevenlabs/domain/model/AudioType;", "useDrm", "lastListenedAudioFileNumber", "lastListenedAudioSeconds", "", "audioDurationSeconds", "audioTypes", "", "isVoiceChangerOn", "lastUsedAudioType", "coverImageUrls", "", "coverAspectRatio", "blurPlaceholder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;JLjava/lang/String;Lio/elevenlabs/domain/model/ReadSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLio/elevenlabs/domain/model/Rating;Ljava/lang/Long;Ljava/lang/String;Lio/elevenlabs/domain/model/ReadCreationStatus;Ljava/lang/Float;ZZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLio/elevenlabs/domain/model/OfflineReadData;Ljava/lang/String;Lio/elevenlabs/domain/model/OriginalVoice;Lio/elevenlabs/domain/model/VoiceSelectionConfig;Lio/elevenlabs/domain/model/SampleConfig;Lio/elevenlabs/domain/model/DisplayMode;ZZLio/elevenlabs/domain/model/AudioType;ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Set;ZLio/elevenlabs/domain/model/AudioType;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/String;)V", "getArticleImageUrl", "()Ljava/lang/String;", "getAuthor", "getChapters", "()Ljava/util/List;", "getCharCount", "()J", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getAddedAt", "getDescription", "getLastListenedCharOffset", "getReadId", "getSource", "()Lio/elevenlabs/domain/model/ReadSource;", "getTitle", "getSubtitle", "getUrl", "getWordCount", "getOriginalFileType", "getHasOriginalAudio", "()Z", "getMatureContent", "getOrigin", "getContentType", "getGenre", "getFromUserImport", "getRating", "()Lio/elevenlabs/domain/model/Rating;", "getUserRating", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLastUsedVoiceId", "getCreationStatus", "()Lio/elevenlabs/domain/model/ReadCreationStatus;", "getCreationProgress", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMarkedAsUnread", "getCompletedAt", "getPublicationDate", "getLanguage", "getPublisherProfileId", "getCanDelete", "getAndroidProductId", "getOfflineReadData", "()Lio/elevenlabs/domain/model/OfflineReadData;", "getPreviewAudio", "getOriginalVoice", "()Lio/elevenlabs/domain/model/OriginalVoice;", "getVoiceSelectionConfig", "()Lio/elevenlabs/domain/model/VoiceSelectionConfig;", "getSampleConfig", "()Lio/elevenlabs/domain/model/SampleConfig;", "getDisplayMode", "()Lio/elevenlabs/domain/model/DisplayMode;", "getInUserLibrary", "getCanUseAssistant", "getAudioType", "()Lio/elevenlabs/domain/model/AudioType;", "getUseDrm", "getLastListenedAudioFileNumber", "getLastListenedAudioSeconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAudioDurationSeconds", "getAudioTypes", "()Ljava/util/Set;", "getLastUsedAudioType", "getCoverImageUrls", "()Ljava/util/Map;", "getCoverAspectRatio", "getBlurPlaceholder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;JLjava/lang/String;Lio/elevenlabs/domain/model/ReadSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLio/elevenlabs/domain/model/Rating;Ljava/lang/Long;Ljava/lang/String;Lio/elevenlabs/domain/model/ReadCreationStatus;Ljava/lang/Float;ZZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLio/elevenlabs/domain/model/OfflineReadData;Ljava/lang/String;Lio/elevenlabs/domain/model/OriginalVoice;Lio/elevenlabs/domain/model/VoiceSelectionConfig;Lio/elevenlabs/domain/model/SampleConfig;Lio/elevenlabs/domain/model/DisplayMode;ZZLio/elevenlabs/domain/model/AudioType;ZLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Set;ZLio/elevenlabs/domain/model/AudioType;Ljava/util/Map;Ljava/lang/Double;Ljava/lang/String;)Lio/elevenlabs/domain/model/ReadMeta;", "equals", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ReadMeta {
    private final Date addedAt;
    private final String androidProductId;
    private final String articleImageUrl;
    private final Double audioDurationSeconds;
    private final AudioType audioType;
    private final Set<AudioType> audioTypes;
    private final String author;
    private final String blurPlaceholder;
    private final boolean canDelete;
    private final boolean canUseAssistant;
    private final List<Chapter> chapters;
    private final long charCount;
    private final Date completedAt;
    private final String contentType;
    private final Double coverAspectRatio;
    private final Map<String, String> coverImageUrls;
    private final Date createdAt;
    private final Float creationProgress;
    private final ReadCreationStatus creationStatus;
    private final String description;
    private final DisplayMode displayMode;
    private final boolean fromUserImport;
    private final List<String> genre;
    private final boolean hasOriginalAudio;
    private final boolean inUserLibrary;
    private final boolean isArchived;
    private final boolean isBookType;
    private final boolean isPaid;
    private final boolean isVoiceChangerOn;
    private final String language;
    private final String lastListenedAudioFileNumber;
    private final Double lastListenedAudioSeconds;
    private final long lastListenedCharOffset;
    private final AudioType lastUsedAudioType;
    private final String lastUsedVoiceId;
    private final boolean markedAsUnread;
    private final boolean matureContent;
    private final OfflineReadData offlineReadData;
    private final String origin;
    private final String originalFileType;
    private final OriginalVoice originalVoice;
    private final String previewAudio;
    private final String publicationDate;
    private final String publisherProfileId;
    private final Rating rating;
    private final String readId;
    private final SampleConfig sampleConfig;
    private final ReadSource source;
    private final String subtitle;
    private final String title;
    private final Date updatedAt;
    private final String url;
    private final boolean useDrm;
    private final Long userRating;
    private final VoiceSelectionConfig voiceSelectionConfig;
    private final long wordCount;

    public /* synthetic */ ReadMeta(String str, String str2, List list, long j4, Date date, Date date2, Date date3, String str3, long j10, String str4, ReadSource readSource, String str5, String str6, String str7, long j11, String str8, boolean z6, boolean z10, String str9, String str10, List list2, boolean z11, boolean z12, Rating rating, Long l4, String str11, ReadCreationStatus readCreationStatus, Float f10, boolean z13, boolean z14, Date date4, String str12, String str13, String str14, boolean z15, String str15, boolean z16, OfflineReadData offlineReadData, String str16, OriginalVoice originalVoice, VoiceSelectionConfig voiceSelectionConfig, SampleConfig sampleConfig, DisplayMode displayMode, boolean z17, boolean z18, AudioType audioType, boolean z19, String str17, Double d10, Double d11, Set set, boolean z20, AudioType audioType2, Map map, Double d12, String str18, int i10, int i11, f fVar) {
        this(str, str2, list, j4, date, date2, date3, str3, j10, str4, readSource, str5, str6, str7, j11, str8, z6, z10, str9, str10, list2, z11, z12, rating, l4, str11, readCreationStatus, f10, z13, z14, date4, str12, str13, str14, z15, str15, z16, (i11 & 32) != 0 ? null : offlineReadData, str16, originalVoice, voiceSelectionConfig, sampleConfig, displayMode, (i11 & 2048) != 0 ? false : z17, (i11 & 4096) != 0 ? false : z18, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : audioType, (i11 & 16384) != 0 ? false : z19, (32768 & i11) != 0 ? null : str17, (65536 & i11) != 0 ? null : d10, (131072 & i11) != 0 ? null : d11, (262144 & i11) != 0 ? v.f33549a : set, (524288 & i11) != 0 ? false : z20, (1048576 & i11) != 0 ? null : audioType2, (2097152 & i11) != 0 ? null : map, (4194304 & i11) != 0 ? null : d12, (i11 & 8388608) != 0 ? null : str18);
    }

    public static /* synthetic */ ReadMeta copy$default(ReadMeta readMeta, String str, String str2, List list, long j4, Date date, Date date2, Date date3, String str3, long j10, String str4, ReadSource readSource, String str5, String str6, String str7, long j11, String str8, boolean z6, boolean z10, String str9, String str10, List list2, boolean z11, boolean z12, Rating rating, Long l4, String str11, ReadCreationStatus readCreationStatus, Float f10, boolean z13, boolean z14, Date date4, String str12, String str13, String str14, boolean z15, String str15, boolean z16, OfflineReadData offlineReadData, String str16, OriginalVoice originalVoice, VoiceSelectionConfig voiceSelectionConfig, SampleConfig sampleConfig, DisplayMode displayMode, boolean z17, boolean z18, AudioType audioType, boolean z19, String str17, Double d10, Double d11, Set set, boolean z20, AudioType audioType2, Map map, Double d12, String str18, int i10, int i11, Object obj) {
        return readMeta.copy((i10 & 1) != 0 ? readMeta.articleImageUrl : str, (i10 & 2) != 0 ? readMeta.author : str2, (i10 & 4) != 0 ? readMeta.chapters : list, (i10 & 8) != 0 ? readMeta.charCount : j4, (i10 & 16) != 0 ? readMeta.createdAt : date, (i10 & 32) != 0 ? readMeta.updatedAt : date2, (i10 & 64) != 0 ? readMeta.addedAt : date3, (i10 & 128) != 0 ? readMeta.description : str3, (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? readMeta.lastListenedCharOffset : j10, (i10 & 512) != 0 ? readMeta.readId : str4, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? readMeta.source : readSource, (i10 & 2048) != 0 ? readMeta.title : str5, (i10 & 4096) != 0 ? readMeta.subtitle : str6, (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? readMeta.url : str7, (i10 & 16384) != 0 ? readMeta.wordCount : j11, (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? readMeta.originalFileType : str8, (i10 & 65536) != 0 ? readMeta.hasOriginalAudio : z6, (i10 & 131072) != 0 ? readMeta.matureContent : z10, (i10 & 262144) != 0 ? readMeta.origin : str9, (i10 & 524288) != 0 ? readMeta.contentType : str10, (i10 & 1048576) != 0 ? readMeta.genre : list2, (i10 & 2097152) != 0 ? readMeta.isBookType : z11, (i10 & 4194304) != 0 ? readMeta.fromUserImport : z12, (i10 & 8388608) != 0 ? readMeta.rating : rating, (i10 & 16777216) != 0 ? readMeta.userRating : l4, (i10 & 33554432) != 0 ? readMeta.lastUsedVoiceId : str11, (i10 & 67108864) != 0 ? readMeta.creationStatus : readCreationStatus, (i10 & 134217728) != 0 ? readMeta.creationProgress : f10, (i10 & 268435456) != 0 ? readMeta.isArchived : z13, (i10 & 536870912) != 0 ? readMeta.markedAsUnread : z14, (i10 & 1073741824) != 0 ? readMeta.completedAt : date4, (i10 & Integer.MIN_VALUE) != 0 ? readMeta.publicationDate : str12, (i11 & 1) != 0 ? readMeta.language : str13, (i11 & 2) != 0 ? readMeta.publisherProfileId : str14, (i11 & 4) != 0 ? readMeta.canDelete : z15, (i11 & 8) != 0 ? readMeta.androidProductId : str15, (i11 & 16) != 0 ? readMeta.isPaid : z16, (i11 & 32) != 0 ? readMeta.offlineReadData : offlineReadData, (i11 & 64) != 0 ? readMeta.previewAudio : str16, (i11 & 128) != 0 ? readMeta.originalVoice : originalVoice, (i11 & RpcError.MAX_MESSAGE_BYTES) != 0 ? readMeta.voiceSelectionConfig : voiceSelectionConfig, (i11 & 512) != 0 ? readMeta.sampleConfig : sampleConfig, (i11 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? readMeta.displayMode : displayMode, (i11 & 2048) != 0 ? readMeta.inUserLibrary : z17, (i11 & 4096) != 0 ? readMeta.canUseAssistant : z18, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? readMeta.audioType : audioType, (i11 & 16384) != 0 ? readMeta.useDrm : z19, (i11 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? readMeta.lastListenedAudioFileNumber : str17, (i11 & 65536) != 0 ? readMeta.lastListenedAudioSeconds : d10, (i11 & 131072) != 0 ? readMeta.audioDurationSeconds : d11, (i11 & 262144) != 0 ? readMeta.audioTypes : set, (i11 & 524288) != 0 ? readMeta.isVoiceChangerOn : z20, (i11 & 1048576) != 0 ? readMeta.lastUsedAudioType : audioType2, (i11 & 2097152) != 0 ? readMeta.coverImageUrls : map, (i11 & 4194304) != 0 ? readMeta.coverAspectRatio : d12, (i11 & 8388608) != 0 ? readMeta.blurPlaceholder : str18);
    }

    /* renamed from: component1, reason: from getter */
    public final String getArticleImageUrl() {
        return this.articleImageUrl;
    }

    /* renamed from: component10, reason: from getter */
    public final String getReadId() {
        return this.readId;
    }

    /* renamed from: component11, reason: from getter */
    public final ReadSource getSource() {
        return this.source;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component14, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component15, reason: from getter */
    public final long getWordCount() {
        return this.wordCount;
    }

    /* renamed from: component16, reason: from getter */
    public final String getOriginalFileType() {
        return this.originalFileType;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getHasOriginalAudio() {
        return this.hasOriginalAudio;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getMatureContent() {
        return this.matureContent;
    }

    /* renamed from: component19, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* renamed from: component20, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    public final List<String> component21() {
        return this.genre;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsBookType() {
        return this.isBookType;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getFromUserImport() {
        return this.fromUserImport;
    }

    /* renamed from: component24, reason: from getter */
    public final Rating getRating() {
        return this.rating;
    }

    /* renamed from: component25, reason: from getter */
    public final Long getUserRating() {
        return this.userRating;
    }

    /* renamed from: component26, reason: from getter */
    public final String getLastUsedVoiceId() {
        return this.lastUsedVoiceId;
    }

    /* renamed from: component27, reason: from getter */
    public final ReadCreationStatus getCreationStatus() {
        return this.creationStatus;
    }

    /* renamed from: component28, reason: from getter */
    public final Float getCreationProgress() {
        return this.creationProgress;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsArchived() {
        return this.isArchived;
    }

    public final List<Chapter> component3() {
        return this.chapters;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getMarkedAsUnread() {
        return this.markedAsUnread;
    }

    /* renamed from: component31, reason: from getter */
    public final Date getCompletedAt() {
        return this.completedAt;
    }

    /* renamed from: component32, reason: from getter */
    public final String getPublicationDate() {
        return this.publicationDate;
    }

    /* renamed from: component33, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component34, reason: from getter */
    public final String getPublisherProfileId() {
        return this.publisherProfileId;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getCanDelete() {
        return this.canDelete;
    }

    /* renamed from: component36, reason: from getter */
    public final String getAndroidProductId() {
        return this.androidProductId;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getIsPaid() {
        return this.isPaid;
    }

    /* renamed from: component38, reason: from getter */
    public final OfflineReadData getOfflineReadData() {
        return this.offlineReadData;
    }

    /* renamed from: component39, reason: from getter */
    public final String getPreviewAudio() {
        return this.previewAudio;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCharCount() {
        return this.charCount;
    }

    /* renamed from: component40, reason: from getter */
    public final OriginalVoice getOriginalVoice() {
        return this.originalVoice;
    }

    /* renamed from: component41, reason: from getter */
    public final VoiceSelectionConfig getVoiceSelectionConfig() {
        return this.voiceSelectionConfig;
    }

    /* renamed from: component42, reason: from getter */
    public final SampleConfig getSampleConfig() {
        return this.sampleConfig;
    }

    /* renamed from: component43, reason: from getter */
    public final DisplayMode getDisplayMode() {
        return this.displayMode;
    }

    /* renamed from: component44, reason: from getter */
    public final boolean getInUserLibrary() {
        return this.inUserLibrary;
    }

    /* renamed from: component45, reason: from getter */
    public final boolean getCanUseAssistant() {
        return this.canUseAssistant;
    }

    /* renamed from: component46, reason: from getter */
    public final AudioType getAudioType() {
        return this.audioType;
    }

    /* renamed from: component47, reason: from getter */
    public final boolean getUseDrm() {
        return this.useDrm;
    }

    /* renamed from: component48, reason: from getter */
    public final String getLastListenedAudioFileNumber() {
        return this.lastListenedAudioFileNumber;
    }

    /* renamed from: component49, reason: from getter */
    public final Double getLastListenedAudioSeconds() {
        return this.lastListenedAudioSeconds;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component50, reason: from getter */
    public final Double getAudioDurationSeconds() {
        return this.audioDurationSeconds;
    }

    public final Set<AudioType> component51() {
        return this.audioTypes;
    }

    /* renamed from: component52, reason: from getter */
    public final boolean getIsVoiceChangerOn() {
        return this.isVoiceChangerOn;
    }

    /* renamed from: component53, reason: from getter */
    public final AudioType getLastUsedAudioType() {
        return this.lastUsedAudioType;
    }

    public final Map<String, String> component54() {
        return this.coverImageUrls;
    }

    /* renamed from: component55, reason: from getter */
    public final Double getCoverAspectRatio() {
        return this.coverAspectRatio;
    }

    /* renamed from: component56, reason: from getter */
    public final String getBlurPlaceholder() {
        return this.blurPlaceholder;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component7, reason: from getter */
    public final Date getAddedAt() {
        return this.addedAt;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component9, reason: from getter */
    public final long getLastListenedCharOffset() {
        return this.lastListenedCharOffset;
    }

    public final ReadMeta copy(String articleImageUrl, String author, List<Chapter> chapters, long charCount, Date createdAt, Date updatedAt, Date addedAt, String description, long lastListenedCharOffset, String readId, ReadSource source, String title, String subtitle, String url, long wordCount, String originalFileType, boolean hasOriginalAudio, boolean matureContent, String r82, String contentType, List<String> genre, boolean isBookType, boolean fromUserImport, Rating r87, Long userRating, String lastUsedVoiceId, ReadCreationStatus creationStatus, Float creationProgress, boolean isArchived, boolean markedAsUnread, Date completedAt, String publicationDate, String language, String publisherProfileId, boolean canDelete, String androidProductId, boolean isPaid, OfflineReadData offlineReadData, String previewAudio, OriginalVoice originalVoice, VoiceSelectionConfig voiceSelectionConfig, SampleConfig sampleConfig, DisplayMode displayMode, boolean inUserLibrary, boolean canUseAssistant, AudioType audioType, boolean useDrm, String lastListenedAudioFileNumber, Double lastListenedAudioSeconds, Double audioDurationSeconds, Set<? extends AudioType> audioTypes, boolean isVoiceChangerOn, AudioType lastUsedAudioType, Map<String, String> coverImageUrls, Double coverAspectRatio, String blurPlaceholder) {
        chapters.getClass();
        createdAt.getClass();
        updatedAt.getClass();
        addedAt.getClass();
        readId.getClass();
        title.getClass();
        subtitle.getClass();
        genre.getClass();
        audioTypes.getClass();
        return new ReadMeta(articleImageUrl, author, chapters, charCount, createdAt, updatedAt, addedAt, description, lastListenedCharOffset, readId, source, title, subtitle, url, wordCount, originalFileType, hasOriginalAudio, matureContent, r82, contentType, genre, isBookType, fromUserImport, r87, userRating, lastUsedVoiceId, creationStatus, creationProgress, isArchived, markedAsUnread, completedAt, publicationDate, language, publisherProfileId, canDelete, androidProductId, isPaid, offlineReadData, previewAudio, originalVoice, voiceSelectionConfig, sampleConfig, displayMode, inUserLibrary, canUseAssistant, audioType, useDrm, lastListenedAudioFileNumber, lastListenedAudioSeconds, audioDurationSeconds, audioTypes, isVoiceChangerOn, lastUsedAudioType, coverImageUrls, coverAspectRatio, blurPlaceholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadMeta)) {
            return false;
        }
        ReadMeta readMeta = (ReadMeta) other;
        if (m.c(this.articleImageUrl, readMeta.articleImageUrl) && m.c(this.author, readMeta.author) && m.c(this.chapters, readMeta.chapters) && this.charCount == readMeta.charCount && m.c(this.createdAt, readMeta.createdAt) && m.c(this.updatedAt, readMeta.updatedAt) && m.c(this.addedAt, readMeta.addedAt) && m.c(this.description, readMeta.description) && this.lastListenedCharOffset == readMeta.lastListenedCharOffset && m.c(this.readId, readMeta.readId) && this.source == readMeta.source && m.c(this.title, readMeta.title) && m.c(this.subtitle, readMeta.subtitle) && m.c(this.url, readMeta.url) && this.wordCount == readMeta.wordCount && m.c(this.originalFileType, readMeta.originalFileType) && this.hasOriginalAudio == readMeta.hasOriginalAudio && this.matureContent == readMeta.matureContent && m.c(this.origin, readMeta.origin) && m.c(this.contentType, readMeta.contentType) && m.c(this.genre, readMeta.genre) && this.isBookType == readMeta.isBookType && this.fromUserImport == readMeta.fromUserImport && m.c(this.rating, readMeta.rating) && m.c(this.userRating, readMeta.userRating) && m.c(this.lastUsedVoiceId, readMeta.lastUsedVoiceId) && this.creationStatus == readMeta.creationStatus && m.c(this.creationProgress, readMeta.creationProgress) && this.isArchived == readMeta.isArchived && this.markedAsUnread == readMeta.markedAsUnread && m.c(this.completedAt, readMeta.completedAt) && m.c(this.publicationDate, readMeta.publicationDate) && m.c(this.language, readMeta.language) && m.c(this.publisherProfileId, readMeta.publisherProfileId) && this.canDelete == readMeta.canDelete && m.c(this.androidProductId, readMeta.androidProductId) && this.isPaid == readMeta.isPaid && m.c(this.offlineReadData, readMeta.offlineReadData) && m.c(this.previewAudio, readMeta.previewAudio) && m.c(this.originalVoice, readMeta.originalVoice) && this.voiceSelectionConfig == readMeta.voiceSelectionConfig && m.c(this.sampleConfig, readMeta.sampleConfig) && this.displayMode == readMeta.displayMode && this.inUserLibrary == readMeta.inUserLibrary && this.canUseAssistant == readMeta.canUseAssistant && this.audioType == readMeta.audioType && this.useDrm == readMeta.useDrm && m.c(this.lastListenedAudioFileNumber, readMeta.lastListenedAudioFileNumber) && m.c(this.lastListenedAudioSeconds, readMeta.lastListenedAudioSeconds) && m.c(this.audioDurationSeconds, readMeta.audioDurationSeconds) && m.c(this.audioTypes, readMeta.audioTypes) && this.isVoiceChangerOn == readMeta.isVoiceChangerOn && this.lastUsedAudioType == readMeta.lastUsedAudioType && m.c(this.coverImageUrls, readMeta.coverImageUrls) && m.c(this.coverAspectRatio, readMeta.coverAspectRatio) && m.c(this.blurPlaceholder, readMeta.blurPlaceholder)) {
            return true;
        }
        return false;
    }

    public final Date getAddedAt() {
        return this.addedAt;
    }

    public final String getAndroidProductId() {
        return this.androidProductId;
    }

    public final String getArticleImageUrl() {
        return this.articleImageUrl;
    }

    public final Double getAudioDurationSeconds() {
        return this.audioDurationSeconds;
    }

    public final AudioType getAudioType() {
        return this.audioType;
    }

    public final Set<AudioType> getAudioTypes() {
        return this.audioTypes;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getBlurPlaceholder() {
        return this.blurPlaceholder;
    }

    public final boolean getCanDelete() {
        return this.canDelete;
    }

    public final boolean getCanUseAssistant() {
        return this.canUseAssistant;
    }

    public final List<Chapter> getChapters() {
        return this.chapters;
    }

    public final long getCharCount() {
        return this.charCount;
    }

    public final Date getCompletedAt() {
        return this.completedAt;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final Double getCoverAspectRatio() {
        return this.coverAspectRatio;
    }

    public final Map<String, String> getCoverImageUrls() {
        return this.coverImageUrls;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Float getCreationProgress() {
        return this.creationProgress;
    }

    public final ReadCreationStatus getCreationStatus() {
        return this.creationStatus;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DisplayMode getDisplayMode() {
        return this.displayMode;
    }

    public final boolean getFromUserImport() {
        return this.fromUserImport;
    }

    public final List<String> getGenre() {
        return this.genre;
    }

    public final boolean getHasOriginalAudio() {
        return this.hasOriginalAudio;
    }

    public final boolean getInUserLibrary() {
        return this.inUserLibrary;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLastListenedAudioFileNumber() {
        return this.lastListenedAudioFileNumber;
    }

    public final Double getLastListenedAudioSeconds() {
        return this.lastListenedAudioSeconds;
    }

    public final long getLastListenedCharOffset() {
        return this.lastListenedCharOffset;
    }

    public final AudioType getLastUsedAudioType() {
        return this.lastUsedAudioType;
    }

    public final String getLastUsedVoiceId() {
        return this.lastUsedVoiceId;
    }

    public final boolean getMarkedAsUnread() {
        return this.markedAsUnread;
    }

    public final boolean getMatureContent() {
        return this.matureContent;
    }

    public final OfflineReadData getOfflineReadData() {
        return this.offlineReadData;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getOriginalFileType() {
        return this.originalFileType;
    }

    public final OriginalVoice getOriginalVoice() {
        return this.originalVoice;
    }

    public final String getPreviewAudio() {
        return this.previewAudio;
    }

    public final String getPublicationDate() {
        return this.publicationDate;
    }

    public final String getPublisherProfileId() {
        return this.publisherProfileId;
    }

    public final Rating getRating() {
        return this.rating;
    }

    public final String getReadId() {
        return this.readId;
    }

    public final SampleConfig getSampleConfig() {
        return this.sampleConfig;
    }

    public final ReadSource getSource() {
        return this.source;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getUseDrm() {
        return this.useDrm;
    }

    public final Long getUserRating() {
        return this.userRating;
    }

    public final VoiceSelectionConfig getVoiceSelectionConfig() {
        return this.voiceSelectionConfig;
    }

    public final long getWordCount() {
        return this.wordCount;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        String str = this.articleImageUrl;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode * 31;
        String str2 = this.author;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode32 = (this.addedAt.hashCode() + ((this.updatedAt.hashCode() + ((this.createdAt.hashCode() + b.g(this.charCount, n.d((i11 + hashCode2) * 31, 31, this.chapters), 31)) * 31)) * 31)) * 31;
        String str3 = this.description;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int c5 = c.c(b.g(this.lastListenedCharOffset, (hashCode32 + hashCode3) * 31, 31), 31, this.readId);
        ReadSource readSource = this.source;
        if (readSource == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = readSource.hashCode();
        }
        int c10 = c.c(c.c((c5 + hashCode4) * 31, 31, this.title), 31, this.subtitle);
        String str4 = this.url;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int g10 = b.g(this.wordCount, (c10 + hashCode5) * 31, 31);
        String str5 = this.originalFileType;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int f10 = b.f(b.f((g10 + hashCode6) * 31, 31, this.hasOriginalAudio), 31, this.matureContent);
        String str6 = this.origin;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i12 = (f10 + hashCode7) * 31;
        String str7 = this.contentType;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int f11 = b.f(b.f(n.d((i12 + hashCode8) * 31, 31, this.genre), 31, this.isBookType), 31, this.fromUserImport);
        Rating rating = this.rating;
        if (rating == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = rating.hashCode();
        }
        int i13 = (f11 + hashCode9) * 31;
        Long l4 = this.userRating;
        if (l4 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = l4.hashCode();
        }
        int i14 = (i13 + hashCode10) * 31;
        String str8 = this.lastUsedVoiceId;
        if (str8 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str8.hashCode();
        }
        int i15 = (i14 + hashCode11) * 31;
        ReadCreationStatus readCreationStatus = this.creationStatus;
        if (readCreationStatus == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = readCreationStatus.hashCode();
        }
        int i16 = (i15 + hashCode12) * 31;
        Float f12 = this.creationProgress;
        if (f12 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = f12.hashCode();
        }
        int f13 = b.f(b.f((i16 + hashCode13) * 31, 31, this.isArchived), 31, this.markedAsUnread);
        Date date = this.completedAt;
        if (date == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = date.hashCode();
        }
        int i17 = (f13 + hashCode14) * 31;
        String str9 = this.publicationDate;
        if (str9 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str9.hashCode();
        }
        int i18 = (i17 + hashCode15) * 31;
        String str10 = this.language;
        if (str10 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str10.hashCode();
        }
        int i19 = (i18 + hashCode16) * 31;
        String str11 = this.publisherProfileId;
        if (str11 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str11.hashCode();
        }
        int f14 = b.f((i19 + hashCode17) * 31, 31, this.canDelete);
        String str12 = this.androidProductId;
        if (str12 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str12.hashCode();
        }
        int f15 = b.f((f14 + hashCode18) * 31, 31, this.isPaid);
        OfflineReadData offlineReadData = this.offlineReadData;
        if (offlineReadData == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = offlineReadData.hashCode();
        }
        int i20 = (f15 + hashCode19) * 31;
        String str13 = this.previewAudio;
        if (str13 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str13.hashCode();
        }
        int i21 = (i20 + hashCode20) * 31;
        OriginalVoice originalVoice = this.originalVoice;
        if (originalVoice == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = originalVoice.hashCode();
        }
        int i22 = (i21 + hashCode21) * 31;
        VoiceSelectionConfig voiceSelectionConfig = this.voiceSelectionConfig;
        if (voiceSelectionConfig == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = voiceSelectionConfig.hashCode();
        }
        int i23 = (i22 + hashCode22) * 31;
        SampleConfig sampleConfig = this.sampleConfig;
        if (sampleConfig == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = sampleConfig.hashCode();
        }
        int i24 = (i23 + hashCode23) * 31;
        DisplayMode displayMode = this.displayMode;
        if (displayMode == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = displayMode.hashCode();
        }
        int f16 = b.f(b.f((i24 + hashCode24) * 31, 31, this.inUserLibrary), 31, this.canUseAssistant);
        AudioType audioType = this.audioType;
        if (audioType == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = audioType.hashCode();
        }
        int f17 = b.f((f16 + hashCode25) * 31, 31, this.useDrm);
        String str14 = this.lastListenedAudioFileNumber;
        if (str14 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = str14.hashCode();
        }
        int i25 = (f17 + hashCode26) * 31;
        Double d10 = this.lastListenedAudioSeconds;
        if (d10 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = d10.hashCode();
        }
        int i26 = (i25 + hashCode27) * 31;
        Double d11 = this.audioDurationSeconds;
        if (d11 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = d11.hashCode();
        }
        int f18 = b.f((this.audioTypes.hashCode() + ((i26 + hashCode28) * 31)) * 31, 31, this.isVoiceChangerOn);
        AudioType audioType2 = this.lastUsedAudioType;
        if (audioType2 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = audioType2.hashCode();
        }
        int i27 = (f18 + hashCode29) * 31;
        Map<String, String> map = this.coverImageUrls;
        if (map == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = map.hashCode();
        }
        int i28 = (i27 + hashCode30) * 31;
        Double d12 = this.coverAspectRatio;
        if (d12 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = d12.hashCode();
        }
        int i29 = (i28 + hashCode31) * 31;
        String str15 = this.blurPlaceholder;
        if (str15 != null) {
            i10 = str15.hashCode();
        }
        return i29 + i10;
    }

    public final boolean isArchived() {
        return this.isArchived;
    }

    public final boolean isBookType() {
        return this.isBookType;
    }

    public final boolean isPaid() {
        return this.isPaid;
    }

    public final boolean isVoiceChangerOn() {
        return this.isVoiceChangerOn;
    }

    public String toString() {
        String str = this.articleImageUrl;
        String str2 = this.author;
        List<Chapter> list = this.chapters;
        long j4 = this.charCount;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        Date date3 = this.addedAt;
        String str3 = this.description;
        long j10 = this.lastListenedCharOffset;
        String str4 = this.readId;
        ReadSource readSource = this.source;
        String str5 = this.title;
        String str6 = this.subtitle;
        String str7 = this.url;
        long j11 = this.wordCount;
        String str8 = this.originalFileType;
        boolean z6 = this.hasOriginalAudio;
        boolean z10 = this.matureContent;
        String str9 = this.origin;
        String str10 = this.contentType;
        List<String> list2 = this.genre;
        boolean z11 = this.isBookType;
        boolean z12 = this.fromUserImport;
        Rating rating = this.rating;
        Long l4 = this.userRating;
        String str11 = this.lastUsedVoiceId;
        ReadCreationStatus readCreationStatus = this.creationStatus;
        Float f10 = this.creationProgress;
        boolean z13 = this.isArchived;
        boolean z14 = this.markedAsUnread;
        Date date4 = this.completedAt;
        String str12 = this.publicationDate;
        String str13 = this.language;
        String str14 = this.publisherProfileId;
        boolean z15 = this.canDelete;
        String str15 = this.androidProductId;
        boolean z16 = this.isPaid;
        OfflineReadData offlineReadData = this.offlineReadData;
        String str16 = this.previewAudio;
        OriginalVoice originalVoice = this.originalVoice;
        VoiceSelectionConfig voiceSelectionConfig = this.voiceSelectionConfig;
        SampleConfig sampleConfig = this.sampleConfig;
        DisplayMode displayMode = this.displayMode;
        boolean z17 = this.inUserLibrary;
        boolean z18 = this.canUseAssistant;
        AudioType audioType = this.audioType;
        boolean z19 = this.useDrm;
        String str17 = this.lastListenedAudioFileNumber;
        Double d10 = this.lastListenedAudioSeconds;
        Double d11 = this.audioDurationSeconds;
        Set<AudioType> set = this.audioTypes;
        boolean z20 = this.isVoiceChangerOn;
        AudioType audioType2 = this.lastUsedAudioType;
        Map<String, String> map = this.coverImageUrls;
        Double d12 = this.coverAspectRatio;
        String str18 = this.blurPlaceholder;
        StringBuilder s10 = defpackage.f.s("ReadMeta(articleImageUrl=", str, ", author=", str2, ", chapters=");
        s10.append(list);
        s10.append(", charCount=");
        s10.append(j4);
        s10.append(", createdAt=");
        s10.append(date);
        s10.append(", updatedAt=");
        s10.append(date2);
        s10.append(", addedAt=");
        s10.append(date3);
        s10.append(", description=");
        s10.append(str3);
        b.w(s10, ", lastListenedCharOffset=", j10, ", readId=");
        s10.append(str4);
        s10.append(", source=");
        s10.append(readSource);
        s10.append(", title=");
        defpackage.f.x(s10, str5, ", subtitle=", str6, ", url=");
        s10.append(str7);
        s10.append(", wordCount=");
        s10.append(j11);
        s10.append(", originalFileType=");
        s10.append(str8);
        s10.append(", hasOriginalAudio=");
        s10.append(z6);
        s10.append(", matureContent=");
        s10.append(z10);
        s10.append(", origin=");
        s10.append(str9);
        s10.append(", contentType=");
        s10.append(str10);
        s10.append(", genre=");
        s10.append(list2);
        s10.append(", isBookType=");
        s10.append(z11);
        s10.append(", fromUserImport=");
        s10.append(z12);
        s10.append(", rating=");
        s10.append(rating);
        s10.append(", userRating=");
        s10.append(l4);
        s10.append(", lastUsedVoiceId=");
        s10.append(str11);
        s10.append(", creationStatus=");
        s10.append(readCreationStatus);
        s10.append(", creationProgress=");
        s10.append(f10);
        s10.append(", isArchived=");
        s10.append(z13);
        s10.append(", markedAsUnread=");
        s10.append(z14);
        s10.append(", completedAt=");
        s10.append(date4);
        defpackage.f.x(s10, ", publicationDate=", str12, ", language=", str13);
        s10.append(", publisherProfileId=");
        s10.append(str14);
        s10.append(", canDelete=");
        s10.append(z15);
        s10.append(", androidProductId=");
        s10.append(str15);
        s10.append(", isPaid=");
        s10.append(z16);
        s10.append(", offlineReadData=");
        s10.append(offlineReadData);
        s10.append(", previewAudio=");
        s10.append(str16);
        s10.append(", originalVoice=");
        s10.append(originalVoice);
        s10.append(", voiceSelectionConfig=");
        s10.append(voiceSelectionConfig);
        s10.append(", sampleConfig=");
        s10.append(sampleConfig);
        s10.append(", displayMode=");
        s10.append(displayMode);
        s10.append(", inUserLibrary=");
        s10.append(z17);
        s10.append(", canUseAssistant=");
        s10.append(z18);
        s10.append(", audioType=");
        s10.append(audioType);
        s10.append(", useDrm=");
        s10.append(z19);
        s10.append(", lastListenedAudioFileNumber=");
        s10.append(str17);
        s10.append(", lastListenedAudioSeconds=");
        s10.append(d10);
        s10.append(", audioDurationSeconds=");
        s10.append(d11);
        s10.append(", audioTypes=");
        s10.append(set);
        s10.append(", isVoiceChangerOn=");
        s10.append(z20);
        s10.append(", lastUsedAudioType=");
        s10.append(audioType2);
        s10.append(", coverImageUrls=");
        s10.append(map);
        s10.append(", coverAspectRatio=");
        s10.append(d12);
        return h.d(s10, ", blurPlaceholder=", str18, Separators.RPAREN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReadMeta(String str, String str2, List<Chapter> list, long j4, Date date, Date date2, Date date3, String str3, long j10, String str4, ReadSource readSource, String str5, String str6, String str7, long j11, String str8, boolean z6, boolean z10, String str9, String str10, List<String> list2, boolean z11, boolean z12, Rating rating, Long l4, String str11, ReadCreationStatus readCreationStatus, Float f10, boolean z13, boolean z14, Date date4, String str12, String str13, String str14, boolean z15, String str15, boolean z16, OfflineReadData offlineReadData, String str16, OriginalVoice originalVoice, VoiceSelectionConfig voiceSelectionConfig, SampleConfig sampleConfig, DisplayMode displayMode, boolean z17, boolean z18, AudioType audioType, boolean z19, String str17, Double d10, Double d11, Set<? extends AudioType> set, boolean z20, AudioType audioType2, Map<String, String> map, Double d12, String str18) {
        list.getClass();
        date.getClass();
        date2.getClass();
        date3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        list2.getClass();
        set.getClass();
        this.articleImageUrl = str;
        this.author = str2;
        this.chapters = list;
        this.charCount = j4;
        this.createdAt = date;
        this.updatedAt = date2;
        this.addedAt = date3;
        this.description = str3;
        this.lastListenedCharOffset = j10;
        this.readId = str4;
        this.source = readSource;
        this.title = str5;
        this.subtitle = str6;
        this.url = str7;
        this.wordCount = j11;
        this.originalFileType = str8;
        this.hasOriginalAudio = z6;
        this.matureContent = z10;
        this.origin = str9;
        this.contentType = str10;
        this.genre = list2;
        this.isBookType = z11;
        this.fromUserImport = z12;
        this.rating = rating;
        this.userRating = l4;
        this.lastUsedVoiceId = str11;
        this.creationStatus = readCreationStatus;
        this.creationProgress = f10;
        this.isArchived = z13;
        this.markedAsUnread = z14;
        this.completedAt = date4;
        this.publicationDate = str12;
        this.language = str13;
        this.publisherProfileId = str14;
        this.canDelete = z15;
        this.androidProductId = str15;
        this.isPaid = z16;
        this.offlineReadData = offlineReadData;
        this.previewAudio = str16;
        this.originalVoice = originalVoice;
        this.voiceSelectionConfig = voiceSelectionConfig;
        this.sampleConfig = sampleConfig;
        this.displayMode = displayMode;
        this.inUserLibrary = z17;
        this.canUseAssistant = z18;
        this.audioType = audioType;
        this.useDrm = z19;
        this.lastListenedAudioFileNumber = str17;
        this.lastListenedAudioSeconds = d10;
        this.audioDurationSeconds = d11;
        this.audioTypes = set;
        this.isVoiceChangerOn = z20;
        this.lastUsedAudioType = audioType2;
        this.coverImageUrls = map;
        this.coverAspectRatio = d12;
        this.blurPlaceholder = str18;
    }
}
