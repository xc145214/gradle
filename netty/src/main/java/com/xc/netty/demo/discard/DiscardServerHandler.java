package com.xc.netty.demo.discard;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;

/**
 * Created by Administrator on 2015/12/5.
 * 处理服务端
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
       /*
        // 默默地丢弃收到的数据
        ((ByteBuf) msg).release(); // (3)
        */

        /*
        try {
	        // Do something with msg
	    } finally {
	        ReferenceCountUtil.release(msg);
	    }
        */

        ByteBuf in = (ByteBuf) msg;
        try {
//            while (in.isReadable()) { // (1)
//                System.out.print((char) in.readByte());
//                System.out.flush();
//            }

            System.out.println(in.toString(CharsetUtil.US_ASCII));
        } finally {
//            ReferenceCountUtil.release(msg); // (2)
            in.release();
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // 当出现异常就关闭连接
        cause.printStackTrace();
        ctx.close();
    }
}
